/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bpd.arsip.controller;

import com.bpd.arsip.exception.ArsipException;
import com.bpd.arsip.model.QuotaModel;
import com.bpd.arsip.validator.ValidatorNotNull;
import com.bpd.arsip.validator.ValidatorNumber;
import com.bpd.arsip.validator.ValidatorTextLimit;
import com.bpd.arsip.view.panel.PanelPengaturanQuota;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.SwingWorker;

/**
 *
 * @author Dany Candra
 */
public class QuotaController {

    private QuotaModel quotaModel;

    public void setQuotaModel(QuotaModel quotaModel) {
        this.quotaModel = quotaModel;
    }

    public void loadDataQuota(PanelPengaturanQuota quota) {

        try {
            quotaModel.loadQuota();
            quota.getTextDus().setText(quotaModel.getIsiDus() + "");
            quota.getTextRak().setText(quotaModel.getIsiRak() + "");
        } catch (ArsipException ex) {
            Logger.getLogger(QuotaController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void simpan(PanelPengaturanQuota quota) {
        if (quota.getButtonSimpan().getText().equals("ATUR")) {
            enableInput(true, quota);
            quota.getButtonSimpan().setText("SIMPAN");
        } else if (quota.getButtonSimpan().getText().equals("SIMPAN")) {
            settingQuota(quota);
            batal(quota);
        }
    }

    public void batal(PanelPengaturanQuota quota) {
        enableInput(false, quota);
        quota.getButtonSimpan().setText("ATUR");
    }

    private void enableInput(boolean value, PanelPengaturanQuota quota) {
        quota.getTextDus().setEnabled(value);
        quota.getTextRak().setEnabled(value);
    }

    private void settingQuota(PanelPengaturanQuota quota) {
        String tmpQuotaRak = quota.getTextRak().getText().trim();
        String tmpQuotaDus = quota.getTextDus().getText().trim();
        if (ValidatorNotNull.isNotNull(tmpQuotaDus, quota, "Quota Dus")
                && ValidatorNotNull.isNotNull(tmpQuotaRak, quota, "Quota Rak")
                && ValidatorNumber.isNumber(tmpQuotaDus, quota, "Quota Rak")
                && ValidatorNumber.isNumber(tmpQuotaRak, quota, "Quota Dus")
                && ValidatorTextLimit.isLimit(tmpQuotaDus, 2, quota, "Quota Dus")
                && ValidatorTextLimit.isLimit(tmpQuotaRak, 3, quota, "Quota Rak")) {

            quotaModel.setIsiDus(Integer.valueOf(tmpQuotaDus));
            quotaModel.setIsiRak(Integer.valueOf(tmpQuotaRak));
            try {
                quotaModel.updateQuota();
                JOptionPane.showMessageDialog(quota, "Data berhasil disimpan", "Pesan Informasi", JOptionPane.INFORMATION_MESSAGE);
            } catch (ArsipException ex) {
                Logger.getLogger(QuotaController.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(quota, new Object[]{"Terjadi Kesalahan Tidak Dapat Menyimpan Data", ex.getMessage()}, "Pesan Kesalahan", JOptionPane.ERROR_MESSAGE);
            }
        }

    }
}
