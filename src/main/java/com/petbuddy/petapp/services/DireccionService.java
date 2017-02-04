package com.petbuddy.petapp.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.petbuddy.petapp.dao.DireccionDAO;
import com.petbuddy.petapp.model.Direccion;

@Service
public class DireccionService {

	@Autowired
	DireccionDAO direccionDAO;
	
	@Transactional
	public Direccion save(Direccion direccion){
		return direccionDAO.save(direccion);
	}
	
	@Transactional
	public List<Direccion> getAll(){
		return (List<Direccion>)direccionDAO.findAll();
	}
	
	@Transactional
	public void updateCoordinates(Double coordX,Double coordY, Integer idDireccion){
		direccionDAO.updateCoordinates(coordX, coordY, idDireccion);
	}
	
	
	@Transactional
	public void remove(Direccion direccion){
		direccionDAO.delete(direccion);
	}
}
