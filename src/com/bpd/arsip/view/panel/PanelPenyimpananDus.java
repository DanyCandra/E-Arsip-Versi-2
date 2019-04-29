package com.bpd.arsip.view.panel;

import com.bpd.arsip.component.CenterFrame;
import com.bpd.arsip.controller.DusController;
import com.bpd.arsip.helper.list.LokasiListCellRender;
import com.bpd.arsip.helper.list.RakiListCellRender;
import com.bpd.arsip.model.DusModel;
import com.bpd.arsip.model.LantaiModel;
import com.bpd.arsip.model.RakModel;
import com.bpd.arsip.view.MainFrame;
import com.stripbandunk.jwidget.JDynamicTable;
import com.stripbandunk.jwidget.JPagination;
import com.stripbandunk.jwidget.model.DynamicTableModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JTextField;

/**
 *
 * @author Dany Candra
 */
public class PanelPenyimpananDus extends javax.swing.JPanel {

    private final DefaultComboBoxModel<LantaiModel> comboBoxModel;
    private final DefaultComboBoxModel<RakModel> comboBoxrRakModel;

    private final DynamicTableModel<DusModel> tableModelDus;

    private final DusController dusController;
    private final LantaiModel lantaiModel;
    private final DusModel dusModel;
    private final RakModel rakModel;
    private MainFrame mainFrame;
    private boolean input;

    private int PAGE_SIZE = 25;

    /**
     * Creates new form PanelLantai
     */
    public PanelPenyimpananDus() {
        lantaiModel = new LantaiModel();
        dusModel = new DusModel();
        rakModel = new RakModel();
        dusController = new DusController();
        dusController.setDusModel(dusModel);
        dusController.setLantaiModel(lantaiModel);
        dusController.setRakModel(rakModel);
        initComponents();

        CenterFrame.makeCenter(dialogHapusDus);
        tableModelDus = new DynamicTableModel<>(DusModel.class);
        tableDus.setDynamicModel(tableModelDus);

        comboBoxModel = new DefaultComboBoxModel<>();
        comboLokasi.setModel(comboBoxModel);
        comboLokasi.setRenderer(new LokasiListCellRender());

        comboBoxrRakModel = new DefaultComboBoxModel<>();
        comboHapusRak.setModel(comboBoxrRakModel);
        comboHapusRak.setRenderer(new RakiListCellRender());

    }

    public DefaultComboBoxModel<RakModel> getComboBoxrRakModel() {
        return comboBoxrRakModel;
    }

    public JComboBox getComboHapusRak() {
        return comboHapusRak;
    }

    public JDialog getDialogHapusDus() {
        return dialogHapusDus;
    }

    public boolean isInput() {
        return input;
    }

    public void setInput(boolean input) {
        this.input = input;
    }

    public void setMainFrame(MainFrame mainFrame) {
        this.mainFrame = mainFrame;
    }

    public JButton getButtonBatal() {
        return buttonBatal;
    }

    public JButton getButtonSimpan() {
        return buttonSimpan;
    }

    public JButton getButtonTambah() {
        return buttonTambah;
    }

    public JDynamicTable getTableDus() {
        return tableDus;
    }

    public DynamicTableModel<DusModel> getTableModelDus() {
        return tableModelDus;
    }

    public MainFrame getMainFrame() {
        return mainFrame;
    }

    public JPagination getjPagination() {
        return jPagination;
    }

    public JComboBox getComboLokasi() {
        return comboLokasi;
    }

    public JTextField getTextJumlahDus() {
        return textJumlahDus;
    }

    public JTextField getTextHapusJumlah() {
        return textHapusJumlah;
    }

    public DefaultComboBoxModel<LantaiModel> getComboBoxModel() {
        return comboBoxModel;
    }

