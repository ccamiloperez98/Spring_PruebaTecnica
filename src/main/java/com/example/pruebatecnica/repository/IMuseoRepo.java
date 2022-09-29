package com.example.pruebatecnica.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.pruebatecnica.entity.Museo;

public interface IMuseoRepo extends JpaRepository<Museo, Integer>{

	@Query("select p from Museo p where p.ciudad= :nombreCiudad")
	public List<Museo> findMuseoByCiudad(String nombreCiudad);
}
