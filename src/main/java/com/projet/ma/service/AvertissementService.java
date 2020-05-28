package com.projet.ma.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.projet.ma.dao.IDao;
import com.projet.ma.entity.Avertissement;
import com.projet.ma.repository.AvertissementRepository;

@Service
@Primary
public class AvertissementService implements IDao<Avertissement> {

	@Autowired
	private AvertissementRepository avertissementRepository;
	
	@Override
	public void create(Avertissement o) {
		// TODO Auto-generated method stub
		avertissementRepository.save(o);
		}

	@Override
	public void update(Avertissement o) {
		// TODO Auto-generated method stub
		avertissementRepository.save(o);
	}

	@Override
	public void delete(Avertissement o) {
		// TODO Auto-generated method stub
		avertissementRepository.delete(o);
	}

	@Override
	public List<Avertissement> findAll() {
		// TODO Auto-generated method stub
		return avertissementRepository.findAll();
	}

	@Override
	public Avertissement findById(int id) {
		// TODO Auto-generated method stub
		return avertissementRepository.findById(id).get();
	}

}
