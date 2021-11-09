package tn.enig.model;

public class Projet {
	
	private int id,etat ;
	private String titre;
	
	public Departement Dep;
	
	public Employe Employe;
	
	
	public Projet() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Projet(int id, String titre, int etat) {
		super();
		this.id = id;
		this.titre = titre;
		this.etat = etat;
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitre() {
		return titre;
	}
	public void setTitre(String titre) {
		this.titre = titre;
	}
	public int getEtat() {
		return etat;
	}
	public void setEtat(int etat) {
		this.etat = etat;
	}
	public Departement getDep() {
		return Dep;
	}
	public void setDep(Departement dep) {
		Dep = dep;
	}
	public Employe getEmploye() {
		return Employe;
	}
	public void setEmploye(Employe employe) {
		Employe = employe;
	}
	
	
	

}
