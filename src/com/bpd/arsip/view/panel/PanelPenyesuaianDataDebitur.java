/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bpd.arsip.view.panel;

import com.bpd.arsip.controller.PenyesuaianDataDebiturController;
import com.bpd.arsip.model.DebiturModel;
import com.bpd.arsip.model.InstansiModel;
import com.toedter.calendar.JDateChooser;
import java.util.Locale;
import javax.swing.JComboBox;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;

/**
 *
 * @author Dany Candra
 */
public class PanelPenyesuaianDataDebitur extends javax.swing.JPanel {

    private final DebiturModel debiturModel;
    private final InstansiModel instansiModel;

    private final PenyesuaianDataDebiturController penyesuaianDataDebiturController;

    private boolean update;
    private boolean newDebitur;

    /**
     * Creates new form PanelPenerimaan
     */
    public PanelPenyesuaianDataDebitur() {

        instansiModel = new InstansiModel();
        debiturModel = new DebiturModel();

        penyesuaianDataDebiturController = new PenyesuaianDataDebiturController();
        penyesuaianDataDebiturController.setInstansiModel(instansiModel);
        penyesuaianDataDebiturController.setDebiturModel(debiturModel);

        initComponents();

        dateChooserTangalLahir.setLocale(new Locale("in_ID"));
        dateChooserTangalLahir.setDateFormatString("dd/MM/yyyy");

    }

    public JComboBox getComboInstansi() {
        return comboInstansi;
    }

    public JTextField getTextAjb() {
        return textAjb;
    }

    public JTextField getTextApht() {
        return textApht;
    }

