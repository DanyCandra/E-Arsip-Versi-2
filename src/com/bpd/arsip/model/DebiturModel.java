/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bpd.arsip.model;

import com.bpd.arsip.dao.DebiturDao;
import com.bpd.arsip.database.DatabaseConnection;
import com.bpd.arsip.entitas.Debitur;
import com.bpd.arsip.exception.ArsipException;
import com.bpd.arsip.helper.render.InstansiRender;
import com.bpd.arsip.helper.render.TableRenderDefault;
import com.stripbandunk.jwidget.annotation.TableColumn;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Dany Candra
 */
public class DebiturModel {

    @TableColumn(name = "CIF", number = 1, size = 10, renderer = TableRenderDefault.class)
    private String cif;
    @TableColumn(name = "NAMA", number = 2, size = 30, renderer = TableRenderDefault.class)
    private String nama;
    @TableColumn(name = "TEMPAT LAHIR", number = 3, size = 20, renderer = TableRenderDefault.class)
    private String tempatLahir;
    @TableColumn(name = "TANGGAL LAHIR", number = 4, size = 20, renderer = TableRenderDefault.class)
    private Date tanggalLahir;
    @TableColumn(name = "NIK", number = 5, size = 20, renderer = TableRenderDefault.class)
    private String nik;
    @TableColumn(name = "ALAMAT", number = 6, size = 35, renderer = TableRenderDefault.class)
    private String alamat;
    private String kelurahan;
    private String kecamatan;
    @TableColumn(name = "TELEPON", number = 7, size = 15, renderer = TableRenderDefault.class)
    private String telepon;
    @TableColumn(name = "SK CPNS", number = 8, size = 30, renderer = TableRenderDefault.class)
    private String skCpns;
    @TableColumn(name = "SK PENGANGKATAN", number = 9, size = 30, renderer = TableRenderDefault.class)
    private String skPengangkatan;
    @TableColumn(name = "SK TERAKHIR", number = 10, size = 30, renderer = TableRenderDefault.class)
    private String skTerakhir;
    @TableColumn(name = "TASPEN", number = 11, size = 30, renderer = TableRenderDefault.class)
    private String taspen;
    @TableColumn(name = "SK PENSIUN", number = 12, size = 30, renderer = TableRenderDefault.class)
    private String skPensiun;
    @TableColumn(name = "KARIP", number = 13, size = 30, renderer = TableRenderDefault.class)
    private String karip;
    @TableColumn(name = "SHM", number = 14, size = 30, renderer = TableRenderDefault.class)
    private String shm;
    @TableColumn(name = "SHT", number = 15, size = 30, renderer = TableRenderDefault.class)
    private String sht;
    @TableColumn(name = "IJAZAH", number = 16, size = 30, renderer = TableRenderDefault.class)
    private String ijazah;
    @TableColumn(name = "SP2K", number = 17, size = 30, renderer = TableRenderDefault.class)
    private String sp2k;
    @TableColumn(name = "SURAT PERJANJIAN", number = 18, size = 30, renderer = TableRenderDefault.class)
    private String suratPerjanjian;
    @TableColumn(name = "SK POTONG TERMIN", number = 19, size = 30, renderer = TableRenderDefault.class)
    private String skPotongTermin;
    @TableColumn(name = "SPK", number = 20, size = 30, renderer = TableRenderDefault.class)
    private String spk;
    @TableColumn(name = "WARKAT DEPOSITO", number = 21, size = 30, renderer = TableRenderDefault.class)
    private String warkatDeposito;
    @TableColumn(name = "SK PENCAIRAN DEPOSITO", number = 22, size = 30, renderer = TableRenderDefault.class)
    private String skPencairanDeposito;
    @TableColumn(name = "SHGB", number = 23, size = 30, renderer = TableRenderDefault.class)
    private String shgb;
    @TableColumn(name = "IMB", number = 24, size = 30, renderer = TableRenderDefault.class)
    private String imb;
    @TableColumn(name = "COVER NOTE", number = 25, size = 30, renderer = TableRenderDefault.class)
    private String coverNote;
    @TableColumn(name = "AJB", number = 26, size = 30, renderer = TableRenderDefault.class)
    private String ajb;
    @TableColumn(name = "SKMHT", number = 27, size = 30, renderer = TableRenderDefault.class)
    private String skmht;
    @TableColumn(name = "APHT", number = 28, size = 30, renderer = TableRenderDefault.class)
    private String apht;
    @TableColumn(name = "BPKB", number = 29, size = 30, renderer = TableRenderDefault.class)
    private String bpkb;
    @TableColumn(name = "KWITANSI", number = 30, size = 30, renderer = TableRenderDefault.class)
    private String kwitansi;
    @TableColumn(name = "FIDUCIA", number = 31, size = 30, renderer = TableRenderDefault.class)
    private String fiducia;

