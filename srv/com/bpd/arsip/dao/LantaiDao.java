/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bpd.arsip.dao;


import com.bpd.arsip.entitas.Lantai;
import com.bpd.arsip.exception.ArsipException;
import java.util.List;

/**
 *
 * @author Dany Candra
 */
public interface LantaiDao {

    public void insertLantai(Lantai lantai) throws ArsipException;

    public void updateLantai(Lantai lantai) throws ArsipException;

    public void deleteLantai(String idLantai) throws ArsipException;

    public boolean isCanDelete(String idLantai) throws ArsipException;
    
    public boolean isCanInsert(String nama) throws ArsipException;

    public List<Lantai> getAllLantai() throws ArsipException;

    public Lantai getLantai(String idLantai) throws ArsipException;
}
