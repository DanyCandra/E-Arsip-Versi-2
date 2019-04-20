/*
 * Aplikasi pengarsipan untuk mengelola berkas kredit PLO dan KWU di Bank Jateng Purwokerto.
 * Aplikasi ini dibuat oleh Dany Candra Febrianto | Bank Jateng Purwokerto 2016
 * Aplikasi ini bebas di modifikasi dan di kembangkan.
 */
package com.bpd.arsip.controller;

import com.bpd.arsip.exception.ArsipException;
import com.bpd.arsip.helper.HelperGeneratorAutoId;
import com.bpd.arsip.model.PejabatModel;
import com.bpd.arsip.validator.ValidatorNotNull;
import com.bpd.arsip.validator.ValidatorTextLimit;
import com.bpd.arsip.view.panel.PanelPejabat;
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
public class PejabatController {

    private PejabatModel pejabatModel;

    public void setPejabatModel(PejabatModel pejabatModel) {
        this.pejabatModel = pejabatModel;
    }

    public void loadTablePejabat(final PanelPejabat view) {
        new SwingWorker<List<PejabatModel>, Object>() {
            @Override
            protected List<PejabatModel> doInBackground() throws Exception {
                view.getMainFrame().startLoading(true);
                List<PejabatModel> list = pejabatModel.getAllPejabatModel();
                return list;
            }

            @Override
            protected void done() {
                try {
                    view.getTableModelPejabat().clear();
                    for (PejabatModel model : get()) {
                        view.getTableModelPejabat().add(model);
                    }
                    view.getMainFrame().startLoading(false);
                } catch (InterruptedException | ExecutionException ex) {
                    Logger.getLogger(PejabatController.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }.execute();
    }

    public void clear(PanelPejabat view) {
        view.getTextNama().setText("");
        view.getTextJabatan().setText("");
    }

    public void selectPejabat(PanelPejabat view) {
        int index = view.getTablePejabat().getSelectedRow();
        pejabatModel = view.getTableModelPejabat().get(view.getTablePejabat().convertRowIndexToModel(index));
        view.getTextNama().setText(pejabatModel.getNamaPejabat());
        view.getTextJabatan().setText(pejabatModel.getJabatan());
    }

    public boolean isSelectedRow(PanelPejabat view) {
        boolean result = false;
        if (view.getTablePejabat().getSelectedRow() != -1 && view.getTablePejabat().getSelectedRowCount() == 1) {
            result = true;
        } else {
            JOptionPane.showMessageDialog(view, "Silahkan Pilih Data Terlebih Dahulu");
        }
        return result;
    }

    public void insertPejabat(PanelPejabat view) {
        String idPejabat = HelperGeneratorAutoId.generateAutoIdPejabat();
        String nama = view.getTextNama().getText().toUpperCase();
        String jabatan = view.getTextJabatan().getText().toUpperCase();

        if (ValidatorNotNull.isNotNull(nama, view, "NAMA")
                && ValidatorNotNull.isNotNull(jabatan, view, "JABATAN")
                && ValidatorTextLimit.isLimit(nama, 50, view, "NAMA")
                && ValidatorTextLimit.isLimit(jabatan, 30, view, "JABATAN")) {
            try {
                pejabatModel.setIdPejabat(idPejabat);
                pejabatModel.setJabatan(jabatan);
                pejabatModel.setNamaPejabat(nama);

                if (pejabatModel.isCanInsert() == true) {
                    pejabatModel.insertPejabat();
                    JOptionPane.showMessageDialog(view, "Data Berhasil Disimpan");
                    clear(view);
                } else {
                    JOptionPane.showMessageDialog(view, "Data Gagal Disimpan, Data Telah Tersedia");
                }

            } catch (ArsipException ex) {
                JOptionPane.showMessageDialog(view, new Object[]{"Terjadi Error Dengan Database", ex.getMessage()}, "Telah Terjadi Error", JOptionPane.ERROR_MESSAGE);
                Logger.getLogger(PejabatController.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public void updatePejabat(PanelPejabat view) {
        if (view.getTablePejabat().getSelectedRowCount() == 0) {
            JOptionPane.showMessageDialog(view, "Silahkan Pilih Data Terlebih Dahulu");
        } else {
            String nama = view.getTextNama().getText().toUpperCase();
            String jabatan = view.getTextJabatan().getText().toUpperCase();

            if (ValidatorNotNull.isNotNull(nama, view, "NAMA")
                    && ValidatorNotNull.isNotNull(jabatan, view, "JABATAN")
                    && ValidatorTextLimit.isLimit(nama, 50, view, "NAMA")
                    && ValidatorTextLimit.isLimit(jabatan, 30, view, "JABATAN")) {
                try {

                    pejabatModel.setJabatan(jabatan);
                    pejabatModel.setNamaPejabat(nama);
                    pejabatModel.updatePejabat();
                    JOptionPane.showMessageDialog(view, "Data Berhasil Disimpan");
                    clear(view);

                } catch (ArsipException ex) {
                    JOptionPane.showMessageDialog(view, new Object[]{"Terjadi Error Dengan Database", ex.getMessage()}, "Telah Terjadi Error", JOptionPane.ERROR_MESSAGE);
                    Logger.getLogger(PejabatController.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }

    public void initInputButton(PanelPejabat view, boolean value) {
        view.getButtonTambah().setEnabled(value);
        view.getButtonUbah().setEnabled(value);
        view.getButtonHapus().setEnabled(value);
        view.getButtonBatal().setEnabled(!value);
        view.getButtonSimpan().setEnabled(!value);
        view.getTablePejabat().setEnabled(value);

        view.getTextJabatan().setEnabled(!value);
        view.getTextNama().setEnabled(!value);
    }

    public void inputText(PanelPejabat view, boolean isInput) {
        if (isInput == true) {
            view.getTextJabatan().setText("");
            view.getTextNama().setText("");
        }
        view.getTextNama().requestFocus();
    }

    public void tambah(PanelPejabat view) {
        initInputButton(view, false);
        inputText(view, true);
        view.setInput(true);
    }

    public void ubah(PanelPejabat view) {
        if (isSelectedRow(view) == true) {
            view.setInput(false);
            selectPejabat(view);
            initInputButton(view, false);
            inputText(view, false);
            view.setInput(false);
        }
    }

    public void hapus(PanelPejabat view) {
        if (isSelectedRow(view) == true) {
            int index = view.getTablePejabat().getSelectedRow();
            if (JOptionPane.showConfirmDialog(view, "Apakah Anda Yakin Akan Menghapus Data ?") == JOptionPane.OK_OPTION) {
                try {
                    pejabatModel = view.getTableModelPejabat().get(view.getTablePejabat().convertRowIndexToModel(index));
                    if (pejabatModel.isCanDelete()) {
                        pejabatModel.deletePejabat();
                        initInputButton(view, true);
                        inputText(view, true);
                        JOptionPane.showMessageDialog(view, "Data Berhasil Dihapus");
                        loadTablePejabat(view);
                    } else {
                        JOptionPane.showMessageDialog(view, "Data Gagal Dihapus, Data Telah Berelasi Dengan Data Pengarsipan");
                    }
                } catch (ArsipException ex) {
                    Logger.getLogger(PejabatController.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }

    public void batal(PanelPejabat view) {
        initInputButton(view, true);
        inputText(view, true);
    }

    public void cari(PanelPejabat view) {
        String nama = view.getTextCari().getText().toUpperCase();
        if (nama.trim().isEmpty()) {
            loadTablePejabat(view);
        } else {
            new SwingWorker<List<PejabatModel>, Object>() {
                @Override
                protected List<PejabatModel> doInBackground() throws Exception {
                    view.getMainFrame().startLoading(true);
                    List<PejabatModel> list = pejabatModel.getAllPejabatByName(nama);
                    return list;
                }

                @Override
                protected void done() {
                    try {
                        view.getTableModelPejabat().clear();
                        for (PejabatModel model : get()) {
                            view.getTableModelPejabat().add(model);
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

    public void simpan(PanelPejabat view) {
        if (view.isInput() == true) {
            insertPejabat(view);
        } else if (view.isInput() == false) {
            updatePejabat(view);
        }
    }

}
