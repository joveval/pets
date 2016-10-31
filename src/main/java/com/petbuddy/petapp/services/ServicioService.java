package com.petbuddy.petapp.services;

import com.petbuddy.petapp.dao.ServicioDAO;
import com.petbuddy.petapp.model.Servicio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author Diego Mansilla on 10/27/2016.
 */

@Service
@Transactional(readOnly = true)
public class ServicioService {

    @Autowired
    private ServicioDAO servicioDAO;

    @Transactional
    public Servicio saveServicio(Servicio servicio) {
        return servicioDAO.save(servicio);
    }

    public List<Servicio> getAll() {
        List<Servicio> servicioList = servicioDAO.findAll();

        return servicioList;
    }
}
