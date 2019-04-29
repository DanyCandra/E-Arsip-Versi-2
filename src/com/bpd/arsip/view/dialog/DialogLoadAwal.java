/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bpd.arsip.view.dialog;

import com.bpd.arsip.component.CenterFrame;
import javax.swing.JFrame;

/**
 *
 * @author Dany
 */
public class DialogLoadAwal extends JFrame {

    /**
     * Creates new form DialogLoadAwal
     */
    public DialogLoadAwal() {
        initComponents();
        CenterFrame.makeCenter(this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelGradient1 = new dany.swing.lib.panel.PanelGradient();
        panelAlpha1 = new dany.swing.lib.panel.PanelAlpha();
        labelWhite1 = new dany.swing.lib.label.LabelWhite();
        labelWhite3 = new dany.swing.lib.label.LabelWhite();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        panelGradient1.setColorBottom(new java.awt.Color(0, 0, 153));

        panelAlpha1.setAlpha(0.2F);
        panelAlpha1.setLayout(new java.awt.BorderLayout());

        labelWhite1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/bpd/arsip/icon/loadingicon.gif"))); // NOI18N
        panelAlpha1.add(labelWhite1, java.awt.BorderLayout.CENTER);

        labelWhite3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelWhite3.setText("Please Wait ......");
        labelWhite3.setFont(new java.awt.Font("sansserif", 3, 12)); // NOI18N
        panelAlpha1.add(labelWhite3, java.awt.BorderLayout.PAGE_END);

        javax.swing.GroupLayout panelGradient1Layout = new javax.swing.GroupLayout(panelGradient1);
        panelGradient1.setLayout(panelGradient1Layout);
        panelGradient1Layout.setHorizontalGroup(
            panelGradient1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGradient1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelAlpha1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelGradient1Layout.setVerticalGroup(
            panelGradient1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGradient1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelAlpha1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(panelGradient1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private dany.swing.lib.label.LabelWhite labelWhite1;
    private dany.swing.lib.label.LabelWhite labelWhite3;
    private dany.swing.lib.panel.PanelAlpha panelAlpha1;
    private dany.swing.lib.panel.PanelGradient panelGradient1;
    // End of variables declaration//GEN-END:variables
}
