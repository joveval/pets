package com.petbuddy.petapp.model;
// Generated 26-ene-2017 13:39:51 by Hibernate Tools 5.2.0.CR1

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Raza generated by hbm2java
 */
@Entity
@Table(name = "raza", catalog = "petbuddy")
public class Raza implements java.io.Serializable {

	private Integer idRaza;
	private String descripcion;
	private Set<TipoMascota> tipoMascotas = new HashSet<TipoMascota>(0);

	public Raza() {
	}

	public Raza(String descripcion, Set<TipoMascota> tipoMascotas) {
		this.descripcion = descripcion;
		this.tipoMascotas = tipoMascotas;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "ID_RAZA", unique = true, nullable = false)
	public Integer getIdRaza() {
		return this.idRaza;
	}

	public void setIdRaza(Integer idRaza) {
		this.idRaza = idRaza;
	}

	@Column(name = "DESCRIPCION", length = 500)
	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "raza")
	public Set<TipoMascota> getTipoMascotas() {
		return this.tipoMascotas;
	}

	public void setTipoMascotas(Set<TipoMascota> tipoMascotas) {
		this.tipoMascotas = tipoMascotas;
	}

}