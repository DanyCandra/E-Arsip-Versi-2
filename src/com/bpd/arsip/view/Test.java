package com.bpd.arsip.view;

import com.bpd.arsip.component.Frame;
import com.bpd.arsip.model.UserModel;
import com.stripbandunk.jglasspane.component.DialogBackgroundColor;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Component;

/**
 *
 * @author Dany Candra
 */
public final class Test extends Frame {

    /**
     * Creates new form MainFrame
     */
    public Test() {
        initComponents();
        initGlassPane();
        initPanel();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jGlassPane = new com.stripbandunk.jglasspane.JGlassPane();
        dialogComponent = new com.stripbandunk.jglasspane.component.DialogComponent();
        panelLoading = new com.bpd.arsip.view.dialog.PanelLoading();
        viewPortTransparan1 = new com.bpd.arsip.component.ViewPortTransparan();
        panelPenerimaanBerkas1 = new com.bpd.arsip.view.panel.PanelPenerimaanBerkas();
        viewPortTransparan2 = new com.bpd.arsip.component.ViewPortTransparan();
        panelPembaruanBerkas1 = new com.bpd.arsip.view.panel.PanelPembaruanBerkas();
        panelGradient1 = new dany.swing.lib.panel.PanelGradient();
        panelFooter = new dany.swing.lib.panel.PanelGradient();
        jProgressBar = new javax.swing.JProgressBar();
        labelDate1 = new dany.swing.lib.label.LabelDate();
        labelUsername = new dany.swing.lib.label.LabelWhite();
        labelTitle = new dany.swing.lib.label.LabelWhite();
        labelHalaman = new dany.swing.lib.label.LabelWhite();
        panelCard = new dany.swing.lib.panel.PanelImageAlpha();
        panelPejabat = new com.bpd.arsip.view.panel.PanelPejabat();
        panelInstansi = new com.bpd.arsip.view.panel.PanelInstansi();
        panelUser = new com.bpd.arsip.view.panel.PanelUser();
        panelPenyimpanan = new com.bpd.arsip.view.panel.PanelPenyimpanan();
        panelPenerimaanBerkas = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        panelPembaruanBerkas = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        menuPenyimpanan = new javax.swing.JMenuItem();
        menuPejabat = new javax.swing.JMenuItem();
        menuInstansi = new javax.swing.JMenuItem();
        menuUser = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        menuPembaruanBerkas = new javax.swing.JMenuItem();

        dialogComponent.setLayout(new java.awt.BorderLayout());

        viewPortTransparan1.setView(panelPenerimaanBerkas1);
        viewPortTransparan1.add(panelPenerimaanBerkas1);

        viewPortTransparan2.add(panelPembaruanBerkas1);

        setAnimationHide(com.bpd.arsip.component.Animation.HIDE_TO_RIGHT);
        setAnimationShow(com.bpd.arsip.component.Animation.SHOW_FROM_LEFT);
        setBackground(new java.awt.Color(255, 255, 255));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        panelGradient1.setColorBottom(new java.awt.Color(51, 0, 153));

        panelFooter.setColorBottom(new java.awt.Color(0, 0, 204));

        labelUsername.setText("Username");

        javax.swing.GroupLayout panelFooterLayout = new javax.swing.GroupLayout(panelFooter);
        panelFooter.setLayout(panelFooterLayout);
        panelFooterLayout.setHorizontalGroup(
            panelFooterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelFooterLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 767, Short.MAX_VALUE)
                .addComponent(labelDate1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jProgressBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panelFooterLayout.setVerticalGroup(
            panelFooterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFooterLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelFooterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelFooterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(labelDate1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(labelUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jProgressBar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        labelTitle.setText("e - Arsip | Bank Jateng");
        labelTitle.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N

        labelHalaman.setText("Halaman");
        labelHalaman.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N

        panelCard.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        panelCard.setLayout(new java.awt.CardLayout());
        panelCard.add(panelPejabat, "panelPejabat");
        panelCard.add(panelInstansi, "panelInstansi");
        panelCard.add(panelUser, "panelUser");
        panelCard.add(panelPenyimpanan, "panelPenyimpanan");

        panelPenerimaanBerkas.setOpaque(false);
        panelPenerimaanBerkas.setLayout(new java.awt.BorderLayout());

        jScrollPane1.setViewport(viewPortTransparan1);
        panelPenerimaanBerkas.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        panelCard.add(panelPenerimaanBerkas, "panelPenerimaanBerkas");

        panelPembaruanBerkas.setOpaque(false);
        panelPembaruanBerkas.setLayout(new java.awt.BorderLayout());

        jScrollPane2.setViewport(viewPortTransparan2);
        panelPembaruanBerkas.add(jScrollPane2, java.awt.BorderLayout.CENTER);

        panelCard.add(panelPembaruanBerkas, "panelPembaruanBerkas");

        javax.swing.GroupLayout panelGradient1Layout = new javax.swing.GroupLayout(panelGradient1);
        panelGradient1.setLayout(panelGradient1Layout);
        panelGradient1Layout.setHorizontalGroup(
            panelGradient1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelFooter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panelGradient1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelHalaman, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 741, Short.MAX_VALUE)
                .addComponent(labelTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(panelGradient1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelGradient1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(panelCard, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        panelGradient1Layout.setVerticalGroup(
            panelGradient1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelGradient1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(panelGradient1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelHalaman, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 540, Short.MAX_VALUE)
                .addComponent(panelFooter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(panelGradient1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelGradient1Layout.createSequentialGroup()
                    .addGap(53, 53, 53)
                    .addComponent(panelCard, javax.swing.GroupLayout.DEFAULT_SIZE, 528, Short.MAX_VALUE)
                    .addGap(37, 37, 37)))
        );

        getContentPane().add(panelGradient1, java.awt.BorderLayout.CENTER);

        jMenu1.setText("Pengaturan");

        menuPenyimpanan.setText("Daftar Penyimpanan Arsip");
        menuPenyimpanan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuPenyimpananActionPerformed(evt);
            }
        });
        jMenu1.add(menuPenyimpanan);

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
        jMenu1.add(jSeparator2);

        jMenuItem6.setText("Keluar");
        jMenu1.add(jMenuItem6);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Transaksi");

        jMenuItem1.setText("Penerimaan Berkas Kredit Baru");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem1);

        menuPembaruanBerkas.setText("Pembaruan Berkas Kredit ");
        menuPembaruanBerkas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuPembaruanBerkasActionPerformed(evt);
            }
        });
        jMenu2.add(menuPembaruanBerkas);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
        exit();
    }//GEN-LAST:event_formWindowClosing

