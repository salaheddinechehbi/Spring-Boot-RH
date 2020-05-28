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

import com.projet.ma.entity.Prime;
import com.projet.ma.repository.PrimeRepository;
import com.projet.ma.service.PrimeService;

@RestController
@RequestMapping("/api/prime")
@CrossOrigin(origins="http://localhost:4200",allowedHeaders="*", methods = {RequestMethod.DELETE, RequestMethod.POST, RequestMethod.PUT, RequestMethod.GET})
public class PrimeController {

	@Autowired
	private PrimeService primeService;
	@Autowired
	private PrimeRepository primeRepository;
	
	@GetMapping
	public List<Prime> getPrime(){
		return primeService.findAll();
	}
	
	@PostMapping
	public void addPrime(@RequestBody Prime c ) {
		primeService.create(c);
	}
	
	@PutMapping
	public void updatePrime(@RequestBody Prime c ) {
		primeService.update(c);
	}
	
	@DeleteMapping("/delete")
	@ResponseBody
	public void deletePrime(@RequestParam(name="id") int id) {
		Prime c = primeService.findById(id);
		primeService.delete(c);
	}
	
	@GetMapping("/find")
	@ResponseBody
	public Prime findPrimeById(@RequestParam(name="id") int id) {
		return primeService.findById(id);
	}
	
	@GetMapping("/primeEmp")
	@ResponseBody
	public Prime[] findPrimeByEmploye(int employeId,String dateDebut, String dateFin) throws Exception {
		String dd = dateDebut;
        String df = dateFin;
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        Date dateF = format.parse(df);
        Date dateD = format.parse(dd);
		return primeRepository.getPrimeByEmploye(employeId, dateD, dateF);
	}
}
