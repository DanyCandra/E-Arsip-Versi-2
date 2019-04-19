package com.bpd.arsip.database;

import com.bpd.arsip.dao.QuotaDao;
import com.bpd.arsip.dao.impl.QuotaDaoImpl;
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
                    if (inputStream!=null) {
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
