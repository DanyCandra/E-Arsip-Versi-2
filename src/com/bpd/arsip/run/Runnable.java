/*
 * Aplikasi pengarsipan untuk mengelola berkas kredit PLO dan KWU di Bank Jateng Purwokerto.
 * Aplikasi ini dibuat oleh Dany Candra Febrianto | Bank Jateng Purwokerto 2016
 * Aplikasi ini bebas di modifikasi dan di kembangkan.
 */
package com.bpd.arsip.run;

import com.bpd.arsip.view.dialog.DialogDatabaseSetting;
import com.bpd.arsip.view.dialog.DialogLogin;
import com.bpd.arsip.view.dialog.SplashScreen;
import java.util.concurrent.ExecutionException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.SwingWorker;

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

//        SplashScreen splashScreen = new SplashScreen();
//        splashScreen.setLocationRelativeTo(null );
//        splashScreen.setVisible(true);
//        splashScreen.startLoading();
        new SwingWorker<Boolean, Object>() {
            SplashScreen splashScreen = new SplashScreen();
            DialogDatabaseSetting setting = null;

            @Override
            protected Boolean doInBackground() throws Exception {
                Boolean result = false;
                splashScreen.setLocationRelativeTo(null);
                splashScreen.setVisible(true);
                splashScreen.startLoading(true);
                setting = new DialogDatabaseSetting();
                result = setting.cekDatabaseConnection();

                return result;
            }

            @Override
            protected void done() {
                splashScreen.setVisible(false);

                try {
                    if (get()) {
                        DialogLogin login = new DialogLogin();
                        login.setVisible(true);
                    } else {
                        JOptionPane.showMessageDialog(null, "Database Belumterhubung Silahkan Setting Database Terlebih Dahulu.");
                        setting.setVisible(true);
                    }
                } catch (InterruptedException | ExecutionException ex) {
                    Logger.getLogger(Runnable.class.getName()).log(Level.SEVERE, null, ex);
                }

            }

        }.execute();
    }

}
