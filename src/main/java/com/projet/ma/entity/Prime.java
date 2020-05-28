package com.projet.ma.entity;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Prime {

	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private Date datePrime;
	private String libelle;
	private Double montant;
	@OneToOne
	private Employe employe; 
	
	
	public Prime() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Prime(int id, Date datePrime, String libelle, Double montant, Employe employe) {
		super();
		this.id = id;
		this.datePrime = datePrime;
		this.libelle = libelle;
		this.montant = montant;
		this.employe = employe;
	}


	public Prime(Date datePrime, String libelle, Double montant, Employe employe) {
		super();
		this.datePrime = datePrime;
		this.libelle = libelle;
		this.montant = montant;
		this.employe = employe;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public Date getDatePrime() {
		return datePrime;
	}


	public void setDatePrime(Date datePrime) {
		this.datePrime = datePrime;
	}


	public String getLibelle() {
		return libelle;
	}


	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}


	public Double getMontant() {
		return montant;
	}


	public void setMontant(Double montant) {
		this.montant = montant;
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
		result = prime * result + ((datePrime == null) ? 0 : datePrime.hashCode());
		result = prime * result + ((employe == null) ? 0 : employe.hashCode());
		result = prime * result + id;
		result = prime * result + ((libelle == null) ? 0 : libelle.hashCode());
		result = prime * result + ((montant == null) ? 0 : montant.hashCode());
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
		Prime other = (Prime) obj;
		if (datePrime == null) {
			if (other.datePrime != null)
				return false;
		} else if (!datePrime.equals(other.datePrime))
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
		if (montant == null) {
			if (other.montant != null)
				return false;
		} else if (!montant.equals(other.montant))
			return false;
		return true;
	}
	
	
	
	
	
}
