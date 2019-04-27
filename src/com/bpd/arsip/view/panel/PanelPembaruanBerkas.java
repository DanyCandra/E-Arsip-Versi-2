/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bpd.arsip.view.panel;

import com.bpd.arsip.controller.PembaruanController;
import com.bpd.arsip.model.CisModel;
import com.bpd.arsip.model.DebiturModel;
import com.bpd.arsip.model.DusModel;
import com.bpd.arsip.model.InstansiModel;
import com.bpd.arsip.model.PejabatModel;
import com.bpd.arsip.model.PengarsipanModel;
import com.bpd.arsip.model.UserModel;
import com.toedter.calendar.JDateChooser;
import java.util.Locale;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;

/**
 *
 * @author Dany
 */
public class PanelPembaruanBerkas extends javax.swing.JPanel {

    private final PejabatModel pejabatModel;
    private final PengarsipanModel pengarsipanModel;
    private final DebiturModel debiturModel;
    private final CisModel cisModel;
    private final InstansiModel instansiModel;
    private final DusModel dusModel;
    private UserModel userModel;

    private final PembaruanController pembaruanController;

    /**
     * Creates new form PanelPenerimaanBerkas
     */
    public PanelPembaruanBerkas() {

        userModel = new UserModel();
        instansiModel = new InstansiModel();
        pejabatModel = new PejabatModel();
        debiturModel = new DebiturModel();
        cisModel = new CisModel();
        dusModel = new DusModel();
        pengarsipanModel = new PengarsipanModel();

        pembaruanController = new PembaruanController();
        pembaruanController.setUserModel(userModel);
        pembaruanController.setInstansiModel(instansiModel);
        pembaruanController.setPejabatModel(pejabatModel);
        pembaruanController.setDebiturModel(debiturModel);
        pembaruanController.setCisModel(cisModel);
        pembaruanController.setDusModel(dusModel);
        pembaruanController.setPengarsipanModel(pengarsipanModel);

        initComponents();

        textTanggalLahir.setLocale(new Locale("in_ID"));
        textTanggalLahir.setDateFormatString("dd/MM/yyyy");

        textTanggalMulai.setLocale(new Locale("in_ID"));
        textTanggalMulai.setDateFormatString("dd/MM/yyyy");

        textTanggalSelesai.setLocale(new Locale("in_ID"));
        textTanggalSelesai.setDateFormatString("dd/MM/yyyy");

        textTanggalSiup.setLocale(new Locale("in_ID"));
        textTanggalSiup.setDateFormatString("dd/MM/yyyy");

        textTanggalTDP.setLocale(new Locale("in_ID"));
        textTanggalTDP.setDateFormatString("dd/MM/yyyy");
    }

    public JTabbedPane getjTabbedPane1() {
        return jTabbedPane1;
    }

    public JTextField getTextDus() {
        return textDus;
    }

    public JComboBox getComboInstansi() {
        return comboInstansi;
    }

    public JComboBox getComboPejabat() {
        return comboPejabat;
    }

    public JComboBox getComboPinjaman() {
        return comboPinjaman;
    }

    public JTextField getTextAjb() {
        return textAjb;
    }

    public JTextField getTextAlamat() {
        return textAlamat;
    }

    public JTextField getTextApht() {
        return textApht;
    }

    public JTextField getTextBpkb() {
        return textBpkb;
    }

    public JTextField getTextCif() {
        return textCif;
    }

    public JTextField getTextCoverNote() {
        return textCoverNote;
    }

    public JTextField getTextFiducia() {
        return textFiducia;
    }

    public JTextField getTextIMB() {
        return textIMB;
    }

    public JTextField getTextIjazah() {
        return textIjazah;
    }

    public JTextField getTextKarip() {
        return textKarip;
    }

    public JTextField getTextKecamatan() {
        return textKecamatan;
    }

    public JTextField getTextKelurahan() {
        return textKelurahan;
    }

    public JTextField getTextKwitansi() {
        return textKwitansi;
    }

    public JTextField getTextLainnya1() {
        return textLainnya1;
    }

    public JTextField getTextLainnya2() {
        return textLainnya2;
    }

    public JTextField getTextNama() {
        return textNama;
    }

    public JTextField getTextNik() {
        return textNik;
    }

