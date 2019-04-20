/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bpd.arsip.dao;


import com.bpd.arsip.entitas.User;
import com.bpd.arsip.exception.ArsipException;
import java.util.List;

/**
 *
 * @author Dany Candra
 */
public interface UserDao {

    public void insertUser(User user) throws ArsipException;

    public void updateUser(User user) throws ArsipException;

    public List<User> getAllUser() throws ArsipException;

    public boolean isCanDelete(String idUser) throws ArsipException;
    
    public boolean isCanInsert(String namaUser) throws ArsipException;

    public void delete(String idUser) throws ArsipException;

    public User getUser(String username, String password) throws ArsipException;
    
    public User getUser(String idUser) throws ArsipException;
    
    public List<User> getAllUserByNama(String namaPemilik) throws ArsipException;
}
