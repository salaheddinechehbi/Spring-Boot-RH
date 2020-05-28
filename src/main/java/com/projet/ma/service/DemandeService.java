package com.projet.ma.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.projet.ma.dao.IDao;
import com.projet.ma.entity.Demande;
import com.projet.ma.repository.DemandeRepository;

@Service
@Primary
public class DemandeService implements IDao<Demande> {

	@Autowired
	private DemandeRepository demandeRepository;
	
	@Override
	public void create(Demande o) {
		// TODO Auto-generated method stub
		demandeRepository.save(o);
	}

	@Override
	public void update(Demande o) {
		// TODO Auto-generated method stub
		demandeRepository.save(o);
	}

	@Override
	public void delete(Demande o) {
		// TODO Auto-generated method stub
		demandeRepository.delete(o);
	}

	@Override
	public List<Demande> findAll() {
		// TODO Auto-generated method stub
		return demandeRepository.findAll();
	}

	@Override
	public Demande findById(int id) {
		// TODO Auto-generated method stub
		return demandeRepository.findById(id).get();
	}

}
