package com.example.pruebatecnica.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.example.pruebatecnica.entity.Museo;
import com.example.pruebatecnica.entity.Obra;

@Component
public interface IArtistaService {
	
	public List<Obra> listaObras(Integer idArtista);
	public List<Museo> listaMuseos(String ciudad);
	

}
