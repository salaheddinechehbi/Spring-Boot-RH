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

import com.projet.ma.entity.Employe;
import com.projet.ma.repository.EmployeRepository;
import com.projet.ma.service.EmployeService;

@RestController
@RequestMapping("/api/employe")
@CrossOrigin(origins="http://localhost:4200",allowedHeaders="*", methods = {RequestMethod.DELETE, RequestMethod.POST, RequestMethod.PUT, RequestMethod.GET})
public class EmployeController {

	@Autowired 
	private EmployeService employeService;
	
	@Autowired 
	private EmployeRepository employeRepository;
	
	@GetMapping
	public List<Employe> getEmploye(){
		return employeService.findAll();
	}
	
	@PostMapping
	public void addEmploye(@RequestBody Employe c ) {
		employeService.create(c);
	}
	
	@PutMapping
	public void updateEmploye(@RequestBody Employe c ) {
		employeService.update(c);
	}
	
	@DeleteMapping("/delete")
	@ResponseBody
	public void deleteEmploye(@RequestParam(name="id") int id) {
		Employe c = employeService.findById(id);
		employeService.delete(c);
	}
	
	@GetMapping("/find")
	@ResponseBody
	public Employe findEmployeById(@RequestParam(name="id") int id) {
		return employeService.findById(id);
	}
	
	@GetMapping("/departement")
	@ResponseBody
	public Employe[] findEmployeByDepartement(@RequestParam(name="id") int id) {
		return employeRepository.getEmployeByDepartement(id);
	}
	
	@GetMapping("/fonction")
	@ResponseBody
	public Employe[] findEmployeByFonction(@RequestParam(name="id") int id) {
		return employeRepository.getEmployeByFonction(id);
	}
	
	@GetMapping("/empDep")
	@ResponseBody
	public String[][] findEmployeByDepartementStat() {
		return employeRepository.getEmployeByDepartementStat();
	}
	
	@GetMapping("/empFon")
	@ResponseBody
	public String[][] findEmployeByFonctionStat() {
		return employeRepository.getEmployeByFunctionStat();
	}
	
	@GetMapping("/proEmp")
	@ResponseBody
	public Employe[] findProEmp() {
		return employeRepository.getProRetr();
	}
	
	@GetMapping("/proEmp2")
	@ResponseBody
	public Object[][] findProEmp2() {
		return employeRepository.getProRetrait();
	}
	
}
