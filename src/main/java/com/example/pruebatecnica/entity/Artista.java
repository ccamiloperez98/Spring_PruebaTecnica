package com.example.pruebatecnica.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="artistas")
public class Artista {
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(name="ID", nullable=false)
	private Integer id;
	
	@Column(name="TIPO_IDE", nullable=false, length = 5)
	private String tipoIde;
	
	@Column(name="NUMERO_IDE", nullable=false, length = 20)
	private String numeroIde;
	
	@Column(name="NOMBRES", nullable=false, length = 30)
	private String nombre;
	
	@Column(name="APELLIDOS", nullable=false, length = 30)
	private String apellidos;
	
	@OneToMany(mappedBy = "idArtista", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.LAZY)
	private List<Obra> obras;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTipoIde() {
		return tipoIde;
	}

	public void setTipoIde(String tipoIde) {
		this.tipoIde = tipoIde;
	}

	public String getNumeroIde() {
		return numeroIde;
	}

	public void setNumeroIde(String numeroIde) {
		this.numeroIde = numeroIde;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	
}
