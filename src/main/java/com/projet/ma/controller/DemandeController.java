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

import com.projet.ma.entity.Demande;
import com.projet.ma.service.DemandeService;

@RestController
@RequestMapping("/api/demande")
@CrossOrigin(origins="http://localhost:4200",allowedHeaders="*", methods = {RequestMethod.DELETE, RequestMethod.POST, RequestMethod.PUT, RequestMethod.GET})
public class DemandeController {

	@Autowired
	private DemandeService demandeService;
	
	@GetMapping
	public List<Demande> getDemande(){
		return demandeService.findAll();
	}
	
	@PostMapping
	public void addDemande(@RequestBody Demande d) {
		demandeService.create(d);
	}
	
	@PutMapping
	public void updateDemande(@RequestBody Demande d) {
		demandeService.update(d);
	}
	
	@DeleteMapping("/delete")
	@ResponseBody
	public void deleteDemande(@RequestParam(name="id") int id) {
		Demande d = demandeService.findById(id);
		demandeService.delete(d);
	}
	
	@GetMapping("/find")
	@ResponseBody
	public Demande findDemandeById(@RequestParam(name="id") int id) {
		return demandeService.findById(id);
	}
}
