package com.petbuddy.petapp.controller;

import com.petbuddy.petapp.model.Cliente;
import com.petbuddy.petapp.model.Servicio;
import com.petbuddy.petapp.services.ServicioService;
import com.petbuddy.petapp.util.Constant;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author Diego Mansilla on 10/27/2016.
 */
@RestController
public class ServicioController {

    @Autowired
    private ServicioService servicioService;

    @RequestMapping(value = Constant.REST_SERVICIO_GET_ALL, method = RequestMethod.GET)
    public List<Servicio> getAll() {
        return servicioService.getAll();
    }

    @RequestMapping(value = Constant.REST_SERVICIO_SAVE, method = RequestMethod.GET)
    public Servicio save(@RequestBody Servicio servicio) {
        return servicioService.save(servicio);
    }
    
    @RequestMapping(value = Constant.REST_SERVICIO_DELETE, method = RequestMethod.DELETE, consumes = "application/json")
	public Integer delete(@RequestBody Servicio servicio) {
		Integer response = 1;
		try {
			servicioService.remove(servicio);
		} catch (Exception e) {
			response = 0;
		}
		return response;
	}
}
