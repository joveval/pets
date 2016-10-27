package com.petbuddy.petapp.services;

import com.petbuddy.petapp.dao.PersonaDAO;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author Diego Mansilla on 10/27/2016.
 */

@Service
@Transactional(readOnly = true)
public class ClienteService {

}
