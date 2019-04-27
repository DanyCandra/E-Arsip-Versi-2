/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bpd.arsip.controller;

import com.bpd.arsip.exception.ArsipException;
import com.bpd.arsip.model.DusModel;
import com.bpd.arsip.model.LantaiModel;
import com.bpd.arsip.model.RakModel;
import com.bpd.arsip.validator.ValidatorNotNull;
import com.bpd.arsip.validator.ValidatorNumber;
import com.bpd.arsip.validator.ValidatorTextLimit;
import com.bpd.arsip.view.panel.PanelPenyimpananDus;
import com.stripbandunk.jwidget.model.DefaultPaginationModel;
import java.awt.EventQueue;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.SwingWorker;

/**
 *
 * @author Dany
 */
public class DusController {

    private DusModel dusModel;

    private LantaiModel lantaiModel;

    private RakModel rakModel;

    public void setRakModel(RakModel rakModel) {
        this.rakModel = rakModel;
    }

    public void setDusModel(DusModel dusModel) {
        this.dusModel = dusModel;
    }

    public void setLantaiModel(LantaiModel lantaiModel) {
        this.lantaiModel = lantaiModel;
    }

    public void initInputButton(PanelPenyimpananDus view, boolean value) {
        view.getButtonTambah().setEnabled(value);
        view.getButtonBatal().setEnabled(!value);
        view.getButtonSimpan().setEnabled(!value);
        view.getTableDus().setEnabled(value);

        view.getComboLokasi().setEnabled(!value);
        view.getTextJumlahDus().setEnabled(!value);
    }

    public void inputText(PanelPenyimpananDus view, boolean isInput) {
        try {
            if (isInput == true) {
                view.getComboLokasi().setSelectedIndex(0);
                view.getTextJumlahDus().setText("");
            }
            view.getTextJumlahDus().requestFocus();
        } catch (IllegalArgumentException e) {
        }
    }

    public void tambah(PanelPenyimpananDus view) {
        initInputButton(view, false);
        inputText(view, true);
        view.setInput(true);
    }

    public void batal(PanelPenyimpananDus view) {
        initInputButton(view, true);
        inputText(view, true);
    }

