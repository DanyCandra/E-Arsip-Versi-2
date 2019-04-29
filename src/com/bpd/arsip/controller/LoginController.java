/*
 * Aplikasi pengarsipan untuk mengelola berkas kredit PLO dan KWU di Bank Jateng Purwokerto.
 * Aplikasi ini dibuat oleh Dany Candra Febrianto | Bank Jateng Purwokerto 2016
 * Aplikasi ini bebas di modifikasi dan di kembangkan.
 */
package com.bpd.arsip.controller;

import com.bpd.arsip.exception.ArsipException;
import com.bpd.arsip.model.UserModel;
import com.bpd.arsip.validator.ValidatorNotNull;
import com.bpd.arsip.view.MainFrame;
import com.bpd.arsip.view.dialog.DialogLoadAwal;
import com.bpd.arsip.view.dialog.DialogLogin;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.SwingWorker;

/**
 *
 * @author Dany Candra
 */
public class LoginController {

    private UserModel userModel;

    public void setUserModel(UserModel userModel) {
        this.userModel = userModel;
    }

    public void loginUser(DialogLogin view) {
        String username = view.getTextUsername().getText().toUpperCase();
        String password = new String(view.getTextPassword().getPassword()).toUpperCase();

        if (ValidatorNotNull.isNotNull(username, view, "USERNAME")
                && ValidatorNotNull.isNotNull(password, view, "PASSWORD")) {
            try {
                if (userModel.getUserLogin(username, password) == true
                        || userModel.getUserLoginByProperties(username, password) == true) {
                    JOptionPane.showMessageDialog(view, "Login Berhasil, Selamat Datang " + userModel.getNama());
                    view.setVisible(false);

                    new SwingWorker<Object, Object>() {
                        DialogLoadAwal sp = new DialogLoadAwal();
                        MainFrame frame = null;

                        @Override
                        protected Object doInBackground() throws Exception {
                            sp.setLocationRelativeTo(null);
                            sp.setVisible(true);

                            frame = new MainFrame();
                            frame.setUserModel(userModel);
                            frame.getTextUsername().setText(userModel.getNama().toUpperCase());
                            return null;

                        }

                        @Override
                        protected void done() {

                            frame.setVisible(true);
                            frame.setMenuUser();
                            sp.setVisible(false);
                        }

                    }.execute();

                } else {
                    JOptionPane.showMessageDialog(view, "Username Tidak Terdaftar");
                }
            } catch (ArsipException ex) {
                JOptionPane.showMessageDialog(view, "Username Tidak Terdaftar");
                Logger.getLogger(LoginController.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }

}
