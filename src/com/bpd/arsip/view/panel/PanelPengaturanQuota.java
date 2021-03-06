package com.bpd.arsip.view.panel;

import com.bpd.arsip.controller.QuotaController;
import com.bpd.arsip.model.QuotaModel;
import com.bpd.arsip.view.MainFrame;
import javax.swing.JButton;
import javax.swing.JTextField;

/**
 *
 * @author Dany Candra
 */
public class PanelPengaturanQuota extends javax.swing.JPanel {

    private final QuotaModel model;
    private final QuotaController controller;
    private MainFrame mainFrame;

    /**
     * Creates new form PanelQuota
     */
    public PanelPengaturanQuota() {
        model = new QuotaModel();
        controller = new QuotaController();
        controller.setQuotaModel(model);
        initComponents();
        

    }

    public void setMainFrame(MainFrame mainFrame) {
        this.mainFrame = mainFrame;
    }

    public JTextField getTextDus() {
        return textDus;
    }

    public JTextField getTextRak() {
        return textRak;
    }

    public JButton getButtonBatal() {
        return buttonBatal;
    }

    public JButton getButtonSimpan() {
        return buttonSimpan;
    }

    public MainFrame getMainFrame() {
        return mainFrame;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelWhite1 = new dany.swing.lib.label.LabelWhite();
        textRak = new javax.swing.JTextField();
        labelWhite2 = new dany.swing.lib.label.LabelWhite();
        textDus = new javax.swing.JTextField();
        buttonSimpan = new javax.swing.JButton();
        buttonBatal = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 51, 153));
        setOpaque(false);

        labelWhite1.setText("Quota Rak :");

        textRak.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N

        labelWhite2.setText("Quota Dus :");

        textDus.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N

        buttonSimpan.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        buttonSimpan.setText("Atur");
        buttonSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSimpanActionPerformed(evt);
            }
        });

        buttonBatal.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        buttonBatal.setText("Batal");
        buttonBatal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonBatalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelWhite1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textRak, javax.swing.GroupLayout.DEFAULT_SIZE, 359, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelWhite2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textDus))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(buttonBatal, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonSimpan)))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {buttonBatal, buttonSimpan});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelWhite1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textRak, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelWhite2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textDus, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonSimpan, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonBatal, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void buttonBatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonBatalActionPerformed
        // TODO add your handling code here:
        controller.batal(this);
    }//GEN-LAST:event_buttonBatalActionPerformed

    private void buttonSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSimpanActionPerformed
        // TODO add your handling code here:
        controller.simpan(this);
    }//GEN-LAST:event_buttonSimpanActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonBatal;
    private javax.swing.JButton buttonSimpan;
    private dany.swing.lib.label.LabelWhite labelWhite1;
    private dany.swing.lib.label.LabelWhite labelWhite2;
    private javax.swing.JTextField textDus;
    private javax.swing.JTextField textRak;
    // End of variables declaration//GEN-END:variables

    public void initFrame() {
        controller.batal(this);
        controller.loadDataQuota(this);
    }
}
