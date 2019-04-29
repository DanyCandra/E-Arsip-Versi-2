/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bpd.arsip.controller;

import com.bpd.arsip.exception.ArsipException;
import com.bpd.arsip.model.UserModel;
import com.bpd.arsip.validator.ValidatorNotNull;
import com.bpd.arsip.validator.ValidatorTextLimit;
import com.bpd.arsip.view.panel.PanelUbahPassword;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author danychan
 */
public class UbahPasswordUserController {

    private UserModel userModel;

    public void setUserModel(UserModel userModel) {
        this.userModel = userModel;
    }

    public void setEnableInput(PanelUbahPassword view, boolean value) {
        view.getTextPassword().setEnabled(value);
        view.getTextUlangPassword().setEnabled(value);
    }

    public void ubahUserAdmin(PanelUbahPassword view) {
        String nama = view.getTextPemilik().getText().toUpperCase();
        String username = view.getTextUsername().getText().toUpperCase();
        String password1 = new String(view.getTextPassword().getPassword()).toUpperCase();
        String password2 = new String(view.getTextUlangPassword().getPassword()).toUpperCase();

        if (ValidatorNotNull.isNotNull(nama, view, "Nama")
                && ValidatorNotNull.isNotNull(username, view, "Username")
                && ValidatorNotNull.isNotNull(password1, view, "Password")
                && ValidatorNotNull.isNotNull(password2, view, "Ulangi Passsword")
                && ValidatorTextLimit.isLimit(nama, 50, view, "Nama")
                && ValidatorTextLimit.isLimit(username, 10, view, "Username")
                && ValidatorTextLimit.isLimit(password1, 10, view, "Password")) {

            if (password1.equals(password2)) {
                try {
                    userModel.setIdUser(view.getId());
                    userModel.setNama(nama);
                    userModel.setPassword(password2);
                    userModel.setUserName(username);
                    userModel.update();
                    JOptionPane.showMessageDialog(view, "Data Berhasil Disimpan");
                    setEnableInput(view, false);
                } catch (ArsipException ex) {
                    Logger.getLogger(UbahPasswordUserController.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else {
                JOptionPane.showMessageDialog(view, "Password Harus Sama");
            }
        }
    }

}
