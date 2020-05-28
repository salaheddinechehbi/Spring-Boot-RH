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

import com.projet.ma.entity.Avertissement;
import com.projet.ma.repository.AvertissementRepository;
import com.projet.ma.service.AvertissementService;

@RestController
@RequestMapping("/api/avertissement")
@CrossOrigin(origins="http://localhost:4200",allowedHeaders="*", methods = {RequestMethod.DELETE, RequestMethod.POST, RequestMethod.PUT, RequestMethod.GET})
public class AvertissementController {

	@Autowired
	private AvertissementService avertissementService;
	
	@Autowired
	private AvertissementRepository avertissementRepository;
	
	@GetMapping
	public List<Avertissement> getAvertissement(){
		return avertissementService.findAll();
	}
	
	@PostMapping
	public void addAvertissement(@RequestBody Avertissement a) {
		avertissementService.create(a);
	}
	
	@PutMapping
	public void updateAvertissement(@RequestBody Avertissement a) {
		avertissementService.update(a);
	}
	
	@DeleteMapping("/delete")
	@ResponseBody
	public void deleteAvertissement(@RequestParam(name="id") int id) {
		Avertissement a = avertissementService.findById(id);
		avertissementService.delete(a);
	}
	
	@GetMapping("/find")
	@ResponseBody
	public Avertissement findAvertissementById(@RequestParam(name="id") int id) {
		return avertissementService.findById(id);
	}
	
	@GetMapping("/averEmp")
	@ResponseBody
	public Avertissement[] findAvertissementByEmploye(int employeId,String dateDebut, String dateFin) throws Exception {
		String dd = dateDebut;
        String df = dateFin;
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        Date dateF = format.parse(df);
        Date dateD = format.parse(dd);
		return avertissementRepository.getAvertissementByEmploye(employeId, dateD, dateF);
	}
	
}
