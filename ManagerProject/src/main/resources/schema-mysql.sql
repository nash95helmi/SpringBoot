-- phpMyAdmin SQL Dump
-- version 4.9.0.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Nov 06, 2019 at 08:39 AM
-- Server version: 10.3.16-MariaDB
-- PHP Version: 7.2.20

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `test`
--

-- --------------------------------------------------------

--
-- Table structure for table `mngmst`
--

CREATE TABLE IF NOT EXISTS `mngmst` (
  `mngrid` varchar(6) NOT NULL,
  `mnfnam` varchar(40) NOT NULL,
  `mnlnam` varchar(40) NOT NULL,
  `mnpoid` varchar(6) NOT NULL,
  `mndept` varchar(10) NOT NULL,
  `mnasts` varchar(20) NOT NULL,
  `mnemel` varchar(40) NOT NULL,
  `mndocid` varchar(30) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `mngmst`
--

INSERT INTO `mngmst` (`mngrid`, `mnfnam`, `mnlnam`, `mnpoid`, `mndept`, `mnasts`, `mnemel`, `mndocid`) VALUES
('M00004', 'Chooi Fong', 'Gan', 'ITSNRM', 'CIMBITIV', 'Active', 'nash95.helmi@gmail.com', NULL),
('M00005', 'Sean Geak', 'Lee', 'ITPRD', 'MNLITHQ', 'Active', 'nash95.helmi@gmail.com', NULL),
('M00006', 'Wah Yam', 'Kam', 'ITPRD', 'AIBITHQ', 'Active', 'nash95.helmi@gmail.com', NULL),
('M00007', 'Hafiz', 'Suhaimi', 'ITTML', 'CIMBITIV', 'Active', 'nash95.helmi@gmail.com', NULL),
('M00008', 'Nabila', 'Johan', 'ITTML', 'MNLITHQ', 'Active', 'nash95.helmi@gmail.com', NULL),
('M00009', 'Hafiz', 'Suhaimi', 'ITASSM', 'AIBITHQ', 'Active', 'nash95.helmi@gmail.com', NULL),
('M00011', 'Aqil', 'Bin Johari', 'ITPRD', 'AIBITHQ', 'Active', 'nash95.helmi@gmail.com', NULL);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `mngmst`
--
ALTER TABLE `mngmst`
  ADD PRIMARY KEY (`mngrid`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
