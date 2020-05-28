package com.projet.ma.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.projet.ma.dao.IDao;
import com.projet.ma.entity.Departement;
import com.projet.ma.repository.DepartementRepository;

@Service
@Primary
public class DepartementService implements IDao<Departement> {

	@Autowired
	private DepartementRepository departementRepository;
	
	@Override
	public void create(Departement o) {
		// TODO Auto-generated method stub
		departementRepository.save(o);
	}

	@Override
	public void update(Departement o) {
		// TODO Auto-generated method stub
		departementRepository.save(o);
	}

	@Override
	public void delete(Departement o) {
		// TODO Auto-generated method stub
		departementRepository.delete(o);
	}

	@Override
	public List<Departement> findAll() {
		// TODO Auto-generated method stub
		return departementRepository.findAll();
	}

	@Override
	public Departement findById(int id) {
		// TODO Auto-generated method stub
		return departementRepository.findById(id).get();
	}

}
