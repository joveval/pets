package com.petbuddy.petapp.dao;

import com.petbuddy.petapp.model.Persona;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * @author Diego Mansilla on 10/25/2016.
 */
public interface PersonaDAO extends BaseRepository<Persona, Long> {

}
