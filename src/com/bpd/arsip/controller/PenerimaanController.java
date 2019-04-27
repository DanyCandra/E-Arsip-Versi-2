/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bpd.arsip.controller;

import com.bpd.arsip.exception.ArsipException;
import com.bpd.arsip.helper.HelperGeneratorAutoId;
import com.bpd.arsip.model.CisModel;
import com.bpd.arsip.model.DebiturModel;
import com.bpd.arsip.model.DusModel;
import com.bpd.arsip.model.InstansiModel;
import com.bpd.arsip.model.PejabatModel;
import com.bpd.arsip.model.PengarsipanModel;
import com.bpd.arsip.model.UserModel;
import com.bpd.arsip.validator.ValidatorNotNull;
import com.bpd.arsip.validator.ValidatorNumber;
import com.bpd.arsip.validator.ValidatorTextLimit;
import com.bpd.arsip.validator.ValidatorTextMinimum;
import com.bpd.arsip.view.panel.PanelPenerimaanBerkas;
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
 * @author Dany
 */
public class PenerimaanController {

    private PejabatModel pejabatModel;
    private PengarsipanModel pengarsipanModel;
    private DebiturModel debiturModel;
    private CisModel cisModel;
    private InstansiModel instansiModel;
    private DusModel dusModel;
    private UserModel userModel;

    public void setPejabatModel(PejabatModel pejabatModel) {
        this.pejabatModel = pejabatModel;
    }

    public void setPengarsipanModel(PengarsipanModel pengarsipanModel) {
        this.pengarsipanModel = pengarsipanModel;
    }

    public void setDebiturModel(DebiturModel debiturModel) {
        this.debiturModel = debiturModel;
    }

    public void setCisModel(CisModel cisModel) {
        this.cisModel = cisModel;
    }

    public void setInstansiModel(InstansiModel instansiModel) {
        this.instansiModel = instansiModel;
    }

    public void setDusModel(DusModel dusModel) {
        this.dusModel = dusModel;
    }

    public void setUserModel(UserModel userModel) {
        this.userModel = userModel;
    }

    public void clearInput(PanelPenerimaanBerkas view) {

        try {
            //tab 1 Data Diri
            view.getTextCif().setText("");
            view.getTextNama().setText("");
            view.getTextTempatLahir().setText("");
            view.getTextTanggalLahir().setDate(null);
            view.getTextNik().setText("");
            view.getTextAlamat().setText("");
            view.getTextKelurahan().setText("");
            view.getTextKecamatan().setText("");
            view.getTextTelepon().setText("");
            view.getComboInstansi().setSelectedIndex(-1);

            //tab 1 Data Pinjaman
            view.getComboPinjaman().setSelectedIndex(1);
            view.getTextNoPermohonan().setText("");
            view.getTextNoPinjaman().setText("");
            view.getTextPinjamanKe().setText("");
            view.getTextTanggalMulai().setDate(null);
            view.getTextTanggalSelesai().setDate(null);
            view.getTextPertanggungan().setText("");

            //tab 2 3 Data Berkas
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
            view.getTextLainnya1().setText("");
            view.getTextLainnya2().setText("");
            view.getComboPejabat().setSelectedIndex(-1);
            view.getTextSiup().setText("");
            view.getTextTanggalSiup().setDate(null);
            view.getTextTdp().setText("");
            view.getTextTanggalTDP().setDate(null);

            view.getComboDus().removeAllItems();

            view.getjTabbedPane1().setSelectedIndex(0);
        } catch (IndexOutOfBoundsException ex) {
        }

    }

