package com.projet.ma.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.projet.ma.dao.IDao;
import com.projet.ma.entity.Absence;
import com.projet.ma.repository.AbsenceRepository;

@Service
@Primary
public class AbsenceService implements IDao<Absence> {

	@Autowired 
	private AbsenceRepository absenceRepository;
	
	@Override
	public void create(Absence o) {
		// TODO Auto-generated method stub
		absenceRepository.save(o);
	}

	@Override
	public void update(Absence o) {
		// TODO Auto-generated method stub
		absenceRepository.save(o);
	}

	@Override
	public void delete(Absence o) {
		// TODO Auto-generated method stub
		absenceRepository.delete(o);
	}

	@Override
	public List<Absence> findAll() {
		// TODO Auto-generated method stub
		return absenceRepository.findAll();
	}

	@Override
	public Absence findById(int id) {
		// TODO Auto-generated method stub
		return absenceRepository.findById(id).get();
	}

}
