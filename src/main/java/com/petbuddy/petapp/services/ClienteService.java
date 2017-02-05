package com.petbuddy.petapp.services;

import com.petbuddy.petapp.dao.ClienteDAO;
import com.petbuddy.petapp.dao.PersonaDAO;
import com.petbuddy.petapp.model.Cliente;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author Diego Mansilla on 10/27/2016.
 */

@Service
public class ClienteService{

	@Autowired
	ClienteDAO clienteDAO;
	
	@Transactional
	public Cliente save(Cliente cliente){
		return clienteDAO.save(cliente);
	}
	
	@Transactional
	public List<Cliente> getAll(){
		return (List<Cliente>)clienteDAO.findAll();
	}
	
	@Transactional
	public void remove(Cliente cliente){
		clienteDAO.delete(cliente);
	}
}
