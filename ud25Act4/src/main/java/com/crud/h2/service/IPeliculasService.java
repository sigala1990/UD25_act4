package com.crud.h2.service;

import java.util.List;

import com.crud.h2.dto.Peliculas;

public interface IPeliculasService {

	//Metodos del CRUD
	public List<Peliculas> listarPeliculas(); //Listar All 
	
	public Peliculas guardarPeliculas(Peliculas peliculas);	//Guarda un cliente CREATE
	
	public Peliculas peliculasXID(Long id); //Leer datos de un cliente READ
	
	public Peliculas actualizarPeliculas(Peliculas peliculas); //Actualiza datos del cliente UPDATE
	
	public void eliminarPeliculas(Long id);// Elimina el cliente DELETE
	
}
