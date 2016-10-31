package com.petbuddy.petapp.application;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.client.RestTemplate;

import com.petbuddy.petapp.dao.ServicioDAO;
import com.petbuddy.petapp.dao.TipoServicioDAO;
import com.petbuddy.petapp.model.Servicio;
import com.petbuddy.petapp.model.TipoServicio;

@ComponentScan({
//	"com.avantica.brainy.mapper",
//  "com.avantica.brainy.client",
        "com.petbuddy.petapp.hello",
        "com.petbuddy.petapp.controller",
        "com.petbuddy.petapp.services",
})
@EntityScan({"com.petbuddy.petapp.model"})
@EnableJpaRepositories({"com.petbuddy.petapp.dao"})
@SpringBootApplication
@EnableAutoConfiguration
public class Application {

    private static final Logger log = LoggerFactory.getLogger(Application.class);

    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    /*@Bean
    public CommandLineRunner demo(ServicioDAO repository, TipoServicioDAO repo2) {
        return (args) -> {
            // save a couple of customers
            TipoServicio tipo = new TipoServicio(new Long(1L), "Tipo1");
            log.info("Tipo():");
            log.info(tipo.toString());
            //repo2.save(tipo);

            //repository.save(new Servicio(0L, tipo, "abc", 11, 11));

            // fetch all customers
            log.info("Customers found with findAll():");
            log.info("-------------------------------");
            for (Servicio customer : repository.findAll()) {
                log.info(customer.toString());
            }
            log.info("");

            // fetch an individual customer by ID
            Servicio customer = repository.findOne(0L);
            log.info("Customer found with findOne(0L):");
            log.info("--------------------------------");
            log.info(customer.toString());
            log.info("");
        };
    }*/
}