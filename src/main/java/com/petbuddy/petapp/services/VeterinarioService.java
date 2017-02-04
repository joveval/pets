package com.petbuddy.petapp.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.petbuddy.petapp.dao.VeterinarioDAO;
import com.petbuddy.petapp.model.Veterinario;

@Service
public class VeterinarioService {

	@Autowired
	VeterinarioDAO veterinarioDAO;

	@Transactional
	public Veterinario save(Veterinario veterinario) {
		return veterinarioDAO.save(veterinario);
	}

	@Transactional
	public List<Veterinario> getAll() {
		return (List<Veterinario>) veterinarioDAO.findAll();
	}

	@Transactional
	public void remove(Veterinario veterinario) {
		veterinarioDAO.delete(veterinario);
	}
}