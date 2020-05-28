package com.projet.ma.dao;

import java.util.List;

public interface IDao<S> {

	public void create(S o);
	public void update(S o);
	public void delete(S o);
	public List<S> findAll();
	public S findById(int id);
	
	
}
