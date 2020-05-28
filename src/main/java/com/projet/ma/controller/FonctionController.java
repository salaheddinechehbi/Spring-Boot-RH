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

import com.projet.ma.entity.Fonction;
import com.projet.ma.service.FonctionService;

@RestController
@RequestMapping("/api/fonction")
@CrossOrigin(origins="http://localhost:4200",allowedHeaders="*", methods = {RequestMethod.DELETE, RequestMethod.POST, RequestMethod.PUT, RequestMethod.GET})
public class FonctionController {

	@Autowired
	private FonctionService fonctionService;
	
	@GetMapping
	public List<Fonction> getFonction(){
		return fonctionService.findAll();
	}
	
	@PostMapping
	public void addFonction(@RequestBody Fonction c ) {
		fonctionService.create(c);
	}
	
	@PutMapping
	@ResponseBody
	public void updateConge(@RequestBody Fonction c ) {
		fonctionService.update(c);
	}
	
	@DeleteMapping("/delete")
	@ResponseBody
	public void deleteeFonction(@RequestParam(name="id")  int id) {
		//System.out.println(fonctionService.findById(id).getLibelle());
		Fonction c = fonctionService.findById(id);
		fonctionService.delete(c);
	}
	
	@GetMapping("/find")
	@ResponseBody
	public Fonction findFonctionById(@RequestParam(name="id") int id) {
		return fonctionService.findById(id);
	}
}
