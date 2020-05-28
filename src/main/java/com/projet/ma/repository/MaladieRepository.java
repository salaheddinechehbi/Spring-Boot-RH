package com.projet.ma.repository;

import java.util.Date;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.projet.ma.entity.Maladie;

@Repository
public interface MaladieRepository extends JpaRepository<Maladie, Integer> {

	@Query("Select p from Maladie p where p.employe.id= ?1 and p.dateDebut >= ?2 and p.dateDebut <= ?3")
	Maladie[] getMaladieByEmploye(Integer id, Date dateD, Date dateF);
}
