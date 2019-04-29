/*
 * Aplikasi pengarsipan untuk mengelola berkas kredit PLO dan KWU di Bank Jateng Purwokerto.
 * Aplikasi ini dibuat oleh Dany Candra Febrianto | Bank Jateng Purwokerto 2016
 * Aplikasi ini bebas di modifikasi dan di kembangkan.
 */
package com.bpd.arsip.controller;

import com.bpd.arsip.exception.ArsipException;
import com.bpd.arsip.model.DusModel;
import com.bpd.arsip.model.PengarsipanModel;
import com.bpd.arsip.view.panel.PanelLaporanIsiDus;
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
public class LaporanIsiDusController {

    private DusModel dusModel;
    private PengarsipanModel pengarsipanModel;

    public void setPengarsipanModel(PengarsipanModel pengarsipanModel) {
        this.pengarsipanModel = pengarsipanModel;
    }

    public void setDusModel(DusModel dusModel) {
        this.dusModel = dusModel;
    }

    public void loadTableDus(final int pageSize, final PanelLaporanIsiDus view) {
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
                } catch (ExecutionException | ArsipException | InterruptedException ex) {
                    Logger.getLogger(LaporanIsiDusController.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }.execute();

    }

    public void onPageChangeTableDus(final int skip, final int max, final PanelLaporanIsiDus view) {
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
                } catch (ExecutionException | InterruptedException ex) {
                    Logger.getLogger(LaporanIsiDusController.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }.execute();
    }

    public void loadTableBerkasByIdDus(final PanelLaporanIsiDus view) {

        if (view.getTableDus().getSelectedRow() != -1 && view.getTableDus().getSelectedRowCount() == 1) {
            int index = view.getTableDus().getSelectedRow();
            dusModel = view.getTableModelDus().get(view.getTableDus().convertRowIndexToModel(index));

            new SwingWorker<List<PengarsipanModel>, Object>() {

                @Override
                protected List<PengarsipanModel> doInBackground() throws Exception {
                    view.getMainFrame().startLoading(true);
                    List<PengarsipanModel> select = pengarsipanModel.searchDaftarBerkasTersediaByIdDus(dusModel.getIdDus());
                    return select;
                }

                @Override
                protected void done() {
                    try {
                        view.getTableModelPengarsipan().clear();
                        for (PengarsipanModel pengarsipanModel : get()) {
                            view.getTableModelPengarsipan().add(pengarsipanModel);
                        }
                        view.getMainFrame().startLoading(false);
                    } catch (ExecutionException | InterruptedException ex) {
                        Logger.getLogger(LaporanIsiDusController.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }.execute();
        }
    }

    public void cetakDaftarPerDus(final PanelLaporanIsiDus view) {
        if (view.getTableDus().getSelectedRow() != -1 && view.getTableDus().getSelectedRowCount() == 1) {

            int index = view.getTableDus().getSelectedRow();
            dusModel = view.getTableModelDus().get(view.getTableDus().convertRowIndexToModel(index));

            new SwingWorker<Object, Object>() {
                @Override
                protected Object doInBackground() throws Exception {
                    view.getMainFrame().startLoading(true);
                    HashMap parameter = new HashMap();
                    parameter.put("ID_DUS", dusModel.getIdDus());
                    FrameReport report = new FrameReport("rpt/CoverDus.jasper", parameter);
                    report.setVisible(true);
                    return null;
                }

                @Override
                protected void done() {
                    view.getMainFrame().startLoading(false);
                }

            }.execute();

        } else {
            JOptionPane.showMessageDialog(view, "Silahkan pilih data", "Peringatan", JOptionPane.WARNING_MESSAGE);
        }
    }

    public void cetakDaftarCoverDus(final PanelLaporanIsiDus view) {
        if (view.getTableDus().getSelectedRow() != -1 && view.getTableDus().getSelectedRowCount() == 1) {

            int index = view.getTableDus().getSelectedRow();
            dusModel = view.getTableModelDus().get(view.getTableDus().convertRowIndexToModel(index));
            new SwingWorker<Object, Object>() {
                @Override
                protected Object doInBackground() throws Exception {
                     view.getMainFrame().startLoading(true);
                    HashMap parameter = new HashMap();
                    parameter.put("ID_DUS", dusModel.getIdDus());
                    FrameReport report = new FrameReport("rpt/CoverDusDepan.jasper", parameter);
                    report.setVisible(true);
                    return null;
                }

                @Override
                protected void done() {
                     view.getMainFrame().startLoading(false);
                }

            }.execute();

        } else {
            JOptionPane.showMessageDialog(view, "Silahkan pilih data", "Peringatan", JOptionPane.WARNING_MESSAGE);
        }
    }

}
