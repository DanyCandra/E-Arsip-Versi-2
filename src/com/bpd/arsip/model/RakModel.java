/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bpd.arsip.model;


import com.bpd.arsip.dao.RakDao;
import com.bpd.arsip.database.DatabaseConnection;
import com.bpd.arsip.entitas.Rak;
import com.bpd.arsip.exception.ArsipException;
import com.bpd.arsip.helper.HelperGeneratorAutoId;
import com.bpd.arsip.helper.render.NamaRakRender;
import com.bpd.arsip.helper.render.QuotaRakRender;
import com.stripbandunk.jwidget.annotation.TableColumn;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

/**
 *
 * @author Dany Candra
 */
public class RakModel {
    
    private String idRak;
    @TableColumn(name = "NAMA RAK", number = 1, size = 50, renderer = NamaRakRender.class)
    private int namaRak;
    @TableColumn(name = "QUOTA RAK", number = 2, size = 60, renderer = QuotaRakRender.class)
    private int quota;
    
    public RakModel() {
    }
    
    public RakModel(String idRak, int namaRak, int quota) {
        this.idRak = idRak;
        this.namaRak = namaRak;
        this.quota = quota;
    }
    
    public String getIdRak() {
        return idRak;
    }
    
    public void setIdRak(String idRak) {
        this.idRak = idRak;
    }
    
    public int getNamaRak() {
        return namaRak;
    }
    
    public void setNamaRak(int namaRak) {
        this.namaRak = namaRak;
    }
    
    public int getQuota() {
        return quota;
    }
    
    public void setQuota(int quota) {
        this.quota = quota;
    }
    
    public List<RakModel> load() throws ArsipException {
        List<RakModel> list = new ArrayList<RakModel>();
        
        RakDao dao = DatabaseConnection.getRakDao();
        List<Rak> listTmp = dao.getAllRak();
        for (Rak rak : listTmp) {
            RakModel model = new RakModel();
            model.setIdRak(rak.getIdRak());
            model.setNamaRak(rak.getNamaRak());
            model.setQuota(rak.getQuota());
            list.add(model);
        }
        return list;
    }
    
    public void insert() throws ArsipException {
        Rak rak = new Rak();
        rak.setIdRak(HelperGeneratorAutoId.generateAutoId());
        rak.setNamaRak(getRakAkhir());
        rak.setQuota(getQuotaInsret());
        
        RakDao dao = DatabaseConnection.getRakDao();
        dao.insertRak(rak);
    }
    
    public int getRakAkhir() throws ArsipException {
        RakDao dao = DatabaseConnection.getRakDao();
        return dao.getRakAkhir() + 1;
        
    }
    
    public int getQuotaInsret() {
        int quota = 0;
        try {
            FileInputStream fileInputStream = new FileInputStream("conf/quota.properties");
            Properties properties = new Properties();
            properties.load(fileInputStream);
            quota = Integer.valueOf(properties.getProperty("rak"));
        } catch (Exception e) {
        }
        return quota;
    }
    
    public RakModel getRakModel(String idRak) throws ArsipException {
        RakModel model = new RakModel();
        RakDao dao = DatabaseConnection.getRakDao();
        Rak rak = dao.getRak(idRak);
        
        model.setIdRak(rak.getIdRak());
        model.setNamaRak(rak.getNamaRak());
        model.setQuota(rak.getQuota());
        return model;
        
    }
    
    public Rak getRakFromModel(RakModel model) {
        Rak rak = new Rak();
        rak.setIdRak(model.getIdRak());
        rak.setNamaRak(model.getNamaRak());
        rak.setQuota(model.getQuota());
        return rak;
    }
    
}
