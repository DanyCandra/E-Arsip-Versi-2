package com.bpd.arsip.database;

import com.bpd.arsip.dao.DusDao;
import com.bpd.arsip.dao.InstansiDao;
import com.bpd.arsip.dao.PejabatDao;
import com.bpd.arsip.dao.QuotaDao;
import com.bpd.arsip.dao.UserDao;
import com.bpd.arsip.dao.impl.InstansiDaoImpl;
import com.bpd.arsip.dao.LantaiDao;
import com.bpd.arsip.dao.RakDao;
import com.bpd.arsip.dao.impl.DusDaoImpl;
import com.bpd.arsip.dao.impl.LantaiDaoImpl;
import com.bpd.arsip.dao.impl.PejabatDaoImpl;
import com.bpd.arsip.dao.impl.QuotaDaoImpl;
import com.bpd.arsip.dao.impl.RakDaoImpl;
import com.bpd.arsip.dao.impl.UserDaoImpl;
import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Dany Candra
 */
public class DatabaseConnection {

    private static Connection connection;

    private static QuotaDao quotaDao;

    private static PejabatDao pejabatDao;

    private static InstansiDao instansiDao;

    private static UserDao userDao;

    private static LantaiDao lantaiDao;

    private static RakDao rakDao;

    private static DusDao dusDao;

    public static RakDao getRakDao() {
        if (rakDao == null) {
            rakDao = new RakDaoImpl(getConnection());
        }
        return rakDao;
    }

    public static DusDao getDusDao() {
        if (dusDao == null) {
            dusDao = new DusDaoImpl(getConnection());
        }
        return dusDao;
    }

    public static LantaiDao getLantaiDao() {
        if (lantaiDao == null) {
            lantaiDao = new LantaiDaoImpl(getConnection());
        }
        return lantaiDao;
    }

    public static UserDao getUserDao() {
        if (userDao == null) {
            userDao = new UserDaoImpl(getConnection());
        }
        return userDao;
    }

    public static InstansiDao getInstansiDao() {
        if (instansiDao == null) {
            instansiDao = new InstansiDaoImpl(getConnection());
        }
        return instansiDao;
    }

    public static PejabatDao getPejabatDao() {
        if (pejabatDao == null) {
            pejabatDao = new PejabatDaoImpl(getConnection());
        }
        return pejabatDao;
    }

    public static QuotaDao getQuotaDao() {
        if (quotaDao == null) {
            quotaDao = new QuotaDaoImpl(getConnection());
        }
        return quotaDao;
    }

    public static Connection getConnection() {
        if (connection == null) {
            Properties properties = new Properties();
            FileInputStream inputStream = null;
            try {
                inputStream = new FileInputStream("conf/database.properties");
                properties.load(inputStream);

                MysqlDataSource dataSource = new MysqlDataSource();
                dataSource.setUser(properties.getProperty("username"));
                dataSource.setPassword(properties.getProperty("password"));
                dataSource.setServerName(properties.getProperty("host"));
                dataSource.setPort(Integer.valueOf(properties.getProperty("port")));
                dataSource.setDatabaseName(properties.getProperty("database"));
                connection = dataSource.getConnection();
                inputStream.close();
            } catch (SQLException | IOException ex) {
                Logger.getLogger(DatabaseConnection.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                try {
                    if (inputStream != null) {
                        inputStream.close();
                    }
                } catch (IOException ex) {
                    Logger.getLogger(DatabaseConnection.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }

        return connection;
    }

    public static void closeConnection() {
        if (connection != null) {
            try {
                connection.close();
            } catch (SQLException ex) {
                Logger.getLogger(DatabaseConnection.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

}