    private String permohonanKredit;
    @TableColumn(name = "LAINNYA 1", number = 32, size = 30, renderer = TableRenderDefault.class)
    private String lainnya;
    @TableColumn(name = "LAINNYA 2", number = 33, size = 30, renderer = TableRenderDefault.class)
    private String lainnya2;
    @TableColumn(name = "INSTANSI", number = 34, size = 25, renderer = InstansiRender.class)
    private InstansiModel instansi;
    @TableColumn(name = "SIUP", number = 35, size = 25, renderer = InstansiRender.class)
    private String siup;
    @TableColumn(name = "TANGGAL SIUP KADALUWARSA", number = 36, size = 25, renderer = InstansiRender.class)
    private Date tanggalSiup;
    @TableColumn(name = "TDP", number = 37, size = 25, renderer = InstansiRender.class)
    private String tdp;
    @TableColumn(name = "TANGGAL TDP KADALUWARSA", number = 38, size = 25, renderer = InstansiRender.class)
    private Date tanggalTdp;

    public DebiturModel() {
    }

    public DebiturModel(String cif, String nama, String tempatLahir, Date tanggalLahir, String nik, String alamat, String kelurahan, String kecamatan, String telepon, String skCpns, String skPengangkatan, String skTerakhir, String taspen, String skPensiun, String karip, String shm, String sht, String ijazah, String sp2k, String suratPerjanjian, String skPotongTermin, String spk, String warkatDeposito, String skPencairanDeposito, String shgb, String imb, String coverNote, String ajb, String skmht, String apht, String bpkb, String kwitansi, String fiducia, String permohonanKredit, String lainnya, String lainnya2, InstansiModel instansi, String siup, Date tanggalSiup, String tdp, Date tanggalTdp) {
        this.cif = cif;
        this.nama = nama;
        this.tempatLahir = tempatLahir;
        this.tanggalLahir = tanggalLahir;
        this.nik = nik;
        this.alamat = alamat;
        this.kelurahan = kelurahan;
        this.kecamatan = kecamatan;
        this.telepon = telepon;
        this.skCpns = skCpns;
        this.skPengangkatan = skPengangkatan;
        this.skTerakhir = skTerakhir;
        this.taspen = taspen;
        this.skPensiun = skPensiun;
        this.karip = karip;
        this.shm = shm;
        this.sht = sht;
        this.ijazah = ijazah;
        this.sp2k = sp2k;
        this.suratPerjanjian = suratPerjanjian;
        this.skPotongTermin = skPotongTermin;
        this.spk = spk;
        this.warkatDeposito = warkatDeposito;
        this.skPencairanDeposito = skPencairanDeposito;
        this.shgb = shgb;
        this.imb = imb;
        this.coverNote = coverNote;
        this.ajb = ajb;
        this.skmht = skmht;
        this.apht = apht;
        this.bpkb = bpkb;
        this.kwitansi = kwitansi;
        this.fiducia = fiducia;
        this.permohonanKredit = permohonanKredit;
        this.lainnya = lainnya;
        this.lainnya2 = lainnya2;
        this.instansi = instansi;
        this.siup = siup;
        this.tanggalSiup = tanggalSiup;
        this.tdp = tdp;
        this.tanggalTdp = tanggalTdp;
    }

    public String getCif() {
        return cif;
    }

