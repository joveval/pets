package com.petbuddy.petapp.controller;

import com.petbuddy.petapp.controller.util.BaseController;
import com.petbuddy.petapp.model.Cliente;
import com.petbuddy.petapp.services.ClienteService;
import com.petbuddy.petapp.util.Constant;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Diego Mansilla on 10/25/2016.
 */

@RestController
public class ClienteController extends BaseController {
	@Autowired
	ClienteService clienteService;

	@RequestMapping(value = Constant.REST_CLIENTE_GET_ALL, method = RequestMethod.GET)
	public List<Cliente> getAll() {
		return clienteService.getAll();
	}

	@RequestMapping(value = Constant.REST_CLIENTE_SAVE, method = RequestMethod.POST, consumes = "application/json")
	public Cliente save(@RequestBody Cliente cliente) {
		return clienteService.save(cliente);
	}

	@RequestMapping(value = Constant.REST_CLIENTE_DELETE, method = RequestMethod.DELETE, consumes = "application/json")
	public Integer delete(@RequestBody Cliente cliente) {
		Integer response = 1;
		try {
			clienteService.remove(cliente);
		} catch (Exception e) {
			response = 0;
		}
		return response;
	}

}