    public void loadTableLantai(PanelPenyimpananDus view, int pageSize) {
        new SwingWorker<List<DusModel>, Object>() {

            @Override
            protected List<DusModel> doInBackground() throws Exception {
                view.getMainFrame().startLoading(true);
                List<DusModel> select = dusModel.load(0, pageSize);
                return select;
            }

            @Override
            protected void done() {
                try {
                    int totalItem = dusModel.getLongList();
                    DefaultPaginationModel paginationModel = new DefaultPaginationModel(pageSize, totalItem);
                    view.getjPagination().setModel(paginationModel);
                    view.getTableModelDus().clear();
                    for (DusModel dusModel1 : get()) {
                        view.getTableModelDus().add(dusModel1);
                    }
                    view.getMainFrame().startLoading(false);
                } catch (ExecutionException ex) {
                    Logger.getLogger(InstansiController.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ArsipException | InterruptedException ex) {
                    Logger.getLogger(DusController.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }.execute();
    }

    public void loadComboBox(final PanelPenyimpananDus view) {
        new SwingWorker<List<LantaiModel>, Object>() {
            @Override
            protected List<LantaiModel> doInBackground() throws Exception {
                List<LantaiModel> list = lantaiModel.load();
                return list;
            }

            @Override
            protected void done() {
                try {
                    view.getComboBoxModel().removeAllElements();
                    for (LantaiModel lantaiModel : get()) {
                        view.getComboBoxModel().addElement(lantaiModel);
                    }
                } catch (ExecutionException | InterruptedException ex) {
                    Logger.getLogger(DusController.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }.execute();
    }

    public void onPageChange(final int skip, final int max, final PanelPenyimpananDus view) {
        new SwingWorker<List<DusModel>, Object>() {
            @Override
            protected List<DusModel> doInBackground() throws Exception {
                view.getMainFrame().startLoading(true);
                List<DusModel> select = dusModel.load(skip, max);
                return select;
            }

            @Override
            protected void done() {
                try {
                    view.getTableModelDus().clear();
                    for (DusModel dusModel1 : get()) {
                        view.getTableModelDus().add(dusModel1);
                    }
                    view.getMainFrame().startLoading(false);
                } catch (ExecutionException ex) {
                    Logger.getLogger(InstansiController.class.getName()).log(Level.SEVERE, null, ex);
                } catch (InterruptedException ex) {
                    Logger.getLogger(DusController.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }.execute();
    }

    public void simpan(PanelPenyimpananDus view) {
        String tmpJumlah = view.getTextJumlahDus().getText();
        LantaiModel lantaiTmp = (LantaiModel) view.getComboLokasi().getSelectedItem();
        if (ValidatorNotNull.isNotNull(tmpJumlah, view, "Jumlah Dus")
                && ValidatorNumber.isNumber(tmpJumlah, view, "Jumlah Dus")
                && ValidatorTextLimit.isLimit(tmpJumlah, 3, view, "Jumlah Dus")
                && Integer.valueOf(tmpJumlah) <= 100) {

            if (JOptionPane.showConfirmDialog(view, "Anda akan menambah dus sebanyak " + tmpJumlah + "dus ", "Perhatian", JOptionPane.OK_CANCEL_OPTION) == JOptionPane.OK_OPTION) {
                new Thread(() -> {
                    view.getMainFrame().startLoading(true);
                    EventQueue.invokeLater(() -> {
                        int jumlah = Integer.parseInt(tmpJumlah);
                        try {
                            dusModel.insertDus(jumlah, lantaiTmp);
                            loadAll(view);
                        } catch (ArsipException ex) {
                            JOptionPane.showMessageDialog(view, new Object[]{"Gagal Terhubung Dengan Database", ex.getMessage()}, "Telah Terjadi Error", JOptionPane.ERROR_MESSAGE);
                            Logger.getLogger(DusController.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        JOptionPane.showMessageDialog(view, "Data Berhasil Disimpan");
                        view.getMainFrame().startLoading(false);

                    });
                }).start();
            }
        }

    }

    public boolean isSelectedRow(PanelPenyimpananDus view) {
        boolean result = false;
        if (view.getTableDus().getSelectedRow() != -1 && view.getTableDus().getSelectedRowCount() == 1) {
            result = true;
        } else {
            JOptionPane.showMessageDialog(view, "Silahkan Pilih Data Terlebih Dahulu");
        }
        return result;
    }

    public void hapus(PanelPenyimpananDus view) {
        if (isSelectedRow(view) == true) {
            int index = view.getTableDus().getSelectedRow();
            if (JOptionPane.showConfirmDialog(view, "Apakah Anda Yakin Akan Menghapus Data ?") == JOptionPane.OK_OPTION) {
            }
        }
    }

    public void loadAll(PanelPenyimpananDus view) {
        batal(view);
        loadTableLantai(view, view.getPAGE_SIZE());
        loadComboBox(view);
        loadComboBoxRak(view);
    }

//   =================================================================================================================================
//                                            Method yang digunakan untuk dialog Hapus
//   =================================================================================================================================
//   
    public void loadComboBoxRak(final PanelPenyimpananDus view) {
        new SwingWorker<List<RakModel>, Object>() {
            @Override
            protected List<RakModel> doInBackground() throws Exception {
                List<RakModel> list = rakModel.load();
                return list;
            }

            @Override
            protected void done() {
                try {
                    view.getComboBoxrRakModel().removeAllElements();
                    for (RakModel model : get()) {
                        view.getComboBoxrRakModel().addElement(model);
                    }
                } catch (ExecutionException | InterruptedException ex) {
                    Logger.getLogger(DusController.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }.execute();
    }

    public void hapusDus(PanelPenyimpananDus view) {

        if (JOptionPane.showConfirmDialog(view.getDialogHapusDus(), "Apakah Anda Yakin Akan Menghapus Data ?") == JOptionPane.OK_OPTION) {
            String tmpJumlah = view.getTextHapusJumlah().getText();
            RakModel model = (RakModel) view.getComboBoxrRakModel().getSelectedItem();
            int index = view.getComboHapusRak().getSelectedIndex();
            if (index >= 0
                    && ValidatorNumber.isNumber(tmpJumlah, view.getDialogHapusDus(), "Jumlah Data")
                    && ValidatorTextLimit.isLimit(tmpJumlah, 2, view, "Jumlah Data")) {
                try {
                    int jumlah = Integer.valueOf(tmpJumlah);
                    dusModel.deleteDus(jumlah, model.getIdRak());
                } catch (ArsipException ex) {
                    Logger.getLogger(DusController.class.getName()).log(Level.SEVERE, null, ex);
                }
                JOptionPane.showMessageDialog(view.getDialogHapusDus(), "Data Berhasil di Hapus?");
                view.getTextHapusJumlah().setText("");
                view.getDialogHapusDus().setVisible(false);
                loadAll(view);
            }
        }
    }
}
