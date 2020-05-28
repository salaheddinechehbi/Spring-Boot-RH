package com.projet.ma.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.projet.ma.dao.IDao;
import com.projet.ma.entity.Fonction;
import com.projet.ma.repository.FonctionRepository;

@Service
@Primary
public class FonctionService implements IDao<Fonction> {

	@Autowired
	private FonctionRepository fonctionRepository; 
	
	@Override
	public void create(Fonction o) {
		// TODO Auto-generated method stub
		fonctionRepository.save(o);
	}

	@Override
	public void update(Fonction o) {
		// TODO Auto-generated method stub
		fonctionRepository.save(o);
	}

	@Override
	public void delete(Fonction o) {
		// TODO Auto-generated method stub
		fonctionRepository.delete(o);
	}

	@Override
	public List<Fonction> findAll() {
		// TODO Auto-generated method stub
		return fonctionRepository.findAll();
	}

	@Override
	public Fonction findById(int id) {
		// TODO Auto-generated method stub
		return fonctionRepository.findById(id).get();
	}

}
