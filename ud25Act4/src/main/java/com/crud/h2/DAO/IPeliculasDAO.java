package com.crud.h2.DAO;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crud.h2.dto.Peliculas;

public interface IPeliculasDAO extends JpaRepository<Peliculas, Long>{

}
