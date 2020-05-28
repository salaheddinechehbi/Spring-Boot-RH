package com.projet.ma.entity;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Retard {

	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private Date dateRetard;
	private int nbrMin;
	private String libelle;
	@OneToOne
	private Employe employe;
	
	public Retard() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Retard(Date dateRetard, int nbrMin, String libelle, Employe employe) {
		super();
		this.dateRetard = dateRetard;
		this.nbrMin = nbrMin;
		this.libelle = libelle;
		this.employe = employe;
	}

	public Retard(int id, Date dateRetard, int nbrMin, String libelle, Employe employe) {
		super();
		this.id = id;
		this.dateRetard = dateRetard;
		this.nbrMin = nbrMin;
		this.libelle = libelle;
		this.employe = employe;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getDateRetard() {
		return dateRetard;
	}

	public void setDateRetard(Date dateRetard) {
		this.dateRetard = dateRetard;
	}

	public int getNbrMin() {
		return nbrMin;
	}

	public void setNbrMin(int nbrMin) {
		this.nbrMin = nbrMin;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public Employe getEmploye() {
		return employe;
	}

	public void setEmploye(Employe employe) {
		this.employe = employe;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dateRetard == null) ? 0 : dateRetard.hashCode());
		result = prime * result + ((employe == null) ? 0 : employe.hashCode());
		result = prime * result + id;
		result = prime * result + ((libelle == null) ? 0 : libelle.hashCode());
		result = prime * result + nbrMin;
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
		Retard other = (Retard) obj;
		if (dateRetard == null) {
			if (other.dateRetard != null)
				return false;
		} else if (!dateRetard.equals(other.dateRetard))
			return false;
		if (employe == null) {
			if (other.employe != null)
				return false;
		} else if (!employe.equals(other.employe))
			return false;
		if (id != other.id)
			return false;
		if (libelle == null) {
			if (other.libelle != null)
				return false;
		} else if (!libelle.equals(other.libelle))
			return false;
		if (nbrMin != other.nbrMin)
			return false;
		return true;
	}
	
	
	
}
