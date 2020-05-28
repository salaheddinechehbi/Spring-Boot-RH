package com.projet.ma.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
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

import com.projet.ma.entity.Maladie;
import com.projet.ma.repository.MaladieRepository;
import com.projet.ma.service.MaladieService;

@RestController
@RequestMapping("/api/maladie")
@CrossOrigin(origins="http://localhost:4200",allowedHeaders="*", methods = {RequestMethod.DELETE, RequestMethod.POST, RequestMethod.PUT, RequestMethod.GET})
public class MaladieController {

	@Autowired
	private MaladieService maladieService;
	
	@Autowired
	private MaladieRepository maladieRepository;
	
	@GetMapping
	public List<Maladie> getMaladie(){
		return maladieService.findAll();
	}
	
	@PostMapping
	public void addMaladie(@RequestBody Maladie c ) {
		maladieService.create(c);
	}
	
	@PutMapping
	public void updateMaladie(@RequestBody Maladie c ) {
		maladieService.update(c);
	}
	
	@DeleteMapping("/delete")
	@ResponseBody
	public void deleteMaladie(@RequestParam(name="id") int id) {
		Maladie c = maladieService.findById(id);
		maladieService.delete(c);
	}
	
	@GetMapping("/find")
	@ResponseBody
	public Maladie findMaladieById(@RequestParam(name="id") int id) {
		return maladieService.findById(id);
	}
	
	@GetMapping("/maladieEmp")
	@ResponseBody
	public Maladie[] findMaladieByEmploye(int employeId,String dateDebut, String dateFin) throws Exception {
		String dd = dateDebut;
        String df = dateFin;
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        Date dateF = format.parse(df);
        Date dateD = format.parse(dd);
		return maladieRepository.getMaladieByEmploye(employeId, dateD, dateF);
	}
}
