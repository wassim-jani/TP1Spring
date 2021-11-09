package tn.enig.dao;

import java.util.List;

import tn.enig.model.Departement;
import tn.enig.model.Employe;
import tn.enig.model.Projet;

public interface IGestion {
	
	public List<Departement> getAllDepartement(); 
	public List<Employe> getEmployeByDepId(int id);
	public List<Projet> getProjetByDepId(int id);
	public List<Employe> getEmployeByProjetId(int id);
	public void ajoutProjet(Projet p);
	public void ajoutEmploye(Employe e); 

}
