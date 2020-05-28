package com.projet.ma.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.projet.ma.entity.Departement;
import com.projet.ma.service.DepartementService;

@RestController
@RequestMapping("/api/departement")
@CrossOrigin(origins="http://localhost:4200",allowedHeaders="*", methods = {RequestMethod.DELETE, RequestMethod.POST, RequestMethod.PUT, RequestMethod.GET})
public class DepartementController {

	@Autowired
	private DepartementService departementService;
	
	@GetMapping
	public List<Departement> getDepartement(){
		return departementService.findAll();
	}
	
	@PostMapping
	public void addDepartement(@RequestBody Departement c ) {
		departementService.create(c);
	}
	
	@PutMapping
	public void updateDepartement(@RequestBody Departement c ) {
		departementService.update(c);
	}
	
	@DeleteMapping("/delete")
	@ResponseBody
	public void deleteDepartement(@RequestParam(name="id") int id) {
		Departement c = departementService.findById(id);
		departementService.delete(c);
	}
	
	@GetMapping("/find")
	@ResponseBody
	public Departement findDepartementById(@RequestParam(name="id") int id) {
		return departementService.findById(id);
	}
}
