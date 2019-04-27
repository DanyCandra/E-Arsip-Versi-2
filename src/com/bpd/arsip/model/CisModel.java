/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bpd.arsip.model;

import com.bpd.arsip.dao.CisDao;
import com.bpd.arsip.database.DatabaseConnection;
import com.bpd.arsip.entitas.Cis;
import com.bpd.arsip.exception.ArsipException;
import com.bpd.arsip.helper.render.TableDebiturRender;
import com.bpd.arsip.helper.render.JumlahPertanggunganRender;
import com.stripbandunk.jwidget.annotation.TableColumn;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Dany Candra
 */
public class CisModel {

    private String idCis;

    @TableColumn(name = "CIF", number = 1, size = 20, renderer = TableDebiturRender.class)
    private DebiturModel debiturModel;
    @TableColumn(name = "NAMA", number = 2, size = 50)
    private String nama;
    @TableColumn(name = "CIF CIS", number = 3, size = 20)
    private String cifCis;
    @TableColumn(name = "NO PINJAMAN", number = 4, size = 20)
    private String noPinjam;
    @TableColumn(name = "TANGGAL REALISASI", number = 5, size = 20)
    private Date tanggalRealisasi;
    @TableColumn(name = "TANGGAL MULAI", number = 6, size = 20)
    private Date tanggalMulai;
    @TableColumn(name = "TANGGAL SELESAI", number = 7, size = 20)
    private Date tanggalSelesai;
    @TableColumn(name = "JUMLAH PERTANGGUNGAN", number = 8, size = 20, renderer = JumlahPertanggunganRender.class)
    private double jumlahPertanggungan;

    public CisModel() {
    }