    public int getPAGE_SIZE() {
        return PAGE_SIZE;
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
        tableDus = new com.stripbandunk.jwidget.JDynamicTable();
        dialogHapusDus = new javax.swing.JDialog();
        panelGradient1 = new dany.swing.lib.panel.PanelGradient();
        labelWhite3 = new dany.swing.lib.label.LabelWhite();
        labelWhite5 = new dany.swing.lib.label.LabelWhite();
        textHapusJumlah = new javax.swing.JTextField();
        buttonBatalHapus = new javax.swing.JButton();
        buttonHapus = new javax.swing.JButton();
        labelWhite6 = new dany.swing.lib.label.LabelWhite();
        labelWhite7 = new dany.swing.lib.label.LabelWhite();
        labelWhite8 = new dany.swing.lib.label.LabelWhite();
        labelWhite9 = new dany.swing.lib.label.LabelWhite();
        comboHapusRak = new javax.swing.JComboBox();
        jPanel1 = new javax.swing.JPanel();
        labelWhite1 = new dany.swing.lib.label.LabelWhite();
        buttonBatal = new javax.swing.JButton();
        buttonTambah = new javax.swing.JButton();
        buttonSimpan = new javax.swing.JButton();
        labelWhite2 = new dany.swing.lib.label.LabelWhite();
        textJumlahDus = new javax.swing.JTextField();
        comboLokasi = new javax.swing.JComboBox();
        jButton2 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPagination = new com.stripbandunk.jwidget.JPagination();
        jButton1 = new javax.swing.JButton();

        viewPortTransparan1.setView(tableDus);

        tableDus.setForeground(new java.awt.Color(255, 255, 255));
        tableDus.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tableDus.setOpaque(false);

        dialogHapusDus.setMinimumSize(new java.awt.Dimension(700, 350));
        dialogHapusDus.setModal(true);

        panelGradient1.setColorBottom(new java.awt.Color(0, 0, 204));

        labelWhite3.setText("Hapus Dus Arsip");
        labelWhite3.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N

        labelWhite5.setText("Jumlah Dus :");

        textHapusJumlah.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N

        buttonBatalHapus.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        buttonBatalHapus.setText("Batal");
        buttonBatalHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonBatalHapusActionPerformed(evt);
            }
        });

        buttonHapus.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        buttonHapus.setText("Hapus");
        buttonHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonHapusActionPerformed(evt);
            }
        });

        labelWhite6.setText("Perhatian !!!");
        labelWhite6.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N

        labelWhite7.setText("1. Dus yang akan dihapus berutan dari no dus akhir sejumlah isian di Kolom Jumlah Dus");

        labelWhite8.setText("2. Pastikan jumlah dus yang akan di hapus sudah tidak memiliki isi Berkas Kredit.");

        labelWhite9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labelWhite9.setText("Pilih Rak :");

        comboHapusRak.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        comboHapusRak.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout panelGradient1Layout = new javax.swing.GroupLayout(panelGradient1);
        panelGradient1.setLayout(panelGradient1Layout);
        panelGradient1Layout.setHorizontalGroup(
            panelGradient1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGradient1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelGradient1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelGradient1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(buttonHapus)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonBatalHapus))
                    .addGroup(panelGradient1Layout.createSequentialGroup()
                        .addGroup(panelGradient1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(labelWhite5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(labelWhite9, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelGradient1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textHapusJumlah)
                            .addComponent(comboHapusRak, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(panelGradient1Layout.createSequentialGroup()
                        .addGroup(panelGradient1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelWhite3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelWhite6, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelWhite7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelWhite8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 42, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panelGradient1Layout.setVerticalGroup(
            panelGradient1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGradient1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(labelWhite3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelGradient1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(comboHapusRak, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelWhite9, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelGradient1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelWhite5, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textHapusJumlah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(panelGradient1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonBatalHapus)
                    .addComponent(buttonHapus))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelWhite6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelWhite7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelWhite8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        dialogHapusDus.getContentPane().add(panelGradient1, java.awt.BorderLayout.CENTER);

        setBackground(new java.awt.Color(0, 0, 153));
        setOpaque(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Data Tempat Penyimpanan", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("sansserif", 1, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel1.setOpaque(false);

        labelWhite1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labelWhite1.setText("Kode Tempat :");

        buttonBatal.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        buttonBatal.setText("Batal");
        buttonBatal.setEnabled(false);
        buttonBatal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonBatalActionPerformed(evt);
            }
        });

        buttonTambah.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        buttonTambah.setText("Tambah");
        buttonTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonTambahActionPerformed(evt);
            }
        });

        buttonSimpan.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        buttonSimpan.setText("Simpan");
        buttonSimpan.setEnabled(false);
        buttonSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSimpanActionPerformed(evt);
            }
        });

        labelWhite2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labelWhite2.setText("Jumlah Dus :");

        textJumlahDus.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        textJumlahDus.setEnabled(false);

        comboLokasi.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        comboLokasi.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comboLokasi.setEnabled(false);

        jButton2.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jButton2.setText("Hapus");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(labelWhite1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(comboLokasi, 0, 518, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(buttonTambah)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonSimpan)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonBatal))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(labelWhite2, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textJumlahDus))))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {buttonBatal, buttonSimpan, buttonTambah, jButton2});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(labelWhite1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(comboLokasi)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(textJumlahDus)
                    .addComponent(labelWhite2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonBatal, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonTambah, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonSimpan, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Daftar Tempat Penyimpanan", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("sansserif", 1, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel2.setOpaque(false);

        jScrollPane1.setBorder(null);
        jScrollPane1.setViewport(viewPortTransparan1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 640, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 258, Short.MAX_VALUE)
        );

        jPagination.setOpaque(false);
        jPagination.addPaginationListener(new com.stripbandunk.jwidget.listener.PaginationListener() {
            public void onPageChange(com.stripbandunk.jwidget.event.PaginationEvent evt) {
                jPaginationOnPageChange(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(255, 51, 51));
        jButton1.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jButton1.setText("Hapus Dus");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPagination, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPagination, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void buttonTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonTambahActionPerformed
        // TODO add your handling code here:
        dusController.tambah(this);
    }//GEN-LAST:event_buttonTambahActionPerformed

    private void buttonSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSimpanActionPerformed
        // TODO add your handling code here:
        dusController.simpan(this);
        
    }//GEN-LAST:event_buttonSimpanActionPerformed

    private void buttonBatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonBatalActionPerformed
        // TODO add your handling code here:
        dusController.batal(this);
    }//GEN-LAST:event_buttonBatalActionPerformed

    private void jPaginationOnPageChange(com.stripbandunk.jwidget.event.PaginationEvent evt) {//GEN-FIRST:event_jPaginationOnPageChange
        // TODO add your handling code here:
        final int skip = (evt.getCurrentPage() - 1) * evt.getPageSize();
        final int max = evt.getPageSize();
        dusController.onPageChange(skip, max, this);
        dusController.batal(this);
    }//GEN-LAST:event_jPaginationOnPageChange

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        dialogHapusDus.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void buttonHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonHapusActionPerformed
        // TODO add your handling code here:
        dusController.hapusDus(this);
    }//GEN-LAST:event_buttonHapusActionPerformed

    private void buttonBatalHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonBatalHapusActionPerformed
        // TODO add your handling code here:
        textHapusJumlah.setText("");
        comboHapusRak.setSelectedIndex(0);
        dialogHapusDus.dispose();
        dialogHapusDus.setVisible(false);
    }//GEN-LAST:event_buttonBatalHapusActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonBatal;
    private javax.swing.JButton buttonBatalHapus;
    private javax.swing.JButton buttonHapus;
    private javax.swing.JButton buttonSimpan;
    private javax.swing.JButton buttonTambah;
    private javax.swing.JComboBox comboHapusRak;
    private javax.swing.JComboBox comboLokasi;
    private javax.swing.JDialog dialogHapusDus;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private com.stripbandunk.jwidget.JPagination jPagination;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private dany.swing.lib.label.LabelWhite labelWhite1;
    private dany.swing.lib.label.LabelWhite labelWhite2;
    private dany.swing.lib.label.LabelWhite labelWhite3;
    private dany.swing.lib.label.LabelWhite labelWhite5;
    private dany.swing.lib.label.LabelWhite labelWhite6;
    private dany.swing.lib.label.LabelWhite labelWhite7;
    private dany.swing.lib.label.LabelWhite labelWhite8;
    private dany.swing.lib.label.LabelWhite labelWhite9;
    private dany.swing.lib.panel.PanelGradient panelGradient1;
    private com.stripbandunk.jwidget.JDynamicTable tableDus;
    private javax.swing.JTextField textHapusJumlah;
    private javax.swing.JTextField textJumlahDus;
    private com.bpd.arsip.component.ViewPortTransparan viewPortTransparan1;
    // End of variables declaration//GEN-END:variables

    public void load() {
        dusController.loadTableLantai(this, PAGE_SIZE);
        dusController.batal(this);
        dusController.loadComboBox(this);
        dusController.loadComboBoxRak(this);

    }

}
