package com.projet.ma.entity;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Absence {

	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private Date dateDebut;
	private Date dateFin;
	private int nbrJours;
	private String libelle;
	private int justification;
	@OneToOne
	private Employe employe;
	
	public Absence() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Absence(int id, Date dateDebut, Date dateFin, int nbrJours, String libelle, Employe employe, int justification) {
		super();
		this.id = id;
		this.dateDebut = dateDebut;
		this.dateFin = dateFin;
		this.nbrJours = nbrJours;
		this.libelle = libelle;
		this.employe = employe;
		this.justification = justification;
	}
	public Absence(Date dateDebut, Date dateFin, int nbrJours, String libelle, Employe employe, int justification) {
		super();
		this.dateDebut = dateDebut;
		this.dateFin = dateFin;
		this.nbrJours = nbrJours;
		this.libelle = libelle;
		this.employe = employe;
		this.justification = justification;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getDateDebut() {
		return dateDebut;
	}
	public void setDateDebut(Date dateDebut) {
		this.dateDebut = dateDebut;
	}
	public Date getDateFin() {
		return dateFin;
	}
	public void setDateFin(Date dateFin) {
		this.dateFin = dateFin;
	}
	
	public int getJustification() {
		return justification;
	}
	public void setJustification(int justification) {
		this.justification = justification;
	}
	public int getNbrJours() {
		return nbrJours;
	}
	public void setNbrJours(int nbrJours) {
		this.nbrJours = nbrJours;
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
		result = prime * result + ((dateDebut == null) ? 0 : dateDebut.hashCode());
		result = prime * result + ((dateFin == null) ? 0 : dateFin.hashCode());
		result = prime * result + ((employe == null) ? 0 : employe.hashCode());
		result = prime * result + id;
		result = prime * result + ((libelle == null) ? 0 : libelle.hashCode());
		result = prime * result + nbrJours;
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
		Absence other = (Absence) obj;
		if (dateDebut == null) {
			if (other.dateDebut != null)
				return false;
		} else if (!dateDebut.equals(other.dateDebut))
			return false;
		if (dateFin == null) {
			if (other.dateFin != null)
				return false;
		} else if (!dateFin.equals(other.dateFin))
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
		if (nbrJours != other.nbrJours)
			return false;
		return true;
	}
	
	
	
}
