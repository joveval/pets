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
 * Persona generated by hbm2java
 */
@Entity
@Table(name = "persona", catalog = "petbuddy")
public class Persona implements java.io.Serializable {

	private Integer idPersona;
	private String nombres;
	private String apPaterno;
	private String apMaterno;
	private String email;
	
	public Persona() {
	}

	

	public Persona(Integer idPersona, String nombres, String apPaterno, String apMaterno, String email) {
		this.idPersona = idPersona;
		this.nombres = nombres;
		this.apPaterno = apPaterno;
		this.apMaterno = apMaterno;
		this.email = email;
	}



	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "ID_PERSONA", unique = true, nullable = false)
	public Integer getIdPersona() {
		return this.idPersona;
	}

	public void setIdPersona(Integer idPersona) {
		this.idPersona = idPersona;
	}

	@Column(name = "NOMBRES", length = 50)
	public String getNombres() {
		return this.nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	@Column(name = "AP_PATERNO", length = 50)
	public String getApPaterno() {
		return this.apPaterno;
	}

	public void setApPaterno(String apPaterno) {
		this.apPaterno = apPaterno;
	}

	@Column(name = "AP_MATERNO", length = 50)
	public String getApMaterno() {
		return this.apMaterno;
	}

	public void setApMaterno(String apMaterno) {
		this.apMaterno = apMaterno;
	}

	@Column(name = "EMAIL", length = 50)
	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}



}
