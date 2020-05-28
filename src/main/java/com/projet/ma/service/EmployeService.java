package com.projet.ma.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.projet.ma.dao.IDao;
import com.projet.ma.entity.Employe;
import com.projet.ma.repository.EmployeRepository;

@Service
@Primary
public class EmployeService implements IDao<Employe> {

	@Autowired
	private EmployeRepository employeRepository;
	
	@Override
	public void create(Employe o) {
		// TODO Auto-generated method stub
		employeRepository.save(o);
	}

	@Override
	public void update(Employe o) {
		// TODO Auto-generated method stub
		employeRepository.save(o);
	}

	@Override
	public void delete(Employe o) {
		// TODO Auto-generated method stub
		employeRepository.delete(o);
	}

	@Override
	public List<Employe> findAll() {
		// TODO Auto-generated method stub
		return employeRepository.findAll();
	}

	@Override
	public Employe findById(int id) {
		// TODO Auto-generated method stub
		return employeRepository.findById(id).get();
	}

}
