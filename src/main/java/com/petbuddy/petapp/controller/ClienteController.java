package com.petbuddy.petapp.controller;

import com.petbuddy.petapp.controller.util.BaseController;
import com.petbuddy.petapp.services.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Diego Mansilla on 10/25/2016.
 */


@RestController
public class ClienteController extends BaseController {
    @Autowired
    private ClienteService clienteService;
}
