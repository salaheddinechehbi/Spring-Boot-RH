package com.projet.ma.repository;

import java.util.Date;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.projet.ma.entity.Conge;

@Repository
public interface CongeRepository extends JpaRepository<Conge, Integer> {

	@Query("Select p from Conge p where p.employe.id= ?1 and p.dateDebut >= ?2 and p.dateDebut <= ?3")
	Conge[] getCongeByEmploye(Integer id, Date dateD, Date dateF);
}