    public CisModel(String idCis, DebiturModel debiturModel, String cifCis, String noPinjam, Date tanggalRealisasi, Date tanggalMulai, Date tanggalSelesai, double jumlahPertanggungan) {
        this.idCis = idCis;
        this.debiturModel = debiturModel;
        this.cifCis = cifCis;
        this.noPinjam = noPinjam;
        this.tanggalRealisasi = tanggalRealisasi;
        this.tanggalMulai = tanggalMulai;
        this.tanggalSelesai = tanggalSelesai;
        this.jumlahPertanggungan = jumlahPertanggungan;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getIdCis() {
        return idCis;
    }

    public void setIdCis(String idCis) {
        this.idCis = idCis;
    }

    public DebiturModel getDebiturModel() {
        return debiturModel;
    }

    public void setDebiturModel(DebiturModel debiturModel) {
        this.debiturModel = debiturModel;
    }

    public String getCifCis() {
        return cifCis;
    }

    public void setCifCis(String cifCis) {
        this.cifCis = cifCis;
    }

    public String getNoPinjam() {
        return noPinjam;
    }

    public void setNoPinjam(String noPinjam) {
        this.noPinjam = noPinjam;
    }

    public Date getTanggalRealisasi() {
        return tanggalRealisasi;
    }

    public void setTanggalRealisasi(Date tanggalRealisasi) {
        this.tanggalRealisasi = tanggalRealisasi;
    }

    public Date getTanggalMulai() {
        return tanggalMulai;
    }

    public void setTanggalMulai(Date tanggalMulai) {
        this.tanggalMulai = tanggalMulai;
    }

    public Date getTanggalSelesai() {
        return tanggalSelesai;
    }

    public void setTanggalSelesai(Date tanggalSelesai) {
        this.tanggalSelesai = tanggalSelesai;
    }

    public double getJumlahPertanggungan() {
        return jumlahPertanggungan;
    }

    public void setJumlahPertanggungan(double jumlahPertanggungan) {
        this.jumlahPertanggungan = jumlahPertanggungan;
    }

    public void insertCis() throws ArsipException {

        Cis cis = new Cis();
        cis.setIdCis(idCis);
        cis.setDebitur(new DebiturModel().getDebiturFromModel(debiturModel));
        cis.setCifCis(cifCis);
        cis.setNoPinjam(noPinjam);
        cis.setTanggalRealisasi(tanggalRealisasi);
        cis.setTanggalMulai(tanggalMulai);
        cis.setTanggalSelesai(tanggalSelesai);
        cis.setJumlahPertanggungan(jumlahPertanggungan);

        CisDao dao = DatabaseConnection.getCisDao();
        dao.insert(cis);
    }
    
    public void updateCis() throws ArsipException {

        Cis cis = new Cis();
        cis.setIdCis(idCis);
        cis.setDebitur(new DebiturModel().getDebiturFromModel(debiturModel));
        cis.setCifCis(cifCis);
        cis.setNoPinjam(noPinjam);
        cis.setTanggalRealisasi(tanggalRealisasi);
        cis.setTanggalMulai(tanggalMulai);
        cis.setTanggalSelesai(tanggalSelesai);
        cis.setJumlahPertanggungan(jumlahPertanggungan);

        CisDao dao = DatabaseConnection.getCisDao();
        dao.update(cis);
    }

    public List<CisModel> selectCisByTanggalRealisasi(Date mulai, Date selesai) throws ArsipException {
        List<CisModel> list = new ArrayList<>();

        CisDao dao = DatabaseConnection.getCisDao();
        List<Cis> tmpList = dao.getCisByTanggalPencairan(mulai, selesai);
        for (Cis tmpCis : tmpList) {
            if (tmpCis != null) {
                CisModel model = new CisModel();

                model.setIdCis(tmpCis.getIdCis());
                model.setDebiturModel(new DebiturModel().getDebiturModelByCif(tmpCis.getDebitur().getCif()));
                model.setNama(model.getDebiturModel().getNama());
                model.setCifCis(tmpCis.getCifCis());
                model.setNoPinjam(tmpCis.getNoPinjam());
                model.setTanggalRealisasi(tmpCis.getTanggalRealisasi());
                model.setTanggalMulai(tmpCis.getTanggalMulai());
                model.setTanggalSelesai(tmpCis.getTanggalSelesai());
                model.setJumlahPertanggungan(tmpCis.getJumlahPertanggungan());
                list.add(model);
            }
        }

        return list;
    }
    
     public List<CisModel> selectCisLikeNoPinjaman(String noPinjaman) throws ArsipException {
        List<CisModel> list = new ArrayList<>();

        CisDao dao = DatabaseConnection.getCisDao();
        List<Cis> tmpList = dao.getCisByNoPinjaman(noPinjaman);
        for (Cis tmpCis : tmpList) {
            if (tmpCis != null) {
                CisModel model = new CisModel();

                model.setIdCis(tmpCis.getIdCis());
                model.setDebiturModel(new DebiturModel().getDebiturModelByCif(tmpCis.getDebitur().getCif()));
                model.setNama(model.getDebiturModel().getNama());
                model.setCifCis(tmpCis.getCifCis());
                model.setNoPinjam(tmpCis.getNoPinjam());
                model.setTanggalRealisasi(tmpCis.getTanggalRealisasi());
                model.setTanggalMulai(tmpCis.getTanggalMulai());
                model.setTanggalSelesai(tmpCis.getTanggalSelesai());
                model.setJumlahPertanggungan(tmpCis.getJumlahPertanggungan());
                list.add(model);
            }
        }

        return list;
    }

    public void selectCisByNoPinjaman(String noPinjam) throws ArsipException {

        CisDao dao = DatabaseConnection.getCisDao();
        Cis cis = dao.getByNoPinjam(noPinjam);

        if (cis != null) {

            setIdCis(cis.getIdCis());
            setDebiturModel(new DebiturModel().getDebiturModelByCif(cis.getDebitur().getCif()));
            setCifCis(cis.getCifCis());
            setNoPinjam(cis.getNoPinjam());
            setTanggalRealisasi(cis.getTanggalRealisasi());
            setTanggalMulai(cis.getTanggalMulai());
            setTanggalSelesai(cis.getTanggalSelesai());
            setJumlahPertanggungan(cis.getJumlahPertanggungan());

        }

    }

}
