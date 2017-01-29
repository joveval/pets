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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * TipoMascota generated by hbm2java
 */
@Entity
@Table(name = "tipo_mascota", catalog = "petbuddy")
public class TipoMascota implements java.io.Serializable {

	private Integer idTipoMascota;
	private Raza raza;
	private String descripcion;
	private Set<Mascota> mascotas = new HashSet<Mascota>(0);

	public TipoMascota() {
	}

	public TipoMascota(Raza raza) {
		this.raza = raza;
	}

	public TipoMascota(Raza raza, String descripcion, Set<Mascota> mascotas) {
		this.raza = raza;
		this.descripcion = descripcion;
		this.mascotas = mascotas;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "ID_TIPO_MASCOTA", unique = true, nullable = false)
	public Integer getIdTipoMascota() {
		return this.idTipoMascota;
	}

	public void setIdTipoMascota(Integer idTipoMascota) {
		this.idTipoMascota = idTipoMascota;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ID_RAZA", nullable = false)
	public Raza getRaza() {
		return this.raza;
	}

	public void setRaza(Raza raza) {
		this.raza = raza;
	}

	@Column(name = "DESCRIPCION", length = 500)
	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "tipoMascota")
	public Set<Mascota> getMascotas() {
		return this.mascotas;
	}

	public void setMascotas(Set<Mascota> mascotas) {
		this.mascotas = mascotas;
	}

}