    public void setEnableInput(PanelPenerimaanBerkas view, boolean value) {
        //tab 1
        view.getTextNama().setEnabled(value);
        view.getTextTempatLahir().setEnabled(value);
        view.getTextTanggalLahir().setEnabled(value);
        view.getTextNik().setEnabled(value);
        view.getTextAlamat().setEnabled(value);
        view.getTextKelurahan().setEnabled(value);
        view.getTextKecamatan().setEnabled(value);
        view.getTextTelepon().setEnabled(value);
        view.getComboInstansi().setEnabled(value);

        //tab 2
        view.getComboPinjaman().setEnabled(value);
        view.getTextNoPermohonan().setEnabled(value);
        view.getTextNoPinjaman().setEnabled(value);
        view.getTextPinjamanKe().setEnabled(value);
        view.getTextTanggalMulai().setEnabled(value);
        view.getTextTanggalSelesai().setEnabled(value);
        view.getTextPertanggungan().setEnabled(value);

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
        view.getTextLainnya1().setEnabled(value);
        view.getTextLainnya2().setEnabled(value);

        view.getBtnCekDus().setEnabled(value);
        view.getTextSiup().setEnabled(value);
        view.getTextTanggalSiup().setEnabled(value);
        view.getTextTdp().setEnabled(value);
        view.getTextTanggalTDP().setEnabled(value);
    }

