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

import com.projet.ma.entity.Mise;
import com.projet.ma.repository.MiseRepository;
import com.projet.ma.service.MiseService;

@RestController
@RequestMapping("/api/mise")
@CrossOrigin(origins="http://localhost:4200",allowedHeaders="*", methods = {RequestMethod.DELETE, RequestMethod.POST, RequestMethod.PUT, RequestMethod.GET})
public class MiseController {

	@Autowired
	private MiseService miseService;
	@Autowired
	private MiseRepository miseRepository;
	
	@GetMapping
	public List<Mise> getMise(){
		return miseService.findAll();
	}
	
	@PostMapping
	public void addMise(@RequestBody Mise c ) {
		miseService.create(c);
	}
	
	@PutMapping
	public void updateMise(@RequestBody Mise c ) {
		miseService.update(c);
	}
	
	@DeleteMapping("/delete")
	@ResponseBody
	public void deleteMise(@RequestParam(name="id") int id) {
		Mise c = miseService.findById(id);
		miseService.delete(c);
	}
	
	@GetMapping("/find")
	@ResponseBody
	public Mise findMiseById(@RequestParam(name="id") int id) {
		return miseService.findById(id);
	}
	
	@GetMapping("/miseEmp")
	@ResponseBody
	public Mise[] findMiseByEmploye(int employeId,String dateDebut, String dateFin) throws Exception {
		String dd = dateDebut;
        String df = dateFin;
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        Date dateF = format.parse(df);
        Date dateD = format.parse(dd);
		return miseRepository.getMiseByEmploye(employeId, dateD, dateF);
	}
}
