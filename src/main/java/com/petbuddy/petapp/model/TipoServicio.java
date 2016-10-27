package com.petbuddy.petapp.model;

import javax.persistence.*;

/**
 * @author Diego Mansilla on 10/27/2016.
 */
@Entity
@Table(name = "TIPO_SERVICIO")
public class TipoServicio {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idTipoServicio;

    @Column
    private String descripcion;
}
