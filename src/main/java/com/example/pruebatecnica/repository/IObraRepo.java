package com.example.pruebatecnica.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.pruebatecnica.entity.Obra;

@Repository
public interface IObraRepo extends JpaRepository<Obra,Integer>{
	
	@Query("select p from Obra p where p.idArtista= :artista")
	public List<Obra> findObraByAutor(Integer artista);

}
