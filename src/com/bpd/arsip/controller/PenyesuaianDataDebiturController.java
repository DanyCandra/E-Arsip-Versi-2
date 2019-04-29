/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bpd.arsip.controller;

import com.bpd.arsip.exception.ArsipException;
import com.bpd.arsip.model.DebiturModel;
import com.bpd.arsip.model.InstansiModel;
import com.bpd.arsip.validator.ValidatorNotNull;
import com.bpd.arsip.validator.ValidatorTextLimit;
import com.bpd.arsip.validator.ValidatorTextMinimum;
import com.bpd.arsip.view.panel.PanelPenyesuaianDataDebitur;
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
public class PenyesuaianDataDebiturController {

    private DebiturModel debiturModel;
    private InstansiModel instansiModel;

    public void setInstansiModel(InstansiModel instansiModel) {
        this.instansiModel = instansiModel;
    }

    public void setDebiturModel(DebiturModel debiturModel) {
        this.debiturModel = debiturModel;
    }

    public void loadInstansiCombobox(final PanelPenyesuaianDataDebitur view) {
        new SwingWorker<List<InstansiModel>, Object>() {
            @Override
            protected List<InstansiModel> doInBackground() throws Exception {
                List<InstansiModel> list = instansiModel.getAllInstansiModel();
                return list;
            }

            @Override
            protected void done() {
                try {
                    view.getComboInstansi().removeAllItems();
                    for (InstansiModel instansiModel : get()) {
                        view.getComboInstansi().addItem(instansiModel.getNamaInstansi());
                    }
                } catch (InterruptedException | ExecutionException ex) {
                    Logger.getLogger(PenyesuaianDataDebiturController.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }.execute();

    }

    public void save(PanelPenyesuaianDataDebitur view) {

        if (JOptionPane.showConfirmDialog(view, "Apakah anda data yang anda masukan sudah benar dan yakin akan menyimpan data ?", "Pesan Konfirmasi", JOptionPane.OK_CANCEL_OPTION) == JOptionPane.OK_OPTION) {
            try {

                getParameterDebitur(view);

                debiturModel.updateDebitur();

                JOptionPane.showMessageDialog(view, "Data Berhasil Diinput", "Pesan Informasi", JOptionPane.INFORMATION_MESSAGE);
                clearInput(view);

                clearInput(view);
                setEnableInput(view, false);
            } catch (ArsipException ex) {
                Logger.getLogger(PenyesuaianDataDebiturController.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(view, new Object[]{"Terlah Terjadi Erro Pada Databaser", ex.getMessage()}, "Pesan Error", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            clearInput(view);
            setEnableInput(view, false);
        }
    }

    public void setParameterDebitur(PanelPenyesuaianDataDebitur view) {
        String cif = view.getTextCIF().getText();
        if (ValidatorNotNull.isNotNull(cif, view, "CIF") && ValidatorTextMinimum.isLimit(cif, 8, view, "CIF")) {
            try {

                if (debiturModel.getDebiturModelByCif(cif) != null) {
                    debiturModel.getByCif(cif);
                    view.getTextCIF().setText(cif);
                    view.getTextNama().setText(debiturModel.getNama());
                    view.getTextTempatLahir().setText(debiturModel.getTempatLahir());
                    view.getDateChooserTangalLahir().setDate(debiturModel.getTanggalLahir());
                    view.getTextNIK().setText(debiturModel.getNik());
                    view.getTextAlamat().setText(debiturModel.getAlamat());
                    view.getTextKelurahan().setText(debiturModel.getKelurahan());
                    view.getTextKecamatan().setText(debiturModel.getKecamatan());
                    view.getTextTelepon().setText(debiturModel.getTelepon());

                    view.getTextSkCpns().setText(debiturModel.getSkCpns());
                    view.getTextSkPengangkatan().setText(debiturModel.getSkPengangkatan());
                    view.getTextSkTerakhir().setText(debiturModel.getSkTerakhir());
                    view.getTextTaspen().setText(debiturModel.getTaspen());
                    view.getTextSkPensiun().setText(debiturModel.getSkPensiun());
                    view.getTextKarip().setText(debiturModel.getKarip());
                    view.getTextSHM().setText(debiturModel.getShm());
                    view.getTextSHT().setText(debiturModel.getSht());
                    view.getTextIjazah().setText(debiturModel.getIjazah());
                    view.getTextLainnya().setText(debiturModel.getLainnya());
                    view.getComboInstansi().setSelectedItem(debiturModel.getInstansi().getNamaInstansi());
                    view.getTextSP2K().setText(debiturModel.getSp2k());
                    view.getTextPerjanjianKredit().setText(debiturModel.getSuratPerjanjian());
                    view.getTextSkPotongTermin().setText(debiturModel.getSkPotongTermin());
                    view.getTextSPK().setText(debiturModel.getSpk());
                    view.getTextWarkatDeposito().setText(debiturModel.getWarkatDeposito());
                    view.getTextPencairanDeposito().setText(debiturModel.getSkPencairanDeposito());
                    view.getTextShgb().setText(debiturModel.getShgb());
                    view.getTextIMB().setText(debiturModel.getImb());
                    view.getTextCoverNote().setText(debiturModel.getCoverNote());
                    view.getTextAjb().setText(debiturModel.getAjb());
                    view.getTextSkmht().setText(debiturModel.getSkmht());
                    view.getTextApht().setText(debiturModel.getApht());
                    view.getTextBpkb().setText(debiturModel.getBpkb());
                    view.getTextKwitansi().setText(debiturModel.getKwitansi());
                    view.getTextFiducia().setText(debiturModel.getFiducia());
                    view.getTextLainnya2().setText(debiturModel.getLainnya2());
                    view.getTextNoPermohonan().setText(debiturModel.getPermohonanKredit());

                    JOptionPane.showMessageDialog(view, "Data debitur tersedia silahkan sesuaikan dengan data terbaru", "Pesan Informasi", JOptionPane.INFORMATION_MESSAGE);
                    setEnableInput(view, true);

                } else {
                    JOptionPane.showMessageDialog(view, "Data debitur tidak tersedia ", "Pesan Kesalahan", JOptionPane.ERROR_MESSAGE);
                    clearInput(view);
                }

            } catch (ArsipException ex) {
                Logger.getLogger(PenyesuaianDataDebiturController.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(view, new Object[]{"Terlah Terjadi Erro Pada Databaser", ex.getMessage()}, "Pesan Error", JOptionPane.ERROR_MESSAGE);
            }

        }

    }

    public void getParameterDebitur(PanelPenyesuaianDataDebitur view) throws ArsipException {
        String cif = view.getTextCIF().getText().toUpperCase();
        String nama = view.getTextNama().getText().toUpperCase();
        String tempatLahir = view.getTextTempatLahir().getText().toUpperCase();
        Date tanggalLahir = view.getDateChooserTangalLahir().getDate();
        String nik = view.getTextNIK().getText().toUpperCase();
        String alamat = view.getTextAlamat().getText().toUpperCase();
        String kelurahan = view.getTextKelurahan().getText().toUpperCase();
        String kecamatan = view.getTextKecamatan().getText().toUpperCase();
        String telepon = view.getTextTelepon().getText().toUpperCase();
        String skCpns = view.getTextSkCpns().getText().toUpperCase();
        String skPengangkatan = view.getTextSkPengangkatan().getText().toUpperCase();
        String skTerakhir = view.getTextSkTerakhir().getText().toUpperCase();
        String taspen = view.getTextTaspen().getText().toUpperCase();
        String skPensiun = view.getTextSkPensiun().getText().toUpperCase();
        String karip = view.getTextKarip().getText().toUpperCase();
        String shm = view.getTextSHM().getText().toUpperCase();
        String sht = view.getTextSHT().getText().toUpperCase();
        String ijazah = view.getTextIjazah().getText().toUpperCase();
        String lainnya = view.getTextLainnya().getText().toUpperCase();
        instansiModel.selectInstansiModelByName((String) view.getComboInstansi().getSelectedItem());
        String sp2k = view.getTextSP2K().getText().toUpperCase();
        String suratPerjanjian = view.getTextPerjanjianKredit().getText().toUpperCase();
        String skPotongTermin = view.getTextSkPotongTermin().getText().toUpperCase();

        String spk = view.getTextSPK().getText().toUpperCase();
        String warkatDeposito = view.getTextWarkatDeposito().getText().toUpperCase();
        String skPencairanDeposito = view.getTextPencairanDeposito().getText().toUpperCase();
        String shgb = view.getTextShgb().getText().toUpperCase();
        String imb = view.getTextIMB().getText().toUpperCase();
        String coverNote = view.getTextCoverNote().getText().toUpperCase();
        String ajb = view.getTextAjb().getText().toUpperCase();
        String skmht = view.getTextSkmht().getText().toUpperCase();
        String apht = view.getTextApht().getText().toUpperCase();
        String bpkb = view.getTextBpkb().getText().toUpperCase();
        String kwitansi = view.getTextKwitansi().getText().toUpperCase();
        String fiducia = view.getTextFiducia().getText().toUpperCase();
        String lainnya2 = view.getTextLainnya2().getText().toUpperCase();
        String noPermohonan = view.getTextNoPermohonan().getText().toUpperCase();

        if (ValidatorNotNull.isNotNull(cif, view, "CIF") == true
                && ValidatorNotNull.isNotNull(nama, view, "Nama") == true
                && ValidatorNotNull.isNotNull(tempatLahir, view, "Tempat Lahir") == true
                && ValidatorNotNull.isNotNull(nik, view, "NIK") == true
                && ValidatorNotNull.isNotNull(alamat, view, "Alamat") == true
                && ValidatorNotNull.isNotNull(telepon, view, "Telepon") == true
                && ValidatorTextLimit.isLimit(skTerakhir, 50, view, "Sk Terkahir") == true
                && ValidatorTextLimit.isLimit(taspen, 50, view, "Taspen") == true
                && ValidatorTextLimit.isLimit(skPensiun, 50, view, "Sk Pensiun") == true
                && ValidatorTextLimit.isLimit(karip, 50, view, "Karip") == true
                && ValidatorTextLimit.isLimit(shm, 50, view, "SHM") == true
                && ValidatorTextLimit.isLimit(sht, 50, view, "SHT") == true
                && ValidatorTextLimit.isLimit(ijazah, 50, view, "Ijazah") == true
                && ValidatorTextLimit.isLimit(lainnya, 50, view, "Lainnya") == true
                && ValidatorTextMinimum.isLimit(cif, 8, view, "CIF")
                && ValidatorTextLimit.isLimit(cif, 10, view, "CIF") == true
                && ValidatorTextLimit.isLimit(nama, 50, view, "Nama") == true
                && ValidatorTextLimit.isLimit(alamat, 50, view, "Alamat") == true
                && ValidatorTextLimit.isLimit(kelurahan, 30, view, "Kelurahan") == true
                && ValidatorTextLimit.isLimit(kecamatan, 30, view, "Kecamatan") == true
                && ValidatorTextLimit.isLimit(telepon, 12, view, "Telepon") == true
                && ValidatorTextLimit.isLimit(skCpns, 50, view, "Sk CPNS") == true
                && ValidatorTextLimit.isLimit(skPengangkatan, 50, view, "Sk Pengangkatan") == true
                && ValidatorTextLimit.isLimit(sp2k, 50, view, "SP2K") == true
                && ValidatorTextLimit.isLimit(suratPerjanjian, 50, view, "Surat Perjanjian Kredit") == true
                && ValidatorTextLimit.isLimit(skPotongTermin, 50, view, "Surat Kuasa Potong Termin") == true
                && ValidatorTextLimit.isLimit(spk, 50, view, "SPK") == true
                && ValidatorTextLimit.isLimit(warkatDeposito, 50, view, "Warkat Deposito") == true
                && ValidatorTextLimit.isLimit(skPencairanDeposito, 50, view, "SK Pencairan Deposito") == true
                && ValidatorTextLimit.isLimit(shgb, 10, view, "SHGB") == true
                && ValidatorTextLimit.isLimit(imb, 50, view, "IMB") == true
                && ValidatorTextLimit.isLimit(coverNote, 50, view, "Cover Note") == true
                && ValidatorTextLimit.isLimit(ajb, 30, view, "AJB") == true
                && ValidatorTextLimit.isLimit(skmht, 30, view, "SKMHT") == true
                && ValidatorTextLimit.isLimit(apht, 12, view, "APHT") == true
                && ValidatorTextLimit.isLimit(bpkb, 50, view, "BPKB") == true
                && ValidatorTextLimit.isLimit(kwitansi, 50, view, "Kwitansi") == true
                && ValidatorTextLimit.isLimit(fiducia, 50, view, "Fiducia") == true
                && ValidatorTextLimit.isLimit(lainnya2, 50, view, "Lain - Lain 2") == true
                && ValidatorTextLimit.isLimit(noPermohonan, 50, view, "Nomor Permohonan") == true) {

            debiturModel.setCif(cif);
            debiturModel.setNama(nama);
            debiturModel.setTempatLahir(tempatLahir);
            debiturModel.setTanggalLahir(tanggalLahir);
            debiturModel.setNik(nik);
            debiturModel.setAlamat(alamat);
            debiturModel.setKelurahan(kelurahan);
            debiturModel.setKecamatan(kecamatan);
            debiturModel.setTelepon(telepon);
            debiturModel.setSkCpns(skCpns);
            debiturModel.setSkPengangkatan(skPengangkatan);
            debiturModel.setSkTerakhir(skTerakhir);
            debiturModel.setTaspen(taspen);
            debiturModel.setSkPensiun(skPensiun);
            debiturModel.setKarip(karip);
            debiturModel.setShm(shm);
            debiturModel.setSht(sht);
            debiturModel.setIjazah(ijazah);
            debiturModel.setLainnya(lainnya);
            debiturModel.setInstansi(instansiModel);
            debiturModel.setSp2k(sp2k);
            debiturModel.setSuratPerjanjian(suratPerjanjian);
            debiturModel.setSkPotongTermin(skPotongTermin);
            debiturModel.setSpk(spk);
            debiturModel.setWarkatDeposito(warkatDeposito);
            debiturModel.setSkPencairanDeposito(skPencairanDeposito);
            debiturModel.setShgb(shgb);
            debiturModel.setImb(imb);
            debiturModel.setCoverNote(coverNote);
            debiturModel.setAjb(ajb);
            debiturModel.setSkmht(skmht);
            debiturModel.setApht(apht);
            debiturModel.setBpkb(bpkb);
            debiturModel.setKwitansi(kwitansi);
            debiturModel.setFiducia(fiducia);
            debiturModel.setLainnya2(lainnya2);
            debiturModel.setPermohonanKredit(noPermohonan);
        }

    }

    public void clearInput(PanelPenyesuaianDataDebitur view) {
        //tab 1
        view.getTextCIF().setText("");
        view.getTextNama().setText("");
        view.getTextTempatLahir().setText("");
        view.getDateChooserTangalLahir().setDate(null);
        view.getTextNIK().setText("");
        view.getTextAlamat().setText("");
        view.getTextKelurahan().setText("");
        view.getTextKecamatan().setText("");
        view.getTextTelepon().setText("");
        view.getComboInstansi().setSelectedIndex(-1);

        //tab 2
        view.getTextSP2K().setText("");
        view.getTextPerjanjianKredit().setText("");
        view.getTextSkCpns().setText("");
        view.getTextSkPengangkatan().setText("");
        view.getTextSkTerakhir().setText("");
        view.getTextSkPensiun().setText("");
        view.getTextTaspen().setText("");
        view.getTextKarip().setText("");
        view.getTextSPK().setText("");
        view.getTextSkPotongTermin().setText("");
        view.getTextWarkatDeposito().setText("");
        view.getTextPencairanDeposito().setText("");
        view.getTextSHM().setText("");
        view.getTextShgb().setText("");
        view.getTextIMB().setText("");
        view.getTextCoverNote().setText("");
        view.getTextAjb().setText("");
        view.getTextSkmht().setText("");
        view.getTextApht().setText("");
        view.getTextSHT().setText("");
        view.getTextBpkb().setText("");
        view.getTextKwitansi().setText("");
        view.getTextFiducia().setText("");
        view.getTextIjazah().setText("");
        view.getTextLainnya().setText("");
        view.getTextLainnya2().setText("");
        view.getTextNoPermohonan().setText("");

        view.getjTabbedPane1().setSelectedIndex(0);
    }

    public void setEnableInput(PanelPenyesuaianDataDebitur view, boolean value) {
        //tab 1
        view.getTextNama().setEnabled(value);
        view.getTextTempatLahir().setEnabled(value);
        view.getDateChooserTangalLahir().setEnabled(value);
        view.getTextNIK().setEnabled(value);
        view.getTextAlamat().setEnabled(value);
        view.getTextKelurahan().setEnabled(value);
        view.getTextKecamatan().setEnabled(value);
        view.getTextTelepon().setEnabled(value);
        view.getComboInstansi().setEnabled(value);

        //tab 2
        view.getTextSP2K().setEnabled(value);
        view.getTextPerjanjianKredit().setEnabled(value);
        view.getTextSkCpns().setEnabled(value);
        view.getTextSkPengangkatan().setEnabled(value);
        view.getTextSkTerakhir().setEnabled(value);
        view.getTextSkPensiun().setEnabled(value);
        view.getTextTaspen().setEnabled(value);
        view.getTextKarip().setEnabled(value);
        view.getTextSPK().setEnabled(value);
        view.getTextSkPotongTermin().setEnabled(value);
        view.getTextWarkatDeposito().setEnabled(value);
        view.getTextPencairanDeposito().setEnabled(value);
        view.getTextSHM().setEnabled(value);
        view.getTextShgb().setEnabled(value);
        view.getTextIMB().setEnabled(value);
        view.getTextCoverNote().setEnabled(value);
        view.getTextAjb().setEnabled(value);
        view.getTextSkmht().setEnabled(value);
        view.getTextApht().setEnabled(value);
        view.getTextSHT().setEnabled(value);
        view.getTextBpkb().setEnabled(value);
        view.getTextKwitansi().setEnabled(value);
        view.getTextFiducia().setEnabled(value);
        view.getTextIjazah().setEnabled(value);
        view.getTextLainnya().setEnabled(value);
        view.getTextLainnya2().setEnabled(value);
        view.getTextNoPermohonan().setEnabled(value);

    }

}
