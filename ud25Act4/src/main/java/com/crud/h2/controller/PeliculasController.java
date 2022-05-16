package com.crud.h2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crud.h2.dto.Peliculas;
import com.crud.h2.dto.Peliculas;
import com.crud.h2.service.PeliculasServiceImpl;

@RestController
@RequestMapping("/api")
public class PeliculasController {
	
	@Autowired
	PeliculasServiceImpl peliculasServiceImpl;
	
	@GetMapping("/peliculas")
	public List<Peliculas> listarPeliculas(){
		return peliculasServiceImpl.listarPeliculas();
	}
	
	@PostMapping("/peliculas")
	public Peliculas salvarPeliculas(@RequestBody Peliculas peliculas) {
		return peliculasServiceImpl.guardarPeliculas(peliculas);
	}
	
	@GetMapping("/peliculas/{codigo}")
	public Peliculas peliculasXID(@PathVariable(name="codigo")Long id) {
		Peliculas peliculas_xid = new Peliculas();
		peliculas_xid = peliculasServiceImpl.peliculasXID(id);
		System.out.println("Peliculas XID: "+peliculas_xid);
		return peliculas_xid;
	}
	
	@PutMapping("/peliculas/{codigo}")
	public Peliculas actualizarPeliculas(@PathVariable(name="codigo")Long id, @RequestBody Peliculas peliculas) {
		Peliculas peliculas_seleccionado = new Peliculas();
		Peliculas peliculas_actualizado = new Peliculas();
		
		peliculas_seleccionado = peliculasServiceImpl.peliculasXID(id);
		
		peliculas_seleccionado.setNombre(peliculas.getNombre());
		peliculas_seleccionado.setCalificacionedad(peliculas.getCalificacionedad());
		peliculas_seleccionado.setSalas(peliculas.getSalas());
		
		peliculas_actualizado = peliculasServiceImpl.actualizarPeliculas(peliculas_seleccionado);
		
		return peliculas_actualizado;
	}
	@DeleteMapping("/peliculas/{codigo}")
	public void eliminarPeliculas(@PathVariable(name="codigo")Long id) {
		peliculasServiceImpl.eliminarPeliculas(id);
	}
}
