/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bpd.arsip.helper;

/**
 *
 * @author danychan
 */
public class HelperGetPinjamanByCifCis {

    public static String getPinjamanKe(String cifCis) {
        String text = "";
        if (cifCis.length() == 12) {
            text = cifCis.substring(11, 12);
        } else if (cifCis.length() == 13) {
            text = cifCis.substring(12, 13);
        }
        return text;
    }

    public static int getJenisPinjaman(String cifCis) {
        int jenis = 0;
        String text = "";
        if (cifCis.length() == 12) {
            text = cifCis.substring(8, 11);
            
        } else if (cifCis.length() == 13) {
            text = cifCis.substring(9, 12);
        }
        System.out.println(text);
        if (text.equals("PLO")) {
            jenis = 0;
        } else if (text.equals("KWU")) {
            jenis = 1;
        }
        else if (text.equals("KUP")) {
            jenis = 2;
        }
        else if (text.equals("KPR")) {
            jenis = 3;
        }
        else if (text.equals("PLS")) {
            jenis = 4;
        }
        else if (text.equals("PLW")) {
            jenis = 5;
        }
        else if (text.equals("PRC")) {
            jenis = 6;
        }
        else if (text.equals("KOP")) {
            jenis = 7;
        }
        return jenis;

    }

}
