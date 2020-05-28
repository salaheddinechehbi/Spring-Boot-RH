package com.projet.ma.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.projet.ma.dao.IDao;
import com.projet.ma.entity.Prime;
import com.projet.ma.repository.PrimeRepository;

@Service
@Primary
public class PrimeService implements IDao<Prime> {

	@Autowired
	private PrimeRepository primeRepository;
	
	@Override
	public void create(Prime o) {
		// TODO Auto-generated method stub
		primeRepository.save(o);
	}

	@Override
	public void update(Prime o) {
		// TODO Auto-generated method stub
		primeRepository.save(o);
	}

	@Override
	public void delete(Prime o) {
		// TODO Auto-generated method stub
		primeRepository.delete(o);
	}

	@Override
	public List<Prime> findAll() {
		// TODO Auto-generated method stub
		return primeRepository.findAll();
	}

	@Override
	public Prime findById(int id) {
		// TODO Auto-generated method stub
		return primeRepository.findById(id).get();
	}

}
