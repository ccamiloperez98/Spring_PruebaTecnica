package com.example.pruebatecnica.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="obras")
public class Obra {
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(name="ID", nullable=false)
	private Integer id;
	
	@Column(name="NOMBRE", nullable=false, length = 20)
	private String nombre;
	
	@Column(name="PAIS", nullable=false, length = 30)
	private String pais;
	

	@ManyToOne
	@JoinColumn(name = "ID_ARTISTA", nullable=false, foreignKey = @ForeignKey(name="FK_artista_libro"))
	private Artista idArtista;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public Artista getIdArtista() {
		return idArtista;
	}

	public void setIdArtista(Artista idArtista) {
		this.idArtista = idArtista;
	}
}
