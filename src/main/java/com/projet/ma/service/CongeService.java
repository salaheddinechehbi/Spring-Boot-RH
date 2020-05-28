package com.projet.ma.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.projet.ma.dao.IDao;
import com.projet.ma.entity.Conge;
import com.projet.ma.repository.CongeRepository;

@Service
@Primary
public class CongeService implements IDao<Conge> {

	@Autowired
	private CongeRepository congeRepository;
	
	@Override
	public void create(Conge o) {
		// TODO Auto-generated method stub
		congeRepository.save(o);
	}

	@Override
	public void update(Conge o) {
		// TODO Auto-generated method stub
		congeRepository.save(o);
	}

	@Override
	public void delete(Conge o) {
		// TODO Auto-generated method stub
		congeRepository.delete(o);
	}

	@Override
	public List<Conge> findAll() {
		// TODO Auto-generated method stub
		return congeRepository.findAll();
	}

	@Override
	public Conge findById(int id) {
		// TODO Auto-generated method stub
		return congeRepository.findById(id).get();
	}

}
