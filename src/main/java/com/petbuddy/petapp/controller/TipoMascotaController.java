package com.petbuddy.petapp.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.petbuddy.petapp.controller.util.BaseController;
import com.petbuddy.petapp.model.TipoMascota;
import com.petbuddy.petapp.services.TipoMascotaService;
import com.petbuddy.petapp.util.Constant;

@RestController
public class TipoMascotaController extends BaseController {
	@Autowired
	TipoMascotaService tipoMascotaService;
	
	@RequestMapping(value=Constant.REST_TIPO_MASCOTA_GET_ALL,method=RequestMethod.GET)
	public List<TipoMascota> getAll(){
		return tipoMascotaService.getAll();
	}
	
	@RequestMapping(value=Constant.REST_TIPO_MASCOTA_SAVE,method=RequestMethod.POST,consumes = "application/json")
	public TipoMascota save(@RequestBody TipoMascota tipoMascota){
		return tipoMascotaService.save(tipoMascota);
	}
	
	
	@RequestMapping(value=Constant.REST_TIPO_MASCOTA_DELETE,method=RequestMethod.DELETE,consumes = "application/json")
	public Integer delete(@RequestBody TipoMascota tipoMascota){
		Integer response = 1;
		try{
			tipoMascotaService.remove(tipoMascota);
		}catch(Exception e){
			response = 0;
		}
		return response;
	}
	
	
}