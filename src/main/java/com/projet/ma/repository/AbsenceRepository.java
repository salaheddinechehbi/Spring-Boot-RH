package com.projet.ma.repository;

import java.util.Date;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.projet.ma.entity.Absence;

@Repository
public interface AbsenceRepository extends JpaRepository<Absence, Integer> {

	@Query("Select p from Absence p where p.employe.id= ?1 and p.dateDebut >= ?2 and p.dateFin <= ?3")
	Absence[] getAbsenceByEmploye(Integer id, Date dateD, Date dateF);
	
	@Query("Select count(a) as nbrAbsence,a.employe.departement.libelle from Absence a GROUP BY a.employe.departement ")
	String[][] getNbrAbsencesByDep();
	
	@Query("Select count(a) as nbrAbsence,a.employe.fonction.libelle from Absence a GROUP BY a.employe.fonction ")
	String[][] getNbrAbsencesByFon();
}
