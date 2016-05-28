-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: May 28, 2016 at 08:11 PM
-- Server version: 10.1.10-MariaDB
-- PHP Version: 5.6.19

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `db_sirmi`
--

-- --------------------------------------------------------

--
-- Table structure for table `m_gol_tarif`
--

CREATE TABLE `m_gol_tarif` (
  `gol_tarif` varchar(4) NOT NULL,
  `tarif` decimal(10,2) NOT NULL,
  `jenis` enum('Per 12 Jam','Per Hari') NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `m_gol_tarif`
--

INSERT INTO `m_gol_tarif` (`gol_tarif`, `tarif`, `jenis`) VALUES
('TR01', '750000.00', 'Per Hari'),
('TR02', '350000.00', 'Per 12 Jam');

-- --------------------------------------------------------

--
-- Table structure for table `m_karyawan`
--

CREATE TABLE `m_karyawan` (
  `id` int(11) NOT NULL,
  `kode_karyawan` varchar(4) NOT NULL,
  `nama_karyawan` varchar(45) NOT NULL,
  `tanggal_lahir` date NOT NULL,
  `kontak_karyawan` varchar(13) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `m_karyawan`
--

INSERT INTO `m_karyawan` (`id`, `kode_karyawan`, `nama_karyawan`, `tanggal_lahir`, `kontak_karyawan`) VALUES
(1, 'K001', 'Rizqan Arief', '1995-05-12', '08981197001'),
(12, 'K003', 'Louis Van Gaal', '1994-05-12', '08981197003');

-- --------------------------------------------------------

--
-- Table structure for table `m_mobil`
--

CREATE TABLE `m_mobil` (
  `kode_mobil` varchar(12) NOT NULL,
  `nama_mobil` varchar(50) NOT NULL,
  `merk_mobil` varchar(10) NOT NULL,
  `nopol_mobil` varchar(12) NOT NULL,
  `jenis_mobil` varchar(10) NOT NULL,
  `tahun_pembuatan` varchar(4) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `m_mobil`
--

INSERT INTO `m_mobil` (`kode_mobil`, `nama_mobil`, `merk_mobil`, `nopol_mobil`, `jenis_mobil`, `tahun_pembuatan`) VALUES
('MHONM15001', 'MOBILIO', 'HONDA', 'DA 2452 OB', 'SPORT', '2015'),
('MSUZE15003', 'ERTIGA', 'SUZUKI', 'DA 8900 YUI', 'MPV', '2015'),
('MTOYA14002', 'AVANZA', 'TOYOTA', 'DA 8888 TC', 'MPV', '2014'),
('MTOYI16004', 'INNOVA', 'TOYOTA', 'DA 7888 TY', 'MPV', '2016');

-- --------------------------------------------------------

--
-- Table structure for table `t_pengembalian`
--

CREATE TABLE `t_pengembalian` (
  `kode_transaksi_kembali` varchar(20) NOT NULL,
  `kode_transaksi` varchar(20) NOT NULL,
  `tgl_jam_kembali` datetime NOT NULL,
  `denda` double(10,2) NOT NULL,
  `kode_karyawan` varchar(4) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `t_penyewaan`
--

CREATE TABLE `t_penyewaan` (
  `kode_transaksi` varchar(20) NOT NULL,
  `kode_tarif` int(11) NOT NULL,
  `nama` varchar(50) NOT NULL,
  `alamat` text NOT NULL,
  `telp` varchar(13) NOT NULL,
  `jaminan` varchar(25) NOT NULL,
  `tgl_jam_keluar` datetime NOT NULL,
  `tgl_jam_kembali` datetime NOT NULL,
  `total_bayar` decimal(10,2) NOT NULL,
  `tanggal_transaksi` datetime NOT NULL,
  `kode_karyawan` varchar(4) NOT NULL,
  `status` varchar(1) NOT NULL DEFAULT 'J'
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `t_penyewaan`
--

INSERT INTO `t_penyewaan` (`kode_transaksi`, `kode_tarif`, `nama`, `alamat`, `telp`, `jaminan`, `tgl_jam_keluar`, `tgl_jam_kembali`, `total_bayar`, `tanggal_transaksi`, `kode_karyawan`, `status`) VALUES
('TS160526173433', 9, 'Ali', 'Loktabat	', '08981197003', 'KTP', '2016-05-26 17:34:33', '2016-05-27 05:34:33', '350000.00', '2016-05-26 17:34:33', 'K001', 'J'),
('TS160526173738', 9, 'Ali', 'Sungai Ulin	', '08981197003', 'KTP', '2016-05-26 17:37:38', '2016-05-27 05:37:38', '350000.00', '2016-05-26 17:37:38', 'K001', 'J'),
('TS160526174654', 9, 'Admin', 'Testing	', '08981197003', 'SIM', '2016-05-26 17:46:54', '2016-05-27 05:46:54', '350000.00', '2016-05-26 17:46:54', 'K001', 'J'),
('TS160526174756', 8, 'Admin', 'testing	', '08981197003', 'KTP', '2016-05-26 17:47:56', '2016-05-27 17:47:56', '1500000.00', '2016-05-26 17:47:56', 'K001', 'J');

-- --------------------------------------------------------

--
-- Table structure for table `t_tarif_mobil`
--

CREATE TABLE `t_tarif_mobil` (
  `kode_tarif` int(11) NOT NULL,
  `gol_tarif` varchar(4) NOT NULL,
  `kode_mobil` varchar(12) NOT NULL,
  `status` varchar(2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `t_tarif_mobil`
--

INSERT INTO `t_tarif_mobil` (`kode_tarif`, `gol_tarif`, `kode_mobil`, `status`) VALUES
(8, 'TR01', 'MHONM15001', 'NA'),
(9, 'TR02', 'MSUZE15003', 'NA');

-- --------------------------------------------------------

--
-- Table structure for table `t_user`
--

CREATE TABLE `t_user` (
  `kode_user` int(11) NOT NULL,
  `username` varchar(10) NOT NULL,
  `password` varchar(25) NOT NULL,
  `hak_akses` enum('Admin','Karyawan') NOT NULL,
  `kode_karyawan` varchar(4) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `t_user`
--

INSERT INTO `t_user` (`kode_user`, `username`, `password`, `hak_akses`, `kode_karyawan`) VALUES
(1, 'admin', 'admin', 'Admin', 'K001'),
(7, 'arief', 'arief', 'Karyawan', 'K003');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `m_gol_tarif`
--
ALTER TABLE `m_gol_tarif`
  ADD PRIMARY KEY (`gol_tarif`);

--
-- Indexes for table `m_karyawan`
--
ALTER TABLE `m_karyawan`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `kode_karyawan` (`kode_karyawan`);

--
-- Indexes for table `m_mobil`
--
ALTER TABLE `m_mobil`
  ADD PRIMARY KEY (`kode_mobil`),
  ADD UNIQUE KEY `nopol_mobil` (`nopol_mobil`);

--
-- Indexes for table `t_pengembalian`
--
ALTER TABLE `t_pengembalian`
  ADD PRIMARY KEY (`kode_transaksi_kembali`),
  ADD KEY `kode_transaksi` (`kode_transaksi`),
  ADD KEY `kode_karyawan` (`kode_karyawan`);

--
-- Indexes for table `t_penyewaan`
--
ALTER TABLE `t_penyewaan`
  ADD PRIMARY KEY (`kode_transaksi`),
  ADD KEY `kode_tarif` (`kode_tarif`),
  ADD KEY `kode_karyawan` (`kode_karyawan`);

--
-- Indexes for table `t_tarif_mobil`
--
ALTER TABLE `t_tarif_mobil`
  ADD PRIMARY KEY (`kode_tarif`),
  ADD KEY `gol_tarif` (`gol_tarif`),
  ADD KEY `kode_mobil` (`kode_mobil`);

--
-- Indexes for table `t_user`
--
ALTER TABLE `t_user`
  ADD PRIMARY KEY (`kode_user`),
  ADD UNIQUE KEY `username` (`username`),
  ADD KEY `kode_karyawan` (`kode_karyawan`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `m_karyawan`
--
ALTER TABLE `m_karyawan`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=13;
--
-- AUTO_INCREMENT for table `t_tarif_mobil`
--
ALTER TABLE `t_tarif_mobil`
  MODIFY `kode_tarif` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;
--
-- AUTO_INCREMENT for table `t_user`
--
ALTER TABLE `t_user`
  MODIFY `kode_user` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;
--
-- Constraints for dumped tables
--

--
-- Constraints for table `t_penyewaan`
--
ALTER TABLE `t_penyewaan`
  ADD CONSTRAINT `t_penyewaan_ibfk_1` FOREIGN KEY (`kode_tarif`) REFERENCES `t_tarif_mobil` (`kode_tarif`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `t_penyewaan_ibfk_2` FOREIGN KEY (`kode_karyawan`) REFERENCES `m_karyawan` (`kode_karyawan`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `t_tarif_mobil`
--
ALTER TABLE `t_tarif_mobil`
  ADD CONSTRAINT `t_tarif_mobil_ibfk_2` FOREIGN KEY (`gol_tarif`) REFERENCES `m_gol_tarif` (`gol_tarif`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `t_tarif_mobil_ibfk_3` FOREIGN KEY (`kode_mobil`) REFERENCES `m_mobil` (`kode_mobil`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `t_user`
--
ALTER TABLE `t_user`
  ADD CONSTRAINT `t_user_ibfk_1` FOREIGN KEY (`kode_karyawan`) REFERENCES `m_karyawan` (`kode_karyawan`) ON DELETE CASCADE ON UPDATE CASCADE;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
