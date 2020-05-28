package com.projet.ma.repository;

import java.util.Date;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.projet.ma.entity.Avertissement;

@Repository
public interface AvertissementRepository extends JpaRepository<Avertissement, Integer> {

	@Query("Select p from Avertissement p where p.employe.id= ?1 and p.dateAvertissement >= ?2 and p.dateAvertissement <= ?3")
	Avertissement[] getAvertissementByEmploye(Integer id, Date dateD, Date dateF);
}
