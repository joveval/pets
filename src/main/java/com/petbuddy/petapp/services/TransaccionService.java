package com.petbuddy.petapp.services;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.petbuddy.petapp.dao.TransaccionDAO;
import com.petbuddy.petapp.model.Transaccion;


@Service
public class TransaccionService {

	@Autowired
	TransaccionDAO transaccionDAO;
	
	@Transactional
	public Transaccion save(Transaccion transaccion){
		return transaccionDAO.save(transaccion);
	}
	
	@Transactional
	public List<Transaccion> getAll(){
		return (List<Transaccion>)transaccionDAO.findAll();
	}
	
	@Transactional
	public void remove(Transaccion transaccion){
		transaccionDAO.delete(transaccion);
	}
}