package com.petbuddy.petapp.services;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.petbuddy.petapp.dao.RelVeterinarioServicioDAO;
import com.petbuddy.petapp.model.RelVeterinarioServicio;


@Service
public class RelVeterinarioServicioService {

	@Autowired
	RelVeterinarioServicioDAO relVeterinarioServicioDAO;
	
	@Transactional
	public RelVeterinarioServicio save(RelVeterinarioServicio relVeterinarioServicio){
		return relVeterinarioServicioDAO.save(relVeterinarioServicio);
	}
	
	@Transactional
	public List<RelVeterinarioServicio> getAll(){
		return (List<RelVeterinarioServicio>)relVeterinarioServicioDAO.findAll();
	}
	
	@Transactional
	public void remove(RelVeterinarioServicio relVeterinarioServicio){
		relVeterinarioServicioDAO.delete(relVeterinarioServicio);
	}
}