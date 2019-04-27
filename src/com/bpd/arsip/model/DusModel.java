/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bpd.arsip.model;

import com.bpd.arsip.dao.DusDao;
import com.bpd.arsip.dao.InstansiDao;
import com.bpd.arsip.dao.LantaiDao;
import com.bpd.arsip.dao.QuotaDao;
import com.bpd.arsip.dao.RakDao;
import com.bpd.arsip.database.DatabaseConnection;
import com.bpd.arsip.entitas.Dus;
import com.bpd.arsip.entitas.Lantai;
import com.bpd.arsip.entitas.Quota;
import com.bpd.arsip.entitas.Rak;
import com.bpd.arsip.exception.ArsipException;
import com.bpd.arsip.helper.HelperGeneratorAutoId;
import com.bpd.arsip.helper.render.DusTableRender;
import com.bpd.arsip.helper.render.LantaiTableRender;
import com.bpd.arsip.helper.render.TableRakRender;
import com.bpd.arsip.helper.render.TableRenderDefault;
import com.stripbandunk.jwidget.annotation.TableColumn;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Dany Candra
 */
public class DusModel {

    @TableColumn(name = "ID DUS", number = 1, size = 30, renderer = DusTableRender.class)
    private String idDus;
    @TableColumn(name = "LOKASI", number = 1, size = 40, renderer = LantaiTableRender.class)
    private LantaiModel lokasi;
    @TableColumn(name = "RAK", number = 1, size = 40, renderer = TableRakRender.class)
    private RakModel rak;
    @TableColumn(name = "QUOTA", number = 1, size = 40, renderer = TableRenderDefault.class)
    private int quota;

    public DusModel() {
    }

    public String getIdDus() {
        return idDus;
    }

    public void setIdDus(String idDus) {
        this.idDus = idDus;
    }

    public LantaiModel getLokasi() {
        return lokasi;
    }

    public void setLokasi(LantaiModel lokasi) {
        this.lokasi = lokasi;
    }

    public RakModel getRak() {
        return rak;
    }

    public void setRak(RakModel rak) {
        this.rak = rak;
    }

    public int getQuota() {
        return quota;
    }

    public void setQuota(int quota) {
        this.quota = quota;
    }

    public List<DusModel> load(int skip, int max) throws ArsipException {
        List<DusModel> list = new ArrayList<DusModel>();

        DusDao dao = DatabaseConnection.getDusDao();
        List<Dus> listTmp = dao.getAllDus(skip, max);
        for (Dus dus : listTmp) {
            DusModel model = new DusModel();
            model.setIdDus(dus.getIdDus());
            model.setLokasi(new LantaiModel().getLantaiModel(dus.getLantai().getIdLantai()));
            model.setRak(new RakModel().getRakModel(dus.getRak().getIdRak()));
            model.setQuota(dus.getQuota());
            list.add(model);
        }

        return list;
    }

    public int getLongList() throws ArsipException {
        int longList = 0;
        DusDao dao = DatabaseConnection.getDusDao();
        longList = dao.getDusAkhir();
        return longList;
    }

    public void insertDus(int jumlahDusInput, LantaiModel lantaiInsert) throws ArsipException {
        LantaiDao lantaiDao = DatabaseConnection.getLantaiDao();
        RakDao rakDao = DatabaseConnection.getRakDao();
        DusDao dusDao = DatabaseConnection.getDusDao();

        int rak = rakDao.getRakAkhir();
        System.out.println("Jumlah Rak Sekarang : " + rak);

        if (rak == 0) {
            rak = 1;
            Rak rak1 = new Rak();
            rak1.setIdRak(HelperGeneratorAutoId.generateAutoIdRak());
            rak1.setNamaRak(rak);
            rak1.setQuota(getQuotaRak());
            rakDao.insertRak(rak1);
            System.out.println("membuat rak dengan nomar rak " + rak1.getNamaRak());
        }
        Rak rakForTmpId = rakDao.getRak(rak);
        System.out.println();
        String idRak = rakForTmpId.getIdRak();
        int dus = dusDao.getDusAkhirByRak(idRak);
        System.out.println("jumlah dus di rak " + rakForTmpId.getIdRak() + " adalah: " + dus);

        int tmpquotaRak = rakDao.getQuotaRakAkhir();
        System.out.println("Sisa Quota Dus di " + rakForTmpId.getIdRak() + " adalah: " + tmpquotaRak);
        int quotaRak = getQuotaRak();
        int jumlahdus = jumlahDusInput;

        for (int i = 1; i <= jumlahdus; i++) {
            if (tmpquotaRak != 0) {
                if (tmpquotaRak <= quotaRak) {
                    tmpquotaRak = tmpquotaRak - 1;
                    //update rak
                    rakDao.updateQuotaRak(rak, tmpquotaRak);
                    System.out.println("Sisa Quota Dus di " + rakForTmpId.getIdRak() + " adalah: " + tmpquotaRak);
                }
            } else if (tmpquotaRak == 0) {
                rak++;
                dus = 0;
                tmpquotaRak = quotaRak - 1;

                Rak rak1 = new Rak();
                rak1.setIdRak(HelperGeneratorAutoId.generateAutoIdRak());
                rak1.setNamaRak(rak);
                rak1.setQuota(tmpquotaRak);
                rakDao.insertRak(rak1);

            }

            dus = dus + 1;
            Dus d = new Dus();
            d.setIdDus(HelperGeneratorAutoId.getAutoIdDus(lantaiInsert.getNamaLantai(), rak, dus));
            d.setLantai(new Lantai(lantaiInsert.getIdLantai(), lantaiInsert.getNamaLantai()));
            d.setRak(rakDao.getRak(rak));
            d.setQuota(getQuotaDus());

            if (dus > 999) {
                break;
            } else {
                dusDao.insertDus(d);
            }

        }
    }

