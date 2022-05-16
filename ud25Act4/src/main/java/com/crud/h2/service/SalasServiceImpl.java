package com.crud.h2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.h2.DAO.ISalasDAO;
import com.crud.h2.dto.Salas;

@Service
public class SalasServiceImpl implements ISalasService{

	@Autowired
	ISalasDAO iSalasDAO;
	
	@Override
	public List<Salas> listarSalas() {
		return iSalasDAO.findAll();
	}

	@Override
	public Salas guardarSalas(Salas salas) {
		// TODO Auto-generated method stub
		return iSalasDAO.save(salas);
	}

	@Override
	public Salas salasXID(Long id) {
		// TODO Auto-generated method stub
		return iSalasDAO.findById(id).get();
	}

	@Override
	public Salas actualizarSalas(Salas salas) {
		// TODO Auto-generated method stub
		return iSalasDAO.save(salas);
	}

	@Override
	public void eliminarSalas(Long id) {
		iSalasDAO.deleteById(id);
		
	}

}
