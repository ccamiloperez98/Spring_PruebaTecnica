package com.example.pruebatecnica.service.imp;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.pruebatecnica.entity.Museo;
import com.example.pruebatecnica.entity.Obra;
import com.example.pruebatecnica.repository.IMuseoRepo;
import com.example.pruebatecnica.repository.IObraRepo;
import com.example.pruebatecnica.service.IArtistaService;

@Service
public class ArtistaServiceImp implements IArtistaService{
	
	@Autowired
	private IObraRepo obraRepo;
	
	@Autowired
	private IMuseoRepo museoRepo;

	@Override
	public List<Obra> listaObras(Integer idArtista) {
		List<Obra> obras = obraRepo.findObraByAutor(idArtista);
		return obras;
	}

	@Override
	public List<Museo> listaMuseos(String ciudad) {
		List<Museo> Museos = museoRepo.findMuseoByCiudad(ciudad);
		List<Museo> MuseosLetraL=new ArrayList<>();
		for (Museo museo : Museos) {
			if(museo.getNombre().startsWith("L")) {
				MuseosLetraL.add(museo);
			}
		}
		return MuseosLetraL;
	}

}
