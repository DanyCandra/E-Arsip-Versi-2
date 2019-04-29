/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bpd.arsip.controller;

import com.bpd.arsip.exception.ArsipException;
import com.bpd.arsip.model.DebiturModel;
import com.bpd.arsip.model.DusModel;
import com.bpd.arsip.model.PengarsipanModel;
import com.bpd.arsip.view.dialog.DialogPenyesuaianBerkas;
import com.bpd.arsip.view.panel.PanelPenyesuaianBerkas;
import com.stripbandunk.jwidget.model.DefaultPaginationModel;
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
public class PenyesuaianBerkasController {

    private PengarsipanModel pengarsipanModel;
    private DebiturModel debiturModel;
    private DusModel dusModel;

    public void setDusModel(DusModel dusModel) {
        this.dusModel = dusModel;
    }

    public void setDebiturModel(DebiturModel debiturModel) {
        this.debiturModel = debiturModel;
    }

    public void setPengarsipanModel(PengarsipanModel pengarsipanModel) {
        this.pengarsipanModel = pengarsipanModel;
    }

    public void reload(final int pageSize, final PanelPenyesuaianBerkas view) {
        new SwingWorker<List<PengarsipanModel>, Object>() {

            @Override
            protected List<PengarsipanModel> doInBackground() throws Exception {
                view.getMainFrame().startLoading(true);
                List<PengarsipanModel> select = pengarsipanModel.getDaftarBerkasTersedia(0, pageSize);
                return select;

            }

            @Override
            protected void done() {
                try {
                    int totalItem = pengarsipanModel.getCountBerkasTersedia();
                    DefaultPaginationModel paginationModel = new DefaultPaginationModel(pageSize, totalItem);
                    view.getjPagination().setModel(paginationModel);
                    view.getTableModel().clear();
                    for (PengarsipanModel model : get()) {
                        view.getTableModel().add(model);
                    }
                    view.getMainFrame().startLoading(false);
                } catch (ExecutionException | InterruptedException | ArsipException ex) {
                    Logger.getLogger(PenyesuaianBerkasController.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

        }.execute();
    }

    public void onPageChange(final int skip, final int max, final PanelPenyesuaianBerkas view) {
        new SwingWorker<List<PengarsipanModel>, Object>() {

            @Override
            protected List<PengarsipanModel> doInBackground() throws Exception {
                view.getMainFrame().startLoading(true);
                List<PengarsipanModel> select = pengarsipanModel.getDaftarBerkasTersedia(skip, max);
                return select;
            }

            @Override
            protected void done() {
                try {
                    view.getTableModel().clear();
                    for (PengarsipanModel model : get()) {
                        view.getTableModel().add(model);
                    }
                    view.getMainFrame().startLoading(false);
                } catch (ExecutionException | InterruptedException ex) {
                    Logger.getLogger(PenyesuaianBerkasController.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

        }.execute();
    }

    public void search(final String cif, final PanelPenyesuaianBerkas view) {
        new SwingWorker<List<PengarsipanModel>, Object>() {

            @Override
            protected List<PengarsipanModel> doInBackground() throws Exception {
                view.getMainFrame().startLoading(true);
                List<PengarsipanModel> select = pengarsipanModel.searchDaftarBerkasTersedia(cif);
                return select;
            }

            @Override
            protected void done() {
                try {
                    view.getTableModel().clear();
                    for (PengarsipanModel model : get()) {
                        view.getTableModel().add(model);
                    }
                    view.getTableModelDebitur().clear();
                    view.getMainFrame().startLoading(false);
                } catch (ExecutionException | InterruptedException ex) {
                    Logger.getLogger(PenyesuaianBerkasController.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

        }.execute();
    }

    public void selectDebitur(PanelPenyesuaianBerkas view) {

        if (view.getTablePengembalianBerkas().getSelectedRow() != -1 && view.getTablePengembalianBerkas().getSelectedRowCount() == 1) {
            int index = view.getTablePengembalianBerkas().getSelectedRow();
            pengarsipanModel = view.getTableModel().get(view.getTablePengembalianBerkas().convertRowIndexToModel(index));

            DialogPenyesuaianBerkas berkas = new DialogPenyesuaianBerkas(this);
            showDialogPenyesuaian(berkas);
            berkas.setLocationRelativeTo(view);
            berkas.setAlwaysOnTop(true);
            berkas.getTextCif().setText(pengarsipanModel.getDebiturModel().getCif());
            berkas.getTextNama().setText(pengarsipanModel.getDebiturModel().getNama());
            berkas.getTextDusLama().setText(pengarsipanModel.getDus().getIdDus());
            berkas.setVisible(true);

        }

    }

    public void showDialogPenyesuaian(final DialogPenyesuaianBerkas view) {
        new SwingWorker<List<DusModel>, Object>() {
            @Override
            protected List<DusModel> doInBackground() throws Exception {
                List<DusModel> list = dusModel.getAllDusModel();
                return list;
            }

            @Override
            protected void done() {
                try {
                    view.getComboDus().removeAllItems();
                    for (DusModel model : get()) {
                        view.getComboDus().addItem(model.getIdDus());
                    }
                } catch (ExecutionException | InterruptedException ex) {
                    Logger.getLogger(PenerimaanController.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }.execute();
    }

    public void updateBerkas(final DialogPenyesuaianBerkas view) {
        try {
            //update stok dus lama
            pengarsipanModel.getDus().updateStokPengembalian();

            //updare stok dus baru
            dusModel.getDusModelByIdDus((String) view.getComboDus().getSelectedItem());
            dusModel.updateStokPenerimaan();

            //update penerimaan
            pengarsipanModel.setDus(dusModel);
            pengarsipanModel.updatePenerimaan();

            view.dispose();
            JOptionPane.showMessageDialog(view, "Data Berhasil Diubah");

        } catch (ArsipException ex) {
            Logger.getLogger(PenyesuaianBerkasController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
