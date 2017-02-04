package com.petbuddy.petapp.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.petbuddy.petapp.controller.util.BaseController;
import com.petbuddy.petapp.model.TipoServicio;
import com.petbuddy.petapp.services.TipoServicioService;
import com.petbuddy.petapp.util.Constant;

@RestController
public class TipoServicioController extends BaseController {
	@Autowired
	TipoServicioService tipoServicioService;
	
	@RequestMapping(value=Constant.REST_TIPO_SERVICIO_GET_ALL,method=RequestMethod.GET)
	public List<TipoServicio> getAll(){
		return tipoServicioService.getAll();
	}
	
	@RequestMapping(value=Constant.REST_TIPO_SERVICIO_SAVE,method=RequestMethod.POST,consumes = "application/json")
	public TipoServicio save(@RequestBody TipoServicio tipoServicio){
		return tipoServicioService.save(tipoServicio);
	}
	
	
	@RequestMapping(value=Constant.REST_TIPO_SERVICIO_DELETE,method=RequestMethod.DELETE,consumes = "application/json")
	public Integer delete(@RequestBody TipoServicio tipoServicio){
		Integer response = 1;
		try{
			tipoServicioService.remove(tipoServicio);
		}catch(Exception e){
			response = 0;
		}
		return response;
	}
	
	
}