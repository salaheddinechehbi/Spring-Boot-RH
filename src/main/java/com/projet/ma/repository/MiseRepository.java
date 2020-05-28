package com.projet.ma.repository;

import java.util.Date;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.projet.ma.entity.Mise;

@Repository
public interface MiseRepository extends JpaRepository<Mise, Integer> {
	
	@Query("Select p from Mise p where p.employe.id= ?1 and p.dateMise >= ?2 and p.dateMise <= ?3")
	Mise[] getMiseByEmploye(Integer id, Date dateD, Date dateF);
}
