/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bpd.arsip.entitas;

/**
 *
 * @author Dany Candra
 */
public class Instansi {

    private String idInstansi;
    private String namaInstansi;
    private String alamat;
    private String telepon;

    public Instansi() {
    }

    public Instansi(String idInstansi, String namaInstansi, String alamat, String telepon) {
        this.idInstansi = idInstansi;
        this.namaInstansi = namaInstansi;
        this.alamat = alamat;
        this.telepon = telepon;
    }

    public String getIdInstansi() {
        return idInstansi;
    }

    public void setIdInstansi(String idInstansi) {
        this.idInstansi = idInstansi;
    }

    public String getNamaInstansi() {
        return namaInstansi;
    }

    public void setNamaInstansi(String namaInstansi) {
        this.namaInstansi = namaInstansi;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getTelepon() {
        return telepon;
    }

    public void setTelepon(String telepon) {
        this.telepon = telepon;
    }

}
