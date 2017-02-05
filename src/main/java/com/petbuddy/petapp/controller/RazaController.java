package com.petbuddy.petapp.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.petbuddy.petapp.controller.util.BaseController;
import com.petbuddy.petapp.model.Raza;
import com.petbuddy.petapp.services.RazaService;
import com.petbuddy.petapp.util.Constant;

@RestController
public class RazaController extends BaseController {
	@Autowired
	RazaService razaService;
	
	@RequestMapping(value=Constant.REST_RAZA_GET_ALL,method=RequestMethod.GET)
	public List<Raza> getAll(){
		return razaService.getAll();
	}
	
	@RequestMapping(value=Constant.REST_RAZA_SAVE,method=RequestMethod.POST,consumes = "application/json")
	public Raza save(@RequestBody Raza raza){
		return razaService.save(raza);
	}
	
	
	@RequestMapping(value=Constant.REST_RAZA_DELETE,method=RequestMethod.DELETE,consumes = "application/json")
	public Integer delete(@RequestBody Raza raza){
		Integer response = 1;
		try{
			razaService.remove(raza);
		}catch(Exception e){
			response = 0;
		}
		return response;
	}
	
	
}