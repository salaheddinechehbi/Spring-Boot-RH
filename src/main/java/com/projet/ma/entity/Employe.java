package com.projet.ma.entity;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Employe extends Personne {

	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String nom;
	private String prenom;
	private Date dateNaissance;
	private String sexe;
	private String email;
	private String telephone;
	private String adresse;
	private Double salaire;
	private Date dateEmbauche;
	private Date dateSortie;
	private int chef;
	@ManyToOne(fetch=FetchType.EAGER)
	private Fonction fonction;
	@ManyToOne(fetch=FetchType.EAGER)
	private Departement departement;
	
	
	public Employe() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Employe(String nom, String prenom, Date dateNaissance, String sexe, String email, String telephone,
			String adresse, Double salaire, Date dateEmbauche, Date dateSortie, int chef, Fonction fonction,
			Departement departement) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.dateNaissance = dateNaissance;
		this.sexe = sexe;
		this.email = email;
		this.telephone = telephone;
		this.adresse = adresse;
		this.salaire = salaire;
		this.dateEmbauche = dateEmbauche;
		this.dateSortie = dateSortie;
		this.chef = chef;
		this.fonction = fonction;
		this.departement = departement;
	}

	public Employe(int id, String nom, String prenom, Date dateNaissance, String sexe, String email, String telephone,
			String adresse, Double salaire, Date dateEmbauche, Date dateSortie, int chef, Fonction fonction,
			Departement departement) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.dateNaissance = dateNaissance;
		this.sexe = sexe;
		this.email = email;
		this.telephone = telephone;
		this.adresse = adresse;
		this.salaire = salaire;
		this.dateEmbauche = dateEmbauche;
		this.dateSortie = dateSortie;
		this.chef = chef;
		this.fonction = fonction;
		this.departement = departement;
	}
	
	public Double getSalaire() {
		return salaire;
	}
	public void setSalaire(Double salaire) {
		this.salaire = salaire;
	}
	public int getChef() {
		return chef;
	}
	public void setChef(int chef) {
		this.chef = chef;
	}
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public Date getDateNaissance() {
		return dateNaissance;
	}

	public void setDateNaissance(Date dateNaissance) {
		this.dateNaissance = dateNaissance;
	}

	public String getSexe() {
		return sexe;
	}

	public void setSexe(String sexe) {
		this.sexe = sexe;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public Date getDateEmbauche() {
		return dateEmbauche;
	}
	public void setDateEmbauche(Date dateEmbauche) {
		this.dateEmbauche = dateEmbauche;
	}
	public Date getDateSortie() {
		return dateSortie;
	}
	public void setDateSortie(Date dateSortie) {
		this.dateSortie = dateSortie;
	}
	public Fonction getFonction() {
		return fonction;
	}
	public void setFonction(Fonction fonction) {
		this.fonction = fonction;
	}
	public Departement getDepartement() {
		return departement;
	}
	public void setDepartement(Departement departement) {
		this.departement = departement;
	}
}
