/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bpd.arsip.helper;

import com.bpd.arsip.dao.InstansiDao;
import com.bpd.arsip.dao.PejabatDao;
import com.bpd.arsip.dao.impl.InstansiDaoImpl;
import com.bpd.arsip.dao.impl.PejabatDaoImpl;
import com.bpd.arsip.database.DatabaseConnection;
import com.bpd.arsip.entitas.Instansi;
import com.bpd.arsip.entitas.Pejabat;
import com.bpd.arsip.exception.ArsipException;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Dany Candra
 */
public class HelperGeneratorAutoId {

    public static String generateAutoId() {
        String id = "";

        long longId = System.currentTimeMillis();

        id = String.valueOf(longId);

        return id;
    }

    public static String generateAutoIdPejabat() {
        String id = "PJ-";

        Random random = new Random();
        int randomDigit = random.nextInt(10);
        
        Calendar cal = Calendar.getInstance();
        cal.setTime(new Date());
        int Hari = cal.get(Calendar.DATE);
        int Bulan = cal.get(Calendar.MONTH) + 1;
        int Tahun = cal.get(Calendar.YEAR);

        PejabatDao dao = new PejabatDaoImpl(DatabaseConnection.getConnection());
        try {
            List<Pejabat> list = dao.getPejabat();
            if (list.isEmpty()) {
                id = "PJ-" + String.valueOf(Hari) + String.valueOf(Bulan) + String.valueOf(Tahun) + "-" + "001"+ "-" +String.valueOf(randomDigit);
                System.err.println("1");
            } else {
                Pejabat objectTmp=list.get(list.size()-1);
                String[] tmpNumber = objectTmp.getIdPejabat().split("-");
                int number = Integer.parseInt(tmpNumber[2]);
                String tmpNewUrutanId=String.valueOf(number+1);
                String newurutanId="";
                
                if (number > 999) {
                    JOptionPane.showMessageDialog(null, "Data Sudah tidak dapat ditambah lagi,silahkan ubah data yang sudaha ada.");
                } else {
                    switch (tmpNewUrutanId.length()) {
                        case 1:
                            newurutanId = "00" + tmpNewUrutanId;
                            break;
                        case 2:
                            newurutanId = "0" + tmpNewUrutanId;
                            break;
                        case 3:
                            newurutanId = tmpNewUrutanId;
                            break;
                        default:
                            break;
                    }
                    id = "PJ-" + String.valueOf(Hari) + String.valueOf(Bulan) + String.valueOf(Tahun) + "-" + newurutanId+ "-" +String.valueOf(randomDigit);
                }
            }
        } catch (ArsipException ex) {
            Logger.getLogger(HelperGeneratorAutoId.class.getName()).log(Level.SEVERE, null, ex);
        }

        return id;
    }
    
    public static String generateAutoIdInstansi() {
        String id = "PJ-";

        Random random = new Random();
        int randomDigit = random.nextInt(10);
        
        Calendar cal = Calendar.getInstance();
        cal.setTime(new Date());
        int Hari = cal.get(Calendar.DATE);
        int Bulan = cal.get(Calendar.MONTH) + 1;
        int Tahun = cal.get(Calendar.YEAR);

        InstansiDao dao = new InstansiDaoImpl(DatabaseConnection.getConnection());
        try {
            List<Instansi> list = dao.getAllInstansi();
            if (list.isEmpty()) {
                id = "IS-" + String.valueOf(Hari) + String.valueOf(Bulan) + String.valueOf(Tahun) + "-" + "001"+ "-" +String.valueOf(randomDigit);
                System.err.println("1");
            } else {
                Instansi objectTmp=list.get(list.size()-1);
                String[] tmpNumber = objectTmp.getIdInstansi().split("-");
                int number = Integer.parseInt(tmpNumber[2]);
                String tmpNewUrutanId=String.valueOf(number+1);
                String newurutanId="";
                
                if (number > 999) {
                    JOptionPane.showMessageDialog(null, "Data Sudah tidak dapat ditambah lagi,silahkan ubah data yang sudaha ada.");
                } else {
                    switch (tmpNewUrutanId.length()) {
                        case 1:
                            newurutanId = "00" + tmpNewUrutanId;
                            break;
                        case 2:
                            newurutanId = "0" + tmpNewUrutanId;
                            break;
                        case 3:
                            newurutanId = tmpNewUrutanId;
                            break;
                        default:
                            break;
                    }
                    id = "PJ-" + String.valueOf(Hari) + String.valueOf(Bulan) + String.valueOf(Tahun) + "-" + newurutanId+ "-" +String.valueOf(randomDigit);
                }
            }
        } catch (ArsipException ex) {
            Logger.getLogger(HelperGeneratorAutoId.class.getName()).log(Level.SEVERE, null, ex);
        }

        return id;
    }

}
