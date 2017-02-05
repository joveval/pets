package com.petbuddy.petapp.services;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.petbuddy.petapp.dao.ExpedienteMedicoDAO;
import com.petbuddy.petapp.model.ExpedienteMedico;


@Service
public class ExpedienteMedicoService {

	@Autowired
	ExpedienteMedicoDAO expedienteMedicoDAO;
	
	@Transactional
	public ExpedienteMedico save(ExpedienteMedico expedienteMedico){
		return expedienteMedicoDAO.save(expedienteMedico);
	}
	
	@Transactional
	public List<ExpedienteMedico> getAll(){
		return (List<ExpedienteMedico>)expedienteMedicoDAO.findAll();
	}
	
	@Transactional
	public void remove(ExpedienteMedico expedienteMedico){
		expedienteMedicoDAO.delete(expedienteMedico);
	}
}