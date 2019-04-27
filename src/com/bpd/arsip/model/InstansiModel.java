/*
 * Aplikasi pengarsipan untuk mengelola berkas kredit PLO dan KWU di Bank Jateng Purwokerto.
 * Aplikasi ini dibuat oleh Dany Candra Febrianto | Bank Jateng Purwokerto 2016
 * Aplikasi ini bebas di modifikasi dan di kembangkan.
 */
package com.bpd.arsip.model;

import com.bpd.arsip.dao.InstansiDao;
import com.bpd.arsip.database.DatabaseConnection;
import com.bpd.arsip.entitas.Instansi;
import com.bpd.arsip.exception.ArsipException;
import com.bpd.arsip.helper.render.TableRenderDefault;
import com.stripbandunk.jwidget.annotation.TableColumn;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Dany Candra
 */
public class InstansiModel {
    
    @TableColumn(name = "ID INSTANSI", number = 1, size = 20,renderer = TableRenderDefault.class)
    private String idInstansi;
    @TableColumn(name = "NAMA INSTANSI", number = 2, size = 40,renderer = TableRenderDefault.class)
    private String namaInstansi;
    @TableColumn(name = "ALAMAT", number = 3, size = 60,renderer = TableRenderDefault.class)
    private String alamat;
    @TableColumn(name = "TELEPON", number = 4, size = 40,renderer = TableRenderDefault.class)
    private String telepon;

    public InstansiModel() {
    }

    public InstansiModel(String idInstansi, String namaInstansi, String alamat, String telepon) {
        this.idInstansi = idInstansi;
        this.namaInstansi = namaInstansi;
        this.alamat = alamat;
        this.telepon = telepon;
    }

    public String getIdInstansi() {
        return idInstansi;
    }

    public void setIdInstansi(String idInstansi) {
        this.idInstansi = idInstansi;
    }

    public String getNamaInstansi() {
        return namaInstansi;
    }

    public void setNamaInstansi(String namaInstansi) {
        this.namaInstansi = namaInstansi;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getTelepon() {
        return telepon;
    }

    public void setTelepon(String telepon) {
        this.telepon = telepon;
    }

    public List<InstansiModel> getAllInstansiModel() throws ArsipException {
        List<InstansiModel> list = new ArrayList<>();

        InstansiDao dao = DatabaseConnection.getInstansiDao();
        List<Instansi> listTmp = dao.getAllInstansi();
        listTmp.stream().map((instansi) -> {
            InstansiModel model = new InstansiModel();
            model.setIdInstansi(instansi.getIdInstansi());
            model.setAlamat(instansi.getAlamat());
            model.setNamaInstansi(instansi.getNamaInstansi());
            model.setTelepon(instansi.getTelepon());
            return model;
        }).forEachOrdered((model) -> {
            list.add(model);
        });
        return list;
    }

    public void insertInstansi() throws ArsipException {
        Instansi instansi = new Instansi();
        instansi.setIdInstansi(idInstansi);
        instansi.setAlamat(alamat);
        instansi.setNamaInstansi(namaInstansi);
        instansi.setTelepon(telepon);

        InstansiDao dao = DatabaseConnection.getInstansiDao();
        dao.insertInstansi(instansi);
    }

    public void updateInstansi() throws ArsipException {
        Instansi instansi = new Instansi();
        instansi.setIdInstansi(idInstansi);
        instansi.setAlamat(alamat);
        instansi.setNamaInstansi(namaInstansi);
        instansi.setTelepon(telepon);

        InstansiDao dao = DatabaseConnection.getInstansiDao();
        dao.updateInstansi(instansi);
    }

    public boolean isCanDelete() throws ArsipException {
        InstansiDao dao = DatabaseConnection.getInstansiDao();
        boolean result = dao.isCanDelete(idInstansi);
        return result;
    }

    public boolean isCanInsert() throws ArsipException {
        InstansiDao dao = DatabaseConnection.getInstansiDao();
        boolean result = dao.isCanInsert(namaInstansi);
        return result;
    }

    public void deleteInstansi() throws ArsipException {
        InstansiDao dao = DatabaseConnection.getInstansiDao();
        dao.delete(idInstansi);
    }

    public InstansiModel getInstansiModel(String idInstansi) throws ArsipException {
        InstansiDao dao = DatabaseConnection.getInstansiDao();
        Instansi instansi = dao.getInstansi(idInstansi);

        InstansiModel model = new InstansiModel();
        model.setIdInstansi(instansi.getIdInstansi());
        model.setAlamat(instansi.getAlamat());
        model.setNamaInstansi(instansi.getNamaInstansi());
        model.setTelepon(instansi.getTelepon());
        return model;
    }

    public List<InstansiModel> getAllInstansiModelByName(String namaInstansi) throws ArsipException {
        List<InstansiModel> list = new ArrayList<>();

        InstansiDao dao = DatabaseConnection.getInstansiDao();
        List<Instansi> listTmp = dao.getAllInstansiByName(namaInstansi);
        listTmp.stream().map((instansi) -> {
            InstansiModel model = new InstansiModel();
            model.setIdInstansi(instansi.getIdInstansi());
            model.setAlamat(instansi.getAlamat());
            model.setNamaInstansi(instansi.getNamaInstansi());
            model.setTelepon(instansi.getTelepon());
            return model;
        }).forEachOrdered((model) -> {
            list.add(model);
        });
        return list;
    }

    public Instansi getInstansiFromModel(InstansiModel model) {
        Instansi instansi = new Instansi();
        instansi.setIdInstansi(model.getIdInstansi());
        instansi.setAlamat(model.getAlamat());
        instansi.setNamaInstansi(model.getNamaInstansi());
        instansi.setTelepon(model.getTelepon());
        return instansi;
    }
    
    public void selectInstansiModelByName(String namaInstansi) throws ArsipException {
        InstansiDao dao = DatabaseConnection.getInstansiDao();
        Instansi instansi = dao.getInstansiByName(namaInstansi);
        if (instansi != null) {
            setIdInstansi(instansi.getIdInstansi());
            setAlamat(instansi.getAlamat());
            setNamaInstansi(instansi.getNamaInstansi());
            setTelepon(instansi.getTelepon());
        }
    }
    
}
