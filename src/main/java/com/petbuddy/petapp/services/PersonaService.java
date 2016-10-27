package com.petbuddy.petapp.services;

import com.petbuddy.petapp.dao.PersonaDAO;
import com.petbuddy.petapp.model.Persona;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author Diego Mansilla on 10/27/2016.
 */
@Service
public class PersonaService {
    PersonaDAO personaDAO;

    @Transactional
    public Persona save(Persona persona) {
        Persona savedPersona = personaDAO.save(persona);
        return savedPersona;
    }
}
