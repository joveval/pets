package com.petbuddy.petapp.application;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.orm.jpa.EntityScan;

/**
 * @author Diego Mansilla on 10/23/2016.
 */

@EntityScan({"com.petbuddy.petapp.model"})
@SpringBootApplication
@EnableAutoConfiguration
public class Application {

}
