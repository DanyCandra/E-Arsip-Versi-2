/*
 * Aplikasi cis untuk mengelola berkas kredit PLO dan KWU di Bank Jateng Purwokerto.
 * Aplikasi ini dibuat oleh Dany Candra Febrianto | Bank Jateng Purwokerto 2016
 * Aplikasi ini bebas di modifikasi dan di kembangkan.
 */
package com.bpd.arsip.controller;

import com.bpd.arsip.exception.ArsipException;
import com.bpd.arsip.model.CisModel;
import com.bpd.arsip.view.panel.PanelLaporanOpname;
import com.bpd.arsip.view.report.FrameReport;
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
public class LaporanOpnameController {

    private CisModel cisModel;

    public void setCisModel(CisModel cisModel) {
        this.cisModel = cisModel;
    }

    public void reload(final PanelLaporanOpname view) {

        new SwingWorker<List<CisModel>, Object>() {
            String noPinjaman = view.getTextNoPinjaman().getText();

            @Override
            protected List<CisModel> doInBackground() throws Exception {
                view.getMainFrame().startLoading(true);
                List<CisModel> select = cisModel.selectCisLikeNoPinjaman(noPinjaman);
                return select;
            }

            @Override
            protected void done() {
                try {
                    view.getTableModel().clear();
                    for (CisModel model : get()) {
                        view.getTableModel().add(model);
                    }
                    view.getMainFrame().startLoading(false);
                } catch (ExecutionException ex) {
                    Logger.getLogger(UserController.class.getName()).log(Level.SEVERE, null, ex);
                } catch (InterruptedException ex) {
                    Logger.getLogger(PencarianController.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }.execute();
    }

    public void showReport(final PanelLaporanOpname view) {

        if (view.getTablePengembalianBerkas().getSelectedRow() != -1 && view.getTablePengembalianBerkas().getSelectedRowCount() == 1) {

            try {
                int index = view.getTablePengembalianBerkas().getSelectedRow();
                cisModel = view.getTableModel().get(view.getTablePengembalianBerkas().convertRowIndexToModel(index));
                String no = cisModel.getNoPinjam();
                String cif = cisModel.getDebiturModel().getCif();
                int dokumen = cisModel.getDebiturModel().getJumlahDokumen(cif);
                new SwingWorker<Object, Object>() {
                    @Override
                    protected Object doInBackground() throws Exception {
                        view.getMainFrame().startLoading(true);
                        HashMap parameter = new HashMap();
                        parameter.put("no_pinjaman", no);
                        parameter.put("totalDokumen", dokumen);

                        FrameReport report = new FrameReport("rpt/CekList.jasper", parameter);
                        report.setVisible(true);
                        return null;
                    }

                    @Override
                    protected void done() {
                        view.getMainFrame().startLoading(false);
                    }

                }.execute();
            } catch (ArsipException ex) {
                Logger.getLogger(LaporanOpnameController.class.getName()).log(Level.SEVERE, null, ex);
            }

        } else {
            JOptionPane.showMessageDialog(view, "Silahkan pilih data yang akan di cetak", "Peringatan", JOptionPane.WARNING_MESSAGE);
        }

    }

}
