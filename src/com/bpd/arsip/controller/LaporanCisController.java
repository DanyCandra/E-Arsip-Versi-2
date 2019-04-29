/*
 * Aplikasi cis untuk mengelola berkas kredit PLO dan KWU di Bank Jateng Purwokerto.
 * Aplikasi ini dibuat oleh Dany Candra Febrianto | Bank Jateng Purwokerto 2016
 * Aplikasi ini bebas di modifikasi dan di kembangkan.
 */
package com.bpd.arsip.controller;

import com.bpd.arsip.model.CisModel;
import com.bpd.arsip.view.panel.PanelLaporanCis;
import com.bpd.arsip.view.report.FrameReport;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
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
public class LaporanCisController {

    private CisModel cisModel;

    public void setCisModel(CisModel cisModel) {
        this.cisModel = cisModel;
    }

    public void reload(final PanelLaporanCis view) {
        final Date mulai = view.getTextTanggalMulai().getDate();
        final Date selesai = view.getTextTanggalSelesai().getDate();

        if (mulai != null && selesai != null) {
            new SwingWorker<List<CisModel>, Object>() {
                int totalPertanggungan = 0;
                int premi = 0;
                int totalBiaya = 0;
                int penjumlah = 0;

                @Override
                protected List<CisModel> doInBackground() throws Exception {
                    view.getMainFrame().startLoading(true);
                    List<CisModel> select = cisModel.selectCisByTanggalRealisasi(mulai, selesai);
                    return select;

                }

                @Override
                protected void done() {

                    try {
                        view.getTableModel().clear();
                        if (get().size() > 0) {
                            for (CisModel model : get()) {
                                view.getTableModel().add(model);
                                double pertanggungan = model.getJumlahPertanggungan();
                                totalPertanggungan = (int) (totalPertanggungan + pertanggungan);

                            }

                            premi = (int) (totalPertanggungan * (2.75 / 1000));

                            if (premi + 16000 <= 250000) {
                                penjumlah = 16000;
                            } else if (premi + 16000 > 250000 && premi + 19000 <= 1000000) {
                                penjumlah = 19000;
                            } else {
                                penjumlah = 22000;
                            }

                            totalBiaya = premi + penjumlah;

                            NumberFormat numberFormat = NumberFormat.getInstance();
                            numberFormat.setMinimumIntegerDigits(0);
                            numberFormat.setGroupingUsed(true);

                            view.getButtonCetak().setEnabled(true);
                            view.getTextPremi().setText("Rp. " + numberFormat.format(totalPertanggungan) + " x 2.75 %o = ");
                            view.getTextTotal().setText("Rp. " + numberFormat.format(premi) + " + Rp. " + numberFormat.format(penjumlah) + " = ");
                            view.getTextHasilPremi().setText("Rp. " + numberFormat.format(premi));
                            view.getTextHasilTotal().setText("Rp. " + numberFormat.format(totalBiaya));
                            view.getMainFrame().startLoading(false);
                        } else {
                            JOptionPane.showMessageDialog(view, "Data tidak tersedia");
                        }
                    } catch (ExecutionException ex) {
                        Logger.getLogger(UserController.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(PencarianController.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }

            }.execute();
        } else {
            JOptionPane.showMessageDialog(view, "Silahkan Isi Tanggal Terlebih Dahulu");
        }

    }

    public void showReport(final PanelLaporanCis view) {
        SimpleDateFormat formatDate = new SimpleDateFormat("yyyy/MM/dd");
        String tanggalMulai = formatDate.format(view.getTextTanggalMulai().getDate());
        String tanggalSelesai = formatDate.format(view.getTextTanggalSelesai().getDate());
        String textPremi = view.getTextPremi().getText();
        String textHasil = view.getTextTotal().getText();
        String hasilPremi = view.getTextHasilPremi().getText();
        String hasilTotal = view.getTextHasilTotal().getText();

        new SwingWorker<Object, Object>() {
            @Override
            protected Object doInBackground() throws Exception {
                view.getMainFrame().startLoading(true);
                HashMap parameter = new HashMap();

                parameter.put("TextPremi", textPremi);
                parameter.put("TextHasil", textHasil);
                parameter.put("HasilPremi", hasilPremi);
                parameter.put("HasilTotal", hasilTotal);
                parameter.put("TanggalMulai", tanggalMulai);
                parameter.put("TanggalSelesai", tanggalSelesai);

                FrameReport report = new FrameReport("rpt/LaporanCis1.jasper", parameter);
                report.setVisible(true);
                return null;
            }

            @Override
            protected void done() {
                view.getMainFrame().startLoading(false);
            }

        }.execute();

    }

}
