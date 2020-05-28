package com.projet.ma.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.projet.ma.dao.IDao;
import com.projet.ma.entity.Retard;
import com.projet.ma.repository.RetardRepository;

@Service
@Primary
public class RetardService implements IDao<Retard> {

	@Autowired
	private RetardRepository retardRepository;
	
	@Override
	public void create(Retard o) {
		// TODO Auto-generated method stub
		retardRepository.save(o);
	}

	@Override
	public void update(Retard o) {
		// TODO Auto-generated method stub
		retardRepository.save(o);
	}

	@Override
	public void delete(Retard o) {
		// TODO Auto-generated method stub
		retardRepository.delete(o);
	}

	@Override
	public List<Retard> findAll() {
		// TODO Auto-generated method stub
		return retardRepository.findAll();
	}

	@Override
	public Retard findById(int id) {
		// TODO Auto-generated method stub
		return retardRepository.findById(id).get();
	}

}
