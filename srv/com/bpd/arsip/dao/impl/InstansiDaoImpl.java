/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bpd.arsip.dao.impl;

import com.bpd.arsip.dao.InstansiDao;
import com.bpd.arsip.entitas.Instansi;
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
public class InstansiDaoImpl implements InstansiDao {

    private Connection connection;

    public InstansiDaoImpl(Connection connection) {
        this.connection = connection;
    }

    @Override
    public void insertInstansi(Instansi instansi) throws ArsipException {
        final String INSERT = "INSERT INTO INSTANSI (ID_INSTANSI,NAMA_INSTANSI,ALAMAT,TELEPON) "
                + "VALUES (?,?,?,?)";

        PreparedStatement statement = null;
        try {
            statement = connection.prepareStatement(INSERT);

            statement.setString(1, instansi.getIdInstansi());
            statement.setString(2, instansi.getNamaInstansi());
            statement.setString(3, instansi.getAlamat());
            statement.setString(4, instansi.getTelepon());
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
    public void updateInstansi(Instansi instansi) throws ArsipException {
        final String UPDATE = "UPDATE INSTANSI SET NAMA_INSTANSI=?,ALAMAT=?,TELEPON=? "
                + "WHERE ID_INSTANSI=?";

        PreparedStatement statement = null;
        try {
            statement = connection.prepareStatement(UPDATE);

            statement.setString(1, instansi.getNamaInstansi());
            statement.setString(2, instansi.getAlamat());
            statement.setString(3, instansi.getTelepon());
            statement.setString(4, instansi.getIdInstansi());
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
    public boolean isCanDelete(String idInstansi) throws ArsipException {

        final String DELETE = "SELECT ID_INSTANSI FROM DEBITUR WHERE ID_INSTANSI = ? ";
        boolean result = true;
        PreparedStatement statement = null;
        try {
            statement = connection.prepareStatement(DELETE);
            statement.setString(1, idInstansi);

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
    public void delete(String idInstansi) throws ArsipException {
        final String DELETE = "DELETE FROM INSTANSI  "
                + "WHERE ID_INSTANSI=?";

        PreparedStatement statement = null;
        try {
            statement = connection.prepareStatement(DELETE);
            statement.setString(1, idInstansi);
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
    public List<Instansi> getAllInstansi() throws ArsipException {
        final String SELECT = "SELECT * FROM INSTANSI ";
        List<Instansi> list = new ArrayList<>();

        PreparedStatement statement = null;
        try {
            statement = connection.prepareStatement(SELECT);
            ResultSet set = statement.executeQuery();
            while (set.next()) {
                Instansi instansi = new Instansi();
                instansi.setIdInstansi(set.getString("ID_INSTANSI"));
                instansi.setNamaInstansi(set.getString("NAMA_INSTANSI"));
                instansi.setAlamat(set.getString("ALAMAT"));
                instansi.setTelepon(set.getString("TELEPON"));
                list.add(instansi);
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
    public Instansi getInstansi(String idInstansi) throws ArsipException {
        final String SELECT = "SELECT * FROM INSTANSI WHERE ID_INSTANSI=?";
        Instansi instansi = null;

        PreparedStatement statement = null;
        try {
            statement = connection.prepareStatement(SELECT);
            statement.setString(1, idInstansi);
            ResultSet set = statement.executeQuery();
            if (set.next()) {
                instansi = new Instansi();
                instansi.setIdInstansi(set.getString("ID_INSTANSI"));
                instansi.setNamaInstansi(set.getString("NAMA_INSTANSI"));
                instansi.setAlamat(set.getString("ALAMAT"));
                instansi.setTelepon(set.getString("TELEPON"));
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

        return instansi;
    }

    @Override
    public boolean isCanInsert(String namaIsntansi) throws ArsipException {
        final String CEK = "SELECT NAMA_INSTANSI FROM INSTANSI WHERE NAMA_INSTANSI = ? ";
        boolean result = true;
        PreparedStatement statement = null;
        try {
            statement = connection.prepareStatement(CEK);
            statement.setString(1, namaIsntansi);

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
    public List<Instansi> getAllInstansiByName(String namaInstansi) throws ArsipException {
        final String SELECT = "SELECT * FROM INSTANSI WHERE NAMA_INSTANSI LIKE ?";
        List<Instansi> list = new ArrayList<>();
        PreparedStatement statement = null;
        try {
            statement = connection.prepareStatement(SELECT);
            statement.setString(1, "%"+namaInstansi+"%");
            ResultSet set = statement.executeQuery();
            while (set.next()) {
                Instansi instansi = new Instansi();
                instansi.setIdInstansi(set.getString("ID_INSTANSI"));
                instansi.setNamaInstansi(set.getString("NAMA_INSTANSI"));
                instansi.setAlamat(set.getString("ALAMAT"));
                instansi.setTelepon(set.getString("TELEPON"));
                list.add(instansi);
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
