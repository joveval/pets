-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 26-01-2017 a las 18:43:18
-- Versión del servidor: 10.1.10-MariaDB
-- Versión de PHP: 5.6.19

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `petbuddy`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cliente`
--

CREATE TABLE `cliente` (
  `id_cliente` int(11) NOT NULL,
  `password` varchar(500) DEFAULT NULL,
  `ID_PERSONA` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `direccion`
--

CREATE TABLE `direccion` (
  `ID_DIRECCION` int(11) NOT NULL,
  `ID_PERSONA` int(11) NOT NULL,
  `NOMBRE_DIRECCION` varchar(500) DEFAULT NULL,
  `DISTRITO` varchar(50) DEFAULT NULL,
  `PROVINCIA` varchar(50) DEFAULT NULL,
  `DEPARTAMENTO` varchar(50) DEFAULT NULL,
  `UBIGEO` varchar(6) DEFAULT NULL,
  `COORD_X` double DEFAULT NULL,
  `COORD_Y` double DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `expediente_medico`
--

CREATE TABLE `expediente_medico` (
  `ID_EXPEDIENTE` int(11) NOT NULL,
  `ID_MASCOTA` int(11) NOT NULL,
  `DESCRIPCION` varchar(500) DEFAULT NULL,
  `FECHA` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `mascota`
--

CREATE TABLE `mascota` (
  `ID_MASCOTA` int(11) NOT NULL,
  `ID_TIPO_MASCOTA` int(11) NOT NULL,
  `SEXO` char(1) DEFAULT NULL,
  `BIRTHDAY` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `persona`
--

CREATE TABLE `persona` (
  `ID_PERSONA` int(11) NOT NULL,
  `NOMBRES` varchar(50) DEFAULT NULL,
  `AP_PATERNO` varchar(50) DEFAULT NULL,
  `AP_MATERNO` varchar(50) DEFAULT NULL,
  `EMAIL` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `raza`
--

CREATE TABLE `raza` (
  `ID_RAZA` int(11) NOT NULL,
  `DESCRIPCION` varchar(500) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `rel_cliente_mascota`
--

CREATE TABLE `rel_cliente_mascota` (
  `ID_REL_CLIENTE_MASCOTA` int(11) NOT NULL,
  `ID_CLIENTE` int(11) NOT NULL,
  `ID_MASCOTA` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `rel_veterinario_servicio`
--

CREATE TABLE `rel_veterinario_servicio` (
  `ID_REL_VETERINARIO_SERVICIO` int(11) NOT NULL,
  `ID_VETERINARIO` int(11) NOT NULL,
  `ID_SERVICIO` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `servicio`
--

CREATE TABLE `servicio` (
  `id_servicio` int(11) NOT NULL,
  `id_tipo_servicio` int(11) NOT NULL,
  `descripcion` varchar(200) DEFAULT NULL,
  `coord_x` double DEFAULT NULL,
  `coord_y` double DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tipo_mascota`
--

