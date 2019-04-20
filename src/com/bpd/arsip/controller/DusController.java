/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bpd.arsip.controller;

import com.bpd.arsip.exception.ArsipException;
import com.bpd.arsip.model.DusModel;
import com.bpd.arsip.model.LantaiModel;
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

    public void setDusModel(DusModel dusModel) {
        this.dusModel = dusModel;
    }

    public void setLantaiModel(LantaiModel lantaiModel) {
        this.lantaiModel = lantaiModel;
    }

    public void initInputButton(PanelPenyimpananDus view, boolean value) {
        view.getButtonTambah().setEnabled(value);
        view.getButtonHapus().setEnabled(value);
        view.getButtonBatal().setEnabled(!value);
        view.getButtonSimpan().setEnabled(!value);
        view.getTableLantai().setEnabled(value);

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

    public void hapus(PanelPenyimpananDus aThis) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
                        } catch (ArsipException ex) {
                            JOptionPane.showMessageDialog(view, new Object[]{"Gagal Terhubung Dengan Database", ex.getMessage()}, "Telah Terjadi Error", JOptionPane.ERROR_MESSAGE);
                            Logger.getLogger(DusController.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        view.getMainFrame().startLoading(false);

                    });
                }).start();
            }
        }
        batal(view);
        JOptionPane.showMessageDialog(view, "Data Berhasil Disimpan");
    }

}
