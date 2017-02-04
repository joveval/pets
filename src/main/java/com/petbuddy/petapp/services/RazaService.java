package com.petbuddy.petapp.services;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.petbuddy.petapp.dao.RazaDAO;
import com.petbuddy.petapp.model.Raza;


@Service
public class RazaService {

	@Autowired
	RazaDAO razaDAO;
	
	@Transactional
	public Raza save(Raza raza){
		return razaDAO.save(raza);
	}
	
	@Transactional
	public List<Raza> getAll(){
		return (List<Raza>)razaDAO.findAll();
	}
	
	@Transactional
	public void remove(Raza raza){
		razaDAO.delete(raza);
	}
}