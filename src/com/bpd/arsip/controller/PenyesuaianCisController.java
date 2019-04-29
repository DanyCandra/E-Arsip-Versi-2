/*
 * Aplikasi pengarsipan untuk mengelola berkas kredit PLO dan KWU di Bank Jateng Purwokerto.
 * Aplikasi ini dibuat oleh Dany Candra Febrianto | Bank Jateng Purwokerto 2016
 * Aplikasi ini bebas di modifikasi dan di kembangkan.
 */
package com.bpd.arsip.controller;

import com.bpd.arsip.exception.ArsipException;
import com.bpd.arsip.helper.HelperGetPinjamanByCifCis;
import com.bpd.arsip.model.CisModel;
import com.bpd.arsip.validator.ValidatorNotNull;
import com.bpd.arsip.validator.ValidatorNumber;
import com.bpd.arsip.view.panel.PanelPenyesuaianCis;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Dany Candra
 */
public class PenyesuaianCisController {

    private CisModel cisModel;

    public void setCisModel(CisModel cisModel) {
        this.cisModel = cisModel;
    }

    public void loadCis(PanelPenyesuaianCis view) {
        String noPinjam = view.getTextNomorPinjaman().getText();
        if (ValidatorNotNull.isNotNull(noPinjam, view, "No Pinjam")) {
            try {
                cisModel.selectCisByNoPinjaman(noPinjam);
                if (cisModel.getCifCis() != null) {
                    view.getTextNomorPinjaman().setText(cisModel.getNoPinjam());
                    view.getTextNama().setText(cisModel.getDebiturModel().getNama());
                    view.getTextPinjamanKe().setText(HelperGetPinjamanByCifCis.getPinjamanKe(cisModel.getCifCis()));
                    view.getComboPinjaman().setSelectedIndex(HelperGetPinjamanByCifCis.getJenisPinjaman(cisModel.getCifCis()));
                    view.getTextNilaiPertanggungan().setText(cisModel.getJumlahPertanggungan() + "");
                    view.getDateChooserAkhir().setDate(cisModel.getTanggalSelesai());
                    view.getDateChooserRealisasi().setDate(cisModel.getTanggalRealisasi());
                    setEnableInput(view, true);
                    //setparameter edit
                    view.getComboPinjaman().setFocusable(true);
                    view.getTextNomorPinjaman().setEditable(false);
                    view.setCanEdit(true);
                }

            } catch (ArsipException ex) {
                Logger.getLogger(PenyesuaianCisController.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }

    public void setEnableInput(PanelPenyesuaianCis view, boolean value) {
        view.getTextPinjamanKe().setEnabled(value);
        view.getComboPinjaman().setEnabled(value);
        view.getTextNilaiPertanggungan().setEnabled(value);
        view.getDateChooserAkhir().setEnabled(value);
        view.getDateChooserRealisasi().setEnabled(value);
    }

    public void clearInput(PanelPenyesuaianCis view) {
        view.getTextNomorPinjaman().setText("");
        view.getTextNama().setText("");
        view.getTextPinjamanKe().setText("");
        view.getComboPinjaman().setSelectedIndex(0);
        view.getTextNilaiPertanggungan().setText("");
        view.getDateChooserAkhir().setDate(null);
        view.getDateChooserRealisasi().setDate(null);
    }

    public void updateCis(PanelPenyesuaianCis view) {
        String noPinjaman = view.getTextNomorPinjaman().getText();
        Date tanggalRealisasi = view.getDateChooserRealisasi().getDate();
        Date tanggalMulai = view.getDateChooserRealisasi().getDate();
        Date tanggalSelesai = view.getDateChooserAkhir().getDate();
        String tmpJumalhPertanggungan = view.getTextNilaiPertanggungan().getText();
        String pinjamanke = view.getTextPinjamanKe().getText();
        String jenisPinjaman = view.getComboPinjaman().getSelectedItem().toString();

        if (view.isCanEdit() == false) {
            JOptionPane.showMessageDialog(view, "Silahkan masukan no pinjaman terlebih dahulu");
        } else if (tanggalMulai == null || tanggalRealisasi == null || tanggalSelesai == null) {
            JOptionPane.showMessageDialog(view, "Silahkan input tanggal dengan benar", "Pesan Kesalahan", JOptionPane.ERROR_MESSAGE);
        } else if (ValidatorNotNull.isNotNull(noPinjaman, view, "Nomor Pinjam")
                && ValidatorNotNull.isNotNull(pinjamanke, view, "Urutan Pinjaman")
                && ValidatorNotNull.isNotNull(tmpJumalhPertanggungan, view, "Jumlah Pertanggungan")
                && ValidatorNumber.isNumber(tmpJumalhPertanggungan, view, "Jumlah Pertanggungan")
                && ValidatorNumber.isNumber(pinjamanke, view, "Urutan Pinjaman")) {
            try {
                cisModel.setIdCis(cisModel.getIdCis());
                cisModel.setDebiturModel(cisModel.getDebiturModel());
                cisModel.setNoPinjam(noPinjaman);
                cisModel.setCifCis(cisModel.getDebiturModel().getCif().concat(jenisPinjaman).concat(pinjamanke));
                cisModel.setTanggalRealisasi(tanggalRealisasi);
                cisModel.setTanggalMulai(tanggalMulai);
                cisModel.setTanggalSelesai(tanggalSelesai);
                cisModel.setJumlahPertanggungan(Double.parseDouble(tmpJumalhPertanggungan));

                cisModel.updateCis();
                JOptionPane.showMessageDialog(view, "Data Berhasil Di Simpan");

                //update parameter
                setEnableInput(view, false);
                view.getTextNomorPinjaman().setEditable(true);
                view.getTextNomorPinjaman().setFocusable(true);
                clearInput(view);
                view.setCanEdit(false);
            } catch (ArsipException ex) {
                Logger.getLogger(PenyesuaianCisController.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }

    public void batal(PanelPenyesuaianCis view) {
        setEnableInput(view, false);
        view.getTextNomorPinjaman().setEditable(true);
        view.getTextNomorPinjaman().setFocusable(true);
        clearInput(view);
        view.setCanEdit(false);
    }

}
