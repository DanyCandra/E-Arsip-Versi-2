/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bpd.arsip.dao;


import com.bpd.arsip.entitas.Dus;
import com.bpd.arsip.exception.ArsipException;
import java.util.List;

/**
 *
 * @author Dany Candra
 */
public interface DusDao {

    public void insertDus(Dus dus) throws ArsipException;
    
    public void updateStock(Dus dus) throws ArsipException;
    
    public void deleteDus(String idDus) throws ArsipException;
    
    public boolean isCanDelete(String idDus)throws ArsipException;

    public List<Dus> getAllDus() throws ArsipException;

    public List<Dus> getDusEmpety() throws ArsipException;

    public int getDusAkhir() throws ArsipException;
    
    public int getDusAkhirByRak(String idRak) throws ArsipException;

    public List<Dus> getAllDus(int skip, int max) throws ArsipException;

    public List<Dus> getAllDus(String idRak) throws ArsipException;

    public Dus getDus(String id) throws ArsipException;
    
    public List<Dus> getDusForDelete(int jumlah,String id_rak)throws ArsipException;
    

    
}
