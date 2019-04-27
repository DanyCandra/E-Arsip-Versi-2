/*
 * Aplikasi pengarsipan untuk mengelola berkas kredit PLO dan KWU di Bank Jateng Purwokerto.
 * Aplikasi ini dibuat oleh Dany Candra Febrianto | Bank Jateng Purwokerto 2016
 * Aplikasi ini bebas di modifikasi dan di kembangkan.
 */
package com.bpd.arsip.run;

import com.bpd.arsip.view.dialog.DialogDatabaseSetting;
import com.bpd.arsip.view.dialog.DialogLogin;
import java.awt.EventQueue;
import javax.swing.JOptionPane;

/**
 *
 * @author Dany Candra
 */
public class Runnable {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DialogDatabaseSetting.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        EventQueue.invokeLater(new java.lang.Runnable() {

            @Override
            public void run() {
                
                DialogDatabaseSetting setting = new DialogDatabaseSetting();
                if (setting.cekDatabaseConnection() == true) {
                    DialogLogin login = new DialogLogin();
                    login.setVisible(true);
                } else {
                    JOptionPane.showMessageDialog(null, "Database Belumterhubung Silahkan Setting Database Terlebih Dahulu.");
                    setting.setVisible(true);
                }
            }
        });

    }

}
