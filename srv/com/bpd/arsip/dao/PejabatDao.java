/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bpd.arsip.dao;

import com.bpd.arsip.entitas.Pejabat;
import com.bpd.arsip.exception.ArsipException;
import java.util.List;

/**
 *
 * @author Dany Candra
 */
public interface PejabatDao {

    public void insertPejabat(Pejabat pejabat) throws ArsipException;

    public void updatePejabat(Pejabat pejabat) throws ArsipException;

    public void delete(String idPejabat) throws ArsipException;

    public List<Pejabat> getPejabat() throws ArsipException;

    public Pejabat getPejabat(String id) throws ArsipException;

    public List<Pejabat> getPejabatByName(String namaPejabat) throws ArsipException;

    public boolean isCanDelete(String idPejabat) throws ArsipException;

    public boolean isCanInsert(String namaPejabat) throws ArsipException;
}
