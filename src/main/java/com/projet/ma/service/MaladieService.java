package com.projet.ma.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.projet.ma.dao.IDao;
import com.projet.ma.entity.Maladie;
import com.projet.ma.repository.MaladieRepository;

@Service
@Primary
public class MaladieService implements IDao<Maladie> {

	@Autowired 
	private MaladieRepository maladieRepositorie;
	
	@Override
	public void create(Maladie o) {
		// TODO Auto-generated method stub
		maladieRepositorie.save(o);
	}

	@Override
	public void update(Maladie o) {
		// TODO Auto-generated method stub
		maladieRepositorie.save(o);
	}

	@Override
	public void delete(Maladie o) {
		// TODO Auto-generated method stub
		maladieRepositorie.delete(o);
	}

	@Override
	public List<Maladie> findAll() {
		// TODO Auto-generated method stub
		return maladieRepositorie.findAll();
	}

	@Override
	public Maladie findById(int id) {
		// TODO Auto-generated method stub
		return maladieRepositorie.findById(id).get();
	}

}
