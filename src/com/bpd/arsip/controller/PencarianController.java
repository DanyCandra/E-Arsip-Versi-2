/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bpd.arsip.controller;

import com.bpd.arsip.exception.ArsipException;
import com.bpd.arsip.model.BerkasModel;
import com.bpd.arsip.model.DebiturModel;
import com.bpd.arsip.model.PengarsipanModel;
import com.bpd.arsip.view.panel.PanelPencarianBerkas;
import com.bpd.arsip.view.report.FrameReport;
import com.stripbandunk.jwidget.model.DefaultPaginationModel;
import java.util.HashMap;
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
public class PencarianController {

    private PengarsipanModel pengarsipanModel;
    private DebiturModel debiturModel;
    private BerkasModel berkasModel;

    public void setBerkasModel(BerkasModel berkasModel) {
        this.berkasModel = berkasModel;
    }

    public void setDebiturModel(DebiturModel debiturModel) {
        this.debiturModel = debiturModel;
    }

    public void setPengarsipanModel(PengarsipanModel pengarsipanModel) {
        this.pengarsipanModel = pengarsipanModel;
    }

    public void reload(final int pageSize, final PanelPencarianBerkas view) {
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
                    Logger.getLogger(PencarianController.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

        }.execute();
    }

    public void onPageChange(final int skip, final int max, final PanelPencarianBerkas view) {
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
                    Logger.getLogger(PencarianController.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

        }.execute();
    }

    public void search(final String cif, final PanelPencarianBerkas view) {
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

                    view.getMainFrame().startLoading(false);
                } catch (ExecutionException | InterruptedException ex) {
                    Logger.getLogger(PencarianController.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

        }.execute();
    }

    public void searchByName(final String name, final PanelPencarianBerkas view) {
        new SwingWorker<List<PengarsipanModel>, Object>() {

            @Override
            protected List<PengarsipanModel> doInBackground() throws Exception {
                view.getMainFrame().startLoading(true);
                List<PengarsipanModel> select = pengarsipanModel.searchDaftarBerkasTersediaByNama(name);
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
                    Logger.getLogger(PencarianController.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

        }.execute();
    }

    public void selectDebiturDetail(PanelPencarianBerkas view) {

        if (view.getTablePengembalianBerkas().getSelectedRow() != -1 && view.getTablePengembalianBerkas().getSelectedRowCount() == 1) {
            try {
                int index = view.getTablePengembalianBerkas().getSelectedRow();
                pengarsipanModel = view.getTableModel().get(view.getTablePengembalianBerkas().convertRowIndexToModel(index));
                String cif = pengarsipanModel.getDebiturModel().getCif();

                List<BerkasModel> list = debiturModel.getListBerkas(cif);
                view.getTableModelBerkas().clear();
                for (BerkasModel data : list) {

                    view.getTableModelBerkas().add(data);
                }
                view.getDialogDetail().setVisible(true);

            } catch (ArsipException ex) {
                Logger.getLogger(PencarianController.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            JOptionPane.showMessageDialog(view, "Silahkan pilih data terlebih dahulu", "Peringatan", JOptionPane.WARNING_MESSAGE);
        }

    }

    public void cetakTandaTerima(final PanelPencarianBerkas view) {
        if (view.getTablePengembalianBerkas().getSelectedRow() != -1 && view.getTablePengembalianBerkas().getSelectedRowCount() == 1) {

            int index = view.getTablePengembalianBerkas().getSelectedRow();
            pengarsipanModel = view.getTableModel().get(view.getTablePengembalianBerkas().convertRowIndexToModel(index));

            new SwingWorker<Object, Object>() {
                @Override
                protected Object doInBackground() throws Exception {
                    view.getMainFrame().startLoading(true);
                    HashMap parameter = new HashMap();
                    parameter.put("CIF", pengarsipanModel.getDebiturModel().getCif());
                    System.out.println(pengarsipanModel.getDebiturModel().getCif());
                    FrameReport report = new FrameReport("rpt/TandaTerimaBerkas.jasper", parameter);
                    report.setVisible(true);
                    return null;

                }

                @Override
                protected void done() {
                    view.getMainFrame().startLoading(false);
                }

            }.execute();

        } else {
            JOptionPane.showMessageDialog(view, "Silahkan pilih data yang akan di cetak", "Peringatan", JOptionPane.WARNING_MESSAGE);
        }
    }

    public void cetakCover(final PanelPencarianBerkas view) {
        if (view.getTablePengembalianBerkas().getSelectedRow() != -1 && view.getTablePengembalianBerkas().getSelectedRowCount() == 1) {

            int index = view.getTablePengembalianBerkas().getSelectedRow();
            pengarsipanModel = view.getTableModel().get(view.getTablePengembalianBerkas().convertRowIndexToModel(index));

            new SwingWorker<Object, Object>() {
                @Override
                protected Object doInBackground() throws Exception {
                    view.getMainFrame().startLoading(true);
                    HashMap parameter = new HashMap();
                    parameter.put("CIF", pengarsipanModel.getDebiturModel().getCif());
                    System.out.println(pengarsipanModel.getDebiturModel().getCif());
                    FrameReport report = new FrameReport("rpt/CoverBerkas.jasper", parameter);
                    report.setVisible(true);
                    return null;

                }

                @Override
                protected void done() {
                     view.getMainFrame().startLoading(false);
                }

            }.execute();

        } else {
            JOptionPane.showMessageDialog(view, "Silahkan pilih data yang akan di cetak", "Peringatan", JOptionPane.WARNING_MESSAGE);
        }
    }

}
