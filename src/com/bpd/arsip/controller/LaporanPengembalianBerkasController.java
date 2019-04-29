/*
 * Aplikasi pengarsipan untuk mengelola berkas kredit PLO dan KWU di Bank Jateng Purwokerto.
 * Aplikasi ini dibuat oleh Dany Candra Febrianto | Bank Jateng Purwokerto 2016
 * Aplikasi ini bebas di modifikasi dan di kembangkan.
 */
package com.bpd.arsip.controller;

import com.bpd.arsip.model.PengarsipanModel;
import com.bpd.arsip.view.panel.PanelLaporanPengembalianBerkas;
import com.bpd.arsip.view.report.FrameReport;
import java.util.Date;
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
public class LaporanPengembalianBerkasController {

    private PengarsipanModel pengarsipanModel;

    public void setPengarsipanModel(PengarsipanModel pengarsipanModel) {
        this.pengarsipanModel = pengarsipanModel;
    }

    public void reload(final PanelLaporanPengembalianBerkas view) {
        final Date mulai = view.getTextTanggalMulai().getDate();
        final Date selesai = view.getTextTanggalSelesai().getDate();

        if (mulai != null && selesai != null) {
            new SwingWorker<List<PengarsipanModel>, Object>() {

                @Override
                protected List<PengarsipanModel> doInBackground() throws Exception {
                    view.getMainFrame().startLoading(true);
                    List<PengarsipanModel> select = pengarsipanModel.searchDaftarPengembalianBerkas(mulai, selesai);
                    return select;

                }

                @Override
                protected void done() {
                    try {
                        view.getTableModel().clear();
                        for (PengarsipanModel model : get()) {
                            view.getTableModel().add(model);
                        }
                        view.getButtonCetak().setEnabled(true);
                        view.getMainFrame().startLoading(false);
                    } catch (ExecutionException | InterruptedException ex) {
                        Logger.getLogger(LaporanPengembalianBerkasController.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }

            }.execute();
        } else {
            JOptionPane.showMessageDialog(view, "Silahkan Isi Tanggal Terlebih Dahulu");
        }

    }

    public void cetakTandaTerima(final PanelLaporanPengembalianBerkas view) {
        if (view.getTablePengembalianBerkas().getSelectedRow() != -1 && view.getTablePengembalianBerkas().getSelectedRowCount() == 1) {

            int index = view.getTablePengembalianBerkas().getSelectedRow();
            pengarsipanModel = view.getTableModel().get(view.getTablePengembalianBerkas().convertRowIndexToModel(index));

            new SwingWorker<Object, Object>() {
                @Override
                protected Object doInBackground() throws Exception {
                    view.getMainFrame().startLoading(true);
                    HashMap parameter = new HashMap();
                    parameter.put("CIF", pengarsipanModel.getDebiturModel().getCif());
                    FrameReport report = new FrameReport("rpt/TandaPenyerahanBerkas.jasper", parameter);
                    report.setVisible(true);
                    return null;
                }

                @Override
                protected void done() {
                    view.getMainFrame().startLoading(false);
                }

            }.execute();

        } else {
            JOptionPane.showMessageDialog(view, "Silahkan pilih data yang akan di kembalikan", "Peringatan", JOptionPane.WARNING_MESSAGE);
        }
    }

}
