package com.petbuddy.petapp.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.petbuddy.petapp.controller.util.BaseController;
import com.petbuddy.petapp.model.Veterinario;
import com.petbuddy.petapp.services.VeterinarioService;
import com.petbuddy.petapp.util.Constant;

@RestController
public class VeterinarioController extends BaseController {
	@Autowired
	VeterinarioService veterinarioService;
	
	@RequestMapping(value=Constant.REST_VETERINARIO_GET_ALL,method=RequestMethod.GET)
	public List<Veterinario> getAll(){
		return veterinarioService.getAll();
	}
	
	@RequestMapping(value=Constant.REST_VETERINARIO_SAVE,method=RequestMethod.POST,consumes = "application/json")
	public Veterinario save(@RequestBody Veterinario veterinario){
		return veterinarioService.save(veterinario);
	}
	
	
	@RequestMapping(value=Constant.REST_VETERINARIO_DELETE,method=RequestMethod.DELETE,consumes = "application/json")
	public Integer delete(@RequestBody Veterinario veterinario){
		Integer response = 1;
		try{
			veterinarioService.remove(veterinario);
		}catch(Exception e){
			response = 0;
		}
		return response;
	}
	
	
}