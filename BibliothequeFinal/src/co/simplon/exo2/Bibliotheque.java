package co.simplon.exo2;

import java.util.ArrayList;
import java.util.List;

public class Bibliotheque {


	private String nom;
	private String adresse;
	private List <Adherent> ListeInscrits= new ArrayList <Adherent>();
	

	public Bibliotheque(String nom, String adresse) {
		super();
		this.nom = nom;
		this.adresse = adresse;
	}
	
	@Override
	public String toString() {
		return "La Bibliotheque : "+  nom + " situé a " + adresse + " a comme inscrit " + ListeInscrits + " ";
		
	}
	
	public List<Adherent> inscrire (Adherent newAdherent) {
		
		
		ListeInscrits.add(newAdherent);
		
		return ListeInscrits;
		
	}
	
	
	public List<Adherent> desinscrire (Adherent pastAdherent){
		
		
		ListeInscrits.remove(pastAdherent);
		
		return ListeInscrits;
		
	}
	
	
	
}
