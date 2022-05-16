package com.crud.h2.dto;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="peliculas")
public class Peliculas {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long codigo;
	@Column(name="nombre")
	private String nombre;
	@Column(name="calificacionedad")
	private int calificacionedad;
	
	@OneToMany
	@JoinColumn(name="codigo")
	private List<Salas> salas;
	
	public Peliculas() {
		//super();
	}

	public Peliculas(Long codigo, String nombre, int calificacionedad) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.calificacionedad = calificacionedad;
	}

	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public int getCalificacionedad() {
		return calificacionedad;
	}

	public void setCalificacionedad(int calificacionEdad) {
		this.calificacionedad = calificacionEdad;
	}

	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "Salas")
	public List<Salas> getSalas() {
		return salas;
	}

	public void setSalas(List<Salas> salas) {
		this.salas = salas;
	}
	
	
}
