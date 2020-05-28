package com.projet.ma.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.projet.ma.entity.Fonction;

@Repository
public interface FonctionRepository extends JpaRepository<Fonction, Integer> {

}
