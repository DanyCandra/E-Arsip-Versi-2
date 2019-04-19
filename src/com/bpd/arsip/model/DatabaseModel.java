/*
 * Aplikasi pengarsipan untuk mengelola berkas kredit PLO dan KWU di Bank Jateng Purwokerto.
 * Aplikasi ini dibuat oleh Dany Candra Febrianto | Bank Jateng Purwokerto 2016
 * Aplikasi ini bebas di modifikasi dan di kembangkan.
 */
package com.bpd.arsip.model;

import com.bpd.arsip.database.DatabaseConnection;
import com.bpd.arsip.exception.ArsipException;
import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
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
public class DatabaseModel {

    private String username;
    private String pasword;
    private String port;
    private String host;
    private String database;
    private Connection connection;

    public DatabaseModel() {
    }

    public DatabaseModel(String username, String pasword, String port, String host, String database) {
        this.username = username;
        this.pasword = pasword;
        this.port = port;
        this.host = host;
        this.database = database;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPasword() {
        return pasword;
    }

    public void setPasword(String pasword) {
        this.pasword = pasword;
    }

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getDatabase() {
        return database;
    }

    public void setDatabase(String database) {
        this.database = database;
    }

    public void settingDatabase() throws ArsipException {
        try {
            FileOutputStream outputStream = new FileOutputStream("conf/database.properties");
            Properties properties = new Properties();
            properties.setProperty("username", getUsername());
            properties.setProperty("password", getPasword());
            properties.setProperty("database", getDatabase());
            properties.setProperty("host", getHost());
            properties.setProperty("port", getPort());
            properties.store(outputStream, "");
        } catch (IOException ex) {
            Logger.getLogger(DatabaseModel.class.getName()).log(Level.SEVERE, null, ex);
            throw new ArsipException(ex.getMessage());
        }
    }

    public void loadConfigurationDatabase() throws ArsipException {

        FileInputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream("conf/database.properties");
            Properties properties = new Properties();
            properties.load(fileInputStream);
            setHost(properties.getProperty("host"));
            setDatabase(properties.getProperty("database"));
            setPasword(properties.getProperty("password"));
            setUsername(properties.getProperty("username"));
            setPort(properties.getProperty("port"));
            fileInputStream.close();
        } catch (IOException ex) {
            Logger.getLogger(DatabaseModel.class.getName()).log(Level.SEVERE, null, ex);
            throw new ArsipException(ex.getMessage());
        } finally {
            try {
                fileInputStream.close();
            } catch (IOException ex) {
                Logger.getLogger(DatabaseModel.class.getName()).log(Level.SEVERE, null, ex);
                throw new ArsipException(ex.getMessage());
            }
        }

    }

    public boolean isDatabaseConnected() {

        boolean result = false;
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
            result = true;

        } catch (SQLException ex) {
            result = false;
            //Logger.getLogger(DatabaseConnection.class.getName()).log(Level.SEVERE, null, ex);
        } catch (FileNotFoundException ex) {
            //Logger.getLogger(DatabaseConnection.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            //Logger.getLogger(DatabaseConnection.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                inputStream.close();
            } catch (IOException ex) {
                Logger.getLogger(DatabaseConnection.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        //closeConnection();
        return result;
    }

    public void closeConnection() {
        try {
            connection.close();
        } catch (SQLException ex) {
            Logger.getLogger(DatabaseModel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
