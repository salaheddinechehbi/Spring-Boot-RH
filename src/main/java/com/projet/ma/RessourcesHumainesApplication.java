package com.projet.ma;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.projet.ma.controller.PrimeController;
import com.projet.ma.entity.Departement;
import com.projet.ma.entity.Employe;
import com.projet.ma.entity.Fonction;
import com.projet.ma.entity.Prime;
import com.projet.ma.repository.AbsenceRepository;
import com.projet.ma.repository.EmployeRepository;
import com.projet.ma.repository.PrimeRepository;
import com.projet.ma.service.DepartementService;
import com.projet.ma.service.EmployeService;
import com.projet.ma.service.FonctionService;

@SpringBootApplication
public class RessourcesHumainesApplication implements CommandLineRunner {

	@Autowired 
	private FonctionService fonctionService;
	
	//@Autowired
	//private EmployeService employeService;
	
	@Autowired
	private DepartementService departementService;
	@Autowired
	private EmployeRepository employeRepository;
	@Autowired
	private PrimeRepository primeRepository;
	@Autowired
	private AbsenceRepository absenceRepository;
	@Autowired
	private PrimeController primeController;
	
	public static void main(String[] args) {
		SpringApplication.run(RessourcesHumainesApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		//Fonction ff = fonctionService.findById(6);
		//Departement dd = departementService.findById(7);
		//employeService.create(new Employe(1,"Chehbi", "Salah", new Date(), "H", "chehbi.salaheddine@gmail.com", "0633318619", "DAr Essalam", 12000, new Date(), new Date(), 1, ff, dd));
		//for (Fonction f : fonctionService.findAll()) {System.out.println(f.getLibelle()+" "+ f.getId());}		
		//for (Departement em : departementService.findAll()) {System.out.println(em.getLibelle()+" id : "+em.getId());}		
		//for (String m[] : employeRepository.getEmployeByDepartementStat()) {System.out.println(m[1]+" "+m[0]);}		
		//for (String m[] : absenceRepository.getNbrAbsencesByDep()) {System.out.println(m[1]+" "+m[0]);}
		//for (String m[] : absenceRepository.getNbrAbsencesByFon()) {System.out.println(m[1]+" "+m[0]);}
		//for (Employe m : employeRepository.getProRetr()) {System.out.println(m.getNom());}
		//for (String m[] : employeRepository.getProRetrt()) {System.out.println(m[2]);}
		//for (Object m[] : employeRepository.getProRetrait()) {System.out.println(m[1]);}
		//for (String m[] : employeRepository.getEmployeByFunctionStat()) {System.out.println(m[1]+" "+m[0]);}		
		//String dd = request.getParameter("dateD");
        //String dn = request.getParameter("dateN");
        //SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        //Date dateN = format.parse(dn);
        //Date dateD = format.parse(dd);
		
		
		
		//String dd = "2019-05-01";
        //String df = "2019-06-01";
        //SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        //Date dateF = format.parse(df);
        //Date dateD = format.parse(dd);
		
		//for (Prime m : primeRepository.getPrimeByEmploye(1, dateD, dateF))
		//{System.out.println(m.getDatePrime());}

		//for (Prime m : primeController.findPrimeByEmploye(1, "2019-05-01", "2019-06-01"))
		//{System.out.println(m.getDatePrime());}
		
	}

}
