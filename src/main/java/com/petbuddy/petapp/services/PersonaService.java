package com.petbuddy.petapp.services;

import com.petbuddy.petapp.dao.PersonaDAO;
import com.petbuddy.petapp.model.Persona;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author Diego Mansilla on 10/27/2016.
 */
@Service
public class PersonaService {

	@Autowired
	PersonaDAO personaDAO;
	
	@Transactional
	public Persona save(Persona persona){
		return personaDAO.save(persona);
	}
	
	@Transactional
	public List<Persona> getAll(){
		return (List<Persona>)personaDAO.findAll();
	}
	
	@Transactional
	public void remove(Persona persona){
		personaDAO.delete(persona);
	}
}