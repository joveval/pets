package com.petbuddy.petapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.petbuddy.petapp.controller.util.BaseController;
import com.petbuddy.petapp.model.Direccion;
import com.petbuddy.petapp.services.DireccionService;
import com.petbuddy.petapp.util.Constant;

@RestController
public class DireccionController extends BaseController {
	@Autowired
	DireccionService direccionService;
	
	@RequestMapping(value=Constant.REST_DIRECCION_GET_ALL,method=RequestMethod.GET)
	public List<Direccion> getAll(){
		return direccionService.getAll();
	}
	
	@RequestMapping(value=Constant.REST_DIRECCION_SAVE,method=RequestMethod.POST,consumes = "application/json")
	public Direccion save(@RequestBody Direccion direccion){
		return direccionService.save(direccion);
	}
	
	@RequestMapping(value="/direccion/update",method=RequestMethod.PUT,consumes = "application/json")
	public Integer update(@RequestBody Direccion direccion){
		Integer response = 1;
		try{
			Double coordX = direccion.getCoordX();
			Double coordY = direccion.getCoordY();
			Integer idDireccion = direccion.getIdDireccion();
			direccionService.updateCoordinates(coordX, coordY, idDireccion);
		}catch(Exception e){
			response = 0;
		}
		return response;
	}
	
	@RequestMapping(value=Constant.REST_DIRECCION_DELETE,method=RequestMethod.DELETE,consumes = "application/json")
	public Integer delete(@RequestBody Direccion direccion){
		Integer response = 1;
		try{
			direccionService.remove(direccion);
		}catch(Exception e){
			response = 0;
		}
		return response;
	}
	
	
}
