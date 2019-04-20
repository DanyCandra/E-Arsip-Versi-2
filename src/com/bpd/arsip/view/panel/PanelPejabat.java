package com.bpd.arsip.view.panel;

import com.bpd.arsip.controller.PejabatController;
import com.bpd.arsip.model.PejabatModel;
import com.bpd.arsip.view.MainFrame;
import com.stripbandunk.jwidget.JDynamicTable;
import com.stripbandunk.jwidget.model.DynamicTableModel;
import javax.swing.JButton;
import javax.swing.JTextField;

/**
 *
 * @author Dany Candra
 */
public class PanelPejabat extends javax.swing.JPanel {
    
    private final PejabatModel pejabatModel;
    private final PejabatController pejabatController;
    private final DynamicTableModel<PejabatModel> tableModelPejabat;
    private MainFrame mainFrame;
    private boolean input;

    /**
     * Creates new form PanelPejabat
     */
    public PanelPejabat() {
        pejabatModel = new PejabatModel();
        pejabatController = new PejabatController();
        pejabatController.setPejabatModel(pejabatModel);
        initComponents();
        tableModelPejabat = new DynamicTableModel<>(PejabatModel.class);
        tablePejabat.setDynamicModel(tableModelPejabat);
        
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
    
    public JButton getButtonHapus() {
        return buttonHapus;
    }
    
    public JButton getButtonSimpan() {
        return buttonSimpan;
    }
    
    public JButton getButtonTambah() {
        return buttonTambah;
    }
    
    public JButton getButtonUbah() {
        return buttonUbah;
    }
    
    public JTextField getTextJabatan() {
        return textJabatan;
    }
    
    public JTextField getTextNama() {
        return textNama;
    }
    
    public JDynamicTable getTablePejabat() {
        return tablePejabat;
    }
    
    public DynamicTableModel<PejabatModel> getTableModelPejabat() {
        return tableModelPejabat;
    }
    
    public MainFrame getMainFrame() {
        return mainFrame;
    }
    
    public JTextField getTextCari() {
        return textCari;
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
        tablePejabat = new com.stripbandunk.jwidget.JDynamicTable();
        jPanel1 = new javax.swing.JPanel();
        labelWhite1 = new dany.swing.lib.label.LabelWhite();
        labelWhite2 = new dany.swing.lib.label.LabelWhite();
        textNama = new javax.swing.JTextField();
        textJabatan = new javax.swing.JTextField();
        buttonBatal = new javax.swing.JButton();
        buttonHapus = new javax.swing.JButton();
        buttonUbah = new javax.swing.JButton();
        buttonTambah = new javax.swing.JButton();
        buttonSimpan = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        textCari = new javax.swing.JTextField();
        buttonCari = new javax.swing.JButton();

        viewPortTransparan1.setView(tablePejabat);

        tablePejabat.setForeground(new java.awt.Color(255, 255, 255));
        tablePejabat.setOpaque(false);

        setBackground(new java.awt.Color(0, 0, 153));
        setOpaque(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Data Pejabat", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("sansserif", 1, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel1.setOpaque(false);

        labelWhite1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labelWhite1.setText("Nama :");

        labelWhite2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labelWhite2.setText("Jabatan :");

        textNama.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        textNama.setEnabled(false);

        textJabatan.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        textJabatan.setEnabled(false);

        buttonBatal.setText("Batal");
        buttonBatal.setEnabled(false);
        buttonBatal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonBatalActionPerformed(evt);
            }
        });

        buttonHapus.setText("Hapus");
        buttonHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonHapusActionPerformed(evt);
            }
        });

        buttonUbah.setText("Ubah");
        buttonUbah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonUbahActionPerformed(evt);
            }
        });

        buttonTambah.setText("Tambah");
        buttonTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonTambahActionPerformed(evt);
            }
        });

        buttonSimpan.setText("Simpan");
        buttonSimpan.setEnabled(false);
        buttonSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSimpanActionPerformed(evt);
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
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(labelWhite2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(labelWhite1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textNama)
                            .addComponent(textJabatan)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(buttonTambah)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonUbah, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonHapus)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonSimpan)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonBatal))))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {buttonBatal, buttonHapus, buttonTambah, buttonUbah});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(textNama)
                    .addComponent(labelWhite1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(textJabatan)
                    .addComponent(labelWhite2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonBatal)
                    .addComponent(buttonHapus)
                    .addComponent(buttonUbah)
                    .addComponent(buttonTambah)
                    .addComponent(buttonSimpan))
                .addContainerGap())
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Daftar Pejabat", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("sansserif", 1, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel2.setOpaque(false);

        jScrollPane1.setViewport(viewPortTransparan1);

        textCari.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        textCari.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                textCariKeyReleased(evt);
            }
        });

        buttonCari.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/bpd/arsip/icon/search.png"))); // NOI18N
        buttonCari.setText("Cari");
        buttonCari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCariActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 622, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(textCari, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonCari))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textCari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonCari))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 255, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void buttonTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonTambahActionPerformed
        // TODO add your handling code here:
        pejabatController.tambah(this);
    }//GEN-LAST:event_buttonTambahActionPerformed

    private void buttonUbahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonUbahActionPerformed
        // TODO add your handling code here:
        pejabatController.ubah(this);
    }//GEN-LAST:event_buttonUbahActionPerformed

    private void buttonHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonHapusActionPerformed
        // TODO add your handling code here:
        pejabatController.hapus(this);
    }//GEN-LAST:event_buttonHapusActionPerformed

    private void buttonSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSimpanActionPerformed
        // TODO add your handling code here:
        pejabatController.simpan(this);
    }//GEN-LAST:event_buttonSimpanActionPerformed

    private void buttonBatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonBatalActionPerformed
        // TODO add your handling code here:
        pejabatController.batal(this);
    }//GEN-LAST:event_buttonBatalActionPerformed

    private void buttonCariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCariActionPerformed
        // TODO add your handling code here:
        pejabatController.cari(this);
    }//GEN-LAST:event_buttonCariActionPerformed

    private void textCariKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textCariKeyReleased
        // TODO add your handling code here:
        if (evt.getKeyCode() == 10) {
            pejabatController.cari(this);
        }
    }//GEN-LAST:event_textCariKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonBatal;
    private javax.swing.JButton buttonCari;
    private javax.swing.JButton buttonHapus;
    private javax.swing.JButton buttonSimpan;
    private javax.swing.JButton buttonTambah;
    private javax.swing.JButton buttonUbah;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private dany.swing.lib.label.LabelWhite labelWhite1;
    private dany.swing.lib.label.LabelWhite labelWhite2;
    private com.stripbandunk.jwidget.JDynamicTable tablePejabat;
    private javax.swing.JTextField textCari;
    private javax.swing.JTextField textJabatan;
    private javax.swing.JTextField textNama;
    private com.bpd.arsip.component.ViewPortTransparan viewPortTransparan1;
    // End of variables declaration//GEN-END:variables

    public void load() {
        pejabatController.loadTablePejabat(this);
        pejabatController.batal(this);
    }
    
}
