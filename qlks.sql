-- phpMyAdmin SQL Dump
-- version 5.1.0
-- https://www.phpmyadmin.net/
--
-- Máy chủ: 127.0.0.1
-- Thời gian đã tạo: Th6 13, 2021 lúc 06:56 AM
-- Phiên bản máy phục vụ: 10.4.18-MariaDB
-- Phiên bản PHP: 7.3.27

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Cơ sở dữ liệu: `qlks`
--

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `dichvu`
--

CREATE TABLE `dichvu` (
  `MaDichVu` varchar(45) COLLATE utf8_bin NOT NULL,
  `TenDichVu` varchar(45) COLLATE utf8_bin DEFAULT 'null',
  `Gia` float DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

--
-- Đang đổ dữ liệu cho bảng `dichvu`
--

INSERT INTO `dichvu` (`MaDichVu`, `TenDichVu`, `Gia`) VALUES
('DV01', '9', 12);

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `nhanvien`
--

CREATE TABLE `nhanvien` (
  `HoTen` varchar(45) COLLATE utf8_bin DEFAULT NULL,
  `DiaChi` varchar(45) COLLATE utf8_bin DEFAULT NULL,
  `GioiTinh` tinyint(4) DEFAULT NULL,
  `MaNV` varchar(45) COLLATE utf8_bin NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `thongtinphong`
--

CREATE TABLE `thongtinphong` (
  `ID` int(11) NOT NULL,
  `MaPhong` varchar(45) COLLATE utf8_bin DEFAULT NULL,
  `SoPhong` int(11) DEFAULT NULL,
  `GiaPhong` float DEFAULT NULL,
  `TenKh` varchar(45) COLLATE utf8_bin DEFAULT NULL,
  `CMNDKh` varchar(45) COLLATE utf8_bin DEFAULT NULL,
  `NgayVao` date DEFAULT NULL,
  `NgayTra` date DEFAULT NULL,
  `TinhTrang` tinyint(1) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

--
-- Đang đổ dữ liệu cho bảng `thongtinphong`
--

INSERT INTO `thongtinphong` (`ID`, `MaPhong`, `SoPhong`, `GiaPhong`, `TenKh`, `CMNDKh`, `NgayVao`, `NgayTra`, `TinhTrang`) VALUES
(1, 'a1', 12, 12, '12', '12', '0000-00-00', '0000-00-00', 1),
(2, '12', 12, 12, NULL, NULL, NULL, '0000-00-00', 0);

--
-- Chỉ mục cho các bảng đã đổ
--

--
-- Chỉ mục cho bảng `dichvu`
--
ALTER TABLE `dichvu`
  ADD PRIMARY KEY (`MaDichVu`);

--
-- Chỉ mục cho bảng `nhanvien`
--
ALTER TABLE `nhanvien`
  ADD PRIMARY KEY (`MaNV`);

--
-- Chỉ mục cho bảng `thongtinphong`
--
ALTER TABLE `thongtinphong`
  ADD PRIMARY KEY (`ID`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