    public JTextField getTextNoPermohonan() {
        return textNoPermohonan;
    }

    public JTextField getTextNoPinjaman() {
        return textNoPinjaman;
    }

    public JTextField getTextPencairanDeposito() {
        return textPencairanDeposito;
    }

    public JTextField getTextPerjanjianKredit() {
        return textPerjanjianKredit;
    }

    public JTextField getTextPertanggungan() {
        return textPertanggungan;
    }

    public JTextField getTextPinjamanKe() {
        return textPinjamanKe;
    }

    public JTextField getTextSHM() {
        return textSHM;
    }

    public JTextField getTextSHT() {
        return textSHT;
    }

    public JTextField getTextSP2K() {
        return textSP2K;
    }

    public JTextField getTextSPK() {
        return textSPK;
    }

    public JTextField getTextShgb() {
        return textShgb;
    }

    public JTextField getTextSiup() {
        return textSiup;
    }

    public JTextField getTextSkCpns() {
        return textSkCpns;
    }

    public JTextField getTextSkPengangkatan() {
        return textSkPengangkatan;
    }

    public JTextField getTextSkPensiun() {
        return textSkPensiun;
    }

    public JTextField getTextSkPotongTermin() {
        return textSkPotongTermin;
    }

    public JTextField getTextSkTerakhir() {
        return textSkTerakhir;
    }

    public JTextField getTextSkmht() {
        return textSkmht;
    }

    public JDateChooser getTextTanggalLahir() {
        return textTanggalLahir;
    }

    public JDateChooser getTextTanggalMulai() {
        return textTanggalMulai;
    }

    public JDateChooser getTextTanggalSelesai() {
        return textTanggalSelesai;
    }

    public JDateChooser getTextTanggalSiup() {
        return textTanggalSiup;
    }

    public JDateChooser getTextTanggalTDP() {
        return textTanggalTDP;
    }

    public JTextField getTextTaspen() {
        return textTaspen;
    }

    public JTextField getTextTdp() {
        return textTdp;
    }

    public JTextField getTextTelepon() {
        return textTelepon;
    }

    public JTextField getTextTempatLahir() {
        return textTempatLahir;
    }

    public JTextField getTextWarkatDeposito() {
        return textWarkatDeposito;
    }

    public JButton getButtonBatal() {
        return buttonBatal;
    }

    public JButton getButtonSimpan() {
        return buttonSimpan;
    }

    public UserModel getUserModel() {
        return userModel;
    }

    public void setUserModel(UserModel userModel) {
        this.userModel = userModel;
    }

    public void initInput() {

        pembaruanController.loadInstansiCombobox(this);
        pembaruanController.loadPejabatCombobox(this);

        try {
            comboInstansi.setSelectedIndex(0);
            comboPejabat.setSelectedIndex(0);
            comboPinjaman.setSelectedIndex(0);
        } catch (IndexOutOfBoundsException | IllegalArgumentException ex) {
        }

        pembaruanController.clearInput(this);
        pembaruanController.setEnableInput(this, false);

    }