    public int getQuotaRak() throws ArsipException {
        int isiRak = 0;
        QuotaDao dao = DatabaseConnection.getQuotaDao();
        Quota q = dao.showQuota();
        isiRak = q.getIsiRak();
        return isiRak;
    }

    public int getQuotaDus() throws ArsipException {
        int quota = 0;
        QuotaDao dao = DatabaseConnection.getQuotaDao();
        Quota q = dao.showQuota();
        quota = q.getIsiDus();
        return quota;
    }

    public List<DusModel> load(String idRak) throws ArsipException {
        List<DusModel> list = new ArrayList<>();

        DusDao dao = DatabaseConnection.getDusDao();
        List<Dus> listTmp = dao.getAllDus(idRak);
        for (Dus dus : listTmp) {
            DusModel model = new DusModel();
            model.setIdDus(dus.getIdDus());
            model.setLokasi(new LantaiModel().getLantaiModel(dus.getLantai().getIdLantai()));
            model.setRak(new RakModel().getRakModel(dus.getRak().getIdRak()));
            model.setQuota(dus.getQuota());
            list.add(model);
        }

        return list;
    }

    public List<DusModel> getAllDusModel() throws ArsipException {
        List<DusModel> list = new ArrayList<DusModel>();

        DusDao dao = DatabaseConnection.getDusDao();
        List<Dus> listTmp = dao.getDusEmpety();
        for (Dus dus : listTmp) {
            DusModel model = new DusModel();
            model.setIdDus(dus.getIdDus());
            model.setLokasi(new LantaiModel().getLantaiModel(dus.getLantai().getIdLantai()));
            model.setRak(new RakModel().getRakModel(dus.getRak().getIdRak()));
            model.setQuota(dus.getQuota());
            list.add(model);
        }

        return list;
    }

    public DusModel getById(String idDus) throws ArsipException {

        DusDao dao = DatabaseConnection.getDusDao();
        Dus dus = dao.getDus(idDus);
        DusModel model = null;
        if (dus != null) {
            model = new DusModel();
            model.setIdDus(dus.getIdDus());
            model.setLokasi(new LantaiModel().getLantaiModel(dus.getLantai().getIdLantai()));
            model.setRak(new RakModel().getRakModel(dus.getRak().getIdRak()));
            model.setQuota(dus.getQuota());
        }

        return model;
    }

    public void getDusModelByIdDus(String idDus) throws ArsipException {

        DusDao dao = DatabaseConnection.getDusDao();
        Dus dus = dao.getDus(idDus);
        if (dus != null) {
            setIdDus(dus.getIdDus());
            setLokasi(new LantaiModel().getLantaiModel(dus.getLantai().getIdLantai()));
            setRak(new RakModel().getRakModel(dus.getRak().getIdRak()));
            setQuota(dus.getQuota());
        }

    }

    public void updateStokPenerimaan() throws ArsipException {
        Dus dus = new Dus();
        dus.setIdDus(idDus);
        int newQuota = quota - 1;
        if (newQuota <= 0) {
            dus.setQuota(0);
        } else {
            dus.setQuota(newQuota);
        }

        DusDao dao = DatabaseConnection.getDusDao();
        dao.updateStock(dus);
    }

    public void updateStokPengembalian() throws ArsipException {
        Dus dus = new Dus();
        dus.setIdDus(idDus);
        int newQuota = quota + 1;
        if (newQuota >= getQuotaDus()) {
            dus.setQuota(getQuotaDus());
        } else {
            dus.setQuota(quota + 1);
        }

        DusDao dao = DatabaseConnection.getDusDao();
        dao.updateStock(dus);
    }

    public Dus getDusFromModel(DusModel model) {
        Dus dus = new Dus();
        dus.setIdDus(model.getIdDus());
        dus.setQuota(model.getQuota());
        dus.setLantai(new LantaiModel().getLantaiFromModel(model.getLokasi()));
        dus.setRak(new RakModel().getRakFromModel(model.getRak()));
        return dus;
    }

    public void deleteDus(int jumlahData, String idRak) throws ArsipException {
        DusDao dusDao = DatabaseConnection.getDusDao();
        RakDao rakDao = DatabaseConnection.getRakDao();
        List<Dus> listDelete = dusDao.getDusForDelete(jumlahData, idRak);

        boolean isCanDelete;
        int jumlahHapus = 0;
        int quotaRak = rakDao.getRak(idRak).getQuota();
        List<Dus> dusDelete = new ArrayList<>();
        for (Dus tmpData : listDelete) {
            isCanDelete = dusDao.isCanDelete(tmpData.getIdDus());
            if (isCanDelete == false) {
                break;
            } else {
                jumlahHapus += 1;
                quotaRak += 1;
                dusDelete.add(tmpData);
                if (jumlahHapus == jumlahData) {
                    for (Dus dusReadyToDelete : dusDelete) {
                        dusDao.deleteDus(dusReadyToDelete.getIdDus());
                    }
                    rakDao.updateQuotaRakById(idRak, quotaRak);
                }
            }
        }
    }

}
