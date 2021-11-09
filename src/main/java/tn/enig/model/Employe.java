package tn.enig.model;

public class Employe {

	
	private int id;
	private String nom,fonct;
	
	public Projet projet;
	
	public Departement Dep;
	
	
	public Employe() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employe(int id, String nom, String fonct) {
		super();
		this.id = id;
		this.nom = nom;
		this.fonct = fonct;
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
	public String getFonct() {
		return fonct;
	}
	public void setFonct(String fonct) {
		this.fonct = fonct;
	}
	public Projet getProjet() {
		return projet;
	}
	public void setProjet(Projet projet) {
		this.projet = projet;
	}
	public Departement getDep() {
		return Dep;
	}
	public void setDep(Departement dep) {
		Dep = dep;
	}
	
	
}
