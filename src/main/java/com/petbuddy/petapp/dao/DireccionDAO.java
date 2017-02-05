package com.petbuddy.petapp.dao;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.petbuddy.petapp.model.Direccion;

public interface DireccionDAO extends BaseRepository<Direccion, Integer> {
	
	@Modifying
	@Query("UPDATE Direccion d SET d.coordX = ?1, d.coordY = ?2 WHERE d.idDireccion = ?3")
	int updateCoordinates(double coordX,double coordY, int idDireccion);
}
