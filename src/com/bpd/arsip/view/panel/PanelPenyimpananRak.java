/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bpd.arsip.view.panel;

import com.bpd.arsip.controller.RakController;
import com.bpd.arsip.model.DusModel;
import com.bpd.arsip.model.RakModel;
import com.stripbandunk.jwidget.JDynamicTable;
import com.stripbandunk.jwidget.model.DynamicTableModel;

/**
 *
 * @author Dany Candra
 */
public class PanelPenyimpananRak extends javax.swing.JPanel {

    private final DynamicTableModel<RakModel> tableModel;
    private final DynamicTableModel<DusModel> dusTableModel;

    private final DusModel dusModel;
    private final RakModel rakModel;
    private final RakController rakController;

    /**
     * Creates new form PanelRak
     */
    public PanelPenyimpananRak() {
        rakModel = new RakModel();
        dusModel = new DusModel();
        rakController = new RakController();
        tableModel = new DynamicTableModel<>(RakModel.class);
        dusTableModel = new DynamicTableModel<>(DusModel.class);

        initComponents();

        tableRak.setDynamicModel(tableModel);
        tableDus.setDynamicModel(dusTableModel);
        rakController.setRakModel(rakModel);
        rakController.setDusModel(dusModel);
    }

    public DynamicTableModel<RakModel> getTableModel() {
        return tableModel;
    }

    public JDynamicTable getTableRak() {
        return tableRak;
    }

    public DynamicTableModel<DusModel> getDusTableModel() {
        return dusTableModel;
    }

    public JDynamicTable getTableDus() {
        return tableDus;
    }

    public void resetTable() {
        dusTableModel.clear();
    }

    public void loadData() {
        rakController.reload(this);
        resetTable();
    }
    
    public void loadDataPanel(){
        rakController.reload(this);
        rakController.loadDus(this);
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
        viewPortTransparan2 = new com.bpd.arsip.component.ViewPortTransparan();
        jPanel1 = new javax.swing.JPanel();
        jPanelRak = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableRak = new com.stripbandunk.jwidget.JDynamicTable();
        jPanelDus = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableDus = new com.stripbandunk.jwidget.JDynamicTable();
        buttonSegarkan = new javax.swing.JButton();

        viewPortTransparan1.setView(tableRak);

        viewPortTransparan2.setView(tableDus);

        setOpaque(false);

        jPanel1.setOpaque(false);

        jPanelRak.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(""), "Daftar Rak", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("sansserif", 1, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanelRak.setOpaque(false);

        jScrollPane1.setViewport(viewPortTransparan1);

        tableRak.setForeground(new java.awt.Color(255, 255, 255));
        tableRak.setOpaque(false);
        tableRak.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableRakMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableRak);

        javax.swing.GroupLayout jPanelRakLayout = new javax.swing.GroupLayout(jPanelRak);
        jPanelRak.setLayout(jPanelRakLayout);
        jPanelRakLayout.setHorizontalGroup(
            jPanelRakLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanelRakLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelRakLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 568, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jPanelRakLayout.setVerticalGroup(
            jPanelRakLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 133, Short.MAX_VALUE)
            .addGroup(jPanelRakLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelRakLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        jPanelDus.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(""), "Daftar Rak", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("sansserif", 1, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanelDus.setOpaque(false);

        jScrollPane2.setViewport(viewPortTransparan2);

        tableDus.setForeground(new java.awt.Color(255, 255, 255));
        tableDus.setOpaque(false);
        jScrollPane2.setViewportView(tableDus);

        javax.swing.GroupLayout jPanelDusLayout = new javax.swing.GroupLayout(jPanelDus);
        jPanelDus.setLayout(jPanelDusLayout);
        jPanelDusLayout.setHorizontalGroup(
            jPanelDusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanelDusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelDusLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 568, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jPanelDusLayout.setVerticalGroup(
            jPanelDusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 140, Short.MAX_VALUE)
            .addGroup(jPanelDusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelDusLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        buttonSegarkan.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        buttonSegarkan.setText("SEGARKAN");
        buttonSegarkan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSegarkanActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 553, Short.MAX_VALUE)
                .addGap(99, 99, 99))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelRak, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelDus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(buttonSegarkan)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelRak, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanelDus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonSegarkan, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void buttonSegarkanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSegarkanActionPerformed
        // TODO add your handling code here:
        loadData();
    }//GEN-LAST:event_buttonSegarkanActionPerformed

    private void tableRakMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableRakMouseClicked
        // TODO add your handling code here:
        rakController.loadDus(this);
    }//GEN-LAST:event_tableRakMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonSegarkan;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelDus;
    private javax.swing.JPanel jPanelRak;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private com.stripbandunk.jwidget.JDynamicTable tableDus;
    private com.stripbandunk.jwidget.JDynamicTable tableRak;
    private com.bpd.arsip.component.ViewPortTransparan viewPortTransparan1;
    private com.bpd.arsip.component.ViewPortTransparan viewPortTransparan2;
    // End of variables declaration//GEN-END:variables
}
