package com.projet.ma.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.projet.ma.entity.Employe;

@Repository
public interface EmployeRepository extends JpaRepository<Employe, Integer> {

	@Query("Select e from Employe e where e.departement.id= ?1")
	Employe[] getEmployeByDepartement(Integer id);
	
	@Query("Select e from Employe e where e.fonction.id= ?1")
	Employe[] getEmployeByFonction(Integer id);
	
	@Query("Select count(e) as nbrEmploye,e.departement.libelle from Employe e group by e.departement ")
	String[][] getEmployeByDepartementStat();
	
	@Query("Select count(e) as nbrEmploye,e.fonction.libelle from Employe e group by e.fonction ")
	String[][] getEmployeByFunctionStat();
	
	@Query("Select e,datediff(sysdate(),e.dateNaissance) as age from Employe e where datediff(sysdate(),e.dateNaissance)>=20810")
	Employe[] getProRetr();
	
	@Query("Select e.nom as nom,e.prenom as prenom,(datediff(sysdate(),e.dateNaissance)/365) as age from Employe e where datediff(sysdate(),e.dateNaissance)>=20810")
	String[][] getProRetrt();
	
	@Query("Select e,(datediff(sysdate(),e.dateNaissance)/365) as age from Employe e where datediff(sysdate(),e.dateNaissance)>=20810")
	Object[][] getProRetrait();
}