    public void loadInstansiCombobox(final PanelPenerimaanBerkas view) {
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
                } catch (InterruptedException ex) {
                    Logger.getLogger(DusController.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ExecutionException ex) {
                    Logger.getLogger(PenerimaanController.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }.execute();
    }

    public void loadDusCombobox(final PanelPenerimaanBerkas view) {
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
                } catch (ExecutionException ex) {
                    Logger.getLogger(DusController.class.getName()).log(Level.SEVERE, null, ex);
                } catch (InterruptedException ex) {
                    Logger.getLogger(PenerimaanController.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }.execute();
    }

    public void loadPejabatCombobox(final PanelPenerimaanBerkas view) {
        new SwingWorker<List<PejabatModel>, Object>() {
            @Override
            protected List<PejabatModel> doInBackground() throws Exception {
                List<PejabatModel> list = pejabatModel.getAllPejabatModel();

                return list;
            }

            @Override
            protected void done() {
                try {
                    view.getComboPejabat().removeAllItems();
                    for (PejabatModel model : get()) {
                        view.getComboPejabat().addItem(model.getNamaPejabat());
                    }
                } catch (ExecutionException ex) {
                    Logger.getLogger(DusController.class.getName()).log(Level.SEVERE, null, ex);
                } catch (InterruptedException ex) {
                    Logger.getLogger(PenerimaanController.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }.execute();
    }

    private void setParameterDus(PanelPenerimaanBerkas view) {
        try {
            if (view.getComboDus().getSelectedItem() != null) {
                dusModel.getDusModelByIdDus((String) view.getComboDus().getSelectedItem());
            } else {
                JOptionPane.showMessageDialog(view, "Silahkan Pilih Dus");

            }
        } catch (ArsipException ex) {
            Logger.getLogger(PenerimaanController.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void setParameterArsip(PanelPenerimaanBerkas view) throws ArsipException {
        pengarsipanModel.setDebiturModel(debiturModel);
        pengarsipanModel.setTanggalTerima(new Date());
        pengarsipanModel.setDus(dusModel);
        pengarsipanModel.setUserPenerima(view.getUserModel());
        pejabatModel.selectPejabatByName((String) view.getComboPejabat().getSelectedItem());
        pengarsipanModel.setPejabatPenerima(pejabatModel);
        pengarsipanModel.setStatusArsip("1");
    }

    public boolean setParamerterCis(PanelPenerimaanBerkas view) {
        boolean result = false;
        String noPinjaman = view.getTextNoPinjaman().getText();
        Date tanggalRealisasi = view.getTextTanggalMulai().getDate();
        Date tanggalMulai = view.getTextTanggalMulai().getDate();
        Date tanggalSelesai = view.getTextTanggalSelesai().getDate();
        String tmpJumalhPertanggungan = view.getTextPertanggungan().getText();
        String pinjamanke = view.getTextPinjamanKe().getText();
        String jenisPinjaman = view.getComboPinjaman().getSelectedItem().toString();

        if (tanggalMulai == null || tanggalRealisasi == null || tanggalSelesai == null) {
            JOptionPane.showMessageDialog(view, "Silahkan input tanggal dengan benar", "Pesan Kesalahan", JOptionPane.ERROR_MESSAGE);
        } else if (ValidatorNotNull.isNotNull(noPinjaman, view, "Nomor Pinjam")
                && ValidatorNotNull.isNotNull(pinjamanke, view, "Urutan Pinjaman")
                && ValidatorNotNull.isNotNull(tmpJumalhPertanggungan, view, "Jumlah Pertanggungan")
                && ValidatorNumber.isNumber(tmpJumalhPertanggungan, view, "Jumlah Pertanggungan")
                && ValidatorNumber.isNumber(pinjamanke, view, "Urutan Pinjaman")) {

            cisModel.setIdCis(HelperGeneratorAutoId.generateAutoIdCis());
            cisModel.setDebiturModel(debiturModel);
            cisModel.setNoPinjam(noPinjaman);
            cisModel.setCifCis(debiturModel.getCif().concat(jenisPinjaman).concat(pinjamanke));
            cisModel.setTanggalRealisasi(tanggalRealisasi);
            cisModel.setTanggalMulai(tanggalMulai);
            cisModel.setTanggalSelesai(tanggalSelesai);
            cisModel.setJumlahPertanggungan(Double.parseDouble(tmpJumalhPertanggungan));
            result = true;
        }
        return result;
    }

    private boolean setParameterDebitur(PanelPenerimaanBerkas view) throws ArsipException {
        boolean result = false;

        String cif = view.getTextCif().getText();
        String nama = view.getTextNama().getText();
        String tempatLahir = view.getTextTempatLahir().getText();
        Date tanggalLahir = view.getTextTanggalLahir().getDate();
        String nik = view.getTextNik().getText();
        String alamat = view.getTextAlamat().getText();
        String kelurahan = view.getTextKelurahan().getText();
        String kecamatan = view.getTextKecamatan().getText();
        String telepon = view.getTextTelepon().getText();

        String skCpns = view.getTextSkCpns().getText();
        String skPengangkatan = view.getTextSkPengangkatan().getText();
        String skTerakhir = view.getTextSkTerakhir().getText();
        String taspen = view.getTextTaspen().getText();
        String skPensiun = view.getTextSkPensiun().getText();
        String karip = view.getTextKarip().getText();
        String shm = view.getTextSHM().getText();
        String sht = view.getTextSHT().getText();
        String ijazah = view.getTextIjazah().getText();
        String lainnya = view.getTextLainnya1().getText();
        instansiModel.selectInstansiModelByName((String) view.getComboInstansi().getSelectedItem());
        String sp2k = view.getTextSP2K().getText();
        String suratPerjanjian = view.getTextPerjanjianKredit().getText();
        String skPotongTermin = view.getTextSkPotongTermin().getText();
        String spk = view.getTextSPK().getText();
        String warkatDeposito = view.getTextWarkatDeposito().getText();
        String skPencairanDeposito = view.getTextPencairanDeposito().getText();
        String shgb = view.getTextShgb().getText();
        String imb = view.getTextIMB().getText();
        String coverNote = view.getTextCoverNote().getText();
        String ajb = view.getTextAjb().getText();
        String skmht = view.getTextSkmht().getText();
        String apht = view.getTextApht().getText();
        String bpkb = view.getTextBpkb().getText();
        String kwitansi = view.getTextKwitansi().getText();
        String fiducia = view.getTextFiducia().getText();
        String lainnya2 = view.getTextLainnya2().getText();
        String permohonanKredit = view.getTextNoPermohonan().getText();
        String siup = view.getTextSiup().getText();
        String tdp = view.getTextTdp().getText();
        Date tanggalSiup = view.getTextTanggalSiup().getDate();
        Date tanggalTdp = view.getTextTanggalTDP().getDate();

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
                && ValidatorTextLimit.isLimit(permohonanKredit, 50, view, "No Permohonan Kredit") == true
                && ValidatorTextLimit.isLimit(siup, 50, view, "SIUP") == true
                && ValidatorTextLimit.isLimit(tdp, 50, view, "TDP") == true) {

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
            debiturModel.setPermohonanKredit(permohonanKredit);
            debiturModel.setSiup(siup);
            debiturModel.setTdp(tdp);
            debiturModel.setTanggalSiup(tanggalSiup);
            debiturModel.setTanggalTdp(tanggalTdp);

            result = true;

        } else {
            result = false;
        }

        return result;
    }

    public void cekParameterDebitur(PanelPenerimaanBerkas view) {
        String cif = view.getTextCif().getText();
        if (ValidatorNotNull.isNotNull(cif, view, "CIF") && ValidatorTextMinimum.isLimit(cif, 8, view, "CIF")) {
            try {
                //jika status berkas = 1 data masih tersedia tidak dapat melakukan insert, harus melakukan pembaruan data
                if (pengarsipanModel.cekPenerimaanByCIF(cif) == false) {

                    //pengecekan apakah debitur baru atau debitur lama
                    if (pengarsipanModel.isNewBerkasCekByCif(cif) == false) {
                        view.getTextCif().setText(cif);
                        view.getTextNama().setText(pengarsipanModel.getDebiturModel().getNama());
                        view.getTextTempatLahir().setText(pengarsipanModel.getDebiturModel().getTempatLahir());
                        view.getTextTanggalLahir().setDate(pengarsipanModel.getDebiturModel().getTanggalLahir());
                        view.getTextNik().setText(pengarsipanModel.getDebiturModel().getNik());
                        view.getTextAlamat().setText(pengarsipanModel.getDebiturModel().getAlamat());
                        view.getTextKelurahan().setText(pengarsipanModel.getDebiturModel().getKelurahan());
                        view.getTextKecamatan().setText(pengarsipanModel.getDebiturModel().getKecamatan());
                        view.getTextTelepon().setText(pengarsipanModel.getDebiturModel().getTelepon());

                        view.getTextSkCpns().setText(pengarsipanModel.getDebiturModel().getSkCpns());
                        view.getTextSkPengangkatan().setText(pengarsipanModel.getDebiturModel().getSkPengangkatan());
                        view.getTextSkTerakhir().setText(pengarsipanModel.getDebiturModel().getSkTerakhir());
                        view.getTextTaspen().setText(pengarsipanModel.getDebiturModel().getTaspen());
                        view.getTextSkPensiun().setText(pengarsipanModel.getDebiturModel().getSkPensiun());
                        view.getTextKarip().setText(pengarsipanModel.getDebiturModel().getKarip());
                        view.getTextSHM().setText(pengarsipanModel.getDebiturModel().getShm());
                        view.getTextSHT().setText(pengarsipanModel.getDebiturModel().getSht());
                        view.getTextIjazah().setText(pengarsipanModel.getDebiturModel().getIjazah());
                        view.getTextLainnya1().setText(pengarsipanModel.getDebiturModel().getLainnya());
                        view.getComboInstansi().setSelectedItem(pengarsipanModel.getDebiturModel().getInstansi().getNamaInstansi());
                        view.getTextSP2K().setText(pengarsipanModel.getDebiturModel().getSp2k());
                        view.getTextPerjanjianKredit().setText(pengarsipanModel.getDebiturModel().getSuratPerjanjian());
                        view.getTextSkPotongTermin().setText(pengarsipanModel.getDebiturModel().getSkPotongTermin());
                        view.getTextSPK().setText(pengarsipanModel.getDebiturModel().getSpk());
                        view.getTextWarkatDeposito().setText(pengarsipanModel.getDebiturModel().getWarkatDeposito());
                        view.getTextPencairanDeposito().setText(pengarsipanModel.getDebiturModel().getSkPencairanDeposito());
                        view.getTextShgb().setText(pengarsipanModel.getDebiturModel().getShgb());
                        view.getTextIMB().setText(pengarsipanModel.getDebiturModel().getImb());
                        view.getTextCoverNote().setText(pengarsipanModel.getDebiturModel().getCoverNote());
                        view.getTextAjb().setText(pengarsipanModel.getDebiturModel().getAjb());
                        view.getTextSkmht().setText(pengarsipanModel.getDebiturModel().getSkmht());
                        view.getTextApht().setText(pengarsipanModel.getDebiturModel().getApht());
                        view.getTextBpkb().setText(pengarsipanModel.getDebiturModel().getBpkb());
                        view.getTextKwitansi().setText(pengarsipanModel.getDebiturModel().getKwitansi());
                        view.getTextFiducia().setText(pengarsipanModel.getDebiturModel().getFiducia());
                        view.getTextLainnya2().setText(pengarsipanModel.getDebiturModel().getLainnya2());
                        view.getTextSiup().setText(pengarsipanModel.getDebiturModel().getSiup());
                        view.getTextTdp().setText(pengarsipanModel.getDebiturModel().getTdp());
                        view.getTextTanggalSiup().setDate(pengarsipanModel.getDebiturModel().getTanggalSiup());
                        view.getTextTanggalTDP().setDate(pengarsipanModel.getDebiturModel().getTanggalTdp());
                        view.setNewDebitur(false);
                        JOptionPane.showMessageDialog(view, "Data debitur sudah tersedia silahkan sesuaikan dengan data terbaru", "Pesan Informasi", JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        view.setNewDebitur(true);
                        JOptionPane.showMessageDialog(view, "Data debitur belum tersedia silahkan isi data", "Pesan Informasi", JOptionPane.INFORMATION_MESSAGE);

                    }
                    setEnableInput(view, true);
                } else {
                    JOptionPane.showMessageDialog(view, "Data dengan CIF " + cif + " masih tersimpan ,tidak dapat melakukan duplikasi data ", "Pesan Informasi", JOptionPane.INFORMATION_MESSAGE);
                    view.initInput();
                }
            } catch (ArsipException ex) {
                Logger.getLogger(PenerimaanController.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(view, new Object[]{"Terlah Terjadi Eror Pada Database", ex.getMessage()}, "Pesan Error", JOptionPane.ERROR_MESSAGE);
            }

        }
    }

    public void save(PanelPenerimaanBerkas view) {
        if (JOptionPane.showConfirmDialog(view, "Apakah anda data yang anda masukan sudah benar dan yakin akan menyimpan data ?", "Pesan Konfirmasi", JOptionPane.OK_CANCEL_OPTION) == JOptionPane.OK_OPTION) {
            try {
                //memastikan data telah terisi
                if (setParameterDebitur(view) && setParamerterCis(view) == true) {

                    //mendapatkan semua parameter
                    setParameterDus(view);
                    setParameterArsip(view);

                    //cek apa quota dus masih ada
                    if (dusModel.getQuota() > 0) {
                        //jika debitur baru insert data arsip dan data debitur
                        if (view.isNewDebitur() == true) {
                            debiturModel.insertDebitur();
                            pengarsipanModel.insertPenerimaan();

                            //jika debitur lama data arsip dan data debitur hanya di update    
                        } else if (view.isNewDebitur() == false) {
                            debiturModel.updateDebitur();
                            pengarsipanModel.updatePenerimaan();
                        }

                        //update mengurangi stok dus pengarsipan yang di pakai
                        dusModel.updateStokPenerimaan();

                        //insert data cis parameter berasal dari inputan data debitur
                        cisModel.insertCis();

                        JOptionPane.showMessageDialog(view, "Data Berhasil Diinput", "Pesan Informasi", JOptionPane.INFORMATION_MESSAGE);
                        if (JOptionPane.showConfirmDialog(view, "Apakah anda akan mencetak cover map?", "Pesan Konfirmasi", JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE) == JOptionPane.OK_OPTION) {
                            //HashMap parameter = new HashMap();
                            //parameter.put("CIF", pengarsipanModel.getDebiturModel().getCif());
                            //FrameReport report = new FrameReport("rpt/CoverBerkas.jasper", parameter);
                            //report.setVisible(true);
                        }
                        view.initInput();
                    } else {
                        JOptionPane.showMessageDialog(view, "Silahkan pilih dus yang lain, quota dus sudah penuh", "Pesan Peringatan", JOptionPane.WARNING_MESSAGE);
                        loadDusCombobox(view);
                    }
                }
            } catch (ArsipException ex) {
                Logger.getLogger(PenerimaanController.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(view, new Object[]{"Terlah Terjadi Erro Pada Databaser", ex.getMessage()}, "Pesan Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    public void setComboPejabatDanDus(PanelPenerimaanBerkas view, boolean value) {
        view.getComboDus().setEnabled(value);
        view.getComboPejabat().setEnabled(value);

    }

}
