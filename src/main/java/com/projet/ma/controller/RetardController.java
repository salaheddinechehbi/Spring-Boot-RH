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

import com.projet.ma.entity.Retard;
import com.projet.ma.repository.RetardRepository;
import com.projet.ma.service.RetardService;

@RestController
@RequestMapping("/api/retard")
@CrossOrigin(origins="http://localhost:4200",allowedHeaders="*", methods = {RequestMethod.DELETE, RequestMethod.POST, RequestMethod.PUT, RequestMethod.GET})
public class RetardController {

	@Autowired
	private RetardService retardService;
	@Autowired
	private RetardRepository retardRepository;
	
	@GetMapping
	public List<Retard> getRetard(){
		return retardService.findAll();
	}
	
	@PostMapping
	public void addRetard(@RequestBody Retard c ) {
		retardService.create(c);
	}
	
	@PutMapping
	public void updateMise(@RequestBody Retard c ) {
		retardService.update(c);
	}
	
	@DeleteMapping("/delete")
	@ResponseBody
	public void deleteRetard(@RequestParam(name="id") int id) {
		Retard c = retardService.findById(id);
		retardService.delete(c);
	}
	
	@GetMapping("/find")
	@ResponseBody
	public Retard findRetardById(@RequestParam(name="id") int id) {
		return retardService.findById(id);
	}
	
	@GetMapping("/retardEmp")
	@ResponseBody
	public Retard[] findRetardByEmploye(int employeId,String dateDebut, String dateFin) throws Exception {
		String dd = dateDebut;
        String df = dateFin;
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        Date dateF = format.parse(df);
        Date dateD = format.parse(dd);
		return retardRepository.getRetardByEmploye(employeId, dateD, dateF);
	}
	
}
