/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bpd.arsip.dao;

import com.bpd.arsip.entitas.Pengarsipan;
import com.bpd.arsip.exception.ArsipException;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Dany Candra
 */
public interface PengarsipanDao {

    public void insertPengarsipan(Pengarsipan pengarsipan) throws ArsipException;

    public void updatePengarsipan(Pengarsipan pengarsipan) throws ArsipException;

    public List<Pengarsipan> getAllDebitur(int skip, int max) throws ArsipException;

    public List<Pengarsipan> getDaftarPenerimaanBerkas(Date tanggalMaulai, Date tanggalSelesai) throws ArsipException;
    
    public List<Pengarsipan> getDaftarPengembalianBerkas(Date tanggalMaulai, Date tanggalSelesai) throws ArsipException;

    public Long getLongPenerimaan() throws ArsipException;

    public void insertPenerimaan(Pengarsipan pengarsipan) throws ArsipException;

    public void insertPengembalian(Pengarsipan pengarsipan) throws ArsipException;

    public List<Pengarsipan> getDaftarBerkasTersedia(int skip, int max) throws ArsipException;

    public List<Pengarsipan> getDaftarBerkasTersedia(String cif) throws ArsipException;
    
    public List<Pengarsipan> getDaftarBerkasTersediaByNama(String nama) throws ArsipException;

    public List<Pengarsipan> getDaftarBerkasTersediaByIdDus(String idDus) throws ArsipException;

    public Pengarsipan getPengarsipanByCIF(String cif) throws ArsipException;

    public Pengarsipan getPengarsipanTersediaByCIF(String cif) throws ArsipException;

    public Pengarsipan getNewPengarsipanByCIF(String cif) throws ArsipException;
    
    public boolean cekPengarsipanTersediaByCIF(String cif) throws ArsipException;

    public void updatePenerimaan(Pengarsipan pengarsipan) throws ArsipException;

}
