package co.simplon.exo2;

import java.time.LocalDate;

public class Exemplaire extends Livre {
	
	private String nomEdition;
	private LocalDate anneeEdition;
	private Editeur editeur;
	
	public Exemplaire() {
		super();
	}

	public Exemplaire(String nomEdition, LocalDate anneeEdition, Editeur editeur) {
		super();
		this.nomEdition = nomEdition;
		this.anneeEdition = anneeEdition;
		this.editeur = editeur;
	}

	public Exemplaire(String nomEdition, LocalDate anneeEdition) {
		super();
		this.nomEdition = nomEdition;
		this.anneeEdition = anneeEdition;
	}

	public String getNomEdition() {
		return nomEdition;
	}

	public void setNomEdition(String nomEdition) {
		this.nomEdition = nomEdition;
	}

	public LocalDate getAnneeEdition() {
		return anneeEdition;
	}

	public void setAnneeEdition(LocalDate anneeEdition) {
		this.anneeEdition = anneeEdition;
	}

	public Editeur getEditeur() {
		return editeur;
	}

	public void setEditeur(Editeur editeur) {
		this.editeur = editeur;
	}
	
	

	

	
	
	
}
