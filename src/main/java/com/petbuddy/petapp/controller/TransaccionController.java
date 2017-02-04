package com.petbuddy.petapp.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.petbuddy.petapp.controller.util.BaseController;
import com.petbuddy.petapp.model.Transaccion;
import com.petbuddy.petapp.services.TransaccionService;
import com.petbuddy.petapp.util.Constant;

@RestController
public class TransaccionController extends BaseController {
	@Autowired
	TransaccionService transaccionService;
	
	@RequestMapping(value=Constant.REST_TRANSACCION_GET_ALL,method=RequestMethod.GET)
	public List<Transaccion> getAll(){
		return transaccionService.getAll();
	}
	
	@RequestMapping(value=Constant.REST_TRANSACCION_SAVE,method=RequestMethod.POST,consumes = "application/json")
	public Transaccion save(@RequestBody Transaccion transaccion){
		return transaccionService.save(transaccion);
	}
	
	
	@RequestMapping(value=Constant.REST_TRANSACCION_DELETE,method=RequestMethod.DELETE,consumes = "application/json")
	public Integer delete(@RequestBody Transaccion transaccion){
		Integer response = 1;
		try{
			transaccionService.remove(transaccion);
		}catch(Exception e){
			response = 0;
		}
		return response;
	}
	
	
}