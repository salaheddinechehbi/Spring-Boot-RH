package com.projet.ma.repository;

import java.util.Date;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.projet.ma.entity.Retard;

@Repository
public interface RetardRepository extends JpaRepository<Retard, Integer> {

	@Query("Select p from Retard p where p.employe.id= ?1 and p.dateRetard >= ?2 and p.dateRetard <= ?3")
	Retard[] getRetardByEmploye(Integer id, Date dateD, Date dateF);
}
