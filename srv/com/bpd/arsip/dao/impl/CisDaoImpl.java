/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bpd.arsip.dao.impl;

import com.bpd.arsip.dao.CisDao;
import com.bpd.arsip.database.DatabaseConnection;
import com.bpd.arsip.entitas.Cis;
import com.bpd.arsip.exception.ArsipException;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Dany Candra
 */
public class CisDaoImpl implements CisDao {

    private final Connection connection;

    public CisDaoImpl(Connection connection) {
        this.connection = connection;
    }

    @Override
    public void insert(Cis cis) throws ArsipException {
        final String INSERT = "INSERT INTO CIS "
                + "(ID_CIS, CIF, CIF_CIS, NO_PINJAMAN, TANGGAL_REALISASI,TANGGAL_MULAI,TANGGAL_SELESAI,JUMLAH_PERTANGGUNGAN) "
                + "VALUES (?,?,?,?,?,?,?,?)";

        PreparedStatement statement = null;
        try {
            statement = connection.prepareStatement(INSERT);

            statement.setString(1, cis.getIdCis());
            statement.setString(2, cis.getDebitur().getCif());
            statement.setString(3, cis.getCifCis());
            statement.setString(4, cis.getNoPinjam());
            statement.setDate(5, new Date(cis.getTanggalRealisasi().getTime()));
            statement.setDate(6, new Date(cis.getTanggalMulai().getTime()));
            statement.setDate(7, new Date(cis.getTanggalSelesai().getTime()));
            statement.setDouble(8, cis.getJumlahPertanggungan());
            statement.executeUpdate();

        } catch (SQLException ex) {

            throw new ArsipException(ex.getMessage());
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {

                }
            }
        }
    }

    @Override
    public void update(Cis cis) throws ArsipException {
        final String UPDATE = "UPDATE CIS SET "
                + " CIF=?, CIF_CIS=?, NO_PINJAMAN=?, TANGGAL_REALISASI=?,TANGGAL_MULAI=?,TANGGAL_SELESAI=?,JUMLAH_PERTANGGUNGAN=? "
                + "WHERE ID_CIS=?";

        PreparedStatement statement = null;
        try {
            statement = connection.prepareStatement(UPDATE);

            statement.setString(1, cis.getDebitur().getCif());
            statement.setString(2, cis.getCifCis());
            statement.setString(3, cis.getNoPinjam());
            statement.setDate(4, new Date(cis.getTanggalRealisasi().getTime()));
            statement.setDate(5, new Date(cis.getTanggalMulai().getTime()));
            statement.setDate(6, new Date(cis.getTanggalSelesai().getTime()));
            statement.setDouble(7, cis.getJumlahPertanggungan());
            statement.setString(8, cis.getIdCis());
            statement.executeUpdate();

        } catch (SQLException ex) {

            throw new ArsipException(ex.getMessage());
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {

                }
            }
        }
    }

    @Override
    public List<Cis> getCisByTanggalPencairan(java.util.Date tanggalMulai, java.util.Date tanggalSelesai) throws ArsipException {
        final String SELECT = "SELECT * FROM CIS WHERE (TANGGAL_REALISASI >= ?) AND (TANGGAL_REALISASI <= ?)";
        List<Cis> list = new ArrayList<>();

        PreparedStatement statement = null;
        try {
            statement = connection.prepareStatement(SELECT);
            statement.setDate(1, new Date(tanggalMulai.getTime()));
            statement.setDate(2, new Date(tanggalSelesai.getTime()));
            ResultSet set = statement.executeQuery();
            while (set.next()) {
                Cis cis = new Cis();
                cis.setIdCis(set.getString("ID_CIS"));
                cis.setDebitur(DatabaseConnection.getDebiturDao().getDebitur(set.getString("CIF")));
                cis.setCifCis(set.getString("CIF_CIS"));
                cis.setNoPinjam(set.getString("NO_PINJAMAN"));
                cis.setTanggalRealisasi(set.getDate("TANGGAL_REALISASI"));
                cis.setTanggalMulai(set.getDate("TANGGAL_MULAI"));
                cis.setTanggalSelesai(set.getDate("TANGGAL_SELESAI"));
                cis.setJumlahPertanggungan(set.getDouble("JUMLAH_PERTANGGUNGAN"));

                list.add(cis);
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
    public Cis getByNoPinjam(String noPinjam) throws ArsipException {
        final String SELECT = "SELECT * FROM CIS WHERE NO_PINJAMAN = ?";
        Cis cis = null;

        PreparedStatement statement = null;
        try {
            statement = connection.prepareStatement(SELECT);
            statement.setString(1, noPinjam);
            ResultSet set = statement.executeQuery();
            while (set.next()) {
                cis = new Cis();
                cis.setIdCis(set.getString("ID_CIS"));
                cis.setDebitur(DatabaseConnection.getDebiturDao().getDebitur(set.getString("CIF")));
                cis.setCifCis(set.getString("CIF_CIS"));
                cis.setNoPinjam(set.getString("NO_PINJAMAN"));
                cis.setTanggalRealisasi(set.getDate("TANGGAL_REALISASI"));
                cis.setTanggalMulai(set.getDate("TANGGAL_MULAI"));
                cis.setTanggalSelesai(set.getDate("TANGGAL_SELESAI"));
                cis.setJumlahPertanggungan(set.getDouble("JUMLAH_PERTANGGUNGAN"));
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

        return cis;
    }

    @Override
    public List<Cis> getCisByNoPinjaman(String noPinjaman) throws ArsipException {
        final String SELECT = "SELECT * FROM CIS WHERE NO_PINJAMAN LIKE ?";
        List<Cis> list = new ArrayList<>();

        PreparedStatement statement = null;
        try {
            statement = connection.prepareStatement(SELECT);
            statement.setString(1, "%" + noPinjaman + "%");
            ResultSet set = statement.executeQuery();
            while (set.next()) {
                Cis cis = new Cis();
                cis.setIdCis(set.getString("ID_CIS"));
                cis.setDebitur(DatabaseConnection.getDebiturDao().getDebitur(set.getString("CIF")));
                cis.setCifCis(set.getString("CIF_CIS"));
                cis.setNoPinjam(set.getString("NO_PINJAMAN"));
                cis.setTanggalRealisasi(set.getDate("TANGGAL_REALISASI"));
                cis.setTanggalMulai(set.getDate("TANGGAL_MULAI"));
                cis.setTanggalSelesai(set.getDate("TANGGAL_SELESAI"));
                cis.setJumlahPertanggungan(set.getDouble("JUMLAH_PERTANGGUNGAN"));

                list.add(cis);
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
    public List<Cis> getAllCis() throws ArsipException {
        final String SELECT = "SELECT * FROM CIS ";
        List<Cis> list = new ArrayList<>();

        PreparedStatement statement = null;
        try {
            statement = connection.prepareStatement(SELECT);
            ResultSet set = statement.executeQuery();
            while (set.next()) {
                Cis cis = new Cis();
                cis.setIdCis(set.getString("ID_CIS"));
                cis.setDebitur(DatabaseConnection.getDebiturDao().getDebitur(set.getString("CIF")));
                cis.setCifCis(set.getString("CIF_CIS"));
                cis.setNoPinjam(set.getString("NO_PINJAMAN"));
                cis.setTanggalRealisasi(set.getDate("TANGGAL_REALISASI"));
                cis.setTanggalMulai(set.getDate("TANGGAL_MULAI"));
                cis.setTanggalSelesai(set.getDate("TANGGAL_SELESAI"));
                cis.setJumlahPertanggungan(set.getDouble("JUMLAH_PERTANGGUNGAN"));

                list.add(cis);
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
