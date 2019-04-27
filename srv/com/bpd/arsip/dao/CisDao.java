/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bpd.arsip.dao;

import com.bpd.arsip.entitas.Cis;
import com.bpd.arsip.exception.ArsipException;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Dany Candra
 */
public interface CisDao {

    public void insert(Cis cis) throws ArsipException;

    public void update(Cis cis) throws ArsipException;
    
    public Cis getByNoPinjam(String noPinjam) throws ArsipException;

    public List<Cis> getCisByTanggalPencairan(Date tanggalMulai, Date tanggalSelesai) throws ArsipException;
    
    public List<Cis> getCisByNoPinjaman(String noPinjaman) throws ArsipException;
    
    public List<Cis> getAllCis() throws ArsipException;

}
