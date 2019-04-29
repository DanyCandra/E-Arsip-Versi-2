/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bpd.arsip.model;

import com.bpd.arsip.dao.PengarsipanDao;
import com.bpd.arsip.database.DatabaseConnection;
import com.bpd.arsip.entitas.Pengarsipan;
import com.bpd.arsip.exception.ArsipException;
import com.bpd.arsip.helper.render.TableDebiturRender;
import com.bpd.arsip.helper.render.DusRender;
import com.bpd.arsip.helper.render.TablePejabatRender;
import com.bpd.arsip.helper.render.TableRenderDefault;
import com.bpd.arsip.helper.render.TableStatusBerkasRender;
import com.bpd.arsip.helper.render.TableStatusPengembalianRender;
import com.bpd.arsip.helper.render.TableUserRender;
import com.stripbandunk.jwidget.annotation.TableColumn;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Dany Candra
 */
public class PengarsipanModel {

    @TableColumn(name = "CIF", number = 1, size = 20, renderer = TableDebiturRender.class, groups = {"ttpengembalian", "lappengembalian"})
    private DebiturModel debiturModel;
    @TableColumn(name = "NAMA", number = 2, size = 35, renderer = TableRenderDefault.class,groups = {"ttpengembalian", "lappengembalian"})
    private String nama;
    @TableColumn(name = "TANGGAL TERIMA", number = 3, size = 20,renderer = TableRenderDefault.class,  groups = {"ttpengembalian"})
    private Date tanggalTerima;
    @TableColumn(name = "PETUGAS PENERIMA", number = 4, size = 20, renderer = TableUserRender.class, groups = {"ttpengembalian"})
    private UserModel userPenerima;
    @TableColumn(name = "PEJABAT PENERIMA", number = 5, size = 20, renderer = TablePejabatRender.class, groups = {"ttpengembalian"})
    private PejabatModel pejabatPenerima;
    @TableColumn(name = "DUS", number = 6, size = 10, renderer = DusRender.class, groups = {"ttpengembalian"})
    private DusModel dus;
    @TableColumn(name = "TANGGAL KEMBALI", number = 7, size = 20,renderer = TableRenderDefault.class, groups = {"lappengembalian"})
    private Date tanggalKembali;
    @TableColumn(name = "PETUGAS PENGEMBALI", number = 8, size = 20, renderer = TableUserRender.class, groups = {"lappengembalian"})
    private UserModel userPengembali;
    @TableColumn(name = "PEJABAT PENGEMBALI", number = 9, size = 20, renderer = TablePejabatRender.class, groups = {"lappengembalian"})
    private PejabatModel pejabatPengembali;
    @TableColumn(name = "STATUS BERKAS", number = 10, size = 20, renderer = TableStatusBerkasRender.class, groups = {"ttpengembalian"})
    private String statusArsip;
    @TableColumn(name = "STATUS KEMBALI", number = 11, size = 20, renderer = TableStatusPengembalianRender.class, groups = {"lappengembalian"})
    private String statusKembali;

    public PengarsipanModel() {
    }

    public PengarsipanModel(DebiturModel debiturModel, String nama, Date tanggalTerima, UserModel userPenerima, PejabatModel pejabatPenerima, DusModel dus, Date tanggalKembali, UserModel userPengembali, PejabatModel pejabatPengembali, String statusArsip, String statusKembali) {
        this.debiturModel = debiturModel;
        this.nama = nama;
        this.tanggalTerima = tanggalTerima;
        this.userPenerima = userPenerima;
        this.pejabatPenerima = pejabatPenerima;
        this.dus = dus;
        this.tanggalKembali = tanggalKembali;
        this.userPengembali = userPengembali;
        this.pejabatPengembali = pejabatPengembali;
        this.statusArsip = statusArsip;
        this.statusKembali = statusKembali;
    }

    public DebiturModel getDebiturModel() {
        return debiturModel;
    }

    public void setDebiturModel(DebiturModel debiturModel) {
        this.debiturModel = debiturModel;
    }

    public Date getTanggalTerima() {
        return tanggalTerima;
    }

    public void setTanggalTerima(Date tanggalTerima) {
        this.tanggalTerima = tanggalTerima;
    }

    public UserModel getUserPenerima() {
        return userPenerima;
    }

    public void setUserPenerima(UserModel userPenerima) {
        this.userPenerima = userPenerima;
    }

    public PejabatModel getPejabatPenerima() {
        return pejabatPenerima;
    }

