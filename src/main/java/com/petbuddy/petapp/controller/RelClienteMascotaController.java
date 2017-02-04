package com.petbuddy.petapp.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.petbuddy.petapp.controller.util.BaseController;
import com.petbuddy.petapp.model.RelClienteMascota;
import com.petbuddy.petapp.services.RelClienteMascotaService;
import com.petbuddy.petapp.util.Constant;

@RestController
public class RelClienteMascotaController extends BaseController {
	@Autowired
	RelClienteMascotaService relClienteMascotaService;
	
	@RequestMapping(value=Constant.REST_REL_CLIENTE_MASCOTA_GET_ALL,method=RequestMethod.GET)
	public List<RelClienteMascota> getAll(){
		return relClienteMascotaService.getAll();
	}
	
	@RequestMapping(value=Constant.REST_REL_CLIENTE_MASCOTA_SAVE,method=RequestMethod.POST,consumes = "application/json")
	public RelClienteMascota save(@RequestBody RelClienteMascota relClienteMascota){
		return relClienteMascotaService.save(relClienteMascota);
	}
	
	
	@RequestMapping(value=Constant.REST_REL_CLIENTE_MASCOTA_DELETE,method=RequestMethod.DELETE,consumes = "application/json")
	public Integer delete(@RequestBody RelClienteMascota relClienteMascota){
		Integer response = 1;
		try{
			relClienteMascotaService.remove(relClienteMascota);
		}catch(Exception e){
			response = 0;
		}
		return response;
	}
	
	
}