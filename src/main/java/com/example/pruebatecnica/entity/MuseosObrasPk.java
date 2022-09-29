package com.example.pruebatecnica.entity;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Embeddable
public class MuseosObrasPk implements Serializable{

	private static final long serialVersionUID = 1L;
	
	 @ManyToOne
	 @JoinColumn(name = "ID_MUSEO", nullable = false)
	 private Museo museo;
	 
	 @ManyToOne
	 @JoinColumn(name = "ID_OBRA", nullable = false)
	 private Obra obra;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((museo == null) ? 0 : museo.hashCode());
		result = prime * result + ((obra == null) ? 0 : obra.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MuseosObrasPk other = (MuseosObrasPk) obj;
		if (museo == null) {
			if (other.museo != null)
				return false;
		} else if (!museo.equals(other.museo))
			return false;
		if (obra == null) {
			if (other.obra != null)
				return false;
		} else if (!obra.equals(other.obra))
			return false;
		return true;
	}

}
