/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bpd.arsip.view.panel;

import com.bpd.arsip.controller.PengembalianController;
import com.bpd.arsip.model.PengarsipanModel;
import com.bpd.arsip.model.UserModel;
import com.bpd.arsip.view.MainFrame;
import com.stripbandunk.jwidget.JDynamicTable;
import com.stripbandunk.jwidget.JPagination;
import com.stripbandunk.jwidget.model.DynamicTableModel;
import javax.swing.JTextField;

/**
 *
 * @author Dany Candra
 */
public class PanelPengembalianBerkas extends javax.swing.JPanel {

    private final PengarsipanModel pengarsipanModel;
    private UserModel userModel;
    private final DynamicTableModel<PengarsipanModel> tableModel;
    private final PengembalianController controller;
    private final int PAGE_SIZE = 20;
    private MainFrame mainFrame;

    /**
     * Creates new form PanelInstansi
     */
    public PanelPengembalianBerkas() {
        pengarsipanModel = new PengarsipanModel();
        controller = new PengembalianController();
        controller.setPengarsipanModel(pengarsipanModel);
        tableModel = new DynamicTableModel<>(PengarsipanModel.class);
        tableModel.setGroup("ttpengembalian");

        initComponents();

        tablePengembalianBerkas.setDynamicModel(tableModel);

    }

    public MainFrame getMainFrame() {
        return mainFrame;
    }

    public void setMainFrame(MainFrame mainFrame) {
        this.mainFrame = mainFrame;
    }

    public UserModel getUserModel() {
        return userModel;
    }

    public void setUserModel(UserModel userModel) {
        this.userModel = userModel;
    }

    public DynamicTableModel<PengarsipanModel> getTableModel() {
        return tableModel;
    }

    public JDynamicTable getTablePengembalianBerkas() {
        return tablePengembalianBerkas;
    }

    public JPagination getjPagination() {
        return jPagination;
    }

    public JTextField getTextCIF() {
        return textCIF;
    }

    public void loadTable() {
        controller.reload(PAGE_SIZE, this);
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tablePengembalianBerkas = new com.stripbandunk.jwidget.JDynamicTable();
        buttonPengembalian = new javax.swing.JButton();
        jPagination = new com.stripbandunk.jwidget.JPagination();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        textCIF = new javax.swing.JTextField();
        buttonCari = new javax.swing.JButton();

        viewPortTransparan1.setForeground(new java.awt.Color(255, 255, 255));
        viewPortTransparan1.setView(tablePengembalianBerkas);

        setOpaque(false);

        jScrollPane1.setViewport(viewPortTransparan1);

        tablePengembalianBerkas.setForeground(new java.awt.Color(255, 255, 255));
        tablePengembalianBerkas.setOpaque(false);
        jScrollPane1.setViewportView(tablePengembalianBerkas);

        buttonPengembalian.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        buttonPengembalian.setText("Kembalikan Berkas");
        buttonPengembalian.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonPengembalianActionPerformed(evt);
            }
        });

        jPagination.setOpaque(false);
        jPagination.addPaginationListener(new com.stripbandunk.jwidget.listener.PaginationListener() {
            public void onPageChange(com.stripbandunk.jwidget.event.PaginationEvent evt) {
                jPaginationOnPageChange(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(""), "Pencarian", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("sansserif", 1, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel1.setOpaque(false);

        jLabel2.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("MASUKAN CIF");

        textCIF.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        textCIF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                textCIFKeyReleased(evt);
            }
        });

        buttonCari.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        buttonCari.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/bpd/arsip/icon/search.png"))); // NOI18N
        buttonCari.setText("Cari");
        buttonCari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCariActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(33, 33, 33)
                .addComponent(textCIF)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonCari))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textCIF, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(buttonCari, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPagination, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 694, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(buttonPengembalian))
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 251, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonPengembalian, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(jPagination, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void textCIFKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textCIFKeyReleased
        // TODO add your handling code here:
        if (evt.getKeyCode() == 10) {
            controller.search(textCIF.getText(), this);
       }
    }//GEN-LAST:event_textCIFKeyReleased

    private void buttonPengembalianActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonPengembalianActionPerformed
        // TODO add your handling code here:
        controller.crudUpdate(this);
        loadTable();
    }//GEN-LAST:event_buttonPengembalianActionPerformed

    private void jPaginationOnPageChange(com.stripbandunk.jwidget.event.PaginationEvent evt) {//GEN-FIRST:event_jPaginationOnPageChange
        // TODO add your handling code here:
        final int skip = (evt.getCurrentPage() - 1) * evt.getPageSize();
        final int max = evt.getPageSize();
        controller.onPageChange(skip, max, this);
    }//GEN-LAST:event_jPaginationOnPageChange

    private void buttonCariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCariActionPerformed
        // TODO add your handling code here:
        controller.search(textCIF.getText(), this);
    }//GEN-LAST:event_buttonCariActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonCari;
    private javax.swing.JButton buttonPengembalian;
    private javax.swing.JLabel jLabel2;
    private com.stripbandunk.jwidget.JPagination jPagination;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private com.stripbandunk.jwidget.JDynamicTable tablePengembalianBerkas;
    private javax.swing.JTextField textCIF;
    private com.bpd.arsip.component.ViewPortTransparan viewPortTransparan1;
    // End of variables declaration//GEN-END:variables
}
