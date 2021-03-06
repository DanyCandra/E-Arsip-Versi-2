/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bpd.arsip.view.panel;

import java.awt.event.ActionListener;

/**
 *
 * @author Dany
 */
public class PanelMenuTransaksi extends javax.swing.JPanel {

    /**
     * Creates new form PanelMenuTransaksi
     */
    public PanelMenuTransaksi() {
        initComponents();
    }
    
    public void addListenerPenerimaanBerkas(ActionListener listener) {
        penerimaanBerkas.addActionListener(listener);
    }
    
    public void addListenerPembaruanBerkas(ActionListener listener) {
        pembaruanBerkas.addActionListener(listener);
    }
    
    public void addListenerPengembalianBerkas(ActionListener listener) {
        pengembalianBerkas.addActionListener(listener);
    }
    
    public void addListenerPindahBerkas(ActionListener listener) {
        pemindahanBerkas.addActionListener(listener);
    }
    
    public void addListenerPenyesuaianCis(ActionListener listener) {
        penyesuaianCis.addActionListener(listener);
    }
    
    public void addListenerPenyesuaianDebitur(ActionListener listener) {
        penyesuaianDebitur.addActionListener(listener);
    }
   

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        penerimaanBerkas = new dany.swing.lib.button.ButtonIconGlass();
        pemindahanBerkas = new dany.swing.lib.button.ButtonIconGlass();
        penyesuaianCis = new dany.swing.lib.button.ButtonIconGlass();
        pembaruanBerkas = new dany.swing.lib.button.ButtonIconGlass();
        penyesuaianDebitur = new dany.swing.lib.button.ButtonIconGlass();
        pengembalianBerkas = new dany.swing.lib.button.ButtonIconGlass();

        setOpaque(false);
        setLayout(new java.awt.GridBagLayout());

        penerimaanBerkas.setText("Penerimaan Berkas");
        penerimaanBerkas.setIconReflection(new javax.swing.ImageIcon(getClass().getResource("/com/bpd/arsip/icon/PenerimaanBerkas.png"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(53, 75, 0, 0);
        add(penerimaanBerkas, gridBagConstraints);

        pemindahanBerkas.setText("Pemindahan Berkas");
        pemindahanBerkas.setIconReflection(new javax.swing.ImageIcon(getClass().getResource("/com/bpd/arsip/icon/PindahBerkas.png"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipady = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 75, 47, 0);
        add(pemindahanBerkas, gridBagConstraints);

        penyesuaianCis.setText("Penyesuaian Cis");
        penyesuaianCis.setIconReflection(new javax.swing.ImageIcon(getClass().getResource("/com/bpd/arsip/icon/PenyesuaianCis.png"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipady = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 33, 47, 0);
        add(penyesuaianCis, gridBagConstraints);

        pembaruanBerkas.setText("Pembaruan Berkas");
        pembaruanBerkas.setIconReflection(new javax.swing.ImageIcon(getClass().getResource("/com/bpd/arsip/icon/PermbaruanBerkas.png"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipady = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(47, 33, 0, 0);
        add(pembaruanBerkas, gridBagConstraints);

        penyesuaianDebitur.setText("Penyeseuaian Debitur");
        penyesuaianDebitur.setIconReflection(new javax.swing.ImageIcon(getClass().getResource("/com/bpd/arsip/icon/PenyesuaianDebitur.png"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipady = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 28, 47, 75);
        add(penyesuaianDebitur, gridBagConstraints);

        pengembalianBerkas.setText("Pengembalian Berkas");
        pengembalianBerkas.setIconReflection(new javax.swing.ImageIcon(getClass().getResource("/com/bpd/arsip/icon/PengembalianBerkas.png"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipady = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(47, 28, 0, 75);
        add(pengembalianBerkas, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private dany.swing.lib.button.ButtonIconGlass pembaruanBerkas;
    private dany.swing.lib.button.ButtonIconGlass pemindahanBerkas;
    private dany.swing.lib.button.ButtonIconGlass penerimaanBerkas;
    private dany.swing.lib.button.ButtonIconGlass pengembalianBerkas;
    private dany.swing.lib.button.ButtonIconGlass penyesuaianCis;
    private dany.swing.lib.button.ButtonIconGlass penyesuaianDebitur;
    // End of variables declaration//GEN-END:variables
}
