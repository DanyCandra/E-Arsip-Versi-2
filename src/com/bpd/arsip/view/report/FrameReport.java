/*
 * Aplikasi pengarsipan untuk mengelola berkas kredit PLO dan KWU di Bank Jateng Purwokerto.
 * Aplikasi ini dibuat oleh Dany Candra Febrianto | Bank Jateng Purwokerto 2016
 * Aplikasi ini bebas di modifikasi dan di kembangkan.
 */
package com.bpd.arsip.view.report;

import com.bpd.arsip.component.CenterFrame;
import com.bpd.arsip.database.DatabaseConnection;
import java.awt.Container;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.swing.JRViewer;


/**
 *
 * @author Dany Candra
 */
public class FrameReport extends javax.swing.JFrame {

    /**
     * Creates new form FrameReport
     */
    public FrameReport() {
        initComponents();

    }

    public FrameReport(String fileName) {
        this(fileName, null);
    }

    public FrameReport(String fimeName, Map parameter) {
        super();
        try {
            JasperPrint jasperPrint = JasperFillManager.fillReport(fimeName, parameter, DatabaseConnection.getConnection());
            JRViewer viewer = new JRViewer(jasperPrint);
            Container c = getContentPane();
            c.add(viewer);
            setBounds(10, 10, 1200, 720);
            CenterFrame.makeCenter(this);
            setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        } catch (JRException ex) {
            Logger.getLogger(FrameReport.class.getName()).log(Level.SEVERE, null, ex);
        }

    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}