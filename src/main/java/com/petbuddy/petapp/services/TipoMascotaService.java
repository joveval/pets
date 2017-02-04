package com.petbuddy.petapp.services;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.petbuddy.petapp.dao.TipoMascotaDAO;
import com.petbuddy.petapp.model.TipoMascota;


@Service
public class TipoMascotaService {

	@Autowired
	TipoMascotaDAO tipoMascotaDAO;
	
	@Transactional
	public TipoMascota save(TipoMascota tipoMascota){
		return tipoMascotaDAO.save(tipoMascota);
	}
	
	@Transactional
	public List<TipoMascota> getAll(){
		return (List<TipoMascota>)tipoMascotaDAO.findAll();
	}
	
	@Transactional
	public void remove(TipoMascota tipoMascota){
		tipoMascotaDAO.delete(tipoMascota);
	}
}