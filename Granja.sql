-- phpMyAdmin SQL Dump
-- version 4.5.5.1
-- http://www.phpmyadmin.net
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 12-06-2017 a las 00:26:33
-- Versión del servidor: 5.7.11
-- Versión de PHP: 5.6.19

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `javaweb_crud`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `articulos`
--

CREATE TABLE `InformacionPorcinos` (
  `Identificacion` int(10) NOT NULL,
  `Raza` varchar(5) COLLATE utf8_spanish2_ci NOT NULL,
  `Edad` int(2) NOT NULL,
  `Peso` int(3) NOT NULL,
  `Alimentacion` varchar(10) COLLATE utf8_spanish2_ci NOT NULL,
  `Cliente` varchar(50) COLLATE utf8_spanish2_ci NOT NULL,
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_spanish2_ci;

CREATE TABLE `InformacionClientes` (
  `Cedula` int(10) NOT NULL,
  `Nombres` varchar(50) COLLATE utf8_spanish2_ci NOT NULL,
  `Apellidos` varchar(50) COLLATE utf8_spanish2_ci NOT NULL,
  `Direccion` varchar(50) COLLATE utf8_spanish2_ci NOT NULL,
  `Telefono` int(10) NOT NULL,
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_spanish2_ci;

CREATE TABLE `InformacionAlimentacion` (
  `Descripcion` varchar(100) COLLATE utf8_spanish2_ci NOT NULL,
  `Dosis` int(5) NOT NULL,
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_spanish2_ci;

--
-- Volcado de datos para la tabla `InformacionPorcinos`
--

INSERT INTO `InformacionPorcinos` (`Identificacion`, `Raza`, `Edad`, `Peso`, `Alimentacion`, `Cliente`) VALUES
(5, 'York', 8, 70, , ),
(8, 'Hamp', 12, 90, , ),
(12, 'Duroc', 14, 100, , ),

--
-- Volcado de datos para la tabla `InformacionClientes`
--

INSERT INTO `InformacionClientes` (`Cedula`, `Nombres`, `Apellidos`, `Direccion`, `Telefono`) VALUES
(0123456789, 'Julian', 'Alvarez', 'Calle 10 No. 9 - 78  Centro', 3004005124),
(1234567890, 'Jhon Mario', 'Gomez Perez', 'Carrera 56A No. 51 - 81', 3205827212),
(2345678901, 'Oscar Hernando', 'Velez Velez', 'Calle 7 No. 5 - 25  Edificio Segunda', 3137631111),

--
-- Volcado de datos para la tabla `InformacionAlimentacion`
--
INSERT INTO `InformacionAlimentacion` (`Descripcion`, `Dosis`) VALUES
('Maiz blanco integral', 1500),
('salvado de trigo', 3500),
('Melaza de caña', 4500),

--
-- Indices de la tabla `InformacionPorcinos`
--

ALTER TABLE `InformacionPorcinos`
  ADD PRIMARY KEY (`Identificacion`);

--
-- Indices de la tabla `InformacionClientes`
--
  
ALTER TABLE `InformacionClientes`
  ADD PRIMARY KEY (`Cedula`);

--
-- Indices de la tabla `InformacionAlimentacion`
-- 
 
ALTER TABLE `InformacionAlimentacion`
  ADD PRIMARY KEY (`Descripcion`);

