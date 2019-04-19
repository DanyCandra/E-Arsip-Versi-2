/*
 * Aplikasi pengarsipan untuk mengelola berkas kredit PLO dan KWU di Bank Jateng Purwokerto.
 * Aplikasi ini dibuat oleh Dany Candra Febrianto | Bank Jateng Purwokerto 2016
 * Aplikasi ini bebas di modifikasi dan di kembangkan.
 */
package com.bpd.arsip.model;

import com.bpd.arsip.dao.PejabatDao;
import com.bpd.arsip.database.DatabaseConnection;
import com.bpd.arsip.entitas.Pejabat;
import com.bpd.arsip.exception.ArsipException;
import com.bpd.arsip.helper.render.TableRenderDefault;
import com.stripbandunk.jwidget.annotation.TableColumn;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Dany Candra
 */
public class PejabatModel {
    
    @TableColumn(name = "ID PEJABAT ", number = 1, size = 20,renderer = TableRenderDefault.class)
    private String idPejabat;
    @TableColumn(name = "NAMA ", number = 2, size = 60,renderer = TableRenderDefault.class)
    private String namaPejabat;
    @TableColumn(name = "JABATAN", number = 3, size = 60,renderer = TableRenderDefault.class)
    private String jabatan;

    public PejabatModel() {
    }

    public PejabatModel(String idPejabat, String namaPejabat, String jabatan) {
        this.idPejabat = idPejabat;
        this.namaPejabat = namaPejabat;
        this.jabatan = jabatan;
    }

    public String getIdPejabat() {
        return idPejabat;
    }

    public void setIdPejabat(String idPejabat) {
        this.idPejabat = idPejabat;
    }

    public String getNamaPejabat() {
        return namaPejabat;
    }

    public void setNamaPejabat(String namaPejabat) {
        this.namaPejabat = namaPejabat;
    }

    public String getJabatan() {
        return jabatan;
    }

    public void setJabatan(String jabatan) {
        this.jabatan = jabatan;
    }

    public List<PejabatModel> getAllPejabatModel() throws ArsipException {
        List<PejabatModel> list = new ArrayList<PejabatModel>();
        PejabatDao dao = DatabaseConnection.getPejabatDao();
        List<Pejabat> pejabatList = dao.getPejabat();
        for (Pejabat pejabat : pejabatList) {
            PejabatModel model = new PejabatModel();
            model.setIdPejabat(pejabat.getIdPejabat());
            model.setJabatan(pejabat.getJabatan());
            model.setNamaPejabat(pejabat.getNamaPejabat());
            list.add(model);
        }
        return list;
    }

    public List<PejabatModel> getAllPejabatByName(String namaPejabat) throws ArsipException {
        List<PejabatModel> list = new ArrayList<PejabatModel>();
        PejabatDao dao = DatabaseConnection.getPejabatDao();
        List<Pejabat> pejabatList = dao.getPejabatByName(namaPejabat);
        for (Pejabat pejabat : pejabatList) {
            PejabatModel model = new PejabatModel();
            model.setIdPejabat(pejabat.getIdPejabat());
            model.setJabatan(pejabat.getJabatan());
            model.setNamaPejabat(pejabat.getNamaPejabat());
            list.add(model);
        }
        return list;
    }

    public void insertPejabat() throws ArsipException {
        PejabatDao dao = DatabaseConnection.getPejabatDao();
        Pejabat pejabat = new Pejabat();
        pejabat.setIdPejabat(idPejabat);
        pejabat.setJabatan(jabatan);
        pejabat.setNamaPejabat(namaPejabat);
        dao.insertPejabat(pejabat);
    }

    public void updatePejabat() throws ArsipException {
        PejabatDao dao = DatabaseConnection.getPejabatDao();
        Pejabat pejabat = new Pejabat();
        pejabat.setIdPejabat(idPejabat);
        pejabat.setJabatan(jabatan);
        pejabat.setNamaPejabat(namaPejabat);
        dao.updatePejabat(pejabat);
    }

    public void deletePejabat() throws ArsipException {
        PejabatDao dao = DatabaseConnection.getPejabatDao();
        dao.delete(idPejabat);
    }

    public boolean isCanInsert() throws ArsipException {
        PejabatDao dao = DatabaseConnection.getPejabatDao();
        boolean result = dao.isCanInsert(namaPejabat);
        return result;
    }

    public boolean isCanDelete() throws ArsipException {
        PejabatDao dao = DatabaseConnection.getPejabatDao();
        boolean result = dao.isCanDelete(idPejabat);
        return result;
    }

    public Pejabat getPejabatFromModel(PejabatModel model) {
        Pejabat pejabat = new Pejabat();
        pejabat.setIdPejabat(model.getIdPejabat());
        pejabat.setJabatan(model.getJabatan());
        pejabat.setNamaPejabat(model.getNamaPejabat());
        return pejabat;
        
    }
    
    public PejabatModel getPejabatModelById(String idPejabat) throws ArsipException {
        PejabatDao dao = DatabaseConnection.getPejabatDao();
        Pejabat pejabat = dao.getPejabat(idPejabat);
        PejabatModel model = null;
        if (pejabat != null) {
            model = new PejabatModel();
            model.setIdPejabat(pejabat.getIdPejabat());
            model.setNamaPejabat(pejabat.getNamaPejabat());
            model.setJabatan(pejabat.getJabatan());
        }
        return model;
    }
    
  

}
