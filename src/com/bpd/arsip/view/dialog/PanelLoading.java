/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bpd.arsip.view.dialog;

import com.stripbandunk.jglasspane.component.DialogComponent;
import com.stripbandunk.jglasspane.component.DialogSubComponent;
import java.awt.Component;

/**
 *
 * @author Dany Candra
 */
public class PanelLoading extends javax.swing.JPanel implements DialogSubComponent {

    private DialogComponent dialogComponent;

    /**
     * Creates new form PanelLoading
     */
    public PanelLoading() {
        initComponents();
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

        setOpaque(false);
        setLayout(new java.awt.GridBagLayout());

        labelWhite1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/bpd/arsip/icon/loadingicon.gif"))); // NOI18N
        add(labelWhite1, new java.awt.GridBagConstraints());
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private dany.swing.lib.label.LabelWhite labelWhite1;
    // End of variables declaration//GEN-END:variables

    @Override
    public Component getSubComponent() {
        return this;
    }

    @Override
    public void setDialogComponent(DialogComponent dc) {
        this.dialogComponent = dc;
    }
}