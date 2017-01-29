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
 * RelClienteMascota generated by hbm2java
 */
@Entity
@Table(name = "rel_cliente_mascota", catalog = "petbuddy")
public class RelClienteMascota implements java.io.Serializable {

	private Integer idRelClienteMascota;
	private Cliente cliente;
	private Mascota mascota;
	private Set<Transaccion> transaccions = new HashSet<Transaccion>(0);

	public RelClienteMascota() {
	}

	public RelClienteMascota(Cliente cliente, Mascota mascota) {
		this.cliente = cliente;
		this.mascota = mascota;
	}

	public RelClienteMascota(Cliente cliente, Mascota mascota, Set<Transaccion> transaccions) {
		this.cliente = cliente;
		this.mascota = mascota;
		this.transaccions = transaccions;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "ID_REL_CLIENTE_MASCOTA", unique = true, nullable = false)
	public Integer getIdRelClienteMascota() {
		return this.idRelClienteMascota;
	}

	public void setIdRelClienteMascota(Integer idRelClienteMascota) {
		this.idRelClienteMascota = idRelClienteMascota;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ID_CLIENTE", nullable = false)
	public Cliente getCliente() {
		return this.cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ID_MASCOTA", nullable = false)
	public Mascota getMascota() {
		return this.mascota;
	}

	public void setMascota(Mascota mascota) {
		this.mascota = mascota;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "relClienteMascota")
	public Set<Transaccion> getTransaccions() {
		return this.transaccions;
	}

	public void setTransaccions(Set<Transaccion> transaccions) {
		this.transaccions = transaccions;
	}

}