    public void setPejabatPenerima(PejabatModel pejabatPenerima) {
        this.pejabatPenerima = pejabatPenerima;
    }

    public DusModel getDus() {
        return dus;
    }

    public void setDus(DusModel dus) {
        this.dus = dus;
    }

    public Date getTanggalKembali() {
        return tanggalKembali;
    }

    public void setTanggalKembali(Date tanggalKembali) {
        this.tanggalKembali = tanggalKembali;
    }

    public UserModel getUserPengembali() {
        return userPengembali;
    }

    public void setUserPengembali(UserModel userPengembali) {
        this.userPengembali = userPengembali;
    }

    public PejabatModel getPejabatPengembali() {
        return pejabatPengembali;
    }

    public void setPejabatPengembali(PejabatModel pejabatPengembali) {
        this.pejabatPengembali = pejabatPengembali;
    }

    public String getStatusArsip() {
        return statusArsip;
    }

    public void setStatusArsip(String statusArsip) {
        this.statusArsip = statusArsip;
    }

    public String getStatusKembali() {
        return statusKembali;
    }

    public void setStatusKembali(String statusKembali) {
        this.statusKembali = statusKembali;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void insertPenerimaan() throws ArsipException {
        PengarsipanDao dao = DatabaseConnection.getPengarsipanDao();
        Pengarsipan pengarsipan = new Pengarsipan();
        pengarsipan.setDebitur(new DebiturModel().getDebiturFromModel(debiturModel));
        pengarsipan.setDus(new DusModel().getDusFromModel(dus));
        pengarsipan.setTanggalTerima(tanggalTerima);
        pengarsipan.setUserPenerima(new UserModel().getUserFromModel(userPenerima));
        pengarsipan.setPejabatPenerima(new PejabatModel().getPejabatFromModel(pejabatPenerima));
        pengarsipan.setStatusArsip(statusArsip);

        dao.insertPenerimaan(pengarsipan);
    }

    public void updatePenerimaan() throws ArsipException {
        PengarsipanDao dao = DatabaseConnection.getPengarsipanDao();
        Pengarsipan pengarsipan = new Pengarsipan();
        pengarsipan.setDebitur(new DebiturModel().getDebiturFromModel(debiturModel));
        pengarsipan.setDus(new DusModel().getDusFromModel(dus));
        pengarsipan.setTanggalTerima(tanggalTerima);
        pengarsipan.setUserPenerima(new UserModel().getUserFromModel(userPenerima));
        pengarsipan.setPejabatPenerima(new PejabatModel().getPejabatFromModel(pejabatPenerima));
        pengarsipan.setStatusArsip(statusArsip);

        dao.updatePenerimaan(pengarsipan);
    }

    public void insertengembalian() throws ArsipException {
        PengarsipanDao dao = DatabaseConnection.getPengarsipanDao();
        Pengarsipan pengarsipan = new Pengarsipan();
        pengarsipan.setTanggalKembali(tanggalKembali);
        pengarsipan.setUserPengembali(new UserModel().getUserFromModel(userPengembali));
        pengarsipan.setPejabatPengembali(new PejabatModel().getPejabatFromModel(pejabatPengembali));
        pengarsipan.setStatusArsip(statusArsip);
        pengarsipan.setStatusKembali(statusKembali);
        pengarsipan.setDebitur(new DebiturModel().getDebiturFromModel(debiturModel));

        dao.insertPengembalian(pengarsipan);
    }

    public boolean cekPenerimaanByCIF(String cif) throws ArsipException {
        PengarsipanDao dao = DatabaseConnection.getPengarsipanDao();
        boolean result = dao.cekPengarsipanTersediaByCIF(cif);
        return result;
    }

    public boolean isNewBerkasCekByCif(String cif) throws ArsipException {
        boolean result = true;
        PengarsipanDao dao = DatabaseConnection.getPengarsipanDao();
        Pengarsipan pengarsipan = dao.getPengarsipanByCIF(cif);
        System.out.println(pengarsipan);
        if (pengarsipan != null) {
            setDebiturModel(new DebiturModel().getDebiturModelByCif(pengarsipan.getDebitur().getCif()));
            setTanggalTerima(pengarsipan.getTanggalTerima());
            setUserPenerima(new UserModel().getUserModelByIdUser(pengarsipan.getUserPenerima().getIdUser()));
            setPejabatPenerima(new PejabatModel().getPejabatModelById(pengarsipan.getPejabatPenerima().getIdPejabat()));
            setDus(new DusModel().getById(pengarsipan.getDus().getIdDus()));
            setStatusArsip(pengarsipan.getStatusArsip());
            result = false;
        }
        return result;

    }

    public void getNewParameterPenerimaanBy(String cif) throws ArsipException {
        PengarsipanDao dao = DatabaseConnection.getPengarsipanDao();
        Pengarsipan pengarsipan = dao.getPengarsipanByCIF(cif);

        if (pengarsipan != null) {
            setDebiturModel(new DebiturModel().getDebiturModelByCif(pengarsipan.getDebitur().getCif()));
            setTanggalTerima(pengarsipan.getTanggalTerima());
            setUserPenerima(new UserModel().getUserModelByIdUser(pengarsipan.getUserPenerima().getIdUser()));
            setPejabatPenerima(new PejabatModel().getPejabatModelById(pengarsipan.getPejabatPenerima().getIdPejabat()));
            setDus(new DusModel().getById(pengarsipan.getDus().getIdDus()));
            setStatusArsip(pengarsipan.getStatusArsip());
        }

    }

    public List<PengarsipanModel> getDaftarBerkasTersedia(int skip, int max) throws ArsipException {
        List<PengarsipanModel> list = new ArrayList<>();

        PengarsipanDao dao = DatabaseConnection.getPengarsipanDao();
        List<Pengarsipan> tmpList = dao.getDaftarBerkasTersedia(skip, max);
        for (Pengarsipan pengarsipan : tmpList) {
            PengarsipanModel model = new PengarsipanModel();
            model.setDebiturModel(new DebiturModel().getDebiturModelByCif(pengarsipan.getDebitur().getCif()));
            model.setNama(new DebiturModel().getDebiturModelByCif(pengarsipan.getDebitur().getCif()).getNama());
            model.setTanggalTerima(pengarsipan.getTanggalTerima());
            model.setUserPenerima(new UserModel().getUserModelByIdUser(pengarsipan.getUserPenerima().getIdUser()));
            model.setPejabatPenerima(new PejabatModel().getPejabatModelById(pengarsipan.getPejabatPenerima().getIdPejabat()));
            model.setDus(new DusModel().getById(pengarsipan.getDus().getIdDus()));
            model.setStatusArsip(pengarsipan.getStatusArsip());
            list.add(model);
        }
        return list;
    }

    public List<PengarsipanModel> searchDaftarBerkasTersedia(String cif) throws ArsipException {
        List<PengarsipanModel> list = new ArrayList<>();

        PengarsipanDao dao = DatabaseConnection.getPengarsipanDao();
        List<Pengarsipan> tmpList = dao.getDaftarBerkasTersedia(cif);
        for (Pengarsipan pengarsipan : tmpList) {
            PengarsipanModel model = new PengarsipanModel();
            model.setDebiturModel(new DebiturModel().getDebiturModelByCif(pengarsipan.getDebitur().getCif()));
            model.setNama(new DebiturModel().getDebiturModelByCif(pengarsipan.getDebitur().getCif()).getNama());
            model.setTanggalTerima(pengarsipan.getTanggalTerima());
            model.setUserPenerima(new UserModel().getUserModelByIdUser(pengarsipan.getUserPenerima().getIdUser()));
            model.setPejabatPenerima(new PejabatModel().getPejabatModelById(pengarsipan.getPejabatPenerima().getIdPejabat()));
            model.setDus(new DusModel().getById(pengarsipan.getDus().getIdDus()));
            model.setStatusArsip(pengarsipan.getStatusArsip());
            list.add(model);
        }
        return list;
    }

    public List<PengarsipanModel> searchDaftarBerkasTersediaByNama(String nama) throws ArsipException {
        List<PengarsipanModel> list = new ArrayList<>();

        PengarsipanDao dao = DatabaseConnection.getPengarsipanDao();
        List<Pengarsipan> tmpList = dao.getDaftarBerkasTersediaByNama(nama);
        for (Pengarsipan pengarsipan : tmpList) {
            PengarsipanModel model = new PengarsipanModel();
            model.setDebiturModel(new DebiturModel().getDebiturModelByCif(pengarsipan.getDebitur().getCif()));
            model.setNama(new DebiturModel().getDebiturModelByCif(pengarsipan.getDebitur().getCif()).getNama());
            model.setTanggalTerima(pengarsipan.getTanggalTerima());
            model.setUserPenerima(new UserModel().getUserModelByIdUser(pengarsipan.getUserPenerima().getIdUser()));
            model.setPejabatPenerima(new PejabatModel().getPejabatModelById(pengarsipan.getPejabatPenerima().getIdPejabat()));
            model.setDus(new DusModel().getById(pengarsipan.getDus().getIdDus()));
            model.setStatusArsip(pengarsipan.getStatusArsip());
            list.add(model);
        }
        return list;
    }

    public List<PengarsipanModel> searchDaftarBerkasTersediaByIdDus(String idDus) throws ArsipException {
        List<PengarsipanModel> list = new ArrayList<>();

        PengarsipanDao dao = DatabaseConnection.getPengarsipanDao();
        List<Pengarsipan> tmpList = dao.getDaftarBerkasTersediaByIdDus(idDus);
        for (Pengarsipan pengarsipan : tmpList) {
            PengarsipanModel model = new PengarsipanModel();
            model.setDebiturModel(new DebiturModel().getDebiturModelByCif(pengarsipan.getDebitur().getCif()));
            model.setNama(new DebiturModel().getDebiturModelByCif(pengarsipan.getDebitur().getCif()).getNama());
            model.setTanggalTerima(pengarsipan.getTanggalTerima());
            model.setUserPenerima(new UserModel().getUserModelByIdUser(pengarsipan.getUserPenerima().getIdUser()));
            model.setPejabatPenerima(new PejabatModel().getPejabatModelById(pengarsipan.getPejabatPenerima().getIdPejabat()));
            model.setDus(new DusModel().getById(pengarsipan.getDus().getIdDus()));
            model.setStatusArsip(pengarsipan.getStatusArsip());
            list.add(model);
        }
        return list;
    }

    public List<PengarsipanModel> searchDaftarPenerimaanBerkas(Date tanggalMulai, Date tanggalSelesai) throws ArsipException {
        List<PengarsipanModel> list = new ArrayList<>();

        PengarsipanDao dao = DatabaseConnection.getPengarsipanDao();
        List<Pengarsipan> tmpList = dao.getDaftarPenerimaanBerkas(tanggalMulai, tanggalSelesai);
        for (Pengarsipan pengarsipan : tmpList) {
            if (pengarsipan != null) {
                PengarsipanModel model = new PengarsipanModel();
                model.setDebiturModel(new DebiturModel().getDebiturModelByCif(pengarsipan.getDebitur().getCif()));
                model.setNama(new DebiturModel().getDebiturModelByCif(pengarsipan.getDebitur().getCif()).getNama());
                model.setTanggalTerima(pengarsipan.getTanggalTerima());
                model.setUserPenerima(new UserModel().getUserModelByIdUser(pengarsipan.getUserPenerima().getIdUser()));
                model.setPejabatPenerima(new PejabatModel().getPejabatModelById(pengarsipan.getPejabatPenerima().getIdPejabat()));
                model.setDus(new DusModel().getById(pengarsipan.getDus().getIdDus()));
                model.setStatusArsip(pengarsipan.getStatusArsip());
                list.add(model);
            }
        }
        return list;
    }

    public List<PengarsipanModel> searchDaftarPengembalianBerkas(Date tanggalMulai, Date tanggalSelesai) throws ArsipException {
        List<PengarsipanModel> list = new ArrayList<>();

        PengarsipanDao dao = DatabaseConnection.getPengarsipanDao();
        List<Pengarsipan> tmpList = dao.getDaftarPengembalianBerkas(tanggalMulai, tanggalSelesai);
        for (Pengarsipan pengarsipan : tmpList) {
            if (pengarsipan != null) {
                if (pengarsipan.getTanggalKembali() != null) {
                    PengarsipanModel model = new PengarsipanModel();
                    model.setDebiturModel(new DebiturModel().getDebiturModelByCif(pengarsipan.getDebitur().getCif()));
                    model.setNama(new DebiturModel().getDebiturModelByCif(pengarsipan.getDebitur().getCif()).getNama());
                    model.setTanggalKembali(pengarsipan.getTanggalKembali());
                    model.setUserPengembali(new UserModel().getUserModelByIdUser(pengarsipan.getUserPengembali().getIdUser()));
                    model.setPejabatPengembali(new PejabatModel().getPejabatModelById(pengarsipan.getPejabatPengembali().getIdPejabat()));
                    model.setStatusKembali(pengarsipan.getStatusKembali());
                    list.add(model);
                }
            }
        }
        return list;
    }

    public int getCountBerkasTersedia() throws ArsipException {
        int result = 0;
        PengarsipanDao dao = DatabaseConnection.getPengarsipanDao();
        Long total = dao.getLongPenerimaan();

        result = total.intValue();

        return result;
    }
}
