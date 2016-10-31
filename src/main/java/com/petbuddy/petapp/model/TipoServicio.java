package com.petbuddy.petapp.model;

import javax.persistence.*;

/**
 * @author Diego Mansilla on 10/27/2016.
 */
@Entity
@Table(name = "TIPO_SERVICIO")
public class TipoServicio {
    @Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idTipoServicio;

    @Column
    private String descripcion;

    public Long getIdTipoServicio() {
        return idTipoServicio;
    }


    public TipoServicio() {
        super();
    }


    public TipoServicio(Long idTipoServicio, String descripcion) {
        super();
        this.idTipoServicio = idTipoServicio;
        this.descripcion = descripcion;
    }

    public void setIdTipoServicio(Long idTipoServicio) {
        this.idTipoServicio = idTipoServicio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }


    @Override
    public String toString() {
        return "TipoServicio [idTipoServicio=" + idTipoServicio + ", descripcion=" + descripcion + "]";
    }



}
