package com.projet.ma.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.projet.ma.dao.IDao;
import com.projet.ma.entity.Mise;
import com.projet.ma.repository.MiseRepository;

@Service
@Primary
public class MiseService implements IDao<Mise> {

	@Autowired 
	private MiseRepository miseRepository;
	
	@Override
	public void create(Mise o) {
		// TODO Auto-generated method stub
		miseRepository.save(o);
	}

	@Override
	public void update(Mise o) {
		// TODO Auto-generated method stub
		miseRepository.save(o);
	}

	@Override
	public void delete(Mise o) {
		// TODO Auto-generated method stub
		miseRepository.delete(o);
	}

	@Override
	public List<Mise> findAll() {
		// TODO Auto-generated method stub
		return miseRepository.findAll();
	}

	@Override
	public Mise findById(int id) {
		// TODO Auto-generated method stub
		return miseRepository.findById(id).get();
	}

}
