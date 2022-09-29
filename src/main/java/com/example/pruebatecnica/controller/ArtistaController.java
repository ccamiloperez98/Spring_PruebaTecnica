package com.example.pruebatecnica.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.pruebatecnica.entity.Museo;
import com.example.pruebatecnica.entity.Obra;
import com.example.pruebatecnica.service.IArtistaService;

@RestController
@RequestMapping(path = "/api/artistas")
public class ArtistaController {
	
	@Autowired
	IArtistaService service;
	
	@GetMapping(path = "/obtenerObrasArtista/{id}")
	public ResponseEntity<List<Obra>> obtenerObraArtista(@PathVariable int id){
		List<Obra> obras=new ArrayList<>();
	    obras= service.listaObras(id);
		return new ResponseEntity<List<Obra>>(obras, HttpStatus.OK);
	}
	
	@GetMapping(path = "/obtenerMuseosCiudad/{ciudad}")
	public ResponseEntity<List<Museo>> obtenerObraArtista(@PathVariable String ciudad){
		List<Museo> museos=new ArrayList<>();
		museos= service.listaMuseos(ciudad);
		return new ResponseEntity<List<Museo>>(museos, HttpStatus.OK);
	}
	
}
