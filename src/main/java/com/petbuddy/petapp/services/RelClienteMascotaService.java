package com.petbuddy.petapp.services;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.petbuddy.petapp.dao.RelClienteMascotaDAO;
import com.petbuddy.petapp.model.RelClienteMascota;


@Service
public class RelClienteMascotaService {

	@Autowired
	RelClienteMascotaDAO relClienteMascotaDAO;
	
	@Transactional
	public RelClienteMascota save(RelClienteMascota relClienteMascota){
		return relClienteMascotaDAO.save(relClienteMascota);
	}
	
	@Transactional
	public List<RelClienteMascota> getAll(){
		return (List<RelClienteMascota>)relClienteMascotaDAO.findAll();
	}
	
	@Transactional
	public void remove(RelClienteMascota relClienteMascota){
		relClienteMascotaDAO.delete(relClienteMascota);
	}
}