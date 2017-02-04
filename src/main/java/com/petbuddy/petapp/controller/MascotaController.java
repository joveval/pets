package com.petbuddy.petapp.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.petbuddy.petapp.controller.util.BaseController;
import com.petbuddy.petapp.model.Mascota;
import com.petbuddy.petapp.services.MascotaService;
import com.petbuddy.petapp.util.Constant;

@RestController
public class MascotaController extends BaseController {
	@Autowired
	MascotaService mascotaService;
	
	@RequestMapping(value=Constant.REST_MASCOTA_GET_ALL,method=RequestMethod.GET)
	public List<Mascota> getAll(){
		return mascotaService.getAll();
	}
	
	@RequestMapping(value=Constant.REST_MASCOTA_SAVE,method=RequestMethod.POST,consumes = "application/json")
	public Mascota save(@RequestBody Mascota mascota){
		return mascotaService.save(mascota);
	}
	
	
	@RequestMapping(value=Constant.REST_MASCOTA_DELETE,method=RequestMethod.DELETE,consumes = "application/json")
	public Integer delete(@RequestBody Mascota mascota){
		Integer response = 1;
		try{
			mascotaService.remove(mascota);
		}catch(Exception e){
			response = 0;
		}
		return response;
	}
	
	
}