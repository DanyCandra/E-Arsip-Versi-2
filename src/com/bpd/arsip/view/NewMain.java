package com.bpd.arsip.view;

import com.bpd.arsip.dao.QuotaDao;
import com.bpd.arsip.dao.impl.QuotaDaoImpl;
import com.bpd.arsip.database.DatabaseConnection;
import com.bpd.arsip.entitas.Quota;
import com.bpd.arsip.exception.ArsipException;

/**
 *
 * @author Dany Candra
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ArsipException {
        QuotaDao dao = new QuotaDaoImpl(DatabaseConnection.getConnection());
        Quota quota = dao.showQuota();
    }

}
