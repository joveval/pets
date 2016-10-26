package com.petbuddy.petapp.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @author Diego Mansilla on 10/23/2016.
 */

@EntityScan({"com.petbuddy.petapp.model"})
@SpringBootApplication
@EnableAutoConfiguration
public class Application {
    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

    public static void main(String... args) {
        SpringApplication.run(Application.class);
    }
}
