package tn.enig.model;

import java.util.List;

public class Departement {

	
	private int id;
	private String nom;
	
	public List<Projet> listProjet; 
	public List<Employe> listEmploye; 

	
	public List<Projet> getListProjet() {
		return listProjet;
	}
	public void setListProjet(List<Projet> listProjet) {
		this.listProjet = listProjet;
	}
	public List<Employe> getListEmploye() {
		return listEmploye;
	}
	public void setListEmploye(List<Employe> listEmploye) {
		this.listEmploye = listEmploye;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public Departement(int id, String nom) {
		super();
		this.id = id;
		this.nom = nom;
	}
	public Departement() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
