package com.petbuddy.petapp.services;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.petbuddy.petapp.dao.MascotaDAO;
import com.petbuddy.petapp.model.Mascota;


@Service
public class MascotaService {

	@Autowired
	MascotaDAO mascotaDAO;
	
	@Transactional
	public Mascota save(Mascota mascota){
		return mascotaDAO.save(mascota);
	}
	
	@Transactional
	public List<Mascota> getAll(){
		return (List<Mascota>)mascotaDAO.findAll();
	}
	
	@Transactional
	public void remove(Mascota mascota){
		mascotaDAO.delete(mascota);
	}
}