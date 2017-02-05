package com.petbuddy.petapp.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.petbuddy.petapp.controller.util.BaseController;
import com.petbuddy.petapp.model.ExpedienteMedico;
import com.petbuddy.petapp.services.ExpedienteMedicoService;
import com.petbuddy.petapp.util.Constant;

@RestController
public class ExpedienteMedicoController extends BaseController {
	@Autowired
	ExpedienteMedicoService expedienteMedicoService;
	
	@RequestMapping(value=Constant.REST_EXPEDIENTE_MEDICO_GET_ALL,method=RequestMethod.GET)
	public List<ExpedienteMedico> getAll(){
		return expedienteMedicoService.getAll();
	}
	
	@RequestMapping(value=Constant.REST_EXPEDIENTE_MEDICO_SAVE,method=RequestMethod.POST,consumes = "application/json")
	public ExpedienteMedico save(@RequestBody ExpedienteMedico expedienteMedico){
		return expedienteMedicoService.save(expedienteMedico);
	}
	
	
	@RequestMapping(value=Constant.REST_EXPEDIENTE_MEDICO_DELETE,method=RequestMethod.DELETE,consumes = "application/json")
	public Integer delete(@RequestBody ExpedienteMedico expedienteMedico){
		Integer response = 1;
		try{
			expedienteMedicoService.remove(expedienteMedico);
		}catch(Exception e){
			response = 0;
		}
		return response;
	}
	
	
}