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

import com.crud.h2.dto.Salas;
import com.crud.h2.service.SalasServiceImpl;

@RestController
@RequestMapping("/api")
public class SalasController {

	@Autowired
	SalasServiceImpl salasServiceImpl;
	
	@GetMapping("/salas")
	public List<Salas> listarSalas(){
		return salasServiceImpl.listarSalas();
	}
	
	@PostMapping("/salas")
	public Salas salvarSalas(@RequestBody Salas salas) {
		return salasServiceImpl.guardarSalas(salas);
	}
	
	@GetMapping("/salas/{codigo}")
	public Salas salasXID(@PathVariable(name="codigo")Long id) {
		Salas salas_xid= new Salas();
		
		salas_xid= salasServiceImpl.salasXID(id);
		return salas_xid;
	}
	
	@PutMapping("/salas/{codigo}")
	public Salas actualizarSalas(@PathVariable(name="codigo")Long id,@RequestBody Salas salas) {
		Salas salas_seleccionado = new Salas();
		Salas salas_actualizado = new Salas();
		
		salas_seleccionado = salasServiceImpl.salasXID(id);
		
		salas_seleccionado.setNombre(salas.getNombre());
		salas_seleccionado.setPeliculas(salas.getPeliculas());
		
		salas_actualizado = salasServiceImpl.actualizarSalas(salas_seleccionado);
		return salas_actualizado;
	}
}
