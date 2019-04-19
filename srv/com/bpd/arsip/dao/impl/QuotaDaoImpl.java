package com.bpd.arsip.dao.impl;

import com.bpd.arsip.dao.QuotaDao;
import com.bpd.arsip.entitas.Quota;
import com.bpd.arsip.exception.ArsipException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Dany Candra
 */
public class QuotaDaoImpl implements QuotaDao {

    private final Connection connection;

    public QuotaDaoImpl(Connection connection) {
        this.connection = connection;
    }

    @Override
    public void update(Quota quota) throws ArsipException {
        final String UPDATE;
        UPDATE = "UPDATE  QUOTA SET ISI_DUS=?, ISI_RAK=? WHERE ID = 1 ";

        PreparedStatement statement = null;
        try {
            statement = connection.prepareStatement(UPDATE);

            statement.setInt(1, quota.getIsiDus());
            statement.setInt(2, quota.getIsiRak());

            statement.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(QuotaDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
            throw new ArsipException(ex.getMessage());
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(QuotaDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
                    throw new ArsipException(ex.getMessage());
                }
            }
        }
    }

    @Override
    public Quota showQuota() throws ArsipException {
        final String SELECT = "SELECT * FROM QUOTA WHERE ID = 1";

        Quota quota = null;
        PreparedStatement statement = null;
        try {
            statement = connection.prepareStatement(SELECT);
            ResultSet set = statement.executeQuery();
            if (set.next()) {
                quota = new Quota();
                quota.setId(set.getInt(1));
                quota.setIsiDus(set.getInt(2));
                quota.setIsiRak(set.getInt(3));
            } else {
                System.out.println("gagal");
            }
        } catch (SQLException ex) {
            Logger.getLogger(QuotaDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
            throw new ArsipException(ex.getMessage());

        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(QuotaDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
                    throw new ArsipException(ex.getMessage());
                }
            }
        }
        return quota;
    }

}
