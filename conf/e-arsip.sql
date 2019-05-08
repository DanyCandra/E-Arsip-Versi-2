-- --------------------------------------------------------
-- Host:                         localhost
-- Server version:               5.7.24 - MySQL Community Server (GPL)
-- Server OS:                    Win64
-- HeidiSQL Version:             9.5.0.5332
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


-- Dumping database structure for e-arsip
DROP DATABASE IF EXISTS `e-arsip`;
CREATE DATABASE IF NOT EXISTS `e-arsip` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `e-arsip`;

-- Dumping structure for table e-arsip.cis
DROP TABLE IF EXISTS `cis`;
CREATE TABLE IF NOT EXISTS `cis` (
  `id_cis` varchar(20) NOT NULL,
  `cif` varchar(20) DEFAULT NULL,
  `cif_cis` varchar(20) DEFAULT NULL,
  `no_pinjaman` varchar(20) DEFAULT NULL,
  `tanggal_realisasi` date DEFAULT NULL,
  `tanggal_mulai` date DEFAULT NULL,
  `tanggal_selesai` date DEFAULT NULL,
  `jumlah_pertanggungan` double(15,0) DEFAULT NULL,
  PRIMARY KEY (`id_cis`),
  UNIQUE KEY `no_pinjaman` (`no_pinjaman`),
  KEY `cif` (`cif`),
  CONSTRAINT `cis_fk` FOREIGN KEY (`cif`) REFERENCES `debitur` (`cif`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Dumping data for table e-arsip.cis: ~0 rows (approximately)
DELETE FROM `cis`;
/*!40000 ALTER TABLE `cis` DISABLE KEYS */;
/*!40000 ALTER TABLE `cis` ENABLE KEYS */;

-- Dumping structure for table e-arsip.debitur
DROP TABLE IF EXISTS `debitur`;
CREATE TABLE IF NOT EXISTS `debitur` (
  `cif` varchar(20) NOT NULL DEFAULT ' ',
  `nama` varchar(50) NOT NULL DEFAULT ' ',
  `tempat_lahir` varchar(20) NOT NULL DEFAULT ' ',
  `tanggal_lahir` date NOT NULL,
  `nik` varchar(30) NOT NULL DEFAULT ' ',
  `alamat` varchar(50) NOT NULL DEFAULT ' ',
  `kelurahan` varchar(30) NOT NULL DEFAULT ' ',
  `kecamatan` varchar(30) NOT NULL DEFAULT ' ',
  `telepon` varchar(12) NOT NULL DEFAULT ' ',
  `sk_cpns` varchar(50) DEFAULT ' ',
  `sk_pengangkatan` varchar(50) DEFAULT ' ',
  `sk_terakhir` varchar(50) DEFAULT ' ',
  `taspen` varchar(50) DEFAULT ' ',
  `sk_pensiun` varchar(50) DEFAULT ' ',
  `karip` varchar(50) DEFAULT ' ',
  `shm` varchar(50) DEFAULT ' ',
  `sht` varchar(50) DEFAULT ' ',
  `ijazah` varchar(50) DEFAULT ' ',
  `lainnya` varchar(50) DEFAULT ' ',
  `id_instansi` varchar(20) DEFAULT ' ',
  `sp2k` varchar(50) DEFAULT ' ',
  `surat_perjanjian` varchar(50) DEFAULT ' ',
  `sk_potong_termin` varchar(50) DEFAULT ' ',
  `spk` varchar(50) DEFAULT ' ',
  `warkat_deposito` varchar(50) DEFAULT ' ',
  `sk_pencairan_deposito` varchar(50) DEFAULT ' ',
  `shgb` varchar(50) DEFAULT ' ',
  `imb` varchar(50) DEFAULT ' ',
  `cover_note` varchar(50) DEFAULT ' ',
  `ajb` varchar(50) DEFAULT ' ',
  `skmht` varchar(50) DEFAULT ' ',
  `apht` varchar(50) DEFAULT ' ',
  `bpkb` varchar(50) DEFAULT ' ',
  `kwitansi` varchar(50) DEFAULT ' ',
  `fiducia` varchar(50) DEFAULT ' ',
  `lainnya2` varchar(50) DEFAULT ' ',
  `permohonan_kredit` varchar(50) DEFAULT ' ',
  `siup` varchar(50) DEFAULT ' ',
  `tanggal_siup` date DEFAULT NULL,
  `tdp` varchar(50) DEFAULT '',
  `tanggal_tdp` date DEFAULT NULL,
  PRIMARY KEY (`cif`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Dumping data for table e-arsip.debitur: ~0 rows (approximately)
DELETE FROM `debitur`;
/*!40000 ALTER TABLE `debitur` DISABLE KEYS */;
INSERT INTO `debitur` (`cif`, `nama`, `tempat_lahir`, `tanggal_lahir`, `nik`, `alamat`, `kelurahan`, `kecamatan`, `telepon`, `sk_cpns`, `sk_pengangkatan`, `sk_terakhir`, `taspen`, `sk_pensiun`, `karip`, `shm`, `sht`, `ijazah`, `lainnya`, `id_instansi`, `sp2k`, `surat_perjanjian`, `sk_potong_termin`, `spk`, `warkat_deposito`, `sk_pencairan_deposito`, `shgb`, `imb`, `cover_note`, `ajb`, `skmht`, `apht`, `bpkb`, `kwitansi`, `fiducia`, `lainnya2`, `permohonan_kredit`, `siup`, `tanggal_siup`, `tdp`, `tanggal_tdp`) VALUES
	('01234567', 'Dany Candra Febrianto', 'Purwokerto', '1991-02-20', '3302242002920001', 'Jl Sarwodadi V No 6', 'Purwokerto Kidul', 'Purwokerto Selatan', '089667194026', '1', '1', '1', '', '', '', '', '', '', '', 'IS-2042019-001-4', '1', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '1', '', NULL, '', NULL),
	('12345678', 'FEBRIANTO CANDRA', 'PURWOKERTO', '1991-04-24', '3302222002920001', 'JL SUDIRMAN 82', 'KRANJI', 'PURWOKERTO TIMUR', '0281 634572', 'SK/CPNS/2017', 'SK/PNS/2019', '', '', '', '', '', '', '', '', 'IS-2042019-002-7', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '1-220-02', '', NULL, '', NULL);
/*!40000 ALTER TABLE `debitur` ENABLE KEYS */;

-- Dumping structure for table e-arsip.dus
DROP TABLE IF EXISTS `dus`;
CREATE TABLE IF NOT EXISTS `dus` (
  `id_dus` varchar(20) NOT NULL,
  `id_lantai` varchar(20) DEFAULT NULL,
  `id_rak` varchar(20) DEFAULT NULL,
  `quota` int(2) DEFAULT '10',
  PRIMARY KEY (`id_dus`),
  KEY `id_lantai` (`id_lantai`),
  KEY `id_rak` (`id_rak`),
  CONSTRAINT `tm_lokasi_fk` FOREIGN KEY (`id_lantai`) REFERENCES `lantai` (`id_lantai`),
  CONSTRAINT `tm_lokasi_fk1` FOREIGN KEY (`id_rak`) REFERENCES `rak` (`id_rak`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Dumping data for table e-arsip.dus: ~0 rows (approximately)
DELETE FROM `dus`;
/*!40000 ALTER TABLE `dus` DISABLE KEYS */;
/*!40000 ALTER TABLE `dus` ENABLE KEYS */;

-- Dumping structure for table e-arsip.instansi
DROP TABLE IF EXISTS `instansi`;
CREATE TABLE IF NOT EXISTS `instansi` (
  `id_instansi` varchar(20) NOT NULL,
  `nama_instansi` varchar(50) DEFAULT NULL,
  `alamat` varchar(100) DEFAULT NULL,
  `telepon` varchar(12) DEFAULT NULL,
  PRIMARY KEY (`id_instansi`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Dumping data for table e-arsip.instansi: ~2 rows (approximately)
DELETE FROM `instansi`;
/*!40000 ALTER TABLE `instansi` DISABLE KEYS */;
/*!40000 ALTER TABLE `instansi` ENABLE KEYS */;

-- Dumping structure for table e-arsip.lantai
DROP TABLE IF EXISTS `lantai`;
CREATE TABLE IF NOT EXISTS `lantai` (
  `id_lantai` varchar(20) NOT NULL,
  `nama_lantai` varchar(3) DEFAULT NULL,
  PRIMARY KEY (`id_lantai`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Dumping data for table e-arsip.lantai: ~1 rows (approximately)
DELETE FROM `lantai`;
/*!40000 ALTER TABLE `lantai` DISABLE KEYS */;
INSERT INTO `lantai` (`id_lantai`, `nama_lantai`) VALUES
	('LN-2042019-001-8', '3');
/*!40000 ALTER TABLE `lantai` ENABLE KEYS */;

-- Dumping structure for table e-arsip.pejabat
DROP TABLE IF EXISTS `pejabat`;
CREATE TABLE IF NOT EXISTS `pejabat` (
  `id_pejabat` varchar(20) NOT NULL,
  `nama_pejabat` varchar(50) DEFAULT NULL,
  `jabatan` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`id_pejabat`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Dumping data for table e-arsip.pejabat: ~2 rows (approximately)
DELETE FROM `pejabat`;
/*!40000 ALTER TABLE `pejabat` DISABLE KEYS */;
/*!40000 ALTER TABLE `pejabat` ENABLE KEYS */;

-- Dumping structure for table e-arsip.pengarsipan
DROP TABLE IF EXISTS `pengarsipan`;
CREATE TABLE IF NOT EXISTS `pengarsipan` (
  `cif` varchar(20) NOT NULL,
  `tanggal_terima` date NOT NULL,
  `id_user_penerima` varchar(20) DEFAULT NULL,
  `id_pejabat_penerima` varchar(20) DEFAULT NULL,
  `id_dus` varchar(20) DEFAULT NULL,
  `tanggal_kembali` date DEFAULT NULL,
  `id_user_pengembali` varchar(20) DEFAULT NULL,
  `id_pejabat_pengembali` varchar(20) DEFAULT NULL,
  `status_arsip` varchar(20) DEFAULT '1' COMMENT '1=ADA, 0=TIDAK ADA',
  `status_kembali` varchar(20) DEFAULT NULL COMMENT 'PELUNASAN, PENGAMBILAN',
  PRIMARY KEY (`cif`),
  KEY `id_user_penerima` (`id_user_penerima`),
  KEY `id_pejabat_penerima` (`id_pejabat_penerima`),
  KEY `id_user_pengembali` (`id_user_pengembali`),
  KEY `id_pejabat_pengembali` (`id_pejabat_pengembali`),
  CONSTRAINT `pengarsipan_fk` FOREIGN KEY (`cif`) REFERENCES `debitur` (`cif`),
  CONSTRAINT `pengarsipan_fk1` FOREIGN KEY (`id_user_penerima`) REFERENCES `user` (`id_user`),
  CONSTRAINT `pengarsipan_fk2` FOREIGN KEY (`id_pejabat_penerima`) REFERENCES `pejabat` (`id_pejabat`),
  CONSTRAINT `pengarsipan_fk4` FOREIGN KEY (`id_user_pengembali`) REFERENCES `user` (`id_user`),
  CONSTRAINT `pengarsipan_fk5` FOREIGN KEY (`id_pejabat_pengembali`) REFERENCES `pejabat` (`id_pejabat`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Dumping data for table e-arsip.pengarsipan: ~0 rows (approximately)
DELETE FROM `pengarsipan`;
/*!40000 ALTER TABLE `pengarsipan` DISABLE KEYS */;
/*!40000 ALTER TABLE `pengarsipan` ENABLE KEYS */;

-- Dumping structure for table e-arsip.quota
DROP TABLE IF EXISTS `quota`;
CREATE TABLE IF NOT EXISTS `quota` (
  `id` int(11) DEFAULT NULL,
  `isi_dus` int(11) DEFAULT NULL,
  `isi_rak` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Dumping data for table e-arsip.quota: ~0 rows (approximately)
DELETE FROM `quota`;
/*!40000 ALTER TABLE `quota` DISABLE KEYS */;
INSERT INTO `quota` (`id`, `isi_dus`, `isi_rak`) VALUES
	(1, 10, 100);
/*!40000 ALTER TABLE `quota` ENABLE KEYS */;

-- Dumping structure for table e-arsip.rak
DROP TABLE IF EXISTS `rak`;
CREATE TABLE IF NOT EXISTS `rak` (
  `id_rak` varchar(20) NOT NULL,
  `nama_rak` varchar(2) DEFAULT NULL,
  `quota` int(2) DEFAULT '20',
  PRIMARY KEY (`id_rak`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Dumping data for table e-arsip.rak: ~0 rows (approximately)
DELETE FROM `rak`;
/*!40000 ALTER TABLE `rak` DISABLE KEYS */;
/*!40000 ALTER TABLE `rak` ENABLE KEYS */;

-- Dumping structure for table e-arsip.user
DROP TABLE IF EXISTS `user`;
CREATE TABLE IF NOT EXISTS `user` (
  `id_user` varchar(20) NOT NULL,
  `username` varchar(20) DEFAULT NULL,
  `password` varchar(20) DEFAULT NULL,
  `nama` varchar(50) DEFAULT NULL,
  `previllage` int(11) DEFAULT '0' COMMENT '0 : User, 1 : Admin',
  PRIMARY KEY (`id_user`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Dumping data for table e-arsip.user: ~3 rows (approximately)
DELETE FROM `user`;
/*!40000 ALTER TABLE `user` DISABLE KEYS */;
INSERT INTO `user` (`id_user`, `username`, `password`, `nama`, `previllage`) VALUES
	('US-2042019-001-4', 'ADMIN', 'ADMIN', 'DEFAULT ADMIN', 1),
	('US-2042019-001-6', 'USER', 'USER', 'DEFAULT USER', 0);
/*!40000 ALTER TABLE `user` ENABLE KEYS */;

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
