package com.projet.ma.entity;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Avertissement {

	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private Date dateAvertissement;
	private String commentaire;
	@OneToOne
	private Employe employe;
	
	public Avertissement() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Avertissement(int id, Date dateAvertissement, String commentaire, Employe employe) {
		super();
		this.id = id;
		this.dateAvertissement = dateAvertissement;
		this.commentaire = commentaire;
		this.employe = employe;
	}
	public Avertissement(Date dateAvertissement, String commentaire, Employe employe) {
		super();
		this.dateAvertissement = dateAvertissement;
		this.commentaire = commentaire;
		this.employe = employe;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getDateAvertissement() {
		return dateAvertissement;
	}
	public void setDateAvertissement(Date dateAvertissement) {
		this.dateAvertissement = dateAvertissement;
	}
	public String getCommentaire() {
		return commentaire;
	}
	public void setCommentaire(String commentaire) {
		this.commentaire = commentaire;
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
		result = prime * result + ((dateAvertissement == null) ? 0 : dateAvertissement.hashCode());
		result = prime * result + ((employe == null) ? 0 : employe.hashCode());
		result = prime * result + id;
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
		Avertissement other = (Avertissement) obj;
		if (commentaire == null) {
			if (other.commentaire != null)
				return false;
		} else if (!commentaire.equals(other.commentaire))
			return false;
		if (dateAvertissement == null) {
			if (other.dateAvertissement != null)
				return false;
		} else if (!dateAvertissement.equals(other.dateAvertissement))
			return false;
		if (employe == null) {
			if (other.employe != null)
				return false;
		} else if (!employe.equals(other.employe))
			return false;
		if (id != other.id)
			return false;
		return true;
	}
	
	
}
