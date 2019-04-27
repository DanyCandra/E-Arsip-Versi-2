/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bpd.arsip.dao.impl;

import com.bpd.arsip.dao.PengarsipanDao;
import com.bpd.arsip.database.DatabaseConnection;
import com.bpd.arsip.entitas.Pengarsipan;
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
public class PengarsipanDaoImpl implements PengarsipanDao {

    private final Connection connection;

    public PengarsipanDaoImpl(Connection connection) {
        this.connection = connection;
    }

    @Override
    public void insertPengarsipan(Pengarsipan pengarsipan) throws ArsipException {
        final String INSERT = "INSERT INTO PENGARSIPAN "
                + "(CIF,TANGGAL_TERIMA, ID_USER_PENERIMA, ID_PEJABAT_PENERIMA,ID_DUS,TANGGAL_KEMBALI,ID_USER_PENGEMBALI,ID_PEJABAT_PENGEMBALI,STATUS_ARSIP,STATUS_KEMBALI) "
                + "VALUES (?,?,?,?,?,?,?,?,?,?)";

        PreparedStatement statement = null;
        try {
            statement = connection.prepareStatement(INSERT);

            statement.setString(1, pengarsipan.getDebitur().getCif());
            statement.setDate(2, new Date(pengarsipan.getTanggalTerima().getTime()));
            statement.setString(3, pengarsipan.getUserPenerima().getIdUser());
            statement.setString(4, pengarsipan.getPejabatPenerima().getIdPejabat());
            statement.setString(5, pengarsipan.getDus().getIdDus());
            statement.setDate(6, new Date(pengarsipan.getTanggalKembali().getTime()));
            statement.setString(7, pengarsipan.getUserPengembali().getIdUser());
            statement.setString(8, pengarsipan.getPejabatPengembali().getIdPejabat());
            statement.setString(9, pengarsipan.getStatusArsip());
            statement.setString(10, pengarsipan.getStatusKembali());
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
    public void updatePengarsipan(Pengarsipan pengarsipan) throws ArsipException {
        final String UPDATE = "UPDATE PENGARSIPAN SET "
                + "TANGGAL_TERIMA=?, ID_USER_PENERIMA=?, ID_PEJABAT_PENERIMA=?,ID_DUS=?,TANGGAL_KEMBALI=?,ID_USER_PENGEMBALI=?,ID_PEJABAT_PENGEMBALI=?,STATUS_ARSIP=?,STATUS_KEMBALI=? "
                + "WHERE CIF=? ";

        PreparedStatement statement = null;
        try {
            statement = connection.prepareStatement(UPDATE);

            statement.setDate(1, new Date(pengarsipan.getTanggalTerima().getTime()));
            statement.setString(2, pengarsipan.getUserPenerima().getIdUser());
            statement.setString(3, pengarsipan.getPejabatPenerima().getIdPejabat());
            statement.setString(4, pengarsipan.getDus().getIdDus());
            statement.setDate(5, new Date(pengarsipan.getTanggalKembali().getTime()));
            statement.setString(6, pengarsipan.getUserPengembali().getIdUser());
            statement.setString(7, pengarsipan.getPejabatPengembali().getIdPejabat());
            statement.setString(8, pengarsipan.getStatusArsip());
            statement.setString(9, pengarsipan.getStatusKembali());
            statement.setString(10, pengarsipan.getDebitur().getCif());
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
    public void insertPenerimaan(Pengarsipan pengarsipan) throws ArsipException {
        final String INSERT = "INSERT INTO PENGARSIPAN "
                + "(CIF,TANGGAL_TERIMA, ID_USER_PENERIMA, ID_PEJABAT_PENERIMA,ID_DUS,STATUS_ARSIP) "
                + "VALUES (?,?,?,?,?,?)";

        PreparedStatement statement = null;
        try {
            statement = connection.prepareStatement(INSERT);

            statement.setString(1, pengarsipan.getDebitur().getCif());
            statement.setDate(2, new Date(pengarsipan.getTanggalTerima().getTime()));
            statement.setString(3, pengarsipan.getUserPenerima().getIdUser());
            statement.setString(4, pengarsipan.getPejabatPenerima().getIdPejabat());
            statement.setString(5, pengarsipan.getDus().getIdDus());
            statement.setString(6, pengarsipan.getStatusArsip());
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
    public void updatePenerimaan(Pengarsipan pengarsipan) throws ArsipException {
        final String INSERT = "UPDATE PENGARSIPAN SET "
                + "TANGGAL_TERIMA=?, ID_USER_PENERIMA=?, ID_PEJABAT_PENERIMA=?,ID_DUS=?,STATUS_ARSIP=? "
                + "WHERE CIF=?";

        PreparedStatement statement = null;
        try {
            statement = connection.prepareStatement(INSERT);

            statement.setDate(1, new Date(pengarsipan.getTanggalTerima().getTime()));
            statement.setString(2, pengarsipan.getUserPenerima().getIdUser());
            statement.setString(3, pengarsipan.getPejabatPenerima().getIdPejabat());
            statement.setString(4, pengarsipan.getDus().getIdDus());
            statement.setString(5, pengarsipan.getStatusArsip());
            statement.setString(6, pengarsipan.getDebitur().getCif());
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
    public void insertPengembalian(Pengarsipan pengarsipan) throws ArsipException {
        final String INSERT = "UPDATE PENGARSIPAN SET "
                + "TANGGAL_KEMBALI=?,ID_USER_PENGEMBALI=?,ID_PEJABAT_PENGEMBALI=?,STATUS_ARSIP=?,STATUS_KEMBALI=? "
                + "WHERE CIF=?";

        PreparedStatement statement = null;
        try {
            statement = connection.prepareStatement(INSERT);

            statement.setDate(1, new Date(pengarsipan.getTanggalKembali().getTime()));
            statement.setString(2, pengarsipan.getUserPengembali().getIdUser());
            statement.setString(3, pengarsipan.getPejabatPengembali().getIdPejabat());
            statement.setString(4, pengarsipan.getStatusArsip());
            statement.setString(5, pengarsipan.getStatusKembali());
            statement.setString(6, pengarsipan.getDebitur().getCif());
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
    public List<Pengarsipan> getAllDebitur(int skip, int max) throws ArsipException {
        final String SELECT = "SELECT * FROM PENGARSIPAN LIMIT ?,?";
        List<Pengarsipan> list = new ArrayList<>();

        PreparedStatement statement = null;
        try {
            statement = connection.prepareStatement(SELECT);
            statement.setInt(1, skip);
            statement.setInt(2, max);
            ResultSet set = statement.executeQuery();
            while (set.next()) {
                Pengarsipan pengarsipan = new Pengarsipan();
                pengarsipan.setDebitur(DatabaseConnection.getDebiturDao().getDebitur(set.getString(1)));
                pengarsipan.setTanggalTerima(set.getDate(2));
                pengarsipan.setUserPenerima(DatabaseConnection.getUserDao().getUser(set.getString(3)));
                pengarsipan.setPejabatPenerima(DatabaseConnection.getPejabatDao().getPejabat(set.getString(4)));
                pengarsipan.setDus(DatabaseConnection.getDusDao().getDus(set.getString(5)));
                pengarsipan.setTanggalKembali(set.getDate(6));
                pengarsipan.setUserPengembali(DatabaseConnection.getUserDao().getUser(set.getString(7)));
                pengarsipan.setPejabatPengembali(DatabaseConnection.getPejabatDao().getPejabat(set.getString(8)));
                pengarsipan.setStatusArsip(set.getString(9));
                pengarsipan.setStatusKembali(set.getString(10));

                list.add(pengarsipan);
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
    public Pengarsipan getPengarsipanByCIF(String cif) throws ArsipException {
        final String SELECT = "SELECT * FROM PENGARSIPAN WHERE CIF=?";
        Pengarsipan pengarsipan = null;

        PreparedStatement statement = null;
        try {
            statement = connection.prepareStatement(SELECT);
            statement.setString(1, cif);
            ResultSet set = statement.executeQuery();
            if (set.next()) {
                pengarsipan = new Pengarsipan();
                pengarsipan.setDebitur(DatabaseConnection.getDebiturDao().getDebitur(set.getString(1)));
                pengarsipan.setTanggalTerima(set.getDate(2));
                pengarsipan.setUserPenerima(DatabaseConnection.getUserDao().getUser(set.getString(3)));
                pengarsipan.setPejabatPenerima(DatabaseConnection.getPejabatDao().getPejabat(set.getString(4)));
                pengarsipan.setDus(DatabaseConnection.getDusDao().getDus(set.getString(5)));
                pengarsipan.setTanggalKembali(set.getDate(6));
                pengarsipan.setUserPengembali(DatabaseConnection.getUserDao().getUser(set.getString(7)));
                pengarsipan.setPejabatPengembali(DatabaseConnection.getPejabatDao().getPejabat(set.getString(8)));
                pengarsipan.setStatusArsip(set.getString(9));
                pengarsipan.setStatusKembali(set.getString(10));

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

        return pengarsipan;
    }

    @Override
    public List<Pengarsipan> getDaftarBerkasTersedia(int skip, int max) throws ArsipException {
        final String SELECT = "SELECT * FROM PENGARSIPAN WHERE STATUS_ARSIP = 1 LIMIT ?,?";
        List<Pengarsipan> list = new ArrayList<>();

        PreparedStatement statement = null;
        try {
            statement = connection.prepareStatement(SELECT);
            statement.setInt(1, skip);
            statement.setInt(2, max);
            ResultSet set = statement.executeQuery();
            while (set.next()) {
                Pengarsipan pengarsipan = new Pengarsipan();
                pengarsipan.setDebitur(DatabaseConnection.getDebiturDao().getDebitur(set.getString(1)));
                pengarsipan.setTanggalTerima(set.getDate(2));
                pengarsipan.setUserPenerima(DatabaseConnection.getUserDao().getUser(set.getString(3)));
                pengarsipan.setPejabatPenerima(DatabaseConnection.getPejabatDao().getPejabat(set.getString(4)));
                pengarsipan.setDus(DatabaseConnection.getDusDao().getDus(set.getString(5)));
                pengarsipan.setTanggalKembali(set.getDate(6));
                pengarsipan.setUserPengembali(DatabaseConnection.getUserDao().getUser(set.getString(7)));
                pengarsipan.setPejabatPengembali(DatabaseConnection.getPejabatDao().getPejabat(set.getString(8)));
                pengarsipan.setStatusArsip(set.getString(9));
                pengarsipan.setStatusKembali(set.getString(10));

                list.add(pengarsipan);
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
    public Long getLongPenerimaan() throws ArsipException {
        final String COUNT_SQL = "SELECT COUNT(CIF) as TOTAL FROM PENGARSIPAN WHERE STATUS_ARSIP=1";
        Long total = 0L;
        PreparedStatement statement = null;
        try {
            statement = connection.prepareStatement(COUNT_SQL);
            ResultSet set = statement.executeQuery();
            if (set.next()) {
                total = set.getLong("TOTAL");
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

            return total;
        }
    }

    @Override
    public List<Pengarsipan> getDaftarBerkasTersedia(String cif) throws ArsipException {
        final String SELECT = "SELECT * FROM PENGARSIPAN WHERE STATUS_ARSIP = 1 AND CIF LIKE ?";
        List<Pengarsipan> list = new ArrayList<>();

        PreparedStatement statement = null;
        try {
            statement = connection.prepareStatement(SELECT);
            statement.setString(1, "%" + cif + "%");
            ResultSet set = statement.executeQuery();
            while (set.next()) {
                Pengarsipan pengarsipan = new Pengarsipan();
                pengarsipan.setDebitur(DatabaseConnection.getDebiturDao().getDebitur(set.getString(1)));
                pengarsipan.setTanggalTerima(set.getDate(2));
                pengarsipan.setUserPenerima(DatabaseConnection.getUserDao().getUser(set.getString(3)));
                pengarsipan.setPejabatPenerima(DatabaseConnection.getPejabatDao().getPejabat(set.getString(4)));
                pengarsipan.setDus(DatabaseConnection.getDusDao().getDus(set.getString(5)));
                pengarsipan.setTanggalKembali(set.getDate(6));
                pengarsipan.setUserPengembali(DatabaseConnection.getUserDao().getUser(set.getString(7)));
                pengarsipan.setPejabatPengembali(DatabaseConnection.getPejabatDao().getPejabat(set.getString(8)));
                pengarsipan.setStatusArsip(set.getString(9));
                pengarsipan.setStatusKembali(set.getString(10));

                list.add(pengarsipan);
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
    public Pengarsipan getPengarsipanTersediaByCIF(String cif) throws ArsipException {
        final String SELECT = "SELECT * FROM PENGARSIPAN WHERE CIF=? AND STATUS_ARSIP=1";

        Pengarsipan pengarsipan = null;

        PreparedStatement statement = null;
        try {
            statement = connection.prepareStatement(SELECT);
            statement.setString(1, cif);
            ResultSet set = statement.executeQuery();
            if (set.next()) {
                pengarsipan = new Pengarsipan();
                pengarsipan.setDebitur(DatabaseConnection.getDebiturDao().getDebitur(set.getString(1)));
                pengarsipan.setTanggalTerima(set.getDate(2));
                pengarsipan.setUserPenerima(DatabaseConnection.getUserDao().getUser(set.getString(3)));
                pengarsipan.setPejabatPenerima(DatabaseConnection.getPejabatDao().getPejabat(set.getString(4)));
                pengarsipan.setDus(DatabaseConnection.getDusDao().getDus(set.getString(5)));
                pengarsipan.setTanggalKembali(set.getDate(6));
                pengarsipan.setUserPengembali(DatabaseConnection.getUserDao().getUser(set.getString(7)));
                pengarsipan.setPejabatPengembali(DatabaseConnection.getPejabatDao().getPejabat(set.getString(8)));
                pengarsipan.setStatusArsip(set.getString(9));
                pengarsipan.setStatusKembali(set.getString(10));

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

        return pengarsipan;
    }

    @Override
    public boolean cekPengarsipanTersediaByCIF(String cif) throws ArsipException {
        final String SELECT = "SELECT * FROM PENGARSIPAN WHERE CIF=? AND STATUS_ARSIP=1";
        boolean result = false;

        PreparedStatement statement = null;
        try {
            statement = connection.prepareStatement(SELECT);
            statement.setString(1, cif);
            ResultSet set = statement.executeQuery();
            if (set.next()) {
                result = true;

            } else {
                result = false;
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

        return result;
    }

    @Override
    public Pengarsipan getNewPengarsipanByCIF(String cif) throws ArsipException {
        final String SELECT = "SELECT * FROM PENGARSIPAN WHERE CIF=? AND STATUS_ARSIP=0";

        Pengarsipan pengarsipan = null;

        PreparedStatement statement = null;
        try {
            statement = connection.prepareStatement(SELECT);
            statement.setString(1, cif);
            ResultSet set = statement.executeQuery();
            if (set.next()) {
                pengarsipan = new Pengarsipan();
                pengarsipan.setDebitur(DatabaseConnection.getDebiturDao().getDebitur(set.getString(1)));
                pengarsipan.setTanggalTerima(set.getDate(2));
                pengarsipan.setUserPenerima(DatabaseConnection.getUserDao().getUser(set.getString(3)));
                pengarsipan.setPejabatPenerima(DatabaseConnection.getPejabatDao().getPejabat(set.getString(4)));
                pengarsipan.setDus(DatabaseConnection.getDusDao().getDus(set.getString(5)));
                pengarsipan.setTanggalKembali(set.getDate(6));
                pengarsipan.setUserPengembali(DatabaseConnection.getUserDao().getUser(set.getString(7)));
                pengarsipan.setPejabatPengembali(DatabaseConnection.getPejabatDao().getPejabat(set.getString(8)));
                pengarsipan.setStatusArsip(set.getString(9));
                pengarsipan.setStatusKembali(set.getString(10));

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

        return pengarsipan;
    }

    @Override
    public List<Pengarsipan> getDaftarBerkasTersediaByIdDus(String idDus) throws ArsipException {
        final String SELECT = "SELECT * FROM PENGARSIPAN WHERE STATUS_ARSIP = 1 AND ID_DUS = ?";
        List<Pengarsipan> list = new ArrayList<>();

        PreparedStatement statement = null;
        try {
            statement = connection.prepareStatement(SELECT);
            statement.setString(1, idDus);
            ResultSet set = statement.executeQuery();
            while (set.next()) {
                Pengarsipan pengarsipan = new Pengarsipan();
                pengarsipan.setDebitur(DatabaseConnection.getDebiturDao().getDebitur(set.getString(1)));
                pengarsipan.setTanggalTerima(set.getDate(2));
                pengarsipan.setUserPenerima(DatabaseConnection.getUserDao().getUser(set.getString(3)));
                pengarsipan.setPejabatPenerima(DatabaseConnection.getPejabatDao().getPejabat(set.getString(4)));
                pengarsipan.setDus(DatabaseConnection.getDusDao().getDus(set.getString(5)));
                pengarsipan.setTanggalKembali(set.getDate(6));
                pengarsipan.setUserPengembali(DatabaseConnection.getUserDao().getUser(set.getString(7)));
                pengarsipan.setPejabatPengembali(DatabaseConnection.getPejabatDao().getPejabat(set.getString(8)));
                pengarsipan.setStatusArsip(set.getString(9));
                pengarsipan.setStatusKembali(set.getString(10));

                list.add(pengarsipan);
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
    public List<Pengarsipan> getDaftarPenerimaanBerkas(java.util.Date tanggalMaulai, java.util.Date tanggalSelesai) throws ArsipException {
        final String SELECT = "SELECT * FROM PENGARSIPAN WHERE (TANGGAL_TERIMA >= ?) AND (TANGGAL_TERIMA <= ?)";
        List<Pengarsipan> list = new ArrayList<>();

        PreparedStatement statement = null;
        try {
            statement = connection.prepareStatement(SELECT);
            statement.setDate(1, new Date(tanggalMaulai.getTime()));
            statement.setDate(2, new Date(tanggalSelesai.getTime()));
            ResultSet set = statement.executeQuery();
            while (set.next()) {
                Pengarsipan pengarsipan = new Pengarsipan();
                pengarsipan.setDebitur(DatabaseConnection.getDebiturDao().getDebitur(set.getString(1)));
                pengarsipan.setTanggalTerima(set.getDate(2));
                pengarsipan.setUserPenerima(DatabaseConnection.getUserDao().getUser(set.getString(3)));
                pengarsipan.setPejabatPenerima(DatabaseConnection.getPejabatDao().getPejabat(set.getString(4)));
                pengarsipan.setDus(DatabaseConnection.getDusDao().getDus(set.getString(5)));
                pengarsipan.setTanggalKembali(set.getDate(6));
                pengarsipan.setUserPengembali(DatabaseConnection.getUserDao().getUser(set.getString(7)));
                pengarsipan.setPejabatPengembali(DatabaseConnection.getPejabatDao().getPejabat(set.getString(8)));
                pengarsipan.setStatusArsip(set.getString(9));
                pengarsipan.setStatusKembali(set.getString(10));

                list.add(pengarsipan);
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
    public List<Pengarsipan> getDaftarPengembalianBerkas(java.util.Date tanggalMaulai, java.util.Date tanggalSelesai) throws ArsipException {
        final String SELECT = "SELECT * FROM PENGARSIPAN WHERE (TANGGAL_KEMBALI >= ?) AND (TANGGAL_KEMBALI <= ?)";
        List<Pengarsipan> list = new ArrayList<>();

        PreparedStatement statement = null;
        try {
            statement = connection.prepareStatement(SELECT);
            statement.setDate(1, new Date(tanggalMaulai.getTime()));
            statement.setDate(2, new Date(tanggalSelesai.getTime()));
            ResultSet set = statement.executeQuery();
            while (set.next()) {
                Pengarsipan pengarsipan = new Pengarsipan();
                pengarsipan.setDebitur(DatabaseConnection.getDebiturDao().getDebitur(set.getString(1)));
                pengarsipan.setTanggalTerima(set.getDate(2));
                pengarsipan.setUserPenerima(DatabaseConnection.getUserDao().getUser(set.getString(3)));
                pengarsipan.setPejabatPenerima(DatabaseConnection.getPejabatDao().getPejabat(set.getString(4)));
                pengarsipan.setDus(DatabaseConnection.getDusDao().getDus(set.getString(5)));
                pengarsipan.setTanggalKembali(set.getDate(6));
                pengarsipan.setUserPengembali(DatabaseConnection.getUserDao().getUser(set.getString(7)));
                pengarsipan.setPejabatPengembali(DatabaseConnection.getPejabatDao().getPejabat(set.getString(8)));
                pengarsipan.setStatusArsip(set.getString(9));
                pengarsipan.setStatusKembali(set.getString(10));

                list.add(pengarsipan);
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
    public List<Pengarsipan> getDaftarBerkasTersediaByNama(String nama) throws ArsipException {
        final String SELECT = "SELECT * FROM PENGARSIPAN "
                + "INNER JOIN debitur ON (pengarsipan.cif = debitur.cif) WHERE debitur.`nama` LIKE ? AND STATUS_ARSIP=1";

        List<Pengarsipan> list = new ArrayList<>();

        PreparedStatement statement = null;
        try {
            statement = connection.prepareStatement(SELECT);
            statement.setString(1, "%" + nama + "%");
            ResultSet set = statement.executeQuery();
            while (set.next()) {
                Pengarsipan pengarsipan = new Pengarsipan();
                pengarsipan.setDebitur(DatabaseConnection.getDebiturDao().getDebitur(set.getString(1)));
                pengarsipan.setTanggalTerima(set.getDate(2));
                pengarsipan.setUserPenerima(DatabaseConnection.getUserDao().getUser(set.getString(3)));
                pengarsipan.setPejabatPenerima(DatabaseConnection.getPejabatDao().getPejabat(set.getString(4)));
                pengarsipan.setDus(DatabaseConnection.getDusDao().getDus(set.getString(5)));
                pengarsipan.setTanggalKembali(set.getDate(6));
                pengarsipan.setUserPengembali(DatabaseConnection.getUserDao().getUser(set.getString(7)));
                pengarsipan.setPejabatPengembali(DatabaseConnection.getPejabatDao().getPejabat(set.getString(8)));
                pengarsipan.setStatusArsip(set.getString(9));
                pengarsipan.setStatusKembali(set.getString(10));
                list.add(pengarsipan);
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
