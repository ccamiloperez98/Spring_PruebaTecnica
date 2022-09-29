package com.example.pruebatecnica.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;


@Entity
@Table(name="museos_x_obras")
@IdClass(MuseosObrasPk.class)
public class MuseosObras {
	
	 @Id
	 private Museo museo;
	
	 @Id
	 private Obra obra;

	public Museo getMuseo() {
		return museo;
	}

	public void setMuseo(Museo museo) {
		this.museo = museo;
	}

	public Obra getObra() {
		return obra;
	}

	public void setObra(Obra obra) {
		this.obra = obra;
	}
}
