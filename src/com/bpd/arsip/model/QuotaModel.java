package com.bpd.arsip.model;

import com.bpd.arsip.dao.QuotaDao;
import com.bpd.arsip.database.DatabaseConnection;
import com.bpd.arsip.entitas.Quota;
import com.bpd.arsip.exception.ArsipException;

/**
 *
 * @author Dany Candra
 */
public class QuotaModel {

    private Integer id;
    private Integer isiDus;
    private Integer isiRak;

    public QuotaModel() {
    }

    public QuotaModel(Integer id, Integer isiDus, Integer isiRak) {
        this.id = id;
        this.isiDus = isiDus;
        this.isiRak = isiRak;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getIsiDus() {
        return isiDus;
    }

    public void setIsiDus(Integer isiDus) {
        this.isiDus = isiDus;
    }

    public Integer getIsiRak() {
        return isiRak;
    }

    public void setIsiRak(Integer isiRak) {
        this.isiRak = isiRak;
    }

    public void updateQuota() throws ArsipException {
        Quota quota = new Quota();
        quota.setId(id);
        quota.setIsiDus(isiDus);
        quota.setIsiRak(isiRak);

        QuotaDao dao = DatabaseConnection.getQuotaDao();
        dao.update(quota);
    }

    public void loadQuota() throws ArsipException {
        QuotaDao dao = DatabaseConnection.getQuotaDao();
        Quota quota = dao.showQuota();
        if (quota != null) {
            setId(quota.getId());
            setIsiDus(quota.getIsiDus());
            setIsiRak(quota.getIsiRak());
        }
        
    }

}
