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

import com.projet.ma.entity.Conge;
import com.projet.ma.repository.CongeRepository;
import com.projet.ma.service.CongeService;

@RestController
@RequestMapping("/api/conge")
@CrossOrigin(origins="http://localhost:4200",allowedHeaders="*", methods = {RequestMethod.DELETE, RequestMethod.POST, RequestMethod.PUT, RequestMethod.GET})
public class CongeController {

	@Autowired
	private CongeService congeService;
	
	@Autowired
	private CongeRepository congeRepository;
	
	@GetMapping
	public List<Conge> getConge(){
		return congeService.findAll();
	}
	
	@PostMapping
	public void addConge(@RequestBody Conge c ) {
		congeService.create(c);
	}
	
	@PutMapping
	public void updateConge(@RequestBody Conge c ) {
		congeService.update(c);
	}
	
	@DeleteMapping("/delete")
	@ResponseBody
	public void deleteConge(@RequestParam(name="id") int id) {
		Conge c = congeService.findById(id);
		congeService.delete(c);
	}
	
	@GetMapping("/find")
	@ResponseBody
	public Conge findCongeById(@RequestParam(name="id") int id) {
		return congeService.findById(id);
	}
	
	@GetMapping("/congeEmp")
	@ResponseBody
	public Conge[] findCongeByEmploye(int employeId,String dateDebut, String dateFin) throws Exception {
		String dd = dateDebut;
        String df = dateFin;
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        Date dateF = format.parse(df);
        Date dateD = format.parse(dd);
		return congeRepository.getCongeByEmploye(employeId, dateD, dateF);
	}
}
