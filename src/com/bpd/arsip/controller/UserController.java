package com.bpd.arsip.controller;

import com.bpd.arsip.exception.ArsipException;
import com.bpd.arsip.helper.HelperGeneratorAutoId;
import com.bpd.arsip.model.UserModel;
import com.bpd.arsip.validator.ValidatorNotNull;
import com.bpd.arsip.validator.ValidatorTextLimit;
import com.bpd.arsip.view.panel.PanelUser;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.SwingWorker;

/**
 *
 * @author Dany Candra
 */
public class UserController {

    private UserModel userModel;

    public void setUserModel(UserModel userModel) {
        this.userModel = userModel;
    }

    public void loadTableUser(PanelUser view) {
        new SwingWorker<List<UserModel>, Object>() {

            @Override
            protected List<UserModel> doInBackground() throws Exception {
                List<UserModel> list = userModel.getAllUserModel();
                return list;
            }

            @Override
            protected void done() {
                try {
                    view.getTableModelUser().clear();
                    for (UserModel model : get()) {
                        view.getTableModelUser().add(model);
                    }
                } catch (InterruptedException | ExecutionException ex) {
                    Logger.getLogger(UserController.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

        }.execute();
    }

    public boolean isSelectedRow(PanelUser view) {
        boolean result = false;
        if (view.getTableUser().getSelectedRow() != -1 && view.getTableUser().getSelectedRowCount() == 1) {
            result = true;
        } else {
            JOptionPane.showMessageDialog(view, "Silahkan Pilih Data Terlebih Dahulu");
        }
        return result;
    }

    public void selectUser(PanelUser view) {
        int index = view.getTableUser().getSelectedRow();
        userModel = view.getTableModelUser().get(view.getTableUser().convertRowIndexToModel(index));
        view.getTextNama().setText(userModel.getNama());
        view.getTextUsername().setText(userModel.getUserName());
        view.getTextPassword().setText(userModel.getPassword());
    }

    public void insert(PanelUser view) {
        String idUser = HelperGeneratorAutoId.generateAutoIdUser();
        String nama = view.getTextNama().getText().toUpperCase();
        String username = view.getTextUsername().getText().toUpperCase();
        String password = new String(view.getTextPassword().getPassword()).toUpperCase();

        if (ValidatorNotNull.isNotNull(nama, view, "NAMA")
                && ValidatorNotNull.isNotNull(username, view, "USERNAME")
                && ValidatorNotNull.isNotNull(password, view, "PASSWORD")
                && ValidatorTextLimit.isLimit(nama, 50, view, "NAMA")
                && ValidatorTextLimit.isLimit(username, 20, view, "USERNAME")
                && ValidatorTextLimit.isLimit(password, 20, view, "PASSWORD")) {
            try {

                userModel.setIdUser(idUser);
                userModel.setNama(nama);
                userModel.setUserName(username);
                userModel.setPassword(password);
                if (userModel.isCanInsert() == true) {
                    userModel.insert();
                    JOptionPane.showMessageDialog(view, "Data Berhasil Disimpan");
                    batal(view);

                } else {
                    JOptionPane.showMessageDialog(view, "Data Gagal Disimpan, Data Telah Tersedia");
                }

            } catch (ArsipException ex) {
                JOptionPane.showMessageDialog(view, new Object[]{"Terjadi Error Dengan Database", ex.getMessage()}, "Telah Terjadi Error", JOptionPane.ERROR_MESSAGE);
                Logger.getLogger(UserController.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public void update(PanelUser view) {
        if (view.getTableUser().getSelectedRowCount() == 0) {
            JOptionPane.showMessageDialog(view, "Silahkan Pilih Data Terlebih Dahulu");
        } else {
            String nama = view.getTextNama().getText().toUpperCase();
            String username = view.getTextUsername().getText().toUpperCase();
            String password = new String(view.getTextPassword().getPassword()).toUpperCase();

            if (ValidatorNotNull.isNotNull(nama, view, "NAMA")
                    && ValidatorNotNull.isNotNull(username, view, "USERNAME")
                    && ValidatorNotNull.isNotNull(password, view, "PASSWORD")
                    && ValidatorTextLimit.isLimit(nama, 50, view, "NAMA")
                    && ValidatorTextLimit.isLimit(username, 20, view, "USERNAME")
                    && ValidatorTextLimit.isLimit(password, 20, view, "PASSWORD")) {
                try {

                    userModel.setNama(nama);
                    userModel.setUserName(username);
                    userModel.setPassword(password);
                    if (userModel.isCanInsert() == true) {
                        userModel.update();
                        JOptionPane.showMessageDialog(view, "Data Berhasil Disimpan");
                        batal(view);

                    } else {
                        JOptionPane.showMessageDialog(view, "Username Tidak Boleh Sama");
                    }

                } catch (ArsipException ex) {
                    JOptionPane.showMessageDialog(view, new Object[]{"Terjadi Error Dengan Database", ex.getMessage()}, "Telah Terjadi Error", JOptionPane.ERROR_MESSAGE);
                    Logger.getLogger(UserController.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }

    public void initInputButton(PanelUser view, boolean value) {
        view.getButtonTambah().setEnabled(value);
        view.getButtonUbah().setEnabled(value);
        view.getButtonHapus().setEnabled(value);
        view.getButtonBatal().setEnabled(!value);
        view.getButtonSimpan().setEnabled(!value);
        view.getTableUser().setEnabled(value);

        view.getTextNama().setEnabled(!value);
        view.getTextUsername().setEnabled(!value);
        view.getTextPassword().setEnabled(!value);
    }

    public void inputText(PanelUser view, boolean isInput) {
        if (isInput == true) {
            view.getTextNama().setText("");
            view.getTextPassword().setText("");
            view.getTextUsername().setText("");
        }
        view.getTextNama().requestFocus();
    }

    public void tambah(PanelUser view) {
        initInputButton(view, false);
        inputText(view, true);
        view.setInput(true);
    }

    public void ubah(PanelUser view) {
        if (isSelectedRow(view) == true) {
            view.setInput(false);
            selectUser(view);
            initInputButton(view, false);
            inputText(view, false);
            view.setInput(false);
        }
    }

    public void hapus(PanelUser view) {
        if (isSelectedRow(view) == true) {
            int index = view.getTableUser().getSelectedRow();
            if (JOptionPane.showConfirmDialog(view, "Apakah Anda Yakin Akan Menghapus Data ?") == JOptionPane.OK_OPTION) {
                try {
                    userModel = view.getTableModelUser().get(view.getTableUser().convertRowIndexToModel(index));
                    if (userModel.isCanDelete()) {
                        userModel.delete();
                        initInputButton(view, true);
                        inputText(view, true);
                        JOptionPane.showMessageDialog(view, "Data Berhasil Dihapus");
                        loadTableUser(view);
                    } else {
                        JOptionPane.showMessageDialog(view, "Data Gagal Dihapus, Data Telah Berelasi Dengan Data Pengarsipan");
                    }
                } catch (ArsipException ex) {
                    Logger.getLogger(PejabatController.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }

    public void simpan(PanelUser view) {
        if (view.isInput() == true) {
            insert(view);
        } else if (view.isInput() == false) {
            update(view);
        }
        loadTableUser(view);
    }

    public void batal(PanelUser view) {
        initInputButton(view, true);
        inputText(view, true);
    }

    public void cari(PanelUser view) {
        String nama = view.getTextCari().getText().toUpperCase();
        if (nama.trim().isEmpty()) {
            loadTableUser(view);
        } else {
            new SwingWorker<List<UserModel>, Object>() {
                @Override
                protected List<UserModel> doInBackground() throws Exception {
                    view.getMainFrame().startLoading(true);
                    List<UserModel> list = userModel.getAllUserModelByName(nama);
                    return list;
                }

                @Override
                protected void done() {
                    try {
                        view.getTableModelUser().clear();
                        for (UserModel model : get()) {
                            view.getTableModelUser().add(model);
                        }
                        view.getTextCari().requestFocus();
                        view.getMainFrame().startLoading(false);
                    } catch (InterruptedException | ExecutionException ex) {
                        Logger.getLogger(PejabatController.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }.execute();
        }
    }

}
