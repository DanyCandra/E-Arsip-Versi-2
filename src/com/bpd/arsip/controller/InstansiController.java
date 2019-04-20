package com.bpd.arsip.controller;

import com.bpd.arsip.exception.ArsipException;
import com.bpd.arsip.helper.HelperGeneratorAutoId;
import com.bpd.arsip.model.InstansiModel;
import com.bpd.arsip.validator.ValidatorNotNull;
import com.bpd.arsip.validator.ValidatorTextLimit;
import com.bpd.arsip.view.panel.PanelInstansi;
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
public class InstansiController {

    private InstansiModel instansiModel;

    public void setInstansiModel(InstansiModel instansiModel) {
        this.instansiModel = instansiModel;
    }

    public void loadTableInstansi(PanelInstansi view) {
        new SwingWorker<List<InstansiModel>, Object>() {

            @Override
            protected List<InstansiModel> doInBackground() throws Exception {
                view.getMainFrame().startLoading(true);
                List<InstansiModel> list = instansiModel.getAllInstansiModel();
                return list;
            }

            @Override
            protected void done() {
                try {
                    view.getTableModelInstansi().clear();
                    for (InstansiModel model : get()) {
                        view.getTableModelInstansi().add(model);
                    }
                    view.getMainFrame().startLoading(false);
                } catch (InterruptedException | ExecutionException ex) {
                    Logger.getLogger(InstansiController.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

        }.execute();
    }

    public boolean isSelectedRow(PanelInstansi view) {
        boolean result = false;
        if (view.getTableInstansi().getSelectedRow() != -1 && view.getTableInstansi().getSelectedRowCount() == 1) {
            result = true;
        } else {
            JOptionPane.showMessageDialog(view, "Silahkan Pilih Data Terlebih Dahulu");
        }
        return result;
    }

    public void selectInstansi(PanelInstansi view) {
        int index = view.getTableInstansi().getSelectedRow();
        instansiModel = view.getTableModelInstansi().get(view.getTableInstansi().convertRowIndexToModel(index));
        view.getTextNamaInstansi().setText(instansiModel.getNamaInstansi().toUpperCase());
        view.getTextAlamat().setText(instansiModel.getAlamat().toUpperCase());
        view.getTextNoTelepon().setText(instansiModel.getTelepon().toUpperCase());
    }

    public void initInputButton(PanelInstansi view, boolean value) {
        view.getButtonTambah().setEnabled(value);
        view.getButtonUbah().setEnabled(value);
        view.getButtonHapus().setEnabled(value);
        view.getButtonBatal().setEnabled(!value);
        view.getButtonSimpan().setEnabled(!value);
        view.getTableInstansi().setEnabled(value);

        view.getTextAlamat().setEnabled(!value);
        view.getTextNamaInstansi().setEnabled(!value);
        view.getTextNoTelepon().setEnabled(!value);
    }

    public void insert(PanelInstansi view) {
        String idInstansi = HelperGeneratorAutoId.generateAutoIdInstansi();
        String namaInstansi = view.getTextNamaInstansi().getText().toUpperCase();
        String alamat = view.getTextAlamat().getText().toUpperCase();
        String telepon = view.getTextNoTelepon().getText().toUpperCase();

        if (ValidatorNotNull.isNotNull(namaInstansi, view, "NAMA")
                && ValidatorNotNull.isNotNull(alamat, view, "ALAMAT")
                && ValidatorTextLimit.isLimit(namaInstansi, 50, view, "NAMA")
                && ValidatorTextLimit.isLimit(alamat, 100, view, "ALAMAT")
                && ValidatorTextLimit.isLimit(telepon, 12, view, "TELEPON")) {
            try {
                instansiModel.setIdInstansi(idInstansi);
                instansiModel.setNamaInstansi(namaInstansi);
                instansiModel.setAlamat(alamat);
                instansiModel.setTelepon(telepon);

                if (instansiModel.isCanInsert() == true) {
                    instansiModel.insertInstansi();
                    JOptionPane.showMessageDialog(view, "Data Berhasil Disimpan");
                    batal(view);
                } else {
                    JOptionPane.showMessageDialog(view, "Data Gagal Disimpan, Data Telah Tersedia");
                }

            } catch (ArsipException ex) {
                JOptionPane.showMessageDialog(view, new Object[]{"Terjadi Error Dengan Database", ex.getMessage()}, "Telah Terjadi Error", JOptionPane.ERROR_MESSAGE);
                Logger.getLogger(InstansiController.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public void update(PanelInstansi view) {
        if (view.getTableInstansi().getSelectedRowCount() == 0) {
            JOptionPane.showMessageDialog(view, "Silahkan Pilih Data Terlebih Dahulu");
        } else {
            String namaInstansi = view.getTextNamaInstansi().getText().toUpperCase();
            String alamat = view.getTextAlamat().getText().toUpperCase();
            String telepon = view.getTextNoTelepon().getText().toUpperCase();

            if (ValidatorNotNull.isNotNull(namaInstansi, view, "NAMA")
                    && ValidatorNotNull.isNotNull(alamat, view, "ALAMAT")
                    && ValidatorTextLimit.isLimit(namaInstansi, 50, view, "NAMA")
                    && ValidatorTextLimit.isLimit(alamat, 100, view, "ALAMAT")
                    && ValidatorTextLimit.isLimit(telepon, 12, view, "TELEPON")) {
                try {

                    instansiModel.setNamaInstansi(namaInstansi);
                    instansiModel.setAlamat(alamat);
                    instansiModel.setTelepon(telepon);
                    instansiModel.updateInstansi();
                    JOptionPane.showMessageDialog(view, "Data Berhasil Disimpan");
                    batal(view);

                } catch (ArsipException ex) {
                    JOptionPane.showMessageDialog(view, new Object[]{"Terjadi Error Dengan Database", ex.getMessage()}, "Telah Terjadi Error", JOptionPane.ERROR_MESSAGE);
                    Logger.getLogger(InstansiController.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }

    public void inputText(PanelInstansi view, boolean isInput) {
        if (isInput == true) {
            view.getTextNamaInstansi().setText("");
            view.getTextAlamat().setText("");
            view.getTextNoTelepon().setText("");
        }
        view.getTextNamaInstansi().requestFocus();
    }

    public void tambah(PanelInstansi view) {
        initInputButton(view, false);
        inputText(view, true);
        view.setInput(true);
    }

    public void ubah(PanelInstansi view) {
        if (isSelectedRow(view) == true) {
            view.setInput(false);
            selectInstansi(view);
            initInputButton(view, false);
            inputText(view, false);
            view.setInput(false);
        }
    }

    public void hapus(PanelInstansi view) {
        if (isSelectedRow(view) == true) {
            int index = view.getTableInstansi().getSelectedRow();
            if (JOptionPane.showConfirmDialog(view, "Apakah Anda Yakin Akan Menghapus Data ?") == JOptionPane.OK_OPTION) {
                try {
                    instansiModel = view.getTableModelInstansi().get(view.getTableInstansi().convertRowIndexToModel(index));
                    if (instansiModel.isCanDelete()) {
                        instansiModel.deleteInstansi();
                        initInputButton(view, true);
                        inputText(view, true);
                        JOptionPane.showMessageDialog(view, "Data Berhasil Dihapus");
                        loadTableInstansi(view);
                    } else {
                        JOptionPane.showMessageDialog(view, "Data Gagal Dihapus, Data Telah Berelasi Dengan Data Pengarsipan");
                    }
                } catch (ArsipException ex) {
                    Logger.getLogger(PejabatController.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }

    public void simpan(PanelInstansi view) {
        if (view.isInput() == true) {
            insert(view);
        } else if (view.isInput() == false) {
            update(view);
        }
    }

    public void batal(PanelInstansi view) {
        initInputButton(view, true);
        inputText(view, true);
    }

    public void cari(PanelInstansi view) {
        String nama = view.getTextCari().getText().toUpperCase();
        if (nama.trim().isEmpty()) {
            loadTableInstansi(view);
        } else {
            new SwingWorker<List<InstansiModel>, Object>() {
                @Override
                protected List<InstansiModel> doInBackground() throws Exception {
                    view.getMainFrame().startLoading(true);
                    List<InstansiModel> list = instansiModel.getAllInstansiModelByName(nama);
                    return list;
                }

                @Override
                protected void done() {
                    try {
                        view.getTableModelInstansi().clear();
                        for (InstansiModel model : get()) {
                            view.getTableModelInstansi().add(model);
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
