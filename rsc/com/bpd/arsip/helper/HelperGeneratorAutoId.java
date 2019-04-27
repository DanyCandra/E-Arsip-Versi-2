/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bpd.arsip.helper;

import com.bpd.arsip.dao.CisDao;
import com.bpd.arsip.dao.InstansiDao;
import com.bpd.arsip.dao.LantaiDao;
import com.bpd.arsip.dao.PejabatDao;
import com.bpd.arsip.dao.RakDao;
import com.bpd.arsip.dao.UserDao;
import com.bpd.arsip.database.DatabaseConnection;
import com.bpd.arsip.entitas.Cis;
import com.bpd.arsip.entitas.Instansi;
import com.bpd.arsip.entitas.Lantai;
import com.bpd.arsip.entitas.Pejabat;
import com.bpd.arsip.entitas.Rak;
import com.bpd.arsip.entitas.User;
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

        PejabatDao dao = DatabaseConnection.getPejabatDao();
        try {
            List<Pejabat> list = dao.getPejabat();
            if (list.isEmpty()) {
                id = "PJ-" + String.valueOf(Hari) + String.valueOf(Bulan) + String.valueOf(Tahun) + "-" + "001" + "-" + String.valueOf(randomDigit);
                System.err.println("1");
            } else {
                Pejabat objectTmp = list.get(list.size() - 1);
                String[] tmpNumber = objectTmp.getIdPejabat().split("-");
                int number = Integer.parseInt(tmpNumber[2]);
                String tmpNewUrutanId = String.valueOf(number + 1);
                String newurutanId = "";

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
                    id = "PJ-" + String.valueOf(Hari) + String.valueOf(Bulan) + String.valueOf(Tahun) + "-" + newurutanId + "-" + String.valueOf(randomDigit);
                }
            }
        } catch (ArrayIndexOutOfBoundsException ex) {
            id = "PJ-" + String.valueOf(Hari) + String.valueOf(Bulan) + String.valueOf(Tahun) + "-" + "001" + "-" + String.valueOf(randomDigit);

        } catch (ArsipException ex) {
            Logger.getLogger(HelperGeneratorAutoId.class.getName()).log(Level.SEVERE, null, ex);
        }

        return id;
    }

    public static String generateAutoIdInstansi() {
        String id = "IS-";

        Random random = new Random();
        int randomDigit = random.nextInt(10);

        Calendar cal = Calendar.getInstance();
        cal.setTime(new Date());
        int Hari = cal.get(Calendar.DATE);
        int Bulan = cal.get(Calendar.MONTH) + 1;
        int Tahun = cal.get(Calendar.YEAR);

        InstansiDao dao = DatabaseConnection.getInstansiDao();
        try {
            List<Instansi> list = dao.getAllInstansi();
            if (list.isEmpty()) {
                id = "IS-" + String.valueOf(Hari) + String.valueOf(Bulan) + String.valueOf(Tahun) + "-" + "001" + "-" + String.valueOf(randomDigit);
                System.err.println("1");
            } else {
                Instansi objectTmp = list.get(list.size() - 1);
                String[] tmpNumber = objectTmp.getIdInstansi().split("-");
                int number = Integer.parseInt(tmpNumber[2]);
                String tmpNewUrutanId = String.valueOf(number + 1);
                String newurutanId = "";

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
                    id = "IS-" + String.valueOf(Hari) + String.valueOf(Bulan) + String.valueOf(Tahun) + "-" + newurutanId + "-" + String.valueOf(randomDigit);
                }
            }
        } catch (ArrayIndexOutOfBoundsException ex) {
            id = "IS-" + String.valueOf(Hari) + String.valueOf(Bulan) + String.valueOf(Tahun) + "-" + "001" + "-" + String.valueOf(randomDigit);

        } catch (ArsipException ex) {
            Logger.getLogger(HelperGeneratorAutoId.class.getName()).log(Level.SEVERE, null, ex);
        }

        return id;
    }

    public static String generateAutoIdUser() {
        String id = "US-";

        Random random = new Random();
        int randomDigit = random.nextInt(10);

        Calendar cal = Calendar.getInstance();
        cal.setTime(new Date());
        int Hari = cal.get(Calendar.DATE);
        int Bulan = cal.get(Calendar.MONTH) + 1;
        int Tahun = cal.get(Calendar.YEAR);

        UserDao dao = DatabaseConnection.getUserDao();
        try {
            List<User> list = dao.getAllUser();
            if (list.isEmpty()) {
                id = "US-" + String.valueOf(Hari) + String.valueOf(Bulan) + String.valueOf(Tahun) + "-" + "001" + "-" + String.valueOf(randomDigit);
                System.err.println("1");
            } else {
                User objectTmp = list.get(list.size() - 1);
                String[] tmpNumber = objectTmp.getIdUser().split("-");
                int number = Integer.parseInt(tmpNumber[2]);
                String tmpNewUrutanId = String.valueOf(number + 1);
                String newurutanId = "";

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
                    id = "US-" + String.valueOf(Hari) + String.valueOf(Bulan) + String.valueOf(Tahun) + "-" + newurutanId + "-" + String.valueOf(randomDigit);
                }
            }
        } catch (ArrayIndexOutOfBoundsException ex) {
            id = "US-" + String.valueOf(Hari) + String.valueOf(Bulan) + String.valueOf(Tahun) + "-" + "001" + "-" + String.valueOf(randomDigit);

        } catch (ArsipException ex) {
            Logger.getLogger(HelperGeneratorAutoId.class.getName()).log(Level.SEVERE, null, ex);
        }

        return id;
    }

    public static String generateAutoIdLantai() {
        String id = "PJ-";

        Random random = new Random();
        int randomDigit = random.nextInt(10);

        Calendar cal = Calendar.getInstance();
        cal.setTime(new Date());
        int Hari = cal.get(Calendar.DATE);
        int Bulan = cal.get(Calendar.MONTH) + 1;
        int Tahun = cal.get(Calendar.YEAR);

        LantaiDao dao = DatabaseConnection.getLantaiDao();
        try {
            List<Lantai> list = dao.getAllLantai();
            if (list.isEmpty()) {
                id = "LN-" + String.valueOf(Hari) + String.valueOf(Bulan) + String.valueOf(Tahun) + "-" + "001" + "-" + String.valueOf(randomDigit);
                System.err.println("1");
            } else {
                Lantai objectTmp = list.get(list.size() - 1);
                String[] tmpNumber = objectTmp.getIdLantai().split("-");
                int number = Integer.parseInt(tmpNumber[2]);
                String tmpNewUrutanId = String.valueOf(number + 1);
                String newurutanId = "";

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
                    id = "LN-" + String.valueOf(Hari) + String.valueOf(Bulan) + String.valueOf(Tahun) + "-" + newurutanId + "-" + String.valueOf(randomDigit);
                }
            }
        } catch (ArrayIndexOutOfBoundsException ex) {
            id = "LN-" + String.valueOf(Hari) + String.valueOf(Bulan) + String.valueOf(Tahun) + "-" + "001" + "-" + String.valueOf(randomDigit);

        } catch (ArsipException ex) {
            Logger.getLogger(HelperGeneratorAutoId.class.getName()).log(Level.SEVERE, null, ex);
        }

        return id;
    }

    public static String getAutoIdDus(String namaLantai, int rak, int dus) {
        String result = "";

        String namalantai = namaLantai;
        String tmpRak = String.valueOf(rak);
        String tmpDus = String.valueOf(dus);

        String namaDus = "";
        int lenghtDus = tmpDus.length();
        if (3 - lenghtDus == 2) {
            namaDus = "00" + tmpDus;
        } else if (3 - lenghtDus == 1) {
            namaDus = "0" + tmpDus;
        } else if (3 - lenghtDus == 0) {
            namaDus = tmpDus;
        }

        String namaRak = "";
        int lenghtRak = tmpRak.length();
        if (3 - lenghtRak == 2) {
            namaRak = "00" + tmpRak;
        } else if (3 - lenghtRak == 1) {
            namaRak = "0" + tmpRak;
        } else if (3 - lenghtRak == 0) {
            namaRak = tmpRak;
        }

        result = namaLantai.concat(".").concat(namaRak).concat(".").concat(namaDus);

        return result;
    }

    public static String generateAutoIdRak() {
        String id = "RK-";

        Random random = new Random();
        int randomDigit = random.nextInt(10);

        Calendar cal = Calendar.getInstance();
        cal.setTime(new Date());
        int Hari = cal.get(Calendar.DATE);
        int Bulan = cal.get(Calendar.MONTH) + 1;
        int Tahun = cal.get(Calendar.YEAR);

        RakDao dao = DatabaseConnection.getRakDao();
        try {
            List<Rak> list = dao.getAllRak();
            if (list.isEmpty()) {
                id = "RK-" + String.valueOf(Hari) + String.valueOf(Bulan) + String.valueOf(Tahun) + "-" + "001" + "-" + String.valueOf(randomDigit);
                System.err.println("1");
            } else {
                Rak objectTmp = list.get(list.size() - 1);
                String[] tmpNumber = objectTmp.getIdRak().split("-");
                int number = Integer.parseInt(tmpNumber[2]);
                String tmpNewUrutanId = String.valueOf(number + 1);
                String newurutanId = "";

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
                    id = "RK-" + String.valueOf(Hari) + String.valueOf(Bulan) + String.valueOf(Tahun) + "-" + newurutanId + "-" + String.valueOf(randomDigit);
                }
            }
        } catch (ArrayIndexOutOfBoundsException ex) {
            id = "RK-" + String.valueOf(Hari) + String.valueOf(Bulan) + String.valueOf(Tahun) + "-" + "001" + "-" + String.valueOf(randomDigit);

        } catch (ArsipException ex) {
            Logger.getLogger(HelperGeneratorAutoId.class.getName()).log(Level.SEVERE, null, ex);
        }

        return id;
    }
    
    public static String generateAutoIdCis() {
        String id = "CIS-";

        Random random = new Random();
        int randomDigit = random.nextInt(10);

        Calendar cal = Calendar.getInstance();
        cal.setTime(new Date());
        int Hari = cal.get(Calendar.DATE);
        int Bulan = cal.get(Calendar.MONTH) + 1;
        int Tahun = cal.get(Calendar.YEAR);

        CisDao dao = DatabaseConnection.getCisDao();
        try {
            List<Cis> list = dao.getAllCis();
            if (list.isEmpty()) {
                id = "CIS-" + String.valueOf(Hari) + String.valueOf(Bulan) + String.valueOf(Tahun) + "-" + "001" + "-" + String.valueOf(randomDigit);
                System.err.println("1");
            } else {
                Cis objectTmp = list.get(list.size() - 1);
                String[] tmpNumber = objectTmp.getIdCis().split("-");
                int number = Integer.parseInt(tmpNumber[2]);
                String tmpNewUrutanId = String.valueOf(number + 1);
                String newurutanId = "";

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
                    id = "CIS-" + String.valueOf(Hari) + String.valueOf(Bulan) + String.valueOf(Tahun) + "-" + newurutanId + "-" + String.valueOf(randomDigit);
                }
            }
        } catch (ArrayIndexOutOfBoundsException ex) {
            id = "CIS-" + String.valueOf(Hari) + String.valueOf(Bulan) + String.valueOf(Tahun) + "-" + "001" + "-" + String.valueOf(randomDigit);

        } catch (ArsipException ex) {
            Logger.getLogger(HelperGeneratorAutoId.class.getName()).log(Level.SEVERE, null, ex);
        }

        return id;
    }

}
