package com.bpd.arsip.model;

import com.bpd.arsip.dao.LantaiDao;
import com.bpd.arsip.database.DatabaseConnection;
import com.bpd.arsip.entitas.Lantai;
import com.bpd.arsip.exception.ArsipException;
import com.bpd.arsip.helper.render.TableLantaiRender;
import com.bpd.arsip.helper.render.TableRenderDefault;
import com.stripbandunk.jwidget.annotation.TableColumn;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Dany Candra
 */
public class LantaiModel {
 
    private String idLantai;

    @TableColumn(name = "Lantai", number = 1, size = 110, renderer = TableRenderDefault.class)
    private String namaLantai;

    public LantaiModel() {
    }

    public LantaiModel(String idLantai, String namaLantai) {
        this.idLantai = idLantai;
        this.namaLantai = namaLantai;
    }

    public String getIdLantai() {
        return idLantai;
    }

    public void setIdLantai(String idLantai) {
        this.idLantai = idLantai;
    }

    public String getNamaLantai() {
        return namaLantai;
    }

    public void setNamaLantai(String namaLantai) {
        this.namaLantai = namaLantai;
    }

    public List<LantaiModel> load() throws ArsipException {
        List<LantaiModel> list = new ArrayList<LantaiModel>();

        LantaiDao dao = DatabaseConnection.getLantaiDao();
        List<Lantai> listTmp = dao.getAllLantai();
        for (Lantai lantai : listTmp) {
            LantaiModel model = new LantaiModel();
            model.setIdLantai(lantai.getIdLantai());
            model.setNamaLantai(lantai.getNamaLantai());
            list.add(model);
        }
        return list;
    }

    public void insert() throws ArsipException {
        Lantai lantai = new Lantai();
        lantai.setIdLantai(idLantai);
        lantai.setNamaLantai(namaLantai);

        LantaiDao dao = DatabaseConnection.getLantaiDao();
        dao.insertLantai(lantai);
    }

    public void update() throws ArsipException {
        Lantai lantai = new Lantai();
        lantai.setIdLantai(idLantai);
        lantai.setNamaLantai(namaLantai);

        LantaiDao dao = DatabaseConnection.getLantaiDao();
        dao.updateLantai(lantai);
    }

    public boolean isCanDelete() throws ArsipException {
        LantaiDao dao = DatabaseConnection.getLantaiDao();
        boolean result = dao.isCanDelete(idLantai);
        return result;
    }
    
    public boolean isCanInsert() throws ArsipException {
        LantaiDao dao = DatabaseConnection.getLantaiDao();
        boolean result = dao.isCanDelete(namaLantai);
        return result;
    }

    public void delete() throws ArsipException {
        LantaiDao dao = DatabaseConnection.getLantaiDao();
        dao.deleteLantai(idLantai);
    }

    public LantaiModel getLantaiModel(String idLantai) throws ArsipException {
        LantaiModel model = new LantaiModel();
        LantaiDao dao = DatabaseConnection.getLantaiDao();
        Lantai lantai = dao.getLantai(idLantai);

        model.setIdLantai(lantai.getIdLantai());
        model.setNamaLantai(lantai.getNamaLantai());

        return model;
    }

    public Lantai getLantaiFromModel(LantaiModel model) {
        Lantai lantai = new Lantai();
        lantai.setIdLantai(model.getIdLantai());
        lantai.setNamaLantai(model.getNamaLantai());
        return lantai;
    }
}
