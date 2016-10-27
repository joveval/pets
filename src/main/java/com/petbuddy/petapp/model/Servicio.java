package com.petbuddy.petapp.model;

import javax.persistence.*;

/**
 * @author Diego Mansilla on 10/27/2016.
 */

@Entity
@Table(name = "SERVICIO")
public class Servicio {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idServicio;

    @ManyToOne
    @JoinColumn(name = "ID_TIPO_SERVICIO")
    private TipoServicio tipoServicio;

    @Column
    private String descripcion;

    @Column
    private double coord_x;

    @Column
    private double coord_y;
}
