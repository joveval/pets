package com.petbuddy.petapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.petbuddy.petapp.controller.util.BaseController;
import com.petbuddy.petapp.model.Persona;
import com.petbuddy.petapp.services.PersonaService;
import com.petbuddy.petapp.util.Constant;

@RestController
public class PersonaController extends BaseController {
	@Autowired
	PersonaService personaService;
	
	@RequestMapping(value=Constant.REST_PERSONA_GET_ALL,method=RequestMethod.GET)
	public List<Persona> getAll(){
		return personaService.getAll();
	}
	
	@RequestMapping(value=Constant.REST_PERSONA_SAVE,method=RequestMethod.POST,consumes = "application/json")
	public Persona save(@RequestBody Persona persona){
		return personaService.save(persona);
	}
	
	
	@RequestMapping(value=Constant.REST_PERSONA_DELETE,method=RequestMethod.DELETE,consumes = "application/json")
	public Integer delete(@RequestBody Persona persona){
		Integer response = 1;
		try{
			personaService.remove(persona);
		}catch(Exception e){
			response = 0;
		}
		return response;
	}
	
	
}