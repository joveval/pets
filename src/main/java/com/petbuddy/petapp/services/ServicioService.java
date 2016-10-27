package com.petbuddy.petapp.services;

import com.petbuddy.petapp.dao.ServicioDAO;
import com.petbuddy.petapp.model.Servicio;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author Diego Mansilla on 10/27/2016.
 */

@Service
public class ServicioService {

    private ServicioDAO servicioDAO;

    @Transactional
    public Servicio saveServicio(Servicio servicio) {
        return servicioDAO.save(servicio);
    }

    public List<Servicio> getAll() {
        return servicioDAO.findAll();
    }
}
