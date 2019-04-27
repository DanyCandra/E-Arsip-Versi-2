/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bpd.arsip.view;

import com.bpd.arsip.component.CenterFrame;
import com.bpd.arsip.model.UserModel;
import com.stripbandunk.jglasspane.component.DialogBackgroundColor;
import dany.swing.lib.label.LabelWhite;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Component;

/**
 *
 * @author Dany
 */
public class MainFrame extends com.bpd.arsip.component.Frame {

    private UserModel userModel;

    /**
     * Creates new form Frame
     */
    public MainFrame() {
        initComponents();
        initGlassPane();
        initPanel();
        CenterFrame.makeCenter(this);
    }

    public UserModel getUserModel() {
        return userModel;
    }

    public void setUserModel(UserModel userModel) {
        this.userModel = userModel;
    }

    public LabelWhite getTextUsername() {
        return textUsername;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        viewPortContainer = new com.bpd.arsip.component.ViewPortTransparan();
        jGlassPane = new com.stripbandunk.jglasspane.JGlassPane();
        dialogComponent = new com.stripbandunk.jglasspane.component.DialogComponent();
        panelLoading = new com.bpd.arsip.view.dialog.PanelLoading();
        panelFooter = new dany.swing.lib.panel.PanelGradient();
        jProgressBar = new javax.swing.JProgressBar();
        labelWhite4 = new dany.swing.lib.label.LabelWhite();
        panelBody = new dany.swing.lib.panel.PanelGradient();
        panelHeader = new dany.swing.lib.panel.PanelImageAlpha();
        labelWhite1 = new dany.swing.lib.label.LabelWhite();
        labelWhite2 = new dany.swing.lib.label.LabelWhite();
        textUsername = new dany.swing.lib.label.LabelWhite();
        labelWhite5 = new dany.swing.lib.label.LabelWhite();
        labelTime1 = new dany.swing.lib.label.LabelTime();
        labelDate1 = new dany.swing.lib.label.LabelDate();
        buttonIconGlass1 = new dany.swing.lib.button.ButtonIconGlass();
        labelHalaman = new dany.swing.lib.label.LabelWhite();
        panelMain = new dany.swing.lib.panel.PanelAlpha();
        scrollPaneMainFrame = new javax.swing.JScrollPane();
        panelCard = new javax.swing.JPanel();
        panelPenyimpanan = new com.bpd.arsip.view.panel.PanelPenyimpanan();
        panelPejabat = new com.bpd.arsip.view.panel.PanelPejabat();
        panelInstansi = new com.bpd.arsip.view.panel.PanelInstansi();
        panelUser = new com.bpd.arsip.view.panel.PanelUser();
        panelPenerimaanBerkas = new com.bpd.arsip.view.panel.PanelPenerimaanBerkas();
        panelPembaruanBerkas = new com.bpd.arsip.view.panel.PanelPembaruanBerkas();
        panelPengembalianBerkas = new com.bpd.arsip.view.panel.PanelPengembalianBerkas();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        meniPenyimpnan = new javax.swing.JMenuItem();
        menuPejabat = new javax.swing.JMenuItem();
        menuInstansi = new javax.swing.JMenuItem();
        menuUser = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        menuPenerimaan = new javax.swing.JMenuItem();
        menuPembaruan = new javax.swing.JMenuItem();
        menuPengembalian = new javax.swing.JMenuItem();

        viewPortContainer.setView(panelCard);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1200, 700));

        panelFooter.setColorBottom(new java.awt.Color(0, 51, 153));
        panelFooter.setPreferredSize(new java.awt.Dimension(1086, 20));

        labelWhite4.setText("e'Arsip");

        javax.swing.GroupLayout panelFooterLayout = new javax.swing.GroupLayout(panelFooter);
        panelFooter.setLayout(panelFooterLayout);
        panelFooterLayout.setHorizontalGroup(
            panelFooterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelFooterLayout.createSequentialGroup()
                .addComponent(labelWhite4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 1163, Short.MAX_VALUE)
                .addComponent(jProgressBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panelFooterLayout.setVerticalGroup(
            panelFooterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFooterLayout.createSequentialGroup()
                .addGroup(panelFooterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(labelWhite4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jProgressBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 1, Short.MAX_VALUE))
        );

        getContentPane().add(panelFooter, java.awt.BorderLayout.PAGE_END);

        panelBody.setColorBottom(new java.awt.Color(0, 51, 153));
        panelBody.setLayout(new java.awt.BorderLayout());

        panelHeader.setAlpha(0.4F);
        panelHeader.setImageBackground(new javax.swing.ImageIcon(getClass().getResource("/com/bpd/arsip/icon/header.jpg"))); // NOI18N
        panelHeader.setPreferredSize(new java.awt.Dimension(1329, 100));

        labelWhite1.setText("e'Arsip : Bank Jateng");
        labelWhite1.setFont(new java.awt.Font("sansserif", 1, 36)); // NOI18N

        labelWhite2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/bpd/arsip/icon/icons8_user_male_circle_24px.png"))); // NOI18N

        textUsername.setText("Username");

        labelWhite5.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        labelWhite5.setText("Selamat Datang,");

        buttonIconGlass1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/bpd/arsip/icon/home_24px.png"))); // NOI18N
        buttonIconGlass1.setText("Beranda");
        buttonIconGlass1.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        buttonIconGlass1.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        buttonIconGlass1.setVerticalTextPosition(javax.swing.SwingConstants.CENTER);

        labelHalaman.setText("Navigator");
        labelHalaman.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N

        javax.swing.GroupLayout panelHeaderLayout = new javax.swing.GroupLayout(panelHeader);
        panelHeader.setLayout(panelHeaderLayout);
        panelHeaderLayout.setHorizontalGroup(
            panelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelHeaderLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelWhite1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelHalaman, javax.swing.GroupLayout.PREFERRED_SIZE, 506, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 606, Short.MAX_VALUE)
                .addGroup(panelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelHeaderLayout.createSequentialGroup()
                        .addGroup(panelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelHeaderLayout.createSequentialGroup()
                                .addComponent(labelWhite5, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(textUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(labelWhite2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelHeaderLayout.createSequentialGroup()
                                .addComponent(labelDate1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(labelTime1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(20, 20, 20))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelHeaderLayout.createSequentialGroup()
                        .addComponent(buttonIconGlass1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        panelHeaderLayout.setVerticalGroup(
            panelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelHeaderLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelHeaderLayout.createSequentialGroup()
                        .addGroup(panelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(labelWhite2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(textUsername, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(labelWhite5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelTime1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelDate1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(buttonIconGlass1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelHeaderLayout.createSequentialGroup()
                        .addComponent(labelWhite1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelHalaman, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        panelBody.add(panelHeader, java.awt.BorderLayout.PAGE_START);

        panelMain.setBorder(null);
        panelMain.setAlpha(0.0F);
        panelMain.setLayout(new java.awt.BorderLayout());

        scrollPaneMainFrame.setBorder(null);
        scrollPaneMainFrame.setViewportBorder(null);
        scrollPaneMainFrame.setViewport(viewPortContainer);

        panelCard.setOpaque(false);
        panelCard.setLayout(new java.awt.CardLayout());
        panelCard.add(panelPenyimpanan, "panelPenyimpanan");
        panelCard.add(panelPejabat, "panelPejabat");
        panelCard.add(panelInstansi, "panelInstansi");
        panelCard.add(panelUser, "panelUser");
        panelCard.add(panelPenerimaanBerkas, "panelPenerimaanBerkas");
        panelCard.add(panelPembaruanBerkas, "panelPembaruanBerkas");
        panelCard.add(panelPengembalianBerkas, "panelPengembalianBerkas");

        scrollPaneMainFrame.setViewportView(panelCard);

        panelMain.add(scrollPaneMainFrame, java.awt.BorderLayout.CENTER);

        panelBody.add(panelMain, java.awt.BorderLayout.CENTER);

        getContentPane().add(panelBody, java.awt.BorderLayout.CENTER);

        jMenu1.setText("Pengaturan");

        meniPenyimpnan.setText("Daftar Penyimpanan Arsip");
        meniPenyimpnan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                meniPenyimpnanActionPerformed(evt);
            }
        });
        jMenu1.add(meniPenyimpnan);

        menuPejabat.setText("Daftar Pejabat Bank");
        menuPejabat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuPejabatActionPerformed(evt);
            }
        });
        jMenu1.add(menuPejabat);

        menuInstansi.setText("Daftar Instansi");
        menuInstansi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuInstansiActionPerformed(evt);
            }
        });
        jMenu1.add(menuInstansi);

        menuUser.setText("Daftar User");
        menuUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuUserActionPerformed(evt);
            }
        });
        jMenu1.add(menuUser);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Transaksi");

        menuPenerimaan.setText("Penerimaan Berkas Kredit Baru");
        menuPenerimaan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuPenerimaanActionPerformed(evt);
            }
        });
        jMenu2.add(menuPenerimaan);

        menuPembaruan.setText("Pembaruan Berkas Kredit");
        menuPembaruan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuPembaruanActionPerformed(evt);
            }
        });
        jMenu2.add(menuPembaruan);

        menuPengembalian.setText("Pengembalian Berkas Kredit");
        menuPengembalian.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuPengembalianActionPerformed(evt);
            }
        });
        jMenu2.add(menuPengembalian);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuPejabatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuPejabatActionPerformed
        // TODO add your handling code here:
        showPanel(panelPejabat, "panelPejabat", "Pengaturan Daftar Pejabat");
        panelPejabat.load();
    }//GEN-LAST:event_menuPejabatActionPerformed

    private void meniPenyimpnanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_meniPenyimpnanActionPerformed
        // TODO add your handling code here:
        showPanel(panelPenyimpanan, "panelPenyimpanan", "Pengaturan Penyimpanan Arsip");
        panelPenyimpanan.loadAllTab();
        panelPenyimpanan.setFirstTab();
    }//GEN-LAST:event_meniPenyimpnanActionPerformed

    private void menuInstansiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuInstansiActionPerformed
        // TODO add your handling code here:

        showPanel(panelInstansi, "panelInstansi", "Pengaturan Daftar Instansi");
        panelInstansi.load();
    }//GEN-LAST:event_menuInstansiActionPerformed

    private void menuUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuUserActionPerformed
        // TODO add your handling code here:
        showPanel(panelUser, "panelUser", "Pengaturan Daftar User");
        panelUser.load();
    }//GEN-LAST:event_menuUserActionPerformed

    private void menuPenerimaanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuPenerimaanActionPerformed
        // TODO add your handling code here:
        showPanel(panelPenerimaanBerkas, "panelPenerimaanBerkas", "Penerimaan Berkas Kredit Baru");
        panelPenerimaanBerkas.setFisrtTab();
        panelPenerimaanBerkas.setUserModel(getUserModel());
        panelPenerimaanBerkas.initInput();
    }//GEN-LAST:event_menuPenerimaanActionPerformed

    private void menuPembaruanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuPembaruanActionPerformed
        // TODO add your handling code here:
        showPanel(panelPembaruanBerkas, "panelPembaruanBerkas", "Pembaruan Berkas Kredit");
        panelPembaruanBerkas.initInput();
        panelPembaruanBerkas.setFisrtTab();
        panelPembaruanBerkas.setUserModel(getUserModel());
    }//GEN-LAST:event_menuPembaruanActionPerformed

    private void menuPengembalianActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuPengembalianActionPerformed
        // TODO add your handling code here:

        showPanel(panelPengembalianBerkas, "panelPengembalianBerkas", "Pengembalian Berkas Kredit");
        panelPengembalianBerkas.loadTable();
        panelPengembalianBerkas.setUserModel(getUserModel());
    }//GEN-LAST:event_menuPengembalianActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private dany.swing.lib.button.ButtonIconGlass buttonIconGlass1;
    private com.stripbandunk.jglasspane.component.DialogComponent dialogComponent;
    private com.stripbandunk.jglasspane.JGlassPane jGlassPane;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JProgressBar jProgressBar;
    private dany.swing.lib.label.LabelDate labelDate1;
    private dany.swing.lib.label.LabelWhite labelHalaman;
    private dany.swing.lib.label.LabelTime labelTime1;
    private dany.swing.lib.label.LabelWhite labelWhite1;
    private dany.swing.lib.label.LabelWhite labelWhite2;
    private dany.swing.lib.label.LabelWhite labelWhite4;
    private dany.swing.lib.label.LabelWhite labelWhite5;
    private javax.swing.JMenuItem meniPenyimpnan;
    private javax.swing.JMenuItem menuInstansi;
    private javax.swing.JMenuItem menuPejabat;
    private javax.swing.JMenuItem menuPembaruan;
    private javax.swing.JMenuItem menuPenerimaan;
    private javax.swing.JMenuItem menuPengembalian;
    private javax.swing.JMenuItem menuUser;
    private dany.swing.lib.panel.PanelGradient panelBody;
    private javax.swing.JPanel panelCard;
    private dany.swing.lib.panel.PanelGradient panelFooter;
    private dany.swing.lib.panel.PanelImageAlpha panelHeader;
    private com.bpd.arsip.view.panel.PanelInstansi panelInstansi;
    private com.bpd.arsip.view.dialog.PanelLoading panelLoading;
    private dany.swing.lib.panel.PanelAlpha panelMain;
    private com.bpd.arsip.view.panel.PanelPejabat panelPejabat;
    private com.bpd.arsip.view.panel.PanelPembaruanBerkas panelPembaruanBerkas;
    private com.bpd.arsip.view.panel.PanelPenerimaanBerkas panelPenerimaanBerkas;
    private com.bpd.arsip.view.panel.PanelPengembalianBerkas panelPengembalianBerkas;
    private com.bpd.arsip.view.panel.PanelPenyimpanan panelPenyimpanan;
    private com.bpd.arsip.view.panel.PanelUser panelUser;
    private javax.swing.JScrollPane scrollPaneMainFrame;
    private dany.swing.lib.label.LabelWhite textUsername;
    private com.bpd.arsip.component.ViewPortTransparan viewPortContainer;
    // End of variables declaration//GEN-END:variables

    public void initGlassPane() {
        setGlassPane(jGlassPane);
        getGlassPane().setVisible(true);
        jGlassPane.addGlassPaneComponent(dialogComponent);
        dialogComponent.setDialogBackground(new DialogBackgroundColor(Color.GRAY));
    }

    public void startLoading(boolean values) {
        if (values == true) {
            dialogComponent.showDialog(panelLoading, values);
            jProgressBar.setIndeterminate(values);
        } else {
            dialogComponent.hideDialog();
            jProgressBar.setIndeterminate(false);
        }
    }

    void showPanel(Component panel, String card, String header) {
        labelHalaman.setText(header);
        if (panel.isVisible()) {
            return;
        }
        CardLayout layout = (CardLayout) panelCard.getLayout();
        layout.show(panelCard, card);
    }

    public void initPanel() {
        panelPejabat.setMainFrame(this);
        panelInstansi.setMainFrame(this);
        panelUser.setMainFrame(this);
        panelPenyimpanan.initPanel(this);
        panelPengembalianBerkas.setMainFrame(this);

    }
}
