package com.petbuddy.petapp.services;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.petbuddy.petapp.dao.TipoServicioDAO;
import com.petbuddy.petapp.model.TipoServicio;


@Service
public class TipoServicioService {

	@Autowired
	TipoServicioDAO tipoServicioDAO;
	
	@Transactional
	public TipoServicio save(TipoServicio tipoServicio){
		return tipoServicioDAO.save(tipoServicio);
	}
	
	@Transactional
	public List<TipoServicio> getAll(){
		return (List<TipoServicio>)tipoServicioDAO.findAll();
	}
	
	@Transactional
	public void remove(TipoServicio tipoServicio){
		tipoServicioDAO.delete(tipoServicio);
	}
}