CREATE TABLE `tipo_mascota` (
  `ID_TIPO_MASCOTA` int(11) NOT NULL,
  `ID_RAZA` int(11) NOT NULL,
  `DESCRIPCION` varchar(500) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `transaccion`
--

CREATE TABLE `transaccion` (
  `ID_TRANSACCION` int(11) NOT NULL,
  `ID_REL_CLIENTE_MASCOTA` int(11) NOT NULL,
  `ID_SERVICIO` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `veterinario`
--

CREATE TABLE `veterinario` (
  `ID_VETERINARIO` int(11) NOT NULL,
  `ID_PERSONA` int(11) NOT NULL,
  `COLEGIADO` tinyint(1) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `cliente`
--
ALTER TABLE `cliente`
  ADD PRIMARY KEY (`id_cliente`),
  ADD UNIQUE KEY `ID_PERSONA` (`ID_PERSONA`);

--
-- Indices de la tabla `direccion`
--
ALTER TABLE `direccion`
  ADD PRIMARY KEY (`ID_DIRECCION`),
  ADD KEY `ID_PERSONA` (`ID_PERSONA`);

--
-- Indices de la tabla `expediente_medico`
--
ALTER TABLE `expediente_medico`
  ADD PRIMARY KEY (`ID_EXPEDIENTE`),
  ADD KEY `ID_MASCOTA` (`ID_MASCOTA`);

--
-- Indices de la tabla `mascota`
--
ALTER TABLE `mascota`
  ADD PRIMARY KEY (`ID_MASCOTA`),
  ADD KEY `ID_TIPO_MASCOTA` (`ID_TIPO_MASCOTA`);

--
-- Indices de la tabla `persona`
--
ALTER TABLE `persona`
  ADD PRIMARY KEY (`ID_PERSONA`);

--
-- Indices de la tabla `raza`
--
ALTER TABLE `raza`
  ADD PRIMARY KEY (`ID_RAZA`);

--
-- Indices de la tabla `rel_cliente_mascota`
--
ALTER TABLE `rel_cliente_mascota`
  ADD PRIMARY KEY (`ID_REL_CLIENTE_MASCOTA`),
  ADD KEY `ID_CLIENTE` (`ID_CLIENTE`),
  ADD KEY `ID_MASCOTA` (`ID_MASCOTA`);

--
-- Indices de la tabla `rel_veterinario_servicio`
--
ALTER TABLE `rel_veterinario_servicio`
  ADD PRIMARY KEY (`ID_REL_VETERINARIO_SERVICIO`),
  ADD UNIQUE KEY `ID_SERVICIO` (`ID_SERVICIO`),
  ADD KEY `ID_VETERINARIO` (`ID_VETERINARIO`);

--
-- Indices de la tabla `servicio`
--
ALTER TABLE `servicio`
  ADD PRIMARY KEY (`id_servicio`);

--
-- Indices de la tabla `tipo_mascota`
--
ALTER TABLE `tipo_mascota`
  ADD PRIMARY KEY (`ID_TIPO_MASCOTA`),
  ADD KEY `ID_RAZA` (`ID_RAZA`);

--
-- Indices de la tabla `transaccion`
--
ALTER TABLE `transaccion`
  ADD PRIMARY KEY (`ID_TRANSACCION`),
  ADD KEY `ID_REL_CLIENTE_MASCOTA` (`ID_REL_CLIENTE_MASCOTA`);

--
-- Indices de la tabla `veterinario`
--
ALTER TABLE `veterinario`
  ADD PRIMARY KEY (`ID_VETERINARIO`),
  ADD KEY `ID_PERSONA` (`ID_PERSONA`);

--
-- AUTO_INCREMENT de las tablas volcadas
--
  
--
-- AUTO_INCREMENT de la tabla `cliente`
--

ALTER TABLE `cliente`
  MODIFY `id_cliente` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=1; 
  
ALTER TABLE `direccion`
  MODIFY `ID_DIRECCION` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=1;
  
ALTER TABLE `expediente_medico` 
  MODIFY `ID_EXPEDIENTE` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=1;

ALTER TABLE `mascota` 
  MODIFY `ID_MASCOTA` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=1;
  
ALTER TABLE `persona` 
  MODIFY `ID_PERSONA` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=1;

ALTER TABLE `raza` 
  MODIFY `ID_RAZA` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=1;
  
ALTER TABLE `rel_cliente_mascota` 
  MODIFY `ID_REL_CLIENTE_MASCOTA` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=1;
  
ALTER TABLE `rel_veterinario_servicio` 
  MODIFY `ID_REL_VETERINARIO_SERVICIO` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=1;
  
ALTER TABLE `servicio` 
  MODIFY `ID_servicio` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=1;


ALTER TABLE `tipo_mascota` 
  MODIFY `ID_TIPO_MASCOTA` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=1;
  
ALTER TABLE `transaccion` 
  MODIFY `ID_TRANSACCION` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=1;

ALTER TABLE `veterinario` 
  MODIFY `ID_VETERINARIO` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=1;
  
  
--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `cliente`
--
ALTER TABLE `cliente`
  ADD CONSTRAINT `cliente_ibfk_1` FOREIGN KEY (`ID_PERSONA`) REFERENCES `persona` (`ID_PERSONA`);

--
-- Filtros para la tabla `direccion`
--
ALTER TABLE `direccion`
  ADD CONSTRAINT `direccion_ibfk_1` FOREIGN KEY (`ID_PERSONA`) REFERENCES `persona` (`ID_PERSONA`);

--
-- Filtros para la tabla `expediente_medico`
--
ALTER TABLE `expediente_medico`
  ADD CONSTRAINT `expediente_medico_ibfk_1` FOREIGN KEY (`ID_MASCOTA`) REFERENCES `mascota` (`ID_MASCOTA`);

--
-- Filtros para la tabla `mascota`
--
ALTER TABLE `mascota`
  ADD CONSTRAINT `mascota_ibfk_1` FOREIGN KEY (`ID_TIPO_MASCOTA`) REFERENCES `tipo_mascota` (`ID_TIPO_MASCOTA`);

--
-- Filtros para la tabla `rel_cliente_mascota`
--
ALTER TABLE `rel_cliente_mascota`
  ADD CONSTRAINT `rel_cliente_mascota_ibfk_1` FOREIGN KEY (`ID_MASCOTA`) REFERENCES `mascota` (`ID_MASCOTA`),
  ADD CONSTRAINT `rel_cliente_mascota_ibfk_2` FOREIGN KEY (`ID_CLIENTE`) REFERENCES `cliente` (`id_cliente`);

--
-- Filtros para la tabla `rel_veterinario_servicio`
--
ALTER TABLE `rel_veterinario_servicio`
  ADD CONSTRAINT `rel_veterinario_servicio_ibfk_1` FOREIGN KEY (`ID_VETERINARIO`) REFERENCES `veterinario` (`ID_VETERINARIO`),
  ADD CONSTRAINT `rel_veterinario_servicio_ibfk_2` FOREIGN KEY (`ID_SERVICIO`) REFERENCES `servicio` (`id_servicio`);

--
-- Filtros para la tabla `tipo_mascota`
--
ALTER TABLE `tipo_mascota`
  ADD CONSTRAINT `tipo_mascota_ibfk_1` FOREIGN KEY (`ID_RAZA`) REFERENCES `raza` (`ID_RAZA`);

--
-- Filtros para la tabla `transaccion`
--
ALTER TABLE `transaccion`
  ADD CONSTRAINT `transaccion_ibfk_1` FOREIGN KEY (`ID_REL_CLIENTE_MASCOTA`) REFERENCES `rel_cliente_mascota` (`ID_REL_CLIENTE_MASCOTA`);

--
-- Filtros para la tabla `veterinario`
--
ALTER TABLE `veterinario`
  ADD CONSTRAINT `veterinario_ibfk_1` FOREIGN KEY (`ID_PERSONA`) REFERENCES `persona` (`ID_PERSONA`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
