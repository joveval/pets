package com.petbuddy.petapp.model;

import javax.persistence.*;

/**
 * @author Diego Mansilla on 10/27/2016.
 */

@Entity
@Table(name = "SERVICIO")
public class Servicio {
    @Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
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

    public Servicio() {
        super();
    }

    public Servicio(Long idServicio, TipoServicio tipoServicio, String descripcion, double coord_x, double coord_y) {
        super();
        this.idServicio = idServicio;
        this.tipoServicio = tipoServicio;
        this.descripcion = descripcion;
        this.coord_x = coord_x;
        this.coord_y = coord_y;
    }

    public Long getIdServicio() {
        return idServicio;
    }

    public void setIdServicio(Long idServicio) {
        this.idServicio = idServicio;
    }

    public TipoServicio getTipoServicio() {
        return tipoServicio;
    }

    public void setTipoServicio(TipoServicio tipoServicio) {
        this.tipoServicio = tipoServicio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getCoord_x() {
        return coord_x;
    }

    public void setCoord_x(double coord_x) {
        this.coord_x = coord_x;
    }

    public double getCoord_y() {
        return coord_y;
    }

    public void setCoord_y(double coord_y) {
        this.coord_y = coord_y;
    }

    @Override
    public String toString() {
        return "Servicio [idServicio=" + idServicio + ", tipoServicio=" + tipoServicio + ", descripcion=" + descripcion
                + ", coord_x=" + coord_x + ", coord_y=" + coord_y + "]";
    }


}
