/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bpd.arsip.dao.impl;

import com.bpd.arsip.dao.UserDao;
import com.bpd.arsip.entitas.User;
import com.bpd.arsip.exception.ArsipException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Dany Candra
 */
public class UserDaoImpl implements UserDao {

    private final Connection connection;

    public UserDaoImpl(Connection connection) {
        this.connection = connection;
    }

    @Override
    public void insertUser(User user) throws ArsipException {
        final String INSERT = "INSERT INTO USER (ID_USER,USERNAME,PASSWORD,NAMA,PREVILLAGE) "
                + "VALUES (?,?,?,?,?)";

        PreparedStatement statement = null;
        try {
            statement = connection.prepareStatement(INSERT);

            statement.setString(1, user.getIdUser());
            statement.setString(2, user.getUserName());
            statement.setString(3, user.getPassword());
            statement.setString(4, user.getNama());
            statement.setInt(5, user.getPrevillage());
            statement.executeUpdate();

        } catch (SQLException ex) {
            throw new ArsipException(ex.getMessage());
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    throw new ArsipException(ex.getMessage());
                }
            }
        }
    }

    @Override
    public List<User> getAllUser() throws ArsipException {
        final String SELECT = "SELECT * FROM USER ORDER BY ID_USER";
        List<User> list = new ArrayList<>();

        PreparedStatement statement = null;
        try {
            statement = connection.prepareStatement(SELECT);
            ResultSet set = statement.executeQuery();
            while (set.next()) {
                User user = new User();
                user.setIdUser(set.getString("ID_USER"));
                user.setNama(set.getString("NAMA"));
                user.setPassword(set.getString("PASSWORD"));
                user.setUserName(set.getString("USERNAME"));
                user.setPrevillage(set.getInt("PREVILLAGE"));
                list.add(user);
            }
        } catch (SQLException ex) {
            throw new ArsipException(ex.getMessage());
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    throw new ArsipException(ex.getMessage());
                }
            }
        }

        return list;
    }

    @Override
    public void updateUser(User user) throws ArsipException {
        final String UPDATE = "UPDATE USER SET USERNAME=?,PASSWORD=?,NAMA=? ,PREVILLAGE=? "
                + "WHERE ID_USER=?";

        PreparedStatement statement = null;
        try {
            statement = connection.prepareStatement(UPDATE);

            statement.setString(1, user.getUserName());
            statement.setString(2, user.getPassword());
            statement.setString(3, user.getNama());
            statement.setInt(4, user.getPrevillage());
            statement.setString(5, user.getIdUser());
            
            statement.executeUpdate();

        } catch (SQLException ex) {
            throw new ArsipException(ex.getMessage());
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    throw new ArsipException(ex.getMessage());
                }
            }
        }
    }

    @Override
    public boolean isCanDelete(String idUser) throws ArsipException {

        final String DELETE = "SELECT ID_USER_PENERIMA FROM PENGARSIPAN WHERE ID_USER_PENERIMA = ? ";
        final String DELETE1 = "SELECT ID_USER_PENGEMBALI FROM PENGARSIPAN WHERE ID_USER_PENGEMBALI = ? ";
        boolean result = true;
        PreparedStatement statement = null;
        PreparedStatement statement1 = null;
        try {
            statement = connection.prepareStatement(DELETE);
            statement.setString(1, idUser);

            statement1 = connection.prepareStatement(DELETE1);
            statement1.setString(1, idUser);

            ResultSet set = statement.executeQuery();
            ResultSet set1 = statement1.executeQuery();

            if (set.next() || set1.next()) {
                result = false;
            }

        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
            throw new ArsipException(ex.getMessage());

        } finally {

            if (statement != null || statement1 != null) {
                try {
                    statement.close();
                    statement1.close();
                } catch (SQLException ex) {
                    System.err.println(ex.getMessage());
                    throw new ArsipException(ex.getMessage());
                }
            }
            return result;
        }
    }

    @Override
    public void delete(String idUser) throws ArsipException {
        final String DELETE = "DELETE FROM USER  "
                + "WHERE ID_USER=?";

        PreparedStatement statement = null;
        try {
            statement = connection.prepareStatement(DELETE);
            statement.setString(1, idUser);
            statement.executeUpdate();
        } catch (SQLException ex) {
            throw new ArsipException(ex.getMessage());
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    throw new ArsipException(ex.getMessage());
                }
            }
        }
    }

    @Override
    public User getUser(String username, String password) throws ArsipException {
        final String SELECT = "SELECT * FROM USER WHERE USERNAME=? AND PASSWORD=?";
        User user = null;

        PreparedStatement statement = null;
        try {
            statement = connection.prepareStatement(SELECT);
            statement.setString(1, username);
            statement.setString(2, password);
            ResultSet set = statement.executeQuery();
            if (set.next()) {
                user = new User();
                user.setIdUser(set.getString("ID_USER"));
                user.setNama(set.getString("NAMA"));
                user.setPassword(set.getString("PASSWORD"));
                user.setUserName(set.getString("USERNAME"));
                user.setPrevillage(set.getInt("PREVILLAGE"));
            }
        } catch (SQLException ex) {
            throw new ArsipException(ex.getMessage());
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    throw new ArsipException(ex.getMessage());
                }
            }
        }

        return user;
    }

    @Override
    public User getUser(String idUser) throws ArsipException {
        final String SELECT = "SELECT * FROM USER WHERE ID_USER=?";
        User user = null;

        PreparedStatement statement = null;
        try {
            statement = connection.prepareStatement(SELECT);
            statement.setString(1, idUser);
            ResultSet set = statement.executeQuery();
            if (set.next()) {
                user = new User();
                user.setIdUser(set.getString("ID_USER"));
                user.setNama(set.getString("NAMA"));
                user.setPassword(set.getString("PASSWORD"));
                user.setUserName(set.getString("USERNAME"));
                user.setPrevillage(set.getInt("PREVILLAGE"));
            }
        } catch (SQLException ex) {
            throw new ArsipException(ex.getMessage());
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    throw new ArsipException(ex.getMessage());
                }
            }
        }

        return user;
    }

    @Override
    public boolean isCanInsert(String namaUser) throws ArsipException {
        final String CEK = "SELECT NAMA FROM USER WHERE USERNAME=? ";
        boolean result = true;
        PreparedStatement statement = null;
        try {
            statement = connection.prepareStatement(CEK);
            statement.setString(1, namaUser);
            ResultSet set = statement.executeQuery();

            if (set.next()) {
                result = false;
            }

        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
            throw new ArsipException(ex.getMessage());

        } finally {

            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    System.err.println(ex.getMessage());
                    throw new ArsipException(ex.getMessage());
                }
            }
            return result;
        }
    }

    @Override
    public List<User> getAllUserByNama(String namaPemilik) throws ArsipException {
        final String SELECT = "SELECT * FROM USER WHERE NAMA LIKE ?";
        List<User> list = new ArrayList<>();

        PreparedStatement statement = null;
        try {
            statement = connection.prepareStatement(SELECT);
            statement.setString(1, "%" + namaPemilik + "%");
            ResultSet set = statement.executeQuery();
            while (set.next()) {
                User user = new User();
                user.setIdUser(set.getString("ID_USER"));
                user.setNama(set.getString("NAMA"));
                user.setPassword(set.getString("PASSWORD"));
                user.setUserName(set.getString("USERNAME"));
                user.setPrevillage(set.getInt("PREVILLAGE"));
                list.add(user);
            }
        } catch (SQLException ex) {
            throw new ArsipException(ex.getMessage());
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    throw new ArsipException(ex.getMessage());
                }
            }
        }

        return list;
    }

}