    private void menuPejabatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuPejabatActionPerformed
        // TODO add your handling code here:
        showPanel(panelPejabat, "panelPejabat", "Pengaturan Data Pejabat");
        panelPejabat.load();
    }//GEN-LAST:event_menuPejabatActionPerformed

    private void menuInstansiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuInstansiActionPerformed
        // TODO add your handling code here:
        showPanel(panelInstansi, "panelInstansi", "Pengaturan Data Instansi");
        panelInstansi.load();
    }//GEN-LAST:event_menuInstansiActionPerformed

    private void menuUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuUserActionPerformed
        // TODO add your handling code here:
        showPanel(panelUser, "panelUser", "Pengaturan Daftar User");
        panelUser.load();
    }//GEN-LAST:event_menuUserActionPerformed

    private void menuPenyimpananActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuPenyimpananActionPerformed
        // TODO add your handling code here:
        showPanel(panelPenyimpanan, "panelPenyimpanan", "Pengaturan Penyimpanan");
        panelPenyimpanan.loadAllTab();
    }//GEN-LAST:event_menuPenyimpananActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        showPanel(panelPenerimaanBerkas, "panelPenerimaanBerkas", "Penerimaan Berkas Kredit");
        panelPenerimaanBerkas1.initInput();
        UserModel userModel=new UserModel("US-2042019-001-6", "DEV", "DEV", "DANY",1);
        panelPenerimaanBerkas1.setUserModel(userModel);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void menuPembaruanBerkasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuPembaruanBerkasActionPerformed
        // TODO add your handling code here:
        showPanel(panelPembaruanBerkas, "panelPembaruanBerkas", "Pembaruan Berkas Kredit");
        panelPembaruanBerkas1.initInput();
        UserModel userModel=new UserModel("US-2042019-001-6", "DEV", "DEV", "DANY",1);
        panelPembaruanBerkas1.setUserModel(userModel);
       
    }//GEN-LAST:event_menuPembaruanBerkasActionPerformed

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
            java.util.logging.Logger.getLogger(Test.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Test.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Test.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Test.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Test().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.stripbandunk.jglasspane.component.DialogComponent dialogComponent;
    private com.stripbandunk.jglasspane.JGlassPane jGlassPane;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JProgressBar jProgressBar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private dany.swing.lib.label.LabelDate labelDate1;
    private dany.swing.lib.label.LabelWhite labelHalaman;
    private dany.swing.lib.label.LabelWhite labelTitle;
    private dany.swing.lib.label.LabelWhite labelUsername;
    private javax.swing.JMenuItem menuInstansi;
    private javax.swing.JMenuItem menuPejabat;
    private javax.swing.JMenuItem menuPembaruanBerkas;
    private javax.swing.JMenuItem menuPenyimpanan;
    private javax.swing.JMenuItem menuUser;
    private dany.swing.lib.panel.PanelImageAlpha panelCard;
    private dany.swing.lib.panel.PanelGradient panelFooter;
    private dany.swing.lib.panel.PanelGradient panelGradient1;
    private com.bpd.arsip.view.panel.PanelInstansi panelInstansi;
    private com.bpd.arsip.view.dialog.PanelLoading panelLoading;
    private com.bpd.arsip.view.panel.PanelPejabat panelPejabat;
    private javax.swing.JPanel panelPembaruanBerkas;
    private com.bpd.arsip.view.panel.PanelPembaruanBerkas panelPembaruanBerkas1;
    private javax.swing.JPanel panelPenerimaanBerkas;
    private com.bpd.arsip.view.panel.PanelPenerimaanBerkas panelPenerimaanBerkas1;
    private com.bpd.arsip.view.panel.PanelPenyimpanan panelPenyimpanan;
    private com.bpd.arsip.view.panel.PanelUser panelUser;
    private com.bpd.arsip.component.ViewPortTransparan viewPortTransparan1;
    private com.bpd.arsip.component.ViewPortTransparan viewPortTransparan2;
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
    
    public void initPanel(){
        //panelPejabat.setMainFrame(this);
        //panelInstansi.setMainFrame(this);
        //panelUser.setMainFrame(this);
        //panelPenyimpanan.initPanel(this);
        
    }

}