    public void setFisrtTab() {
        jTabbedPane1.setSelectedIndex(0);
        textCif.requestFocus();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        viewPortTransparan1 = new com.bpd.arsip.component.ViewPortTransparan();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        labelWhite1 = new dany.swing.lib.label.LabelWhite();
        textCif = new javax.swing.JTextField();
        buttonCekCif = new javax.swing.JButton();
        labelWhite2 = new dany.swing.lib.label.LabelWhite();
        textNik = new javax.swing.JTextField();
        labelWhite3 = new dany.swing.lib.label.LabelWhite();
        textNama = new javax.swing.JTextField();
        labelWhite4 = new dany.swing.lib.label.LabelWhite();
        textTempatLahir = new javax.swing.JTextField();
        labelWhite5 = new dany.swing.lib.label.LabelWhite();
        textTanggalLahir = new com.toedter.calendar.JDateChooser();
        labelWhite6 = new dany.swing.lib.label.LabelWhite();
        textAlamat = new javax.swing.JTextField();
        labelWhite7 = new dany.swing.lib.label.LabelWhite();
        textKelurahan = new javax.swing.JTextField();
        textKecamatan = new javax.swing.JTextField();
        labelWhite8 = new dany.swing.lib.label.LabelWhite();
        labelWhite9 = new dany.swing.lib.label.LabelWhite();
        textTelepon = new javax.swing.JTextField();
        labelWhite10 = new dany.swing.lib.label.LabelWhite();
        comboInstansi = new javax.swing.JComboBox();
        jPanel7 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        labelWhite21 = new dany.swing.lib.label.LabelWhite();
        comboPinjaman = new javax.swing.JComboBox();
        labelWhite22 = new dany.swing.lib.label.LabelWhite();
        textNoPermohonan = new javax.swing.JTextField();
        labelWhite23 = new dany.swing.lib.label.LabelWhite();
        textNoPinjaman = new javax.swing.JTextField();
        textPinjamanKe = new javax.swing.JTextField();
        labelWhite24 = new dany.swing.lib.label.LabelWhite();
        labelWhite11 = new dany.swing.lib.label.LabelWhite();
        textTanggalMulai = new com.toedter.calendar.JDateChooser();
        labelWhite12 = new dany.swing.lib.label.LabelWhite();
        textTanggalSelesai = new com.toedter.calendar.JDateChooser();
        textPertanggungan = new javax.swing.JTextField();
        labelWhite14 = new dany.swing.lib.label.LabelWhite();
        labelWhite13 = new dany.swing.lib.label.LabelWhite();
        jPanel3 = new javax.swing.JPanel();
        jLabel34 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        textSkCpns = new javax.swing.JTextField();
        textTaspen = new javax.swing.JTextField();
        textKarip = new javax.swing.JTextField();
        textPerjanjianKredit = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        textSkPensiun = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        textSkPotongTermin = new javax.swing.JTextField();
        textSP2K = new javax.swing.JTextField();
        textSkTerakhir = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        textSkPengangkatan = new javax.swing.JTextField();
        jLabel35 = new javax.swing.JLabel();
        textSPK = new javax.swing.JTextField();
        jLabel36 = new javax.swing.JLabel();
        textWarkatDeposito = new javax.swing.JTextField();
        jLabel37 = new javax.swing.JLabel();
        textPencairanDeposito = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        textSHM = new javax.swing.JTextField();
        textShgb = new javax.swing.JTextField();
        jLabel39 = new javax.swing.JLabel();
        textIMB = new javax.swing.JTextField();
        textCoverNote = new javax.swing.JTextField();
        jLabel41 = new javax.swing.JLabel();
        textAjb = new javax.swing.JTextField();
        textSkmht = new javax.swing.JTextField();
        jLabel43 = new javax.swing.JLabel();
        textApht = new javax.swing.JTextField();
        textSHT = new javax.swing.JTextField();
        jLabel44 = new javax.swing.JLabel();
        textBpkb = new javax.swing.JTextField();
        textKwitansi = new javax.swing.JTextField();
        jLabel46 = new javax.swing.JLabel();
        textFiducia = new javax.swing.JTextField();
        textIjazah = new javax.swing.JTextField();
        textTdp = new javax.swing.JTextField();
        textTanggalTDP = new com.toedter.calendar.JDateChooser();
        jLabel31 = new javax.swing.JLabel();
        textLainnya1 = new javax.swing.JTextField();
        textLainnya2 = new javax.swing.JTextField();
        jLabel38 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        textSiup = new javax.swing.JTextField();
        textTanggalSiup = new com.toedter.calendar.JDateChooser();
        jLabel48 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel51 = new javax.swing.JLabel();
        comboPejabat = new javax.swing.JComboBox();
        buttonSimpan = new javax.swing.JButton();
        buttonBatal = new javax.swing.JButton();
        textDus = new javax.swing.JTextField();
        jLabel50 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 0, 204));
        setOpaque(false);

        jTabbedPane1.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N

        jPanel1.setOpaque(false);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Data Debitur", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("sansserif", 1, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel4.setForeground(new java.awt.Color(255, 255, 255));
        jPanel4.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jPanel4.setOpaque(false);

        labelWhite1.setText("CIF");

        textCif.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        textCif.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                textCifKeyReleased(evt);
            }
        });

        buttonCekCif.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        buttonCekCif.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/bpd/arsip/icon/search.png"))); // NOI18N
        buttonCekCif.setText("Cek");
        buttonCekCif.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCekCifActionPerformed(evt);
            }
        });

        labelWhite2.setText("NIK");

        textNik.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        textNik.setEnabled(false);

        labelWhite3.setText("NAMA");

        textNama.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        textNama.setEnabled(false);

        labelWhite4.setText("TEMPAT LAHIR");

        textTempatLahir.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        textTempatLahir.setEnabled(false);

        labelWhite5.setText("TANGGAL LAHIR");

        textTanggalLahir.setEnabled(false);
        textTanggalLahir.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        textTanggalLahir.setOpaque(false);

        labelWhite6.setText("ALAMAT");

        textAlamat.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        textAlamat.setEnabled(false);

        labelWhite7.setText("KELURAHAN");

        textKelurahan.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        textKelurahan.setEnabled(false);

        textKecamatan.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        textKecamatan.setEnabled(false);

        labelWhite8.setText("KECAMATAN");

        labelWhite9.setText("TELEPON");

        textTelepon.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        textTelepon.setEnabled(false);

        labelWhite10.setText("INSTANSI");

        comboInstansi.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        comboInstansi.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comboInstansi.setEnabled(false);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(labelWhite9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(labelWhite7, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)
                            .addComponent(labelWhite10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(36, 36, 36)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(textKelurahan)
                            .addComponent(textTelepon)
                            .addComponent(comboInstansi, 0, 319, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelWhite8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(textKecamatan))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(labelWhite1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(labelWhite2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(labelWhite3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(labelWhite4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(labelWhite6, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textNama)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(textTempatLahir, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(labelWhite5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(textTanggalLahir, javax.swing.GroupLayout.DEFAULT_SIZE, 762, Short.MAX_VALUE))
                            .addComponent(textAlamat)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(textCif, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(buttonCekCif)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(textNik))))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(buttonCekCif, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelWhite1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textCif, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(textNik, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                            .addComponent(labelWhite2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textNama, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelWhite3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(4, 4, 4)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(textTempatLahir, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                            .addComponent(labelWhite5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelWhite4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(textTanggalLahir, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textAlamat, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelWhite6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textKecamatan, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(textKelurahan, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(labelWhite8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(labelWhite7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textTelepon, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelWhite9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboInstansi, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelWhite10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 33, Short.MAX_VALUE))
        );

        jPanel4Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {comboInstansi, textAlamat, textCif, textKecamatan, textKelurahan, textNama, textNik, textTanggalLahir, textTelepon, textTempatLahir});

        jPanel4Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {labelWhite1, labelWhite10, labelWhite2, labelWhite3, labelWhite4, labelWhite5, labelWhite6, labelWhite7, labelWhite8, labelWhite9});

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Data Debitur & Pinjaman", jPanel1);

        jPanel7.setOpaque(false);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Data Pinjaman", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("sansserif", 1, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel5.setForeground(new java.awt.Color(255, 255, 255));
        jPanel5.setOpaque(false);

        labelWhite21.setText("JENIS PINJAMAN");

        comboPinjaman.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        comboPinjaman.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "PLO", "KWU", "KUP", "KPR", "PLS", "PLW", "PRC", "KOP" }));
        comboPinjaman.setEnabled(false);

        labelWhite22.setLabelFor(textNoPermohonan);
        labelWhite22.setText("NO PERMOHONAN");

        textNoPermohonan.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        textNoPermohonan.setEnabled(false);

        labelWhite23.setLabelFor(textNoPinjaman);
        labelWhite23.setText("NO PINJAMAN");

        textNoPinjaman.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        textNoPinjaman.setEnabled(false);

        textPinjamanKe.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        textPinjamanKe.setEnabled(false);

        labelWhite24.setText("Pinjaman Ke");

        labelWhite11.setLabelFor(textTanggalMulai);
        labelWhite11.setText("TANGGAL MULAI");

        textTanggalMulai.setEnabled(false);
        textTanggalMulai.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        textTanggalMulai.setOpaque(false);

        labelWhite12.setLabelFor(textTanggalSelesai);
        labelWhite12.setText("TANGGAL SELESAI");

        textTanggalSelesai.setEnabled(false);
        textTanggalSelesai.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        textTanggalSelesai.setOpaque(false);

        textPertanggungan.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        textPertanggungan.setEnabled(false);

        labelWhite14.setText("Dalam Rupiah");

        labelWhite13.setLabelFor(textPertanggungan);
        labelWhite13.setText("JML PERTANGGUNGAN");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(labelWhite13, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(labelWhite21, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(labelWhite22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(6, 6, 6)))
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(textPertanggungan, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelWhite14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(comboPinjaman, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                                .addComponent(textNoPermohonan, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(771, 771, 771))))))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(labelWhite12, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)
                    .addComponent(labelWhite11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelWhite23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(textNoPinjaman, javax.swing.GroupLayout.PREFERRED_SIZE, 917, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelWhite24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textPinjamanKe, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(textTanggalSelesai, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textTanggalMulai, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(comboPinjaman)
                    .addComponent(labelWhite21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(textNoPermohonan, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                    .addComponent(labelWhite22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textPinjamanKe, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(textNoPinjaman, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(labelWhite23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(labelWhite24, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelWhite11, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textTanggalMulai, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelWhite12, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textTanggalSelesai, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelWhite13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(textPertanggungan, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelWhite14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(39, 39, 39))
        );

        jPanel5Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {labelWhite12, labelWhite13, labelWhite21, labelWhite23});

        jPanel5Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {textNoPinjaman, textPinjamanKe});

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(79, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Data Pinjaman", jPanel7);

        jPanel3.setOpaque(false);

        jLabel34.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(255, 255, 255));
        jLabel34.setText("SK POTONG TERMIN");

        jLabel33.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(255, 255, 255));
        jLabel33.setText("PERJANJIAN KREDIT");

        textSkCpns.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        textSkCpns.setEnabled(false);

        textTaspen.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        textTaspen.setEnabled(false);

        textKarip.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        textKarip.setEnabled(false);

        textPerjanjianKredit.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        textPerjanjianKredit.setEnabled(false);

        jLabel20.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("SK CPNS");

        textSkPensiun.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        textSkPensiun.setEnabled(false);

        jLabel24.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("SK PENSIUN");

        jLabel23.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("TASEPEN");

        textSkPotongTermin.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        textSkPotongTermin.setEnabled(false);

        textSP2K.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        textSP2K.setEnabled(false);

        textSkTerakhir.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        textSkTerakhir.setEnabled(false);

        jLabel22.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("SK TERKAHIR");

        jLabel30.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(255, 255, 255));
        jLabel30.setText("SP2K");

        jLabel25.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("KARIP");

        jLabel21.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("SK PENGANGKATAN");

        textSkPengangkatan.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        textSkPengangkatan.setEnabled(false);

        jLabel35.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(255, 255, 255));
        jLabel35.setText("TERMIN / SPK");

        textSPK.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        textSPK.setEnabled(false);

        jLabel36.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(255, 255, 255));
        jLabel36.setText("WARKAT DEPOSITO");

        textWarkatDeposito.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        textWarkatDeposito.setEnabled(false);

        jLabel37.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(255, 255, 255));
        jLabel37.setText("SK PENCAIRAN DEPOSITO");

        textPencairanDeposito.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        textPencairanDeposito.setEnabled(false);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel36, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE)
                    .addComponent(jLabel20, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE)
                    .addComponent(jLabel30, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel22, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel35, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(37, 37, 37)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textSPK)
                    .addComponent(textTaspen)
                    .addComponent(textSP2K, javax.swing.GroupLayout.DEFAULT_SIZE, 479, Short.MAX_VALUE)
                    .addComponent(textSkCpns)
                    .addComponent(textSkTerakhir)
                    .addComponent(textWarkatDeposito))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textPerjanjianKredit, javax.swing.GroupLayout.DEFAULT_SIZE, 479, Short.MAX_VALUE)
                    .addComponent(textPencairanDeposito, javax.swing.GroupLayout.DEFAULT_SIZE, 479, Short.MAX_VALUE)
                    .addComponent(textSkPotongTermin, javax.swing.GroupLayout.DEFAULT_SIZE, 479, Short.MAX_VALUE)
                    .addComponent(textKarip, javax.swing.GroupLayout.DEFAULT_SIZE, 479, Short.MAX_VALUE)
                    .addComponent(textSkPensiun, javax.swing.GroupLayout.DEFAULT_SIZE, 479, Short.MAX_VALUE)
                    .addComponent(textSkPengangkatan, javax.swing.GroupLayout.DEFAULT_SIZE, 479, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textSP2K, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel33)
                    .addComponent(textPerjanjianKredit, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(textSkCpns, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel21))
                            .addComponent(textSkPengangkatan, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jLabel20)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(textSkPensiun, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textKarip, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textSkPotongTermin, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textPencairanDeposito, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(165, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(jLabel22))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(textSkTerakhir, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel24))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(textTaspen, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel23)
                            .addComponent(jLabel25))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(textSPK, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel35)
                            .addComponent(jLabel34))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(textWarkatDeposito, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel36)
                            .addComponent(jLabel37))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        jPanel3Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLabel20, jLabel21, jLabel22, jLabel23, jLabel24, jLabel25, jLabel30, jLabel33, jLabel34, jLabel35, jLabel36, jLabel37});

        jTabbedPane1.addTab("Data Berkas", jPanel3);

        jPanel2.setOpaque(false);

        jLabel26.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setText("SHM");

        textSHM.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        textSHM.setEnabled(false);

        textShgb.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        textShgb.setEnabled(false);

        jLabel39.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(255, 255, 255));
        jLabel39.setText("IMB");

        textIMB.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        textIMB.setEnabled(false);

        textCoverNote.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        textCoverNote.setEnabled(false);

        jLabel41.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel41.setForeground(new java.awt.Color(255, 255, 255));
        jLabel41.setText("AJB");

        textAjb.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        textAjb.setEnabled(false);

        textSkmht.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        textSkmht.setEnabled(false);

        jLabel43.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel43.setForeground(new java.awt.Color(255, 255, 255));
        jLabel43.setText("APHT");

        textApht.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        textApht.setEnabled(false);

        textSHT.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        textSHT.setEnabled(false);

        jLabel44.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel44.setForeground(new java.awt.Color(255, 255, 255));
        jLabel44.setText("BPKB");

        textBpkb.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        textBpkb.setEnabled(false);

        textKwitansi.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        textKwitansi.setEnabled(false);

        jLabel46.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel46.setForeground(new java.awt.Color(255, 255, 255));
        jLabel46.setText("FIDUCIA");

        textFiducia.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        textFiducia.setEnabled(false);

        textIjazah.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        textIjazah.setEnabled(false);

        textTdp.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        textTdp.setEnabled(false);

        textTanggalTDP.setEnabled(false);
        textTanggalTDP.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        textTanggalTDP.setOpaque(false);

        jLabel31.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(255, 255, 255));
        jLabel31.setText("LAIN LAIN 1");

        textLainnya1.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        textLainnya1.setEnabled(false);

        textLainnya2.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        textLainnya2.setEnabled(false);

        jLabel38.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(255, 255, 255));
        jLabel38.setText("SHGB");

        jLabel40.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(255, 255, 255));
        jLabel40.setText("COVER NOTE");

        jLabel42.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel42.setForeground(new java.awt.Color(255, 255, 255));
        jLabel42.setText("SKMHT");

        jLabel27.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setText("SHT");

        jLabel45.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel45.setForeground(new java.awt.Color(255, 255, 255));
        jLabel45.setText("KWITANSI PEMBELIAN");

        jLabel28.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setText("IJAZAH");

        jLabel47.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel47.setForeground(new java.awt.Color(255, 255, 255));
        jLabel47.setText("TDP");

        jLabel32.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(255, 255, 255));
        jLabel32.setText("TANGGAL TDP");

        jLabel49.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel49.setForeground(new java.awt.Color(255, 255, 255));
        jLabel49.setText("LAIN LAIN 2");

        jLabel29.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(255, 255, 255));
        jLabel29.setText("SIUP");

        textSiup.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        textSiup.setEnabled(false);
        textSiup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textSiupActionPerformed(evt);
            }
        });

        textTanggalSiup.setEnabled(false);
        textTanggalSiup.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        textTanggalSiup.setOpaque(false);

        jLabel48.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel48.setForeground(new java.awt.Color(255, 255, 255));
        jLabel48.setText("TANGGAL SIUP");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel46, javax.swing.GroupLayout.DEFAULT_SIZE, 97, Short.MAX_VALUE)
                    .addComponent(jLabel26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel39, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel41, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel44, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel43, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel31, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel29, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel48, javax.swing.GroupLayout.DEFAULT_SIZE, 97, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textFiducia)
                    .addComponent(textLainnya1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(textBpkb)
                    .addComponent(textAjb, javax.swing.GroupLayout.DEFAULT_SIZE, 480, Short.MAX_VALUE)
                    .addComponent(textApht)
                    .addComponent(textSHM)
                    .addComponent(textIMB)
                    .addComponent(textSiup, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(textTanggalSiup, javax.swing.GroupLayout.DEFAULT_SIZE, 480, Short.MAX_VALUE))
                .addGap(79, 79, 79)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel27, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel38, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
                    .addComponent(jLabel40, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
                    .addComponent(jLabel42, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
                    .addComponent(jLabel45, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
                    .addComponent(jLabel47, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
                    .addComponent(jLabel32, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
                    .addComponent(jLabel49, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
                    .addComponent(jLabel28, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(textTanggalTDP, javax.swing.GroupLayout.DEFAULT_SIZE, 476, Short.MAX_VALUE)
                    .addComponent(textTdp, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textIjazah, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textKwitansi, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textSHT, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textSkmht, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textCoverNote, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textShgb, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textLainnya2))
                .addGap(18, 18, 18))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(textShgb, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textCoverNote, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textSkmht, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textSHT, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textKwitansi, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(textIjazah, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel28))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(textTdp, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel47))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textTanggalTDP, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(textLainnya2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel49)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel40)
                                    .addComponent(jLabel39))
                                .addGap(6, 6, 6)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel41)
                                    .addComponent(jLabel42))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel44)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel46))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel38)
                                .addGap(129, 129, 129)
                                .addComponent(jLabel45))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(129, 129, 129)
                                .addComponent(jLabel27)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel43)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel29)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel48, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel31, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(47, 47, 47)
                                .addComponent(jLabel32))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(textSHM, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(textIMB, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textAjb, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textBpkb, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textFiducia, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textApht, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textSiup, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textTanggalSiup, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textLainnya1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLabel26, jLabel27, jLabel28, jLabel29, jLabel31, jLabel32, jLabel38, jLabel39, jLabel40, jLabel41, jLabel42, jLabel43, jLabel44, jLabel45, jLabel46, jLabel47, jLabel49});

        jTabbedPane1.addTab("Data Berkas", jPanel2);

        jPanel8.setOpaque(false);

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), "Penyimpanan", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("sansserif", 1, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel6.setOpaque(false);

        jLabel51.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel51.setForeground(new java.awt.Color(255, 255, 255));
        jLabel51.setText("PEJABAT PENERIMA ");

        comboPejabat.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        comboPejabat.setEnabled(false);

        buttonSimpan.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        buttonSimpan.setText("SIMPAN");
        buttonSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSimpanActionPerformed(evt);
            }
        });

        buttonBatal.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        buttonBatal.setText("BATAL");
        buttonBatal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonBatalActionPerformed(evt);
            }
        });

        textDus.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        textDus.setEnabled(false);

        jLabel50.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel50.setForeground(new java.awt.Color(255, 255, 255));
        jLabel50.setText("PILIH DUS PENYIMPANAN");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addGap(0, 1114, Short.MAX_VALUE)
                        .addComponent(buttonSimpan, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonBatal, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel51, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel50, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(comboPejabat, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(textDus, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );

        jPanel6Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {buttonBatal, buttonSimpan});

        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel50)
                    .addComponent(textDus, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel51, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboPejabat, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonSimpan, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonBatal, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(234, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Data Penyimpanan Berkas", jPanel8);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void buttonSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSimpanActionPerformed
        // TODO add your handling code here:
        pembaruanController.save(this);
    }//GEN-LAST:event_buttonSimpanActionPerformed

    private void buttonBatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonBatalActionPerformed
        // TODO add your handling code here:
        initInput();
    }//GEN-LAST:event_buttonBatalActionPerformed

    private void buttonCekCifActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCekCifActionPerformed
        // TODO add your handling code here:
        pembaruanController.cekParameterDebitur(this);
        textNik.requestFocus();
    }//GEN-LAST:event_buttonCekCifActionPerformed

    private void textCifKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textCifKeyReleased
        // TODO add your handling code here:
        if (evt.getKeyCode() == 10) {
            pembaruanController.cekParameterDebitur(this);
            textNik.requestFocus();
        }
    }//GEN-LAST:event_textCifKeyReleased

    private void textSiupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textSiupActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textSiupActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonBatal;
    private javax.swing.JButton buttonCekCif;
    private javax.swing.JButton buttonSimpan;
    private javax.swing.JComboBox comboInstansi;
    private javax.swing.JComboBox comboPejabat;
    private javax.swing.JComboBox comboPinjaman;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JTabbedPane jTabbedPane1;
    private dany.swing.lib.label.LabelWhite labelWhite1;
    private dany.swing.lib.label.LabelWhite labelWhite10;
    private dany.swing.lib.label.LabelWhite labelWhite11;
    private dany.swing.lib.label.LabelWhite labelWhite12;
    private dany.swing.lib.label.LabelWhite labelWhite13;
    private dany.swing.lib.label.LabelWhite labelWhite14;
    private dany.swing.lib.label.LabelWhite labelWhite2;
    private dany.swing.lib.label.LabelWhite labelWhite21;
    private dany.swing.lib.label.LabelWhite labelWhite22;
    private dany.swing.lib.label.LabelWhite labelWhite23;
    private dany.swing.lib.label.LabelWhite labelWhite24;
    private dany.swing.lib.label.LabelWhite labelWhite3;
    private dany.swing.lib.label.LabelWhite labelWhite4;
    private dany.swing.lib.label.LabelWhite labelWhite5;
    private dany.swing.lib.label.LabelWhite labelWhite6;
    private dany.swing.lib.label.LabelWhite labelWhite7;
    private dany.swing.lib.label.LabelWhite labelWhite8;
    private dany.swing.lib.label.LabelWhite labelWhite9;
    private javax.swing.JTextField textAjb;
    private javax.swing.JTextField textAlamat;
    private javax.swing.JTextField textApht;
    private javax.swing.JTextField textBpkb;
    private javax.swing.JTextField textCif;
    private javax.swing.JTextField textCoverNote;
    private javax.swing.JTextField textDus;
    private javax.swing.JTextField textFiducia;
    private javax.swing.JTextField textIMB;
    private javax.swing.JTextField textIjazah;
    private javax.swing.JTextField textKarip;
    private javax.swing.JTextField textKecamatan;
    private javax.swing.JTextField textKelurahan;
    private javax.swing.JTextField textKwitansi;
    private javax.swing.JTextField textLainnya1;
    private javax.swing.JTextField textLainnya2;
    private javax.swing.JTextField textNama;
    private javax.swing.JTextField textNik;
    private javax.swing.JTextField textNoPermohonan;
    private javax.swing.JTextField textNoPinjaman;
    private javax.swing.JTextField textPencairanDeposito;
    private javax.swing.JTextField textPerjanjianKredit;
    private javax.swing.JTextField textPertanggungan;
    private javax.swing.JTextField textPinjamanKe;
    private javax.swing.JTextField textSHM;
    private javax.swing.JTextField textSHT;
    private javax.swing.JTextField textSP2K;
    private javax.swing.JTextField textSPK;
    private javax.swing.JTextField textShgb;
    private javax.swing.JTextField textSiup;
    private javax.swing.JTextField textSkCpns;
    private javax.swing.JTextField textSkPengangkatan;
    private javax.swing.JTextField textSkPensiun;
    private javax.swing.JTextField textSkPotongTermin;
    private javax.swing.JTextField textSkTerakhir;
    private javax.swing.JTextField textSkmht;
    private com.toedter.calendar.JDateChooser textTanggalLahir;
    private com.toedter.calendar.JDateChooser textTanggalMulai;
    private com.toedter.calendar.JDateChooser textTanggalSelesai;
    private com.toedter.calendar.JDateChooser textTanggalSiup;
    private com.toedter.calendar.JDateChooser textTanggalTDP;
    private javax.swing.JTextField textTaspen;
    private javax.swing.JTextField textTdp;
    private javax.swing.JTextField textTelepon;
    private javax.swing.JTextField textTempatLahir;
    private javax.swing.JTextField textWarkatDeposito;
    private com.bpd.arsip.component.ViewPortTransparan viewPortTransparan1;
    // End of variables declaration//GEN-END:variables
}
