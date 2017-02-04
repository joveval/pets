package com.petbuddy.petapp.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.petbuddy.petapp.controller.util.BaseController;
import com.petbuddy.petapp.model.RelVeterinarioServicio;
import com.petbuddy.petapp.services.RelVeterinarioServicioService;
import com.petbuddy.petapp.util.Constant;

@RestController
public class RelVeterinarioServicioController extends BaseController {
	@Autowired
	RelVeterinarioServicioService relVeterinarioServicioService;
	
	@RequestMapping(value=Constant.REST_REL_VETERINARIO_SERVICIO_GET_ALL,method=RequestMethod.GET)
	public List<RelVeterinarioServicio> getAll(){
		return relVeterinarioServicioService.getAll();
	}
	
	@RequestMapping(value=Constant.REST_REL_VETERINARIO_SERVICIO_SAVE,method=RequestMethod.POST,consumes = "application/json")
	public RelVeterinarioServicio save(@RequestBody RelVeterinarioServicio relVeterinarioServicio){
		return relVeterinarioServicioService.save(relVeterinarioServicio);
	}
	
	
	@RequestMapping(value=Constant.REST_REL_VETERINARIO_SERVICIO_DELETE,method=RequestMethod.DELETE,consumes = "application/json")
	public Integer delete(@RequestBody RelVeterinarioServicio relVeterinarioServicio){
		Integer response = 1;
		try{
			relVeterinarioServicioService.remove(relVeterinarioServicio);
		}catch(Exception e){
			response = 0;
		}
		return response;
	}
	
	
}