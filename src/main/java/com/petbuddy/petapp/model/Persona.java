package com.petbuddy.petapp.model;

import javax.persistence.*;

/**
 * @author Diego Mansilla on 10/24/2016.
 */


@Entity
@Table(name = "PERSONA")
public class Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idPersona;

    @Column
    private String nombres;

    @Column
    private String apPaterno;

    @Column
    private String apMaterno;

    @Column
    private String email;

}
