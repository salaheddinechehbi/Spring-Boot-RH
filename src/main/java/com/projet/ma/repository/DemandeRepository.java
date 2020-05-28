package com.projet.ma.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.projet.ma.entity.Demande;

@Repository
public interface DemandeRepository extends JpaRepository<Demande, Integer> {

}
