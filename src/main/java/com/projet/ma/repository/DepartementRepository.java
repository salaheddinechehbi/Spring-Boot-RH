package com.projet.ma.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.projet.ma.entity.Departement;

@Repository
public interface DepartementRepository extends JpaRepository<Departement, Integer> {

}
