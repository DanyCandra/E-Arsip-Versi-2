/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bpd.arsip.dao;

import com.bpd.arsip.entitas.Instansi;
import com.bpd.arsip.exception.ArsipException;
import java.util.List;

/**
 *
 * @author Dany Candra
 */
public interface InstansiDao {

    public void insertInstansi(Instansi instansi) throws ArsipException;

    public void updateInstansi(Instansi instansi) throws ArsipException;

    public void delete(String idInstansi) throws ArsipException;

    public List<Instansi> getAllInstansi() throws ArsipException;

    public Instansi getInstansi(String idInstansi) throws ArsipException;
    
    public List<Instansi> getAllInstansiByName(String namaInstansi) throws ArsipException;

    public boolean isCanDelete(String idInstansi) throws ArsipException;
    
    public boolean isCanInsert(String namaIsntansi) throws ArsipException;

}
