package com.example.pruebatecnica.repository;

import org.springframework.stereotype.Repository;

import com.example.pruebatecnica.entity.Artista;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface IArtistaRepo extends JpaRepository<Artista,Integer>{

}
