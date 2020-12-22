package co.simplon.exo2;

import java.util.Date;

public class Editeur {
	
	private int idEditeur ;
	private String nomEditeur;
	private Date dateEdition;
	
	
	public Editeur() {
		super();
	}
	
	
	public Editeur(int idEditeur, String nomEditeur, Date dateEdition) {
		super();
		this.idEditeur = idEditeur;
		this.nomEditeur = nomEditeur;
		this.dateEdition = dateEdition;
	}

	public int getIdEditeur() {
		return idEditeur;
	}
	public void setIdEditeur(int idEditeur) {
		this.idEditeur = idEditeur;
	}
	public String getNomEditeur() {
		return nomEditeur;
	}
	public void setNomEditeur(String nomEditeur) {
		this.nomEditeur = nomEditeur;
	}
	public Date getDateEdition() {
		return dateEdition;
	}
	public void setDateEdition(Date dateEdition) {
		this.dateEdition = dateEdition;
	}
	

}
