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

import com.projet.ma.entity.Absence;
import com.projet.ma.repository.AbsenceRepository;
import com.projet.ma.service.AbsenceService;

@RestController
@RequestMapping("/api/absence")
@CrossOrigin(origins="http://localhost:4200",allowedHeaders="*", methods = {RequestMethod.DELETE, RequestMethod.POST, RequestMethod.PUT, RequestMethod.GET})
public class AbsenceController {

	@Autowired
	private AbsenceService absenceService;
	
	@Autowired
	private AbsenceRepository absenceRepository;
	
	@GetMapping
	public List<Absence> getAbsence(){
		return absenceService.findAll();
	}
	
	@PostMapping
	public void addAbsence(@RequestBody Absence a) {
		absenceService.create(a);
	}
	
	@PutMapping
	public void updateAbsence(@RequestBody Absence a) {
		absenceService.update(a);
	}
	
	@DeleteMapping("/delete")
	@ResponseBody
	public void deleteAbsence(@RequestParam(name="id") int id) {
		Absence a = absenceService.findById(id);
		absenceService.delete(a);
	}
	
	@GetMapping("/find")
	@ResponseBody
	public Absence findAbsenceById(@RequestParam(name="id") int id) {
		return absenceService.findById(id);
	}
	
	@GetMapping("/absEmp")
	@ResponseBody
	public Absence[] findAbsenceByEmploye(int employeId,String dateDebut, String dateFin) throws Exception {
		String dd = dateDebut;
        String df = dateFin;
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        Date dateF = format.parse(df);
        Date dateD = format.parse(dd);
		return absenceRepository.getAbsenceByEmploye(employeId, dateD, dateF);
	}
}
