package com.bpd.arsip.view;

import com.bpd.arsip.component.Frame;
import com.stripbandunk.jglasspane.component.DialogBackgroundColor;
import com.stripbandunk.jglasspane.helper.GraphicHelper;
import com.stripbandunk.jglasspane.transition.image.WipeRightImageTransition;
import com.stripbandunk.jglasspane.transition.image.creator.ComponentImageCreator;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Component;

/**
 *
 * @author Dany Candra
 */
public class MainFrame extends Frame {

    /**
     * Creates new form MainFrame
     */
    public MainFrame() {
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
        imageTransitionComponent = new com.stripbandunk.jglasspane.component.ImageTransitionComponent();
        viewPortTransparan1 = new com.bpd.arsip.component.ViewPortTransparan();
        panelGradient1 = new dany.swing.lib.panel.PanelGradient();
        panelFooter = new dany.swing.lib.panel.PanelGradient();
        jProgressBar = new javax.swing.JProgressBar();
        labelDate1 = new dany.swing.lib.label.LabelDate();
        labelUsername = new dany.swing.lib.label.LabelWhite();
        labelTitle = new dany.swing.lib.label.LabelWhite();
        labelHalaman = new dany.swing.lib.label.LabelWhite();
        panelCard = new dany.swing.lib.panel.PanelImageAlpha();
        panelPengaturanQuota = new com.bpd.arsip.view.panel.PanelPengaturanQuota();
        panelPejabat = new com.bpd.arsip.view.panel.PanelPejabat();
        panelInstansi = new com.bpd.arsip.view.panel.PanelInstansi();
        panelUser = new com.bpd.arsip.view.panel.PanelUser();
        panelPenyimpanan = new com.bpd.arsip.view.panel.PanelPenyimpanan();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        menuPengaturanQuota = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        menuPenyimpanan = new javax.swing.JMenuItem();
        menuPejabat = new javax.swing.JMenuItem();
        menuInstansi = new javax.swing.JMenuItem();
        menuUser = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        javax.swing.GroupLayout imageTransitionComponentLayout = new javax.swing.GroupLayout(imageTransitionComponent);
        imageTransitionComponent.setLayout(imageTransitionComponentLayout);
        imageTransitionComponentLayout.setHorizontalGroup(
            imageTransitionComponentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        imageTransitionComponentLayout.setVerticalGroup(
            imageTransitionComponentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setAnimationHide(com.bpd.arsip.component.Animation.HIDE_TO_RIGHT);
        setAnimationShow(com.bpd.arsip.component.Animation.SHOW_FROM_LEFT);
        setBackground(new java.awt.Color(255, 255, 255));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        panelGradient1.setColorBottom(new java.awt.Color(0, 0, 204));

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
        panelCard.add(panelPengaturanQuota, "panelPengaturanQuota");
        panelCard.add(panelPejabat, "panelPejabat");
        panelCard.add(panelInstansi, "panelInstansi");
        panelCard.add(panelUser, "panelUser");
        panelCard.add(panelPenyimpanan, "panelPenyimpanan");

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
                    .addComponent(panelCard, javax.swing.GroupLayout.DEFAULT_SIZE, 1099, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        panelGradient1Layout.setVerticalGroup(
            panelGradient1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelGradient1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(panelGradient1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelHalaman, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 485, Short.MAX_VALUE)
                .addComponent(panelFooter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(panelGradient1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelGradient1Layout.createSequentialGroup()
                    .addGap(53, 53, 53)
                    .addComponent(panelCard, javax.swing.GroupLayout.DEFAULT_SIZE, 473, Short.MAX_VALUE)
                    .addGap(37, 37, 37)))
        );

        getContentPane().add(panelGradient1, java.awt.BorderLayout.CENTER);

        jMenu1.setText("Pengaturan");

        menuPengaturanQuota.setText("Quota Penyimpanan");
        menuPengaturanQuota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuPengaturanQuotaActionPerformed(evt);
            }
        });
        jMenu1.add(menuPengaturanQuota);
        jMenu1.add(jSeparator1);

        menuPenyimpanan.setText("Daftar Rak & Dus");
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

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
        exit();
    }//GEN-LAST:event_formWindowClosing

    private void menuPengaturanQuotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuPengaturanQuotaActionPerformed
        // TODO add your handling code here:
        showPanel(panelPengaturanQuota, "panelPengaturanQuota", "Pengaturan Quota Rak & Dus");
        panelPengaturanQuota.initFrame();
    }//GEN-LAST:event_menuPengaturanQuotaActionPerformed

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
        showPanel(panelPenyimpanan, "panelPenyimpanan", "Pengaturan Tempat Penyimpanan");
        panelPenyimpanan.initPanel();
        panelPenyimpanan.loadAllTab();
    }//GEN-LAST:event_menuPenyimpananActionPerformed

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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.stripbandunk.jglasspane.component.DialogComponent dialogComponent;
    private com.stripbandunk.jglasspane.component.ImageTransitionComponent imageTransitionComponent;
    private com.stripbandunk.jglasspane.JGlassPane jGlassPane;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JProgressBar jProgressBar;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private dany.swing.lib.label.LabelDate labelDate1;
    private dany.swing.lib.label.LabelWhite labelHalaman;
    private dany.swing.lib.label.LabelWhite labelTitle;
    private dany.swing.lib.label.LabelWhite labelUsername;
    private javax.swing.JMenuItem menuInstansi;
    private javax.swing.JMenuItem menuPejabat;
    private javax.swing.JMenuItem menuPengaturanQuota;
    private javax.swing.JMenuItem menuPenyimpanan;
    private javax.swing.JMenuItem menuUser;
    private dany.swing.lib.panel.PanelImageAlpha panelCard;
    private dany.swing.lib.panel.PanelGradient panelFooter;
    private dany.swing.lib.panel.PanelGradient panelGradient1;
    private com.bpd.arsip.view.panel.PanelInstansi panelInstansi;
    private com.bpd.arsip.view.dialog.PanelLoading panelLoading;
    private com.bpd.arsip.view.panel.PanelPejabat panelPejabat;
    private com.bpd.arsip.view.panel.PanelPengaturanQuota panelPengaturanQuota;
    private com.bpd.arsip.view.panel.PanelPenyimpanan panelPenyimpanan;
    private com.bpd.arsip.view.panel.PanelUser panelUser;
    private com.bpd.arsip.component.ViewPortTransparan viewPortTransparan1;
    // End of variables declaration//GEN-END:variables

    public void initGlassPane() {
        setGlassPane(jGlassPane);
        getGlassPane().setVisible(true);
        jGlassPane.addGlassPaneComponent(dialogComponent);
        jGlassPane.addGlassPaneComponent(imageTransitionComponent);
        
        imageTransitionComponent.setImageCreator(new ComponentImageCreator(panelCard));
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
        WipeRightImageTransition transition=new WipeRightImageTransition();
        transition.setCoordinate(GraphicHelper.getLocation(panelCard, jGlassPane));
        
        imageTransitionComponent.setTransition(transition);
        imageTransitionComponent.start();
        labelHalaman.setText(header);
        if (panel.isVisible()) {
            return;
        }
        CardLayout layout = (CardLayout) panelCard.getLayout();
        layout.show(panelCard, card);
    }
    
    public void initPanel(){
        panelPejabat.setMainFrame(this);
        panelPengaturanQuota.setMainFrame(this);
        panelInstansi.setMainFrame(this);
        panelUser.setMainFrame(this);
        panelPenyimpanan.setMainFrame(this);
    }

}
