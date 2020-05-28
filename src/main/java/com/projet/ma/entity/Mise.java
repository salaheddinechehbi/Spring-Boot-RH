package com.projet.ma.entity;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Mise {

	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private Date dateMise;
	private String commentaire;
	private Double montant;
	@OneToOne
	private Employe employe;
	public Mise() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Mise(int id, Date dateMise, String commentaire, Double montant, Employe employe) {
		super();
		this.id = id;
		this.dateMise = dateMise;
		this.commentaire = commentaire;
		this.montant = montant;
		this.employe = employe;
	}
	public Mise(Date dateMise, String commentaire, Double montant, Employe employe) {
		super();
		this.dateMise = dateMise;
		this.commentaire = commentaire;
		this.montant = montant;
		this.employe = employe;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getDateMise() {
		return dateMise;
	}
	public void setDateMise(Date dateMise) {
		this.dateMise = dateMise;
	}
	public String getCommentaire() {
		return commentaire;
	}
	public void setCommentaire(String commentaire) {
		this.commentaire = commentaire;
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
		result = prime * result + ((commentaire == null) ? 0 : commentaire.hashCode());
		result = prime * result + ((dateMise == null) ? 0 : dateMise.hashCode());
		result = prime * result + ((employe == null) ? 0 : employe.hashCode());
		result = prime * result + id;
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
		Mise other = (Mise) obj;
		if (commentaire == null) {
			if (other.commentaire != null)
				return false;
		} else if (!commentaire.equals(other.commentaire))
			return false;
		if (dateMise == null) {
			if (other.dateMise != null)
				return false;
		} else if (!dateMise.equals(other.dateMise))
			return false;
		if (employe == null) {
			if (other.employe != null)
				return false;
		} else if (!employe.equals(other.employe))
			return false;
		if (id != other.id)
			return false;
		if (montant == null) {
			if (other.montant != null)
				return false;
		} else if (!montant.equals(other.montant))
			return false;
		return true;
	}
	
	
}
