/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bpd.arsip.dao.impl;

import com.bpd.arsip.dao.PejabatDao;
import com.bpd.arsip.entitas.Pejabat;
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
public class PejabatDaoImpl implements PejabatDao {

    private Connection connection;

    public PejabatDaoImpl(Connection connection) {
        this.connection = connection;
    }

    @Override
    public void insertPejabat(Pejabat pejabat) throws ArsipException {
        final String INSERT = "INSERT INTO PEJABAT (ID_PEJABAT,NAMA_PEJABAT,JABATAN) "
                + "VALUES (?,?,?)";

        PreparedStatement statement = null;
        try {
            statement = connection.prepareStatement(INSERT);

            statement.setString(1, pejabat.getIdPejabat());
            statement.setString(2, pejabat.getNamaPejabat());
            statement.setString(3, pejabat.getJabatan());
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
    public List<Pejabat> getPejabat() throws ArsipException {
        final String SELECT = "SELECT * FROM PEJABAT";
        List<Pejabat> list = new ArrayList<Pejabat>();

        PreparedStatement statement = null;
        try {
            statement = connection.prepareStatement(SELECT);
            ResultSet set = statement.executeQuery();
            while (set.next()) {
                Pejabat pejabat = new Pejabat();
                pejabat.setIdPejabat(set.getString("ID_PEJABAT"));
                pejabat.setNamaPejabat(set.getString("NAMA_PEJABAT"));
                pejabat.setJabatan(set.getString("JABATAN"));
                list.add(pejabat);
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
    public void updatePejabat(Pejabat pejabat) throws ArsipException {
        final String UPDATE = "UPDATE PEJABAT SET NAMA_PEJABAT=?,JABATAN=? "
                + "WHERE ID_PEJABAT=?";

        PreparedStatement statement = null;
        try {
            statement = connection.prepareStatement(UPDATE);

            statement.setString(1, pejabat.getNamaPejabat());
            statement.setString(2, pejabat.getJabatan());
            statement.setString(3, pejabat.getIdPejabat());
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
    public boolean isCanDelete(String idPejabat) throws ArsipException {

        final String DELETE = "SELECT ID_PEJABAT_PENERIMA FROM PENGARSIPAN WHERE ID_PEJABAT_PENERIMA = ? ";
        final String DELETE1 = "SELECT ID_PEJABAT_PENGEMBALI FROM PENGARSIPAN WHERE ID_PEJABAT_PENGEMBALI = ? ";
        boolean result = true;
        PreparedStatement statement = null;
        PreparedStatement statement1 = null;
        try {
            statement = connection.prepareStatement(DELETE);
            statement.setString(1, idPejabat);

            statement1 = connection.prepareStatement(DELETE1);
            statement1.setString(1, idPejabat);

            ResultSet set = statement.executeQuery();
            ResultSet set1 = statement1.executeQuery();

            if (set.next() || set1.next()) {
                result = false;
            } else {
                result = true;
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
    public void delete(String idPejabat) throws ArsipException {
        final String DELETE = "DELETE FROM PEJABAT  "
                + "WHERE ID_PEJABAT=?";

        PreparedStatement statement = null;
        try {
            statement = connection.prepareStatement(DELETE);
            statement.setString(1, idPejabat);
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
    public Pejabat getPejabat(String id) throws ArsipException {
        final String SELECT = "SELECT * FROM PEJABAT WHERE ID_PEJABAT=?";
        Pejabat pejabat = null;

        PreparedStatement statement = null;
        try {
            statement = connection.prepareStatement(SELECT);
            statement.setString(1, id);
            ResultSet set = statement.executeQuery();
            if (set.next()) {
                pejabat = new Pejabat();
                pejabat.setIdPejabat(set.getString("ID_PEJABAT"));
                pejabat.setNamaPejabat(set.getString("NAMA_PEJABAT"));
                pejabat.setJabatan(set.getString("JABATAN"));
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

        return pejabat;
    }

    @Override
    public boolean isCanInsert(String namaPejabat) throws ArsipException {
        final String CEK = "SELECT NAMA_PEJABAT FROM PEJABAT WHERE NAMA_PEJABAT = ? ";
        boolean result = true;
        PreparedStatement statement = null;
        try {
            statement = connection.prepareStatement(CEK);
            statement.setString(1, namaPejabat);
            ResultSet set = statement.executeQuery();
            if (set.next()) {
                result = false;
            } else {
                result = true;
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
    public List<Pejabat> getPejabatByName(String namaPejabat) throws ArsipException {
        final String SELECT = "SELECT * FROM PEJABAT WHERE NAMA_PEJABAT LIKE ?";
        List<Pejabat> list = new ArrayList<>();
        PreparedStatement statement = null;
        try {
            statement = connection.prepareStatement(SELECT);
            statement.setString(1, "%"+namaPejabat+"%");
            ResultSet set = statement.executeQuery();
            while (set.next()) {
                Pejabat pejabat = new Pejabat();
                pejabat.setIdPejabat(set.getString("ID_PEJABAT"));
                pejabat.setNamaPejabat(set.getString("NAMA_PEJABAT"));
                pejabat.setJabatan(set.getString("JABATAN"));
                list.add(pejabat);
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
