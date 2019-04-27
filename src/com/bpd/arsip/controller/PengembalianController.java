/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bpd.arsip.controller;

import com.bpd.arsip.exception.ArsipException;
import com.bpd.arsip.model.DusModel;
import com.bpd.arsip.model.PejabatModel;
import com.bpd.arsip.model.PengarsipanModel;
import com.bpd.arsip.view.dialog.DialogPengembalian;
import com.bpd.arsip.view.panel.PanelPengembalianBerkas;
import com.stripbandunk.jwidget.model.DefaultPaginationModel;
import java.util.Date;
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
public class PengembalianController {

    private PengarsipanModel pengarsipanModel;
    private PejabatModel pejabatModel;
    private DusModel dusModel;

    public void setPengarsipanModel(PengarsipanModel pengarsipanModel) {
        this.pengarsipanModel = pengarsipanModel;
    }

    public void setPejabatModel(PejabatModel pejabatModel) {
        this.pejabatModel = pejabatModel;
    }

    public void setDusModel(DusModel dusModel) {
        this.dusModel = dusModel;
    }

    public void reload(final int pageSize, final PanelPengembalianBerkas view) {
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
                } catch (ExecutionException | ArsipException | InterruptedException ex) {
                    Logger.getLogger(PengembalianController.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

        }.execute();
    }

    public void search(final String cif, final PanelPengembalianBerkas view) {
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
                    Logger.getLogger(PengembalianController.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

        }.execute();
    }

    public void onPageChange(final int skip, final int max, final PanelPengembalianBerkas view) {
        new SwingWorker<List<PengarsipanModel>, Object>() {

            @Override
            protected List<PengarsipanModel> doInBackground() throws Exception {
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
                } catch (ExecutionException | InterruptedException ex) {
                    Logger.getLogger(PengembalianController.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

        }.execute();
    }

    public void loadPejabatCombobox(final DialogPengembalian view) {

        new SwingWorker<List<PejabatModel>, Object>() {
            @Override
            protected List<PejabatModel> doInBackground() throws Exception {
                List<PejabatModel> list = pejabatModel.getAllPejabatModel();
                return list;
            }

            @Override
            protected void done() {
                try {
                    view.getComboPejabatModel().removeAllElements();
                    for (PejabatModel model : get()) {
                        view.getComboPejabatModel().addElement(model);
                    }
                } catch (ExecutionException | InterruptedException ex) {
                    Logger.getLogger(PengembalianController.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }.execute();
    }

    public void crudUpdate(PanelPengembalianBerkas view) {

        if (view.getTablePengembalianBerkas().getSelectedRow() != -1 && view.getTablePengembalianBerkas().getSelectedRowCount() == 1) {

            int index = view.getTablePengembalianBerkas().getSelectedRow();
            pengarsipanModel = view.getTableModel().get(view.getTablePengembalianBerkas().convertRowIndexToModel(index));

            DialogPengembalian dialogPengembalian = new DialogPengembalian(this);
            dialogPengembalian.setLocationRelativeTo(view);
            dialogPengembalian.setUserModel(view.getUserModel());
            dialogPengembalian.getComboPejabat().setFocusable(true);
            dialogPengembalian.loadCombo();
            dialogPengembalian.setVisible(true);

        } else {
            JOptionPane.showMessageDialog(view, "Silahkan pilih data yang akan di kembalikan", "Peringatan", JOptionPane.WARNING_MESSAGE);
        }

    }

    public void savePengembalian(DialogPengembalian view) {
        try {

            String alasan = view.getComboAlasan().getSelectedIndex() + "";
            //mendapatkan parameter untuk insert, data debitur tidak di tampilkan karena sudah include pada set pengarsipan model
            pengarsipanModel.setTanggalKembali(new Date());
            pengarsipanModel.setPejabatPengembali((PejabatModel) view.getComboPejabat().getSelectedItem());
            pengarsipanModel.setUserPengembali(view.getUserModel());
            pengarsipanModel.setStatusArsip("0");
            pengarsipanModel.setStatusKembali(alasan);
            pengarsipanModel.insertengembalian();
            pengarsipanModel.getDus().updateStokPengembalian();

            JOptionPane.showMessageDialog(view, "Data Berhasil Diinput", "Pesan Informasi", JOptionPane.INFORMATION_MESSAGE);
            view.dispose();
            if (JOptionPane.showConfirmDialog(view, "Apakah anda akan mencetak tanda terima transaksi", "Pesan Konfirmasi", JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE) == JOptionPane.OK_OPTION) {
                //HashMap parameter = new HashMap();
                //parameter.put("CIF", pengarsipanModel.getDebiturModel().getCif());
                //FrameReport report = new FrameReport("rpt/TandaPenyerahanBerkas.jasper",parameter);
                //report.setVisible(true);
            }
        } catch (ArsipException ex) {
            Logger.getLogger(PengembalianController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
