package com.bpd.arsip.view.panel;

import com.bpd.arsip.view.MainFrame;

/**
 *
 * @author Dany Candra
 */
public class PanelPenyimpanan extends javax.swing.JPanel {

    /**
     * Creates new form PanelPenyimpanan
     */
    int start = 0;

    public PanelPenyimpanan() {
        initComponents();
    }

    public PanelPengaturanQuota getPanelPengaturanQuota1() {
        return panelPengaturanQuota1;
    }

    public PanelPenyimpananLantai getPanelPenyimpananLantai() {
        return panelPenyimpananLantai1;
    }

    public PanelPenyimpananDus getPanelPenyimpananDus() {
        return panelPenyimpananDus1;
    }

    public PanelPenyimpananRak getPanelPenyimpananRak() {
        return panelPenyimpananRak1;
    }
    
    
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        panelPengaturanQuota1 = new com.bpd.arsip.view.panel.PanelPengaturanQuota();
        panelPenyimpananLantai1 = new com.bpd.arsip.view.panel.PanelPenyimpananLantai();
        panelPenyimpananDus1 = new com.bpd.arsip.view.panel.PanelPenyimpananDus();
        panelPenyimpananRak1 = new com.bpd.arsip.view.panel.PanelPenyimpananRak();

        setBackground(new java.awt.Color(51, 51, 255));
        setOpaque(false);
        setLayout(new java.awt.GridLayout(1, 0));

        jTabbedPane1.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jTabbedPane1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jTabbedPane1StateChanged(evt);
            }
        });
        jTabbedPane1.addTab("Pengaturan Quota Rak & Dus", panelPengaturanQuota1);
        jTabbedPane1.addTab("Daftar Tempat Penyimpanan", panelPenyimpananLantai1);
        jTabbedPane1.addTab("Daftar Dus Arsip", panelPenyimpananDus1);

        panelPenyimpananRak1.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jTabbedPane1.addTab("Daftar Rak & Dus Arsip", panelPenyimpananRak1);

        add(jTabbedPane1);
    }// </editor-fold>//GEN-END:initComponents

    private void jTabbedPane1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jTabbedPane1StateChanged
        // TODO add your handling code here:
        int now = jTabbedPane1.getSelectedIndex();
        if (start != now) {
            loadAllTab();
        }
    }//GEN-LAST:event_jTabbedPane1StateChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane jTabbedPane1;
    private com.bpd.arsip.view.panel.PanelPengaturanQuota panelPengaturanQuota1;
    private com.bpd.arsip.view.panel.PanelPenyimpananDus panelPenyimpananDus1;
    private com.bpd.arsip.view.panel.PanelPenyimpananLantai panelPenyimpananLantai1;
    private com.bpd.arsip.view.panel.PanelPenyimpananRak panelPenyimpananRak1;
    // End of variables declaration//GEN-END:variables

    public void initPanel(MainFrame mainFrame) {
        panelPenyimpananLantai1.setMainFrame(mainFrame);
        panelPengaturanQuota1.setMainFrame(mainFrame);
        panelPenyimpananDus1.setMainFrame(mainFrame);
    }

    public void loadAllTab() {
        getPanelPengaturanQuota1().initFrame();
        getPanelPenyimpananLantai().load();
        getPanelPenyimpananDus().load();
        getPanelPenyimpananRak().loadData();
    }
    
    public void setFirstTab(){
        jTabbedPane1.setSelectedIndex(0);
    }
            
}
