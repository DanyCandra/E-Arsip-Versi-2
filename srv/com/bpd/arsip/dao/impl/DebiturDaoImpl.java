/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bpd.arsip.dao.impl;

import com.bpd.arsip.dao.DebiturDao;
import com.bpd.arsip.database.DatabaseConnection;
import com.bpd.arsip.entitas.Debitur;
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
public class DebiturDaoImpl implements DebiturDao {

    private final Connection connection;

    public DebiturDaoImpl(Connection connection) {
        this.connection = connection;
    }

    @Override
    public void insertDebitur(Debitur debitur) throws ArsipException {
        final String INSERT = "INSERT INTO DEBITUR "
                + "(CIF,NAMA,TEMPAT_LAHIR,TANGGAL_LAHIR,NIK,ALAMAT,KELURAHAN,KECAMATAN,TELEPON,"
                + "SK_CPNS,SK_PENGANGKATAN,SK_TERAKHIR,TASPEN,SK_PENSIUN,KARIP,SHM,SHT,"
                + "IJAZAH,LAINNYA,ID_INSTANSI, "
                + "SP2K, SURAT_PERJANJIAN, SK_POTONG_TERMIN, SPK, WARKAT_DEPOSITO,SK_PENCAIRAN_DEPOSITO, SHGB,"
                + "IMB, COVER_NOTE, AJB, SKMHT, APHT, BPKB, KWITANSI, FIDUCIA, LAINNYA2, PERMOHONAN_KREDIT,"
                + "SIUP,TANGGAL_SIUP,TDP,TANGGAL_TDP) "
                + "VALUES "
                + "("
                + "?,?,?,?,?,?,?,?,?,?,"
                + "?,?,?,?,?,?,?,?,?,?,"
                + "?,?,?,?,?,?,?,?,?,?,"
                + "?,?,?,?,?,?,?,?,?,?,?)";

        PreparedStatement statement = null;
        try {
            statement = connection.prepareStatement(INSERT);

            statement.setString(1, debitur.getCif());
            statement.setString(2, debitur.getNama());
            statement.setString(3, debitur.getTempatLahir());
            statement.setDate(4, new Date(debitur.getTanggalLahir().getTime()));
            statement.setString(5, debitur.getNik());
            statement.setString(6, debitur.getAlamat());
            statement.setString(7, debitur.getKelurahan());
            statement.setString(8, debitur.getKecamatan());
            statement.setString(9, debitur.getTelepon());
            statement.setString(10, debitur.getSkCpns());
            statement.setString(11, debitur.getSkPengangkatan());
            statement.setString(12, debitur.getSkTerakhir());
            statement.setString(13, debitur.getTaspen());
            statement.setString(14, debitur.getSkPensiun());
            statement.setString(15, debitur.getKarip());
            statement.setString(16, debitur.getShm());
            statement.setString(17, debitur.getSht());
            statement.setString(18, debitur.getIjazah());
            statement.setString(19, debitur.getLainnya());
            statement.setString(20, debitur.getInstansi().getIdInstansi());
            statement.setString(21, debitur.getSp2k());
            statement.setString(22, debitur.getSuratPerjanjian());
            statement.setString(23, debitur.getSkPotongTermin());
            statement.setString(24, debitur.getSpk());
            statement.setString(25, debitur.getWarkatDeposito());
            statement.setString(26, debitur.getSkPencairanDeposito());
            statement.setString(27, debitur.getShgb());
            statement.setString(28, debitur.getImb());
            statement.setString(29, debitur.getCoverNote());
            statement.setString(30, debitur.getAjb());
            statement.setString(31, debitur.getSkmht());
            statement.setString(32, debitur.getApht());
            statement.setString(33, debitur.getBpkb());
            statement.setString(34, debitur.getKwitansi());
            statement.setString(35, debitur.getFiducia());
            statement.setString(36, debitur.getLainnya2());
            statement.setString(37, debitur.getPermohonanKredit());
            statement.setString(38, debitur.getSiup());

            if (debitur.getTanggalSiup() != null) {
                statement.setDate(39, new Date(debitur.getTanggalSiup().getTime()));
            } else {
                statement.setDate(39, null);
            }
            
            statement.setString(40, debitur.getTdp());
            
            if (debitur.getTanggalTdp() != null) {
                statement.setDate(41, new Date(debitur.getTanggalTdp().getTime()));
            } else {
                statement.setDate(41, null);
            }
            
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
    public void updateDebitur(Debitur debitur) throws ArsipException {
        final String UPDATE = "UPDATE  DEBITUR "
                + "SET NAMA=?,TEMPAT_LAHIR=?,TANGGAL_LAHIR=?,NIK=?,ALAMAT=?,KELURAHAN=?,KECAMATAN=?,TELEPON=?, "
                + "SK_CPNS=?,SK_PENGANGKATAN=?,SK_TERAKHIR=?,TASPEN=?,SK_PENSIUN=?,KARIP=?,SHM=?,SHT=?,IJAZAH=?,LAINNYA=?,ID_INSTANSI=?, "
                + "SP2K=?, SURAT_PERJANJIAN=?, SK_POTONG_TERMIN=?, SPK=?, WARKAT_DEPOSITO=?,SK_PENCAIRAN_DEPOSITO=?, SHGB=?,"
                + "IMB=?, COVER_NOTE=?, AJB=?, SKMHT=?, APHT=?, BPKB=?, KWITANSI=?, FIDUCIA=?, LAINNYA2=?, PERMOHONAN_KREDIT=?, "
                + "SIUP=?, TANGGAL_SIUP=?, TDP=?, TANGGAL_TDP=? "
                + "WHERE CIF=?";

        PreparedStatement statement = null;
        try {
            statement = connection.prepareStatement(UPDATE);

            statement.setString(1, debitur.getNama());
            statement.setString(2, debitur.getTempatLahir());
            statement.setDate(3, new Date(debitur.getTanggalLahir().getTime()));
            statement.setString(4, debitur.getNik());
            statement.setString(5, debitur.getAlamat());
            statement.setString(6, debitur.getKelurahan());
            statement.setString(7, debitur.getKecamatan());
            statement.setString(8, debitur.getTelepon());
            statement.setString(9, debitur.getSkCpns());
            statement.setString(10, debitur.getSkPengangkatan());
            statement.setString(11, debitur.getSkTerakhir());
            statement.setString(12, debitur.getTaspen());
            statement.setString(13, debitur.getSkPensiun());
            statement.setString(14, debitur.getKarip());
            statement.setString(15, debitur.getShm());
            statement.setString(16, debitur.getSht());
            statement.setString(17, debitur.getIjazah());
            statement.setString(18, debitur.getLainnya());
            statement.setString(19, debitur.getInstansi().getIdInstansi());
            statement.setString(20, debitur.getSp2k());
            statement.setString(21, debitur.getSuratPerjanjian());
            statement.setString(22, debitur.getSkPotongTermin());
            statement.setString(23, debitur.getSpk());
            statement.setString(24, debitur.getWarkatDeposito());
            statement.setString(25, debitur.getSkPencairanDeposito());
            statement.setString(26, debitur.getShgb());
            statement.setString(27, debitur.getImb());
            statement.setString(28, debitur.getCoverNote());
            statement.setString(29, debitur.getAjb());
            statement.setString(30, debitur.getSkmht());
            statement.setString(31, debitur.getApht());
            statement.setString(32, debitur.getBpkb());
            statement.setString(33, debitur.getKwitansi());
            statement.setString(34, debitur.getFiducia());
            statement.setString(35, debitur.getLainnya2());
            statement.setString(36, debitur.getPermohonanKredit());
            statement.setString(37, debitur.getSiup());
            if (debitur.getTanggalSiup() != null) {
                statement.setDate(38, new Date(debitur.getTanggalSiup().getTime()));
            } else {
                statement.setDate(38, null);
            }
            
            statement.setString(39, debitur.getTdp());
            
            if (debitur.getTanggalTdp() != null) {
                statement.setDate(40, new Date(debitur.getTanggalTdp().getTime()));
            } else {
                statement.setDate(40, null);
            }
            statement.setString(41, debitur.getCif());
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
    public Debitur getDebitur(String cif) throws ArsipException {
        final String SELECT = "SELECT * FROM DEBITUR WHERE CIF=?";

        Debitur debitur = null;
        PreparedStatement statement = null;
        try {
            statement = connection.prepareStatement(SELECT);
            statement.setString(1, cif);
            ResultSet set = statement.executeQuery();
            if (set.next()) {
                debitur = new Debitur();
                debitur.setCif(set.getString(1));
                debitur.setNama(set.getString(2));
                debitur.setTempatLahir(set.getString(3));
                debitur.setTanggalLahir(set.getDate(4));
                debitur.setNik(set.getString(5));
                debitur.setAlamat(set.getString(6));
                debitur.setKelurahan(set.getString(7));
                debitur.setKecamatan(set.getString(8));
                debitur.setTelepon(set.getString(9));
                debitur.setSkCpns(set.getString(10));
                debitur.setSkPengangkatan(set.getString(11));
                debitur.setSkTerakhir(set.getString(12));
                debitur.setTaspen(set.getString(13));
                debitur.setSkPensiun(set.getString(14));
                debitur.setKarip(set.getString(15));
                debitur.setShm(set.getString(16));
                debitur.setSht(set.getString(17));
                debitur.setIjazah(set.getString(18));
                debitur.setLainnya(set.getString(19));
                debitur.setInstansi(DatabaseConnection.getInstansiDao().getInstansi(set.getString(20)));
                debitur.setSp2k(set.getString(21));
                debitur.setSuratPerjanjian(set.getString(22));
                debitur.setSkPotongTermin(set.getString(23));
                debitur.setSpk(set.getString(24));
                debitur.setWarkatDeposito(set.getString(25));
                debitur.setSkPencairanDeposito(set.getString(26));
                debitur.setShgb(set.getString(27));
                debitur.setImb(set.getString(28));
                debitur.setCoverNote(set.getString(29));
                debitur.setAjb(set.getString(30));
                debitur.setSkmht(set.getString(31));
                debitur.setApht(set.getString(32));
                debitur.setBpkb(set.getString(33));
                debitur.setKwitansi(set.getString(34));
                debitur.setFiducia(set.getString(35));
                debitur.setLainnya2(set.getString(36));
                debitur.setPermohonanKredit(set.getString(37));
                debitur.setSiup(set.getString(38));
                debitur.setTanggalSiup(set.getDate(39));
                debitur.setTdp(set.getString(40));
                debitur.setTanggalTdp((set.getDate(41)));
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

        return debitur;
    }

    @Override
    public List<Debitur> getAllDebitur(int skip, int max) throws ArsipException {
        final String SELECT = "SELECT * FROM DEBITUR LIMIT ?,?";
        List<Debitur> list = new ArrayList<Debitur>();

        PreparedStatement statement = null;
        try {
            statement = connection.prepareStatement(SELECT);
            statement.setInt(1, skip);
            statement.setInt(2, max);
            ResultSet set = statement.executeQuery();
            if (set.next()) {
                Debitur debitur = new Debitur();
                debitur.setCif(set.getString(1));
                debitur.setNama(set.getString(2));
                debitur.setTempatLahir(set.getString(3));
                debitur.setTanggalLahir(set.getDate(4));
                debitur.setNik(set.getString(5));
                debitur.setAlamat(set.getString(6));
                debitur.setKelurahan(set.getString(7));
                debitur.setKecamatan(set.getString(8));
                debitur.setTelepon(set.getString(9));
                debitur.setSkCpns(set.getString(10));
                debitur.setSkPengangkatan(set.getString(11));
                debitur.setSkTerakhir(set.getString(12));
                debitur.setTaspen(set.getString(13));
                debitur.setSkPensiun(set.getString(14));
                debitur.setKarip(set.getString(15));
                debitur.setShm(set.getString(16));
                debitur.setSht(set.getString(17));
                debitur.setIjazah(set.getString(18));
                debitur.setLainnya(set.getString(19));
                debitur.setInstansi(DatabaseConnection.getInstansiDao().getInstansi(set.getString(20)));
                debitur.setSp2k(set.getString(21));
                debitur.setSuratPerjanjian(set.getString(22));
                debitur.setSkPotongTermin(set.getString(23));
                debitur.setSpk(set.getString(24));
                debitur.setWarkatDeposito(set.getString(25));
                debitur.setSkPencairanDeposito(set.getString(26));
                debitur.setShgb(set.getString(27));
                debitur.setImb(set.getString(28));
                debitur.setCoverNote(set.getString(29));
                debitur.setAjb(set.getString(30));
                debitur.setSkmht(set.getString(31));
                debitur.setApht(set.getString(32));
                debitur.setBpkb(set.getString(33));
                debitur.setKwitansi(set.getString(34));
                debitur.setFiducia(set.getString(35));
                debitur.setLainnya2(set.getString(36));
                debitur.setPermohonanKredit(set.getString(37));
                debitur.setSiup(set.getString(38));
                debitur.setTanggalSiup(set.getDate(39));
                debitur.setTdp(set.getString(40));
                debitur.setTanggalTdp((set.getDate(41)));
                list.add(debitur);
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