    public JTextField getTextBpkb() {
        return textBpkb;
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

    public JTextField getTextKwitansi() {
        return textKwitansi;
    }

    public JTextField getTextLainnya2() {
        return textLainnya2;
    }

    public JTextField getTextPencairanDeposito() {
        return textPencairanDeposito;
    }

    public JTextField getTextSPK() {
        return textSPK;
    }

    public JTextField getTextShgb() {
        return textShgb;
    }

    public JTextField getTextSkmht() {
        return textSkmht;
    }

    public JTextField getTextWarkatDeposito() {
        return textWarkatDeposito;
    }

    public JDateChooser getDateChooserTangalLahir() {
        return dateChooserTangalLahir;
    }

    public JTextField getTextAlamat() {
        return textAlamat;
    }

    public JTextField getTextCIF() {
        return textCIF;
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

    public JTextField getTextLainnya() {
        return textLainnya;
    }

    public JTextField getTextNIK() {
        return textNIK;
    }

    public JTextField getTextNama() {
        return textNama;
    }

    public JTextField getTextSHM() {
        return textSHM;
    }

    public JTextField getTextSHT() {
        return textSHT;
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

    public JTextField getTextSkTerakhir() {
        return textSkTerakhir;
    }

    public JTextField getTextTaspen() {
        return textTaspen;
    }

    public JTextField getTextTelepon() {
        return textTelepon;
    }

    public JTextField getTextTempatLahir() {
        return textTempatLahir;
    }

    public JTabbedPane getjTabbedPane1() {
        return jTabbedPane1;
    }

    public JTextField getTextPerjanjianKredit() {
        return textPerjanjianKredit;
    }

    public JTextField getTextSP2K() {
        return textSP2K;
    }

    public JTextField getTextSkPotongTermin() {
        return textSkPotongTermin;
    }

    public JTextField getTextNoPermohonan() {
        return textNoPermohonan;
    }

    public final void loadData() {
        newDebitur = true;
        penyesuaianDataDebiturController.loadInstansiCombobox(this);

        penyesuaianDataDebiturController.clearInput(this);
        penyesuaianDataDebiturController.setEnableInput(this, false);

    }

    public void initInput() {
        newDebitur = true;

        comboInstansi.setSelectedIndex(0);

        penyesuaianDataDebiturController.clearInput(this);
        penyesuaianDataDebiturController.setEnableInput(this, false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        textAlamat = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        dateChooserTangalLahir = new com.toedter.calendar.JDateChooser();
        jLabel11 = new javax.swing.JLabel();
        textKelurahan = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        textTelepon = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        textNama = new javax.swing.JTextField();
        comboInstansi = new javax.swing.JComboBox();
        textTempatLahir = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        textKecamatan = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        textNIK = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        textCIF = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        textPencairanDeposito = new javax.swing.JTextField();
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
        jPanel2 = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        textSHM = new javax.swing.JTextField();
        textShgb = new javax.swing.JTextField();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        textIMB = new javax.swing.JTextField();
        jLabel40 = new javax.swing.JLabel();
        textCoverNote = new javax.swing.JTextField();
        jLabel41 = new javax.swing.JLabel();
        textAjb = new javax.swing.JTextField();
        jLabel42 = new javax.swing.JLabel();
        textSkmht = new javax.swing.JTextField();
        textSHT = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        textApht = new javax.swing.JTextField();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        textBpkb = new javax.swing.JTextField();
        jLabel45 = new javax.swing.JLabel();
        textKwitansi = new javax.swing.JTextField();
        textIjazah = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        textFiducia = new javax.swing.JTextField();
        jLabel46 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        textLainnya = new javax.swing.JTextField();
        textLainnya2 = new javax.swing.JTextField();
        jLabel47 = new javax.swing.JLabel();
        textNoPermohonan = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        textSiup = new javax.swing.JTextField();
        jLabel48 = new javax.swing.JLabel();
        textTdp = new javax.swing.JTextField();
        textTanggalTDP = new com.toedter.calendar.JDateChooser();
        jLabel49 = new javax.swing.JLabel();
        textTanggalSiup = new com.toedter.calendar.JDateChooser();
        jLabel50 = new javax.swing.JLabel();
        buttonSimpan = new javax.swing.JButton();
        buttonBatal = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 0, 204));
        setOpaque(false);

        jTabbedPane1.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(""), "Data Debitur", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("sansserif", 1, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel1.setOpaque(false);

        textAlamat.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        textAlamat.setEnabled(false);

        jButton1.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jButton1.setText("Cek");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        dateChooserTangalLahir.setDate(new java.util.Date());
        dateChooserTangalLahir.setDateFormatString("MMMM dd, yyyy");
        dateChooserTangalLahir.setEnabled(false);
        dateChooserTangalLahir.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        dateChooserTangalLahir.setOpaque(false);

        jLabel11.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("NIK");

        textKelurahan.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        textKelurahan.setEnabled(false);

        jLabel5.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("KELURAHAN");

        textTelepon.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        textTelepon.setEnabled(false);

        jLabel8.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("TEMPAT LAHIR");

        textNama.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        textNama.setEnabled(false);

        comboInstansi.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        comboInstansi.setEnabled(false);

        textTempatLahir.setEnabled(false);

        jLabel3.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("ALAMAT");

        textKecamatan.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        textKecamatan.setEnabled(false);

        jLabel7.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("KECAMATAN");

        jLabel12.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("TANGGAL LAHIR");

        jLabel10.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("TELEPON");

        jLabel1.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("CIF");

        jLabel2.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("NAMA");

        textNIK.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        textNIK.setEnabled(false);

        jLabel9.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("INSTANSI");

        textCIF.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        textCIF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                textCIFKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(textKelurahan, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(textKecamatan))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(textTempatLahir, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel12)
                                        .addGap(0, 0, Short.MAX_VALUE)))
                                .addGap(6, 6, 6))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(textAlamat)
                                .addContainerGap())))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(textTelepon, javax.swing.GroupLayout.PREFERRED_SIZE, 417, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(comboInstansi, javax.swing.GroupLayout.PREFERRED_SIZE, 417, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(202, 202, 202))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 147, Short.MAX_VALUE)
                                .addComponent(dateChooserTangalLahir, javax.swing.GroupLayout.PREFERRED_SIZE, 806, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(textNIK)
                                    .addComponent(textNama))))
                        .addContainerGap())))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(textCIF, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jButton1)
                    .addContainerGap(594, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textNIK, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textNama, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(textTempatLahir, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(dateChooserTangalLahir, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textAlamat, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textKelurahan, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textKecamatan, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textTelepon, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboInstansi, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(109, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(18, 18, 18)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(textCIF, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(393, Short.MAX_VALUE)))
        );

        jTabbedPane1.addTab("Data Debitur", jPanel1);

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(""), "Data Berkas", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("sansserif", 1, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel3.setOpaque(false);

        textPencairanDeposito.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        textPencairanDeposito.setEnabled(false);

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

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel30, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel22, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel23, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel35, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel36, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE))
                    .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE))
                .addGap(23, 23, 23)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textTaspen, javax.swing.GroupLayout.DEFAULT_SIZE, 271, Short.MAX_VALUE)
                    .addComponent(textSkTerakhir, javax.swing.GroupLayout.DEFAULT_SIZE, 271, Short.MAX_VALUE)
                    .addComponent(textSP2K, javax.swing.GroupLayout.DEFAULT_SIZE, 271, Short.MAX_VALUE)
                    .addComponent(textWarkatDeposito, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(textSPK, javax.swing.GroupLayout.DEFAULT_SIZE, 271, Short.MAX_VALUE)
                    .addComponent(textSkCpns, javax.swing.GroupLayout.DEFAULT_SIZE, 271, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel33, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel34, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel37, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(44, 44, 44))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(86, 86, 86)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textSkPengangkatan, javax.swing.GroupLayout.DEFAULT_SIZE, 315, Short.MAX_VALUE)
                    .addComponent(textPerjanjianKredit)
                    .addComponent(textPencairanDeposito)
                    .addComponent(textSkPotongTermin)
                    .addComponent(textKarip)
                    .addComponent(textSkPensiun))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(textSP2K, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(textPerjanjianKredit, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(textSkPengangkatan, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(textSkCpns, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(textSkPensiun, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(textSkTerakhir, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textTaspen, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textKarip, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(textSPK, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(textSkPotongTermin, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(textWarkatDeposito, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(textPencairanDeposito, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(188, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Data Berkas", jPanel3);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(""), "Data Berkas", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("sansserif", 1, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel2.setOpaque(false);

        jLabel26.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setText("SHM");

        textSHM.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        textSHM.setEnabled(false);

        textShgb.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        textShgb.setEnabled(false);

        jLabel38.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(255, 255, 255));
        jLabel38.setText("SHGB");

        jLabel39.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(255, 255, 255));
        jLabel39.setText("IMB");

        textIMB.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        textIMB.setEnabled(false);

        jLabel40.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(255, 255, 255));
        jLabel40.setText("COVER NOTE");

        textCoverNote.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        textCoverNote.setEnabled(false);

        jLabel41.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel41.setForeground(new java.awt.Color(255, 255, 255));
        jLabel41.setText("AJB");

        textAjb.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        textAjb.setEnabled(false);

        jLabel42.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel42.setForeground(new java.awt.Color(255, 255, 255));
        jLabel42.setText("SKMHT");

        textSkmht.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        textSkmht.setEnabled(false);

        textSHT.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        textSHT.setEnabled(false);

        jLabel27.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setText("SHT");

        textApht.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        textApht.setEnabled(false);

        jLabel43.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel43.setForeground(new java.awt.Color(255, 255, 255));
        jLabel43.setText("APHT");

        jLabel44.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel44.setForeground(new java.awt.Color(255, 255, 255));
        jLabel44.setText("BPKB");

        textBpkb.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        textBpkb.setEnabled(false);

        jLabel45.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel45.setForeground(new java.awt.Color(255, 255, 255));
        jLabel45.setText("KWITANSI PEMBELIAN");

        textKwitansi.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        textKwitansi.setEnabled(false);

        textIjazah.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        textIjazah.setEnabled(false);

        jLabel28.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setText("IJAZAH");

        textFiducia.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        textFiducia.setEnabled(false);

        jLabel46.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel46.setForeground(new java.awt.Color(255, 255, 255));
        jLabel46.setText("FIDUCIA");

        jLabel29.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(255, 255, 255));
        jLabel29.setText("LAIN LAIN 1");

        textLainnya.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        textLainnya.setEnabled(false);

        textLainnya2.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        textLainnya2.setEnabled(false);

        jLabel47.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel47.setForeground(new java.awt.Color(255, 255, 255));
        jLabel47.setText("LAIN LAIN 2");

        textNoPermohonan.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        textNoPermohonan.setEnabled(false);

        jLabel31.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(255, 255, 255));
        jLabel31.setText("NO PERMOHONAN");

        jLabel32.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(255, 255, 255));
        jLabel32.setText("SIUP");

        textSiup.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        textSiup.setEnabled(false);

        jLabel48.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel48.setForeground(new java.awt.Color(255, 255, 255));
        jLabel48.setText("TDP");

        textTdp.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        textTdp.setEnabled(false);

        textTanggalTDP.setEnabled(false);
        textTanggalTDP.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        textTanggalTDP.setOpaque(false);

        jLabel49.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel49.setForeground(new java.awt.Color(255, 255, 255));
        jLabel49.setText("TANGGAL TDP");

        textTanggalSiup.setEnabled(false);
        textTanggalSiup.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        textTanggalSiup.setOpaque(false);

        jLabel50.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel50.setForeground(new java.awt.Color(255, 255, 255));
        jLabel50.setText("TANGGAL SIUP");

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

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textNoPermohonan)
                            .addComponent(textLainnya)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel39, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel41, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel44, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel46, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
                                .addComponent(jLabel32, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel43, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel50, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textApht)
                            .addComponent(textSiup)
                            .addComponent(textTanggalSiup, javax.swing.GroupLayout.DEFAULT_SIZE, 304, Short.MAX_VALUE)
                            .addComponent(textFiducia)
                            .addComponent(textBpkb)
                            .addComponent(textAjb)
                            .addComponent(textIMB)
                            .addComponent(textSHM))))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel38, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel49, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel47, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel48, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
                            .addComponent(jLabel28, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
                            .addComponent(jLabel45, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel27, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
                            .addComponent(jLabel42, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
                            .addComponent(jLabel40, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(textIjazah)
                            .addComponent(textKwitansi, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textTanggalTDP, javax.swing.GroupLayout.DEFAULT_SIZE, 333, Short.MAX_VALUE)
                            .addComponent(textTdp, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textLainnya2)
                            .addComponent(textSkmht)
                            .addComponent(textSHT, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textShgb)
                            .addComponent(textCoverNote, javax.swing.GroupLayout.Alignment.LEADING)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(buttonSimpan, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonBatal, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(textSHM, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(textShgb, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(textIMB, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(textCoverNote, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(textAjb, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(textSkmht, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(textBpkb, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(textSHT, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel46, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textFiducia, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel45, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textKwitansi, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textApht, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textIjazah, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textSiup, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel48, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textTdp, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel50, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textTanggalSiup, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel49, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textTanggalTDP, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textLainnya, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel47, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textLainnya2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textNoPermohonan, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(buttonBatal, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(buttonSimpan, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Data Berkas", jPanel2);

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

    private void buttonBatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonBatalActionPerformed
        // TODO add your handling code here:
        initInput();
    }//GEN-LAST:event_buttonBatalActionPerformed

    private void buttonSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSimpanActionPerformed
        // TODO add your handling code here:
        penyesuaianDataDebiturController.save(this);
        // initInput();
    }//GEN-LAST:event_buttonSimpanActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        penyesuaianDataDebiturController.setParameterDebitur(this);
        textNIK.requestFocus();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void textCIFKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textCIFKeyReleased
        // TODO add your handling code here:
        if (evt.getKeyCode() == 10) {
            penyesuaianDataDebiturController.setParameterDebitur(this);
            textNIK.requestFocus();
        }
    }//GEN-LAST:event_textCIFKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonBatal;
    private javax.swing.JButton buttonSimpan;
    private javax.swing.JComboBox comboInstansi;
    private com.toedter.calendar.JDateChooser dateChooserTangalLahir;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
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
    private javax.swing.JLabel jLabel3;
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
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField textAjb;
    private javax.swing.JTextField textAlamat;
    private javax.swing.JTextField textApht;
    private javax.swing.JTextField textBpkb;
    private javax.swing.JTextField textCIF;
    private javax.swing.JTextField textCoverNote;
    private javax.swing.JTextField textFiducia;
    private javax.swing.JTextField textIMB;
    private javax.swing.JTextField textIjazah;
    private javax.swing.JTextField textKarip;
    private javax.swing.JTextField textKecamatan;
    private javax.swing.JTextField textKelurahan;
    private javax.swing.JTextField textKwitansi;
    private javax.swing.JTextField textLainnya;
    private javax.swing.JTextField textLainnya2;
    private javax.swing.JTextField textNIK;
    private javax.swing.JTextField textNama;
    private javax.swing.JTextField textNoPermohonan;
    private javax.swing.JTextField textPencairanDeposito;
    private javax.swing.JTextField textPerjanjianKredit;
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
    private com.toedter.calendar.JDateChooser textTanggalSiup;
    private com.toedter.calendar.JDateChooser textTanggalTDP;
    private javax.swing.JTextField textTaspen;
    private javax.swing.JTextField textTdp;
    private javax.swing.JTextField textTelepon;
    private javax.swing.JTextField textTempatLahir;
    private javax.swing.JTextField textWarkatDeposito;
    // End of variables declaration//GEN-END:variables
}
