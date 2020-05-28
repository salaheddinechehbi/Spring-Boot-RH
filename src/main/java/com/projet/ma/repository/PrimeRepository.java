package com.projet.ma.repository;

import java.util.Date;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.projet.ma.entity.Prime;

@Repository
public interface PrimeRepository extends JpaRepository<Prime, Integer> {

	@Query("Select p from Prime p where p.employe.id = ?1 and p.datePrime >= ?2 and p.datePrime <= ?3")
	Prime[] getPrimeByEmploye(Integer id, Date dateD, Date dateF);
}
