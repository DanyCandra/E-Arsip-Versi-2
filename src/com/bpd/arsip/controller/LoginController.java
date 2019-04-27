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
import com.bpd.arsip.view.dialog.DialogLogin;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

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
                    JOptionPane.showMessageDialog(view, "Login Berhasil, Selamat Datang Operator");
                    view.setVisible(false);
                    
                    MainFrame frame = new MainFrame();
                    frame.setUserModel(userModel);
                    frame.getTextUsername().setText(userModel.getNama());
                    frame.setVisible(true);
                } else {
                    JOptionPane.showMessageDialog(view, "Username Tidak Terdaftar");
                }
            } catch (ArsipException ex) {
                Logger.getLogger(LoginController.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }

}
