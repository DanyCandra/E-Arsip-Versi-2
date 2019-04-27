/*
 * Aplikasi pengarsipan untuk mengelola berkas kredit PLO dan KWU di Bank Jateng Purwokerto.
 * Aplikasi ini dibuat oleh Dany Candra Febrianto | Bank Jateng Purwokerto 2016
 * Aplikasi ini bebas di modifikasi dan di kembangkan.
 */
package com.bpd.arsip.controller;

import com.bpd.arsip.exception.ArsipException;
import com.bpd.arsip.model.DatabaseModel;
import com.bpd.arsip.validator.ValidatorNotNull;
import com.bpd.arsip.view.dialog.DialogDatabaseSetting;
import com.bpd.arsip.view.dialog.DialogLogin;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Dany Candra
 */
public class DatabaseController {

    private DatabaseModel databaseModel;

    public void setDatabaseModel(DatabaseModel databaseModel) {
        this.databaseModel = databaseModel;
    }

    public boolean isDatabaseConnected() {
        boolean result = databaseModel.isDatabaseConnected();
        
        return result;
    }

    public void loadConfiguration(DialogDatabaseSetting view) {
        try {
            databaseModel.loadConfigurationDatabase();
            view.getTextDatabase().setText(databaseModel.getDatabase());
            view.getTextHost().setText(databaseModel.getHost());
            view.getTextPassword().setText(databaseModel.getPasword());
            view.getTextPort().setText(databaseModel.getPort());
            view.getTextUsername().setText(databaseModel.getUsername());
        } catch (ArsipException ex) {
            Logger.getLogger(DatabaseController.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void resetConfiguration(DialogDatabaseSetting view) {
        try {
            databaseModel.loadConfigurationDatabase();
            view.getTextDatabase().setText("e-arsip");
            view.getTextHost().setText("localhost");
            view.getTextPassword().setText("");
            view.getTextPort().setText("3306");
            view.getTextUsername().setText("root");
        } catch (ArsipException ex) {
            Logger.getLogger(DatabaseController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void settingDatabase(DialogDatabaseSetting view) {
        String database = view.getTextDatabase().getText();
        String host = view.getTextHost().getText();
        String port = view.getTextPort().getText();
        String username = view.getTextUsername().getText();
        String password = new String(view.getTextPassword().getPassword());

        if (ValidatorNotNull.isNotNull(database, view, "Database")
                && ValidatorNotNull.isNotNull(host, view, "Host")
                && ValidatorNotNull.isNotNull(port, view, "Port")
                && ValidatorNotNull.isNotNull(username, view, "Username")) {
            try {
                databaseModel.setDatabase(database);
                databaseModel.setHost(host);
                databaseModel.setPasword(password);
                databaseModel.setPort(port);
                databaseModel.setUsername(username);
                databaseModel.settingDatabase();
                
                if (databaseModel.isDatabaseConnected()==true) {
                    JOptionPane.showMessageDialog(view, "Database Terhubung");
                    databaseModel.closeConnection();
                    showLoginDialog(view);
                }else{
                    JOptionPane.showMessageDialog(view, "Database Tidak Terhubung");
                }
               

            } catch (ArsipException ex) {
                Logger.getLogger(DatabaseController.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }

    public void showLoginDialog(DialogDatabaseSetting view) {
        view.setVisible(false);
        DialogLogin login = new DialogLogin();
        login.setVisible(true);
    }
    
    public void closeConnection(){
        databaseModel.closeConnection();
    }

}
