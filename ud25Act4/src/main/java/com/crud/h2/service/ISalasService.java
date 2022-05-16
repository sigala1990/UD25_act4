package com.crud.h2.service;

import java.util.List;

import com.crud.h2.dto.Salas;

public interface ISalasService {
	//Metodos del CRUD
	public List<Salas> listarSalas(); //Listar All 
	
	public Salas guardarSalas(Salas salas);	//Guarda un cliente CREATE
	
	public Salas salasXID(Long id); //Leer datos de un cliente READ
	
	public Salas actualizarSalas(Salas salas); //Actualiza datos del cliente UPDATE
	
	public void eliminarSalas(Long id);// Elimina el cliente DELETE
	
	
}