    public void setCif(String cif) {
        this.cif = cif;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getTempatLahir() {
        return tempatLahir;
    }

    public void setTempatLahir(String tempatLahir) {
        this.tempatLahir = tempatLahir;
    }

    public Date getTanggalLahir() {
        return tanggalLahir;
    }

    public void setTanggalLahir(Date tanggalLahir) {
        this.tanggalLahir = tanggalLahir;
    }

    public String getNik() {
        return nik;
    }

    public void setNik(String nik) {
        this.nik = nik;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getKelurahan() {
        return kelurahan;
    }

    public void setKelurahan(String kelurahan) {
        this.kelurahan = kelurahan;
    }

    public String getKecamatan() {
        return kecamatan;
    }

    public void setKecamatan(String kecamatan) {
        this.kecamatan = kecamatan;
    }

    public String getTelepon() {
        return telepon;
    }

    public void setTelepon(String telepon) {
        this.telepon = telepon;
    }

    public String getSkCpns() {
        return skCpns;
    }

    public void setSkCpns(String skCpns) {
        this.skCpns = skCpns;
    }

    public String getSkPengangkatan() {
        return skPengangkatan;
    }

    public void setSkPengangkatan(String skPengangkatan) {
        this.skPengangkatan = skPengangkatan;
    }

    public String getSkTerakhir() {
        return skTerakhir;
    }

    public void setSkTerakhir(String skTerakhir) {
        this.skTerakhir = skTerakhir;
    }

    public String getTaspen() {
        return taspen;
    }

    public void setTaspen(String taspen) {
        this.taspen = taspen;
    }

    public String getSkPensiun() {
        return skPensiun;
    }

    public void setSkPensiun(String skPensiun) {
        this.skPensiun = skPensiun;
    }

    public String getKarip() {
        return karip;
    }

    public void setKarip(String karip) {
        this.karip = karip;
    }

    public String getShm() {
        return shm;
    }

    public void setShm(String shm) {
        this.shm = shm;
    }

    public String getSht() {
        return sht;
    }

    public void setSht(String sht) {
        this.sht = sht;
    }

    public String getIjazah() {
        return ijazah;
    }

    public void setIjazah(String ijazah) {
        this.ijazah = ijazah;
    }

    public String getLainnya() {
        return lainnya;
    }

    public void setLainnya(String lainnya) {
        this.lainnya = lainnya;
    }

    public InstansiModel getInstansi() {
        return instansi;
    }

    public void setInstansi(InstansiModel instansi) {
        this.instansi = instansi;
    }

    public String getSp2k() {
        return sp2k;
    }

    public void setSp2k(String sp2k) {
        this.sp2k = sp2k;
    }

    public String getSuratPerjanjian() {
        return suratPerjanjian;
    }

    public void setSuratPerjanjian(String suratPerjanjian) {
        this.suratPerjanjian = suratPerjanjian;
    }

    public String getSkPotongTermin() {
        return skPotongTermin;
    }

    public void setSkPotongTermin(String skPotongTermin) {
        this.skPotongTermin = skPotongTermin;
    }

    public String getSpk() {
        return spk;
    }

    public void setSpk(String spk) {
        this.spk = spk;
    }

    public String getWarkatDeposito() {
        return warkatDeposito;
    }

    public void setWarkatDeposito(String warkatDeposito) {
        this.warkatDeposito = warkatDeposito;
    }

    public String getSkPencairanDeposito() {
        return skPencairanDeposito;
    }

    public void setSkPencairanDeposito(String skPencairanDeposito) {
        this.skPencairanDeposito = skPencairanDeposito;
    }

    public String getShgb() {
        return shgb;
    }

    public void setShgb(String shgb) {
        this.shgb = shgb;
    }

    public String getImb() {
        return imb;
    }

    public void setImb(String imb) {
        this.imb = imb;
    }

    public String getCoverNote() {
        return coverNote;
    }

    public void setCoverNote(String coverNote) {
        this.coverNote = coverNote;
    }

    public String getAjb() {
        return ajb;
    }

    public void setAjb(String ajb) {
        this.ajb = ajb;
    }

    public String getSkmht() {
        return skmht;
    }

    public void setSkmht(String skmht) {
        this.skmht = skmht;
    }

    public String getApht() {
        return apht;
    }

    public void setApht(String apht) {
        this.apht = apht;
    }

    public String getBpkb() {
        return bpkb;
    }

    public void setBpkb(String bpkb) {
        this.bpkb = bpkb;
    }

    public String getKwitansi() {
        return kwitansi;
    }

    public void setKwitansi(String kwitansi) {
        this.kwitansi = kwitansi;
    }

    public String getFiducia() {
        return fiducia;
    }

    public void setFiducia(String fiducia) {
        this.fiducia = fiducia;
    }

    public String getLainnya2() {
        return lainnya2;
    }

    public void setLainnya2(String lainnya2) {
        this.lainnya2 = lainnya2;
    }

    public String getPermohonanKredit() {
        return permohonanKredit;
    }

    public void setPermohonanKredit(String permohonanKredit) {
        this.permohonanKredit = permohonanKredit;
    }

    public String getSiup() {
        return siup;
    }

    public void setSiup(String siup) {
        this.siup = siup;
    }

    public Date getTanggalSiup() {
        return tanggalSiup;
    }

    public void setTanggalSiup(Date tanggalSiup) {
        this.tanggalSiup = tanggalSiup;
    }

    public String getTdp() {
        return tdp;
    }

    public void setTdp(String tdp) {
        this.tdp = tdp;
    }

    public Date getTanggalTdp() {
        return tanggalTdp;
    }

    public void setTanggalTdp(Date tanggalTdp) {
        this.tanggalTdp = tanggalTdp;
    }

    public void insertDebitur() throws ArsipException {

        Debitur debitur = new Debitur();
        debitur.setCif(cif);
        debitur.setNama(nama);
        debitur.setTempatLahir(tempatLahir);
        debitur.setTanggalLahir(tanggalLahir);
        debitur.setNik(nik);
        debitur.setAlamat(alamat);
        debitur.setKelurahan(kelurahan);
        debitur.setKecamatan(kecamatan);
        debitur.setTelepon(telepon);
        debitur.setSkCpns(skCpns);
        debitur.setSkPengangkatan(skPengangkatan);
        debitur.setSkTerakhir(skTerakhir);
        debitur.setTaspen(taspen);
        debitur.setSkPensiun(skPensiun);
        debitur.setKarip(karip);
        debitur.setShm(shm);
        debitur.setSht(sht);
        debitur.setIjazah(ijazah);
        debitur.setLainnya(lainnya);
        debitur.setInstansi(new InstansiModel().getInstansiFromModel(instansi));
        debitur.setSp2k(sp2k);
        debitur.setSuratPerjanjian(suratPerjanjian);
        debitur.setSkPotongTermin(skPotongTermin);
        debitur.setSpk(spk);
        debitur.setWarkatDeposito(warkatDeposito);
        debitur.setSkPencairanDeposito(skPencairanDeposito);
        debitur.setShgb(shgb);
        debitur.setImb(imb);
        debitur.setCoverNote(coverNote);
        debitur.setAjb(ajb);
        debitur.setSkmht(skmht);
        debitur.setApht(apht);
        debitur.setBpkb(bpkb);
        debitur.setKwitansi(kwitansi);
        debitur.setFiducia(fiducia);
        debitur.setLainnya2(lainnya2);
        debitur.setPermohonanKredit(permohonanKredit);
        debitur.setSiup(siup);
        debitur.setTanggalSiup(tanggalSiup);
        debitur.setTdp(tdp);
        debitur.setTanggalTdp(tanggalTdp);

        DebiturDao dao = DatabaseConnection.getDebiturDao();
        dao.insertDebitur(debitur);
    }

    public void updateDebitur() throws ArsipException {

        Debitur debitur = new Debitur();
        debitur.setCif(cif);
        debitur.setNama(nama);
        debitur.setTempatLahir(tempatLahir);
        debitur.setTanggalLahir(tanggalLahir);
        debitur.setNik(nik);
        debitur.setAlamat(alamat);
        debitur.setKelurahan(kelurahan);
        debitur.setKecamatan(kecamatan);
        debitur.setTelepon(telepon);
        debitur.setSkCpns(skCpns);
        debitur.setSkPengangkatan(skPengangkatan);
        debitur.setSkTerakhir(skTerakhir);
        debitur.setTaspen(taspen);
        debitur.setSkPensiun(skPensiun);
        debitur.setKarip(karip);
        debitur.setShm(shm);
        debitur.setSht(sht);
        debitur.setIjazah(ijazah);
        debitur.setLainnya(lainnya);
        debitur.setInstansi(new InstansiModel().getInstansiFromModel(instansi));
        debitur.setSp2k(sp2k);
        debitur.setSuratPerjanjian(suratPerjanjian);
        debitur.setSkPotongTermin(skPotongTermin);
        debitur.setSpk(spk);
        debitur.setWarkatDeposito(warkatDeposito);
        debitur.setSkPencairanDeposito(skPencairanDeposito);
        debitur.setShgb(shgb);
        debitur.setImb(imb);
        debitur.setCoverNote(coverNote);
        debitur.setAjb(ajb);
        debitur.setSkmht(skmht);
        debitur.setApht(apht);
        debitur.setBpkb(bpkb);
        debitur.setKwitansi(kwitansi);
        debitur.setFiducia(fiducia);
        debitur.setLainnya2(lainnya2);
        debitur.setPermohonanKredit(permohonanKredit);
        debitur.setSiup(siup);
        debitur.setTanggalSiup(tanggalSiup);
        debitur.setTdp(tdp);
        debitur.setTanggalTdp(tanggalTdp);

        DebiturDao dao = DatabaseConnection.getDebiturDao();
        dao.updateDebitur(debitur);
    }

    public Debitur getDebiturFromModel(DebiturModel model) {
        Debitur debitur = new Debitur();
        debitur.setCif(model.getCif());
        debitur.setNama(model.getNama());
        debitur.setTempatLahir(model.getTempatLahir());
        debitur.setTanggalLahir(model.getTanggalLahir());
        debitur.setNik(model.getNik());
        debitur.setAlamat(model.getAlamat());
        debitur.setKelurahan(model.getKelurahan());
        debitur.setKecamatan(model.getKecamatan());
        debitur.setTelepon(model.getTelepon());
        debitur.setSkCpns(model.getSkCpns());
        debitur.setSkPengangkatan(model.getSkPengangkatan());
        debitur.setSkTerakhir(model.getSkTerakhir());
        debitur.setTaspen(model.getTaspen());
        debitur.setSkPensiun(model.getSkPensiun());
        debitur.setKarip(model.getKarip());
        debitur.setShm(model.getShm());
        debitur.setSht(model.getSht());
        debitur.setIjazah(model.getIjazah());
        debitur.setLainnya(model.getLainnya());
        debitur.setInstansi(model.getInstansi().getInstansiFromModel(model.getInstansi()));
        debitur.setSp2k(model.getSp2k());
        debitur.setSuratPerjanjian(model.getSuratPerjanjian());
        debitur.setSkPotongTermin(model.getSkPotongTermin());
        debitur.setSpk(model.getSpk());
        debitur.setWarkatDeposito(model.getWarkatDeposito());
        debitur.setSkPencairanDeposito(model.getSkPencairanDeposito());
        debitur.setShgb(model.getShgb());
        debitur.setImb(model.getImb());
        debitur.setCoverNote(model.getCoverNote());
        debitur.setAjb(model.getAjb());
        debitur.setSkmht(model.getSkmht());
        debitur.setApht(model.getApht());
        debitur.setBpkb(model.getBpkb());
        debitur.setKwitansi(model.getKwitansi());
        debitur.setFiducia(model.getFiducia());
        debitur.setLainnya2(model.getLainnya2());
        debitur.setPermohonanKredit(model.getPermohonanKredit());
        debitur.setSiup(model.getSiup());
        debitur.setTanggalSiup(model.getTanggalSiup());
        debitur.setTdp(model.getTdp());
        debitur.setTanggalTdp(model.getTanggalTdp());

        return debitur;
    }

    public void getByCif(String cif) throws ArsipException {
        DebiturDao dao = DatabaseConnection.getDebiturDao();
        Debitur model = dao.getDebitur(cif);

        if (model != null) {
            setCif(model.getCif());
            setNama(model.getNama());
            setTempatLahir(model.getTempatLahir());
            setTanggalLahir(model.getTanggalLahir());
            setNik(model.getNik());
            setAlamat(model.getAlamat());
            setKelurahan(model.getKelurahan());
            setKecamatan(model.getKecamatan());
            setTelepon(model.getTelepon());
            setSkCpns(model.getSkCpns());
            setSkPengangkatan(model.getSkPengangkatan());
            setSkTerakhir(model.getSkTerakhir());
            setTaspen(model.getTaspen());
            setSkPensiun(model.getSkPensiun());
            setKarip(model.getKarip());
            setShm(model.getShm());
            setSht(model.getSht());
            setLainnya(model.getLainnya());
            setIjazah(model.getIjazah());
            setInstansi(new InstansiModel().getInstansiModel(model.getInstansi().getIdInstansi()));
            setSp2k(model.getSp2k());
            setSuratPerjanjian(model.getSuratPerjanjian());
            setSkPotongTermin(model.getSkPotongTermin());
            setSpk(model.getSpk());
            setWarkatDeposito(model.getWarkatDeposito());
            setSkPencairanDeposito(model.getSkPencairanDeposito());
            setShgb(model.getShgb());
            setImb(model.getImb());
            setCoverNote(model.getCoverNote());
            setAjb(model.getAjb());
            setSkmht(model.getSkmht());
            setApht(model.getApht());
            setBpkb(model.getBpkb());
            setKwitansi(model.getKwitansi());
            setFiducia(model.getFiducia());
            setLainnya2(model.getLainnya2());
            setPermohonanKredit(model.getPermohonanKredit());
            setSiup(model.getSiup());
            setTanggalSiup(model.getTanggalSiup());
            setTdp(model.getTdp());
            setTanggalTdp(model.getTanggalTdp());
        }

    }

    public DebiturModel getDebiturModelByCif(String cif) throws ArsipException {
        DebiturDao dao = DatabaseConnection.getDebiturDao();
        Debitur model = dao.getDebitur(cif);
        DebiturModel debiturModel = null;
        if (model != null) {
            debiturModel = new DebiturModel();
            debiturModel.setCif(model.getCif());
            debiturModel.setNama(model.getNama());
            debiturModel.setTempatLahir(model.getTempatLahir());
            debiturModel.setTanggalLahir(model.getTanggalLahir());
            debiturModel.setNik(model.getNik());
            debiturModel.setAlamat(model.getAlamat());
            debiturModel.setKelurahan(model.getKelurahan());
            debiturModel.setKecamatan(model.getKecamatan());
            debiturModel.setTelepon(model.getTelepon());
            debiturModel.setSkCpns(model.getSkCpns());
            debiturModel.setSkPengangkatan(model.getSkPengangkatan());
            debiturModel.setSkTerakhir(model.getSkTerakhir());
            debiturModel.setTaspen(model.getTaspen());
            debiturModel.setSkPensiun(model.getSkPensiun());
            debiturModel.setKarip(model.getKarip());
            debiturModel.setShm(model.getShm());
            debiturModel.setSht(model.getSht());
            debiturModel.setLainnya(model.getLainnya());
            debiturModel.setIjazah(model.getIjazah());
            debiturModel.setInstansi(new InstansiModel().getInstansiModel(model.getInstansi().getIdInstansi()));
            debiturModel.setSp2k(model.getSp2k());
            debiturModel.setSuratPerjanjian(model.getSuratPerjanjian());
            debiturModel.setSkPotongTermin(model.getSkPotongTermin());
            debiturModel.setSpk(model.getSpk());
            debiturModel.setWarkatDeposito(model.getWarkatDeposito());
            debiturModel.setSkPencairanDeposito(model.getSkPencairanDeposito());
            debiturModel.setShgb(model.getShgb());
            debiturModel.setImb(model.getImb());
            debiturModel.setCoverNote(model.getCoverNote());
            debiturModel.setAjb(model.getAjb());
            debiturModel.setSkmht(model.getSkmht());
            debiturModel.setApht(model.getApht());
            debiturModel.setBpkb(model.getBpkb());
            debiturModel.setKwitansi(model.getKwitansi());
            debiturModel.setFiducia(model.getFiducia());
            debiturModel.setLainnya2(model.getLainnya2());
            debiturModel.setPermohonanKredit(model.getPermohonanKredit());
            debiturModel.setSiup(model.getSiup());
            debiturModel.setTanggalSiup(model.getTanggalSiup());
            debiturModel.setTdp(model.getTdp());
            debiturModel.setTanggalTdp(model.getTanggalTdp());
        }
        return debiturModel;
    }

    public String getKelengkapanBerkas(String inputCif) throws ArsipException {
        String x = "Data Detail Debitur CIF : " + inputCif;
        DebiturModel tmp = getDebiturModelByCif(inputCif);
        x = x + "\n>>Nama              : " + tmp.getNama() + "\n>>Alamat            : " + tmp.getAlamat() + "\n>>Nik               : " + tmp.getNik() + "\nKelengkapan Berkas Yang Dijaminkan ";
        if (!tmp.getSkCpns().trim().isEmpty()) {
            x = x + "\n>>SK PNS            : " + tmp.getSkCpns();
        }
        if (!tmp.getSkPengangkatan().trim().isEmpty()) {
            x = x + "\n>>SK PENGANGKATAN   : " + tmp.getSkPengangkatan();
        }
        if (!tmp.getSkTerakhir().trim().isEmpty()) {
            x = x + "\n>>SK TERAKHIR       : " + tmp.getSkTerakhir();
        }
        if (!tmp.getTaspen().trim().isEmpty()) {
            x = x + "\n>>NO TASPEN         : " + tmp.getTaspen();
        }
        if (!tmp.getSkPensiun().trim().isEmpty()) {
            x = x + "\n>>SK PENSIUN        : " + tmp.getSkPensiun();
        }
        if (!tmp.getKarip().trim().isEmpty()) {
            x = x + "\n>>NO KARIP          : " + tmp.getKarip();
        }
        if (!tmp.getShm().trim().isEmpty()) {
            x = x + "\n>>SHM               : " + tmp.getShm();
        }
        if (!tmp.getSht().trim().isEmpty()) {
            x = x + "\n>>SHT               : " + tmp.getSht();
        }
        if (!tmp.getIjazah().trim().isEmpty()) {
            x = x + "\n>>IJAZAH            : " + tmp.getIjazah();
        }
        if (!tmp.getSp2k().trim().isEmpty()) {
            x = x + "\n>>SP2K              : " + tmp.getSp2k();
        }
        if (!tmp.getSuratPerjanjian().trim().isEmpty()) {
            x = x + "\n>>SURAT PERJANJIAN  : " + tmp.getSuratPerjanjian();
        }
        if (!tmp.getSkPotongTermin().trim().isEmpty()) {
            x = x + "\n>>SK POTONG TERMIN  : " + tmp.getSkPotongTermin();
        }
        if (!tmp.getSpk().trim().isEmpty()) {
            x = x + "\n>>SPK               : " + tmp.getSpk();
        }
        if (!tmp.getWarkatDeposito().trim().isEmpty()) {
            x = x + "\n>>WARKAT DEPOSITO   : " + tmp.getWarkatDeposito();
        }
        if (!tmp.getSkPencairanDeposito().trim().isEmpty()) {
            x = x + "\n>>SURAT PNC DEPOSITO: " + tmp.getSkPencairanDeposito();
        }
        if (!tmp.getShgb().trim().isEmpty()) {
            x = x + "\n>>SHGB              : " + tmp.getShgb();
        }
        if (!tmp.getImb().trim().isEmpty()) {
            x = x + "\n>>IMB               : " + tmp.getImb();
        }
        if (!tmp.getCoverNote().trim().isEmpty()) {
            x = x + "\n>>COVER NOTE        : " + tmp.getCoverNote();
        }
        if (!tmp.getAjb().trim().isEmpty()) {
            x = x + "\n>>AJB               : " + tmp.getAjb();
        }
        if (!tmp.getSkmht().trim().isEmpty()) {
            x = x + "\n>>SKMHT             : " + tmp.getSkmht();
        }
        if (!tmp.getApht().trim().isEmpty()) {
            x = x + "\n>>APHT              : " + tmp.getApht();
        }
        if (!tmp.getBpkb().trim().isEmpty()) {
            x = x + "\n>>BPKB              : " + tmp.getBpkb();
        }
        if (!tmp.getKwitansi().trim().isEmpty()) {
            x = x + "\n>>KWITANSI          : " + tmp.getKwitansi();
        }
        if (!tmp.getFiducia().trim().isEmpty()) {
            x = x + "\n>>FIDUCIA           : " + tmp.getFiducia();
        }
        if (!tmp.getPermohonanKredit().trim().isEmpty()) {
            x = x + "\n>>PERMOHONAN KRD    : " + tmp.getPermohonanKredit();
        }
        if (!tmp.getSiup().trim().isEmpty()) {
            x = x + "\n>>SIUP              : " + tmp.getSiup() + " TANGGAL KADALUARSA : " + tmp.getTanggalSiup();
        }
        if (!tmp.getTdp().trim().isEmpty()) {
            x = x + "\n>>TDP               : " + tmp.getTdp() + " TANGGAL KADALUARSA : " + tmp.getTanggalTdp();
        }
        return x;
    }

    public List<String> getKelengkapanListBerkas(String inputCif) throws ArsipException {
        List<String> builder = new ArrayList<>();

        DebiturModel tmp = getDebiturModelByCif(inputCif);

        if (!tmp.getSkCpns().trim().isEmpty()) {
            builder.add(tmp.getSkCpns());
        }
        if (!tmp.getSkPengangkatan().trim().isEmpty()) {
            builder.add(tmp.getSkPengangkatan());
        }
        if (!tmp.getSkTerakhir().trim().isEmpty()) {
            builder.add(tmp.getSkTerakhir());
        }
        if (!tmp.getTaspen().trim().isEmpty()) {
            builder.add(tmp.getTaspen());
        }
        if (!tmp.getSkPensiun().trim().isEmpty()) {
            builder.add(tmp.getSkPensiun());
        }
        if (!tmp.getKarip().trim().isEmpty()) {
            builder.add(tmp.getKarip());
        }
        if (!tmp.getShm().trim().isEmpty()) {
            builder.add(tmp.getShm());
        }
        if (!tmp.getSht().trim().isEmpty()) {
            builder.add(tmp.getSht());
        }
        if (!tmp.getIjazah().trim().isEmpty()) {
            builder.add(tmp.getIjazah());
        }
        if (!tmp.getSp2k().trim().isEmpty()) {
            builder.add(tmp.getSp2k());
        }
        if (!tmp.getSuratPerjanjian().trim().isEmpty()) {
            builder.add(tmp.getSuratPerjanjian());
        }
        if (!tmp.getSkPotongTermin().trim().isEmpty()) {
            builder.add(tmp.getSkPotongTermin());
        }
        if (!tmp.getSpk().trim().isEmpty()) {
            builder.add(tmp.getSpk());
        }
        if (!tmp.getWarkatDeposito().trim().isEmpty()) {
            builder.add(tmp.getWarkatDeposito());
        }
        if (!tmp.getSkPencairanDeposito().trim().isEmpty()) {
            builder.add(tmp.getSkPencairanDeposito());
        }
        if (!tmp.getShgb().trim().isEmpty()) {
            builder.add(tmp.getShgb());
        }
        if (!tmp.getImb().trim().isEmpty()) {
            builder.add(tmp.getImb());
        }
        if (!tmp.getCoverNote().trim().isEmpty()) {
            builder.add(tmp.getCoverNote());
        }
        if (!tmp.getAjb().trim().isEmpty()) {
            builder.add(tmp.getAjb());
        }
        if (!tmp.getSkmht().trim().isEmpty()) {
            builder.add(tmp.getSkmht());
        }
        if (!tmp.getApht().trim().isEmpty()) {
            builder.add(tmp.getApht());
        }
        if (!tmp.getBpkb().trim().isEmpty()) {
            builder.add(tmp.getBpkb());
        }
        if (!tmp.getKwitansi().trim().isEmpty()) {
            builder.add(tmp.getKwitansi());
        }
        if (!tmp.getFiducia().trim().isEmpty()) {
            builder.add(tmp.getFiducia());
        }
        if (!tmp.getPermohonanKredit().trim().isEmpty()) {
            builder.add(tmp.getPermohonanKredit());
        }
        if (!tmp.getSiup().trim().isEmpty()) {
            builder.add(tmp.getSiup() + " TANGGAL KADALUARSA : " + tmp.getTanggalSiup());
        }
        if (!tmp.getTdp().trim().isEmpty()) {
            builder.add(tmp.getTdp() + " TANGGAL KADALUARSA : " + tmp.getTanggalTdp());
        }
        return builder;
    }

    public List<BerkasModel> getListBerkas(String inputCif) throws ArsipException {
        List<BerkasModel> builder = new ArrayList<>();

        DebiturModel tmp = getDebiturModelByCif(inputCif);

        if (!tmp.getSkCpns().trim().isEmpty()) {
            BerkasModel model = new BerkasModel("SK CPNS", tmp.getSkCpns());
            builder.add(model);
        }
        if (!tmp.getSkPengangkatan().trim().isEmpty()) {
            BerkasModel model = new BerkasModel("SK PENGANGKATAN", tmp.getSkPengangkatan());
            builder.add(model);
        }
        if (!tmp.getSkTerakhir().trim().isEmpty()) {
            BerkasModel model = new BerkasModel("SK TERKAHIR", tmp.getSkTerakhir());
            builder.add(model);
        }
        if (!tmp.getTaspen().trim().isEmpty()) {
            BerkasModel model = new BerkasModel("TASPEN", tmp.getTaspen());
            builder.add(model);
        }
        if (!tmp.getSkPensiun().trim().isEmpty()) {
            BerkasModel model = new BerkasModel("SK PENSIUN", tmp.getSkPensiun());
            builder.add(model);
        }
        if (!tmp.getKarip().trim().isEmpty()) {
            BerkasModel model = new BerkasModel("KARIP", tmp.getKarip());
            builder.add(model);
        }
        if (!tmp.getShm().trim().isEmpty()) {
            BerkasModel model = new BerkasModel("SHM", tmp.getShm());
            builder.add(model);
        }
        if (!tmp.getSht().trim().isEmpty()) {
            BerkasModel model = new BerkasModel("SHT", tmp.getSht());
            builder.add(model);
        }
        if (!tmp.getIjazah().trim().isEmpty()) {
            BerkasModel model = new BerkasModel("IJAZAH", tmp.getIjazah());
            builder.add(model);
        }
        if (!tmp.getSp2k().trim().isEmpty()) {
            BerkasModel model = new BerkasModel("SP2K", tmp.getSp2k());
            builder.add(model);
        }
        if (!tmp.getSuratPerjanjian().trim().isEmpty()) {
            BerkasModel model = new BerkasModel("SURAT PERJANJIAN", tmp.getSuratPerjanjian());
            builder.add(model);
        }
        if (!tmp.getSkPotongTermin().trim().isEmpty()) {
            BerkasModel model = new BerkasModel("SK POTONG TERMIN", tmp.getSkPotongTermin());
            builder.add(model);
        }
        if (!tmp.getSpk().trim().isEmpty()) {
            BerkasModel model = new BerkasModel("SPK", tmp.getSpk());
            builder.add(model);
        }
        if (!tmp.getWarkatDeposito().trim().isEmpty()) {
            BerkasModel model = new BerkasModel("WARKAT DEPOSITO", tmp.getWarkatDeposito());
            builder.add(model);
        }
        if (!tmp.getSkPencairanDeposito().trim().isEmpty()) {
            BerkasModel model = new BerkasModel("SK PENCAIRAN DEPOSITO", tmp.getSkPencairanDeposito());
            builder.add(model);
        }
        if (!tmp.getShgb().trim().isEmpty()) {
            BerkasModel model = new BerkasModel("SHGB", tmp.getShgb());
            builder.add(model);
        }
        if (!tmp.getImb().trim().isEmpty()) {
            BerkasModel model = new BerkasModel("IMB", tmp.getImb());
            builder.add(model);
        }
        if (!tmp.getCoverNote().trim().isEmpty()) {
            BerkasModel model = new BerkasModel("COVER NOTE", tmp.getCoverNote());
            builder.add(model);
        }
        if (!tmp.getAjb().trim().isEmpty()) {
            BerkasModel model = new BerkasModel("AJB", tmp.getAjb());
            builder.add(model);
        }
        if (!tmp.getSkmht().trim().isEmpty()) {
            BerkasModel model = new BerkasModel("SKMHT", tmp.getSkmht());
            builder.add(model);
        }
        if (!tmp.getApht().trim().isEmpty()) {
            BerkasModel model=new BerkasModel("APHT", tmp.getApht());
            builder.add(model);
        }
        if (!tmp.getBpkb().trim().isEmpty()) {
            BerkasModel model=new BerkasModel("BPKB", tmp.getBpkb());
            builder.add(model);
        }
        if (!tmp.getKwitansi().trim().isEmpty()) {
            BerkasModel model=new BerkasModel("KWITANSI", tmp.getKwitansi());
            builder.add(model);
        }
        if (!tmp.getFiducia().trim().isEmpty()) {
            BerkasModel model=new BerkasModel("FIDUCIA", tmp.getFiducia());
            builder.add(model);
        }
        if (!tmp.getPermohonanKredit().trim().isEmpty()) {
            BerkasModel model=new BerkasModel("PERMOHONAN KRD", tmp.getPermohonanKredit());
            builder.add(model);
        }
        if (!tmp.getSiup().trim().isEmpty()) {
            BerkasModel model=new BerkasModel("SIUP", tmp.getSiup()+"TANGGAL BERLAKU : "+tmp.getTanggalSiup());
            builder.add(model);
        }
        if (!tmp.getTdp().trim().isEmpty()) {
            BerkasModel model=new BerkasModel("TDP", tmp.getTdp()+"TANGGAL BERLAKU : "+tmp.getTanggalTdp());
            builder.add(model);
        }
        return builder;
    }

    public List<DebiturModel> getListDebiturModelByCif(String cif) throws ArsipException {
        List<DebiturModel> list = new ArrayList<>();
        list.add(this.getDebiturModelByCif(cif));
        return list;
    }

    public int getJumlahDokumen(String cif) throws ArsipException {
        int dokumen = 0;
        DebiturDao dao = DatabaseConnection.getDebiturDao();
        Debitur debitur = dao.getDebitur(cif);

        if (!debitur.getSkCpns().equals("")) {
            dokumen = dokumen + 1;
        }
        if (!debitur.getSkPengangkatan().equals("")) {
            dokumen = dokumen + 1;
        }

        if (!debitur.getSkTerakhir().equals("")) {
            dokumen = dokumen + 1;
        }

        if (!debitur.getTaspen().equals("")) {
            dokumen = dokumen + 1;
        }

        if (!debitur.getSkPensiun().equals("")) {
            dokumen = dokumen + 1;
        }

        if (!debitur.getKarip().equals("")) {
            dokumen = dokumen + 1;
        }

        if (!debitur.getShm().equals("")) {
            dokumen = dokumen + 1;
        }

        if (!debitur.getSht().equals("")) {
            dokumen = dokumen + 1;
        }

        if (!debitur.getIjazah().equals("")) {
            dokumen = dokumen + 1;
        }

        if (!debitur.getLainnya().equals("")) {
            dokumen = dokumen + 1;
        }

        if (!debitur.getSp2k().equals("")) {
            dokumen = dokumen + 1;
        }

        if (!debitur.getSuratPerjanjian().equals("")) {
            dokumen = dokumen + 1;
        }

        if (!debitur.getSkPotongTermin().equals("")) {
            dokumen = dokumen + 1;
        }

        if (!debitur.getSpk().equals("")) {
            dokumen = dokumen + 1;
        }

        if (!debitur.getWarkatDeposito().equals("")) {
            dokumen = dokumen + 1;
        }

        if (!debitur.getSkPencairanDeposito().equals("")) {
            dokumen = dokumen + 1;
        }

        if (!debitur.getShgb().equals("")) {
            dokumen = dokumen + 1;
        }

        if (!debitur.getImb().equals("")) {
            dokumen = dokumen + 1;
        }

        if (!debitur.getCoverNote().equals("")) {
            dokumen = dokumen + 1;
        }

        if (!debitur.getAjb().equals("")) {
            dokumen = dokumen + 1;
        }

        if (!debitur.getSkmht().equals("")) {
            dokumen = dokumen + 1;
        }

        if (!debitur.getApht().equals("")) {
            dokumen = dokumen + 1;
        }

        if (!debitur.getBpkb().equals("")) {
            dokumen = dokumen + 1;
        }

        if (!debitur.getKwitansi().equals("")) {
            dokumen = dokumen + 1;
        }

        if (!debitur.getFiducia().equals("")) {
            dokumen = dokumen + 1;
        }

        if (!debitur.getLainnya2().equals("")) {
            dokumen = dokumen + 1;
        }

        if (!debitur.getPermohonanKredit().equals("")) {
            dokumen = dokumen + 1;
        }

        if (!debitur.getSiup().equals("")) {
            dokumen = dokumen + 1;
        }

        if (!debitur.getTdp().equals("")) {
            dokumen = dokumen + 1;
        }

        return dokumen;
    }
}
