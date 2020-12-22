package co.simplon.exo2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


public class Adherent {

	private int idAdherent;
	private String nom;
	private String prenom;
	private LocalDate dateNaissance;
	private String adressePostale;
	private String adresseMail;
	private LocalDate dateAdhesion;
	private String telephone;
	private String categorie;
	private List<Exemplaire> listeEmprunte = new ArrayList<Exemplaire>();

	public Adherent() {
		super();
	}
	
public Adherent(int idAdherent, String nom, String prenom, LocalDate dateNaissance, String adressePostale,
		String adresseMail, LocalDate dateAdhesion, String telephone, String categorie) {
	super();
	this.idAdherent = idAdherent;
	this.nom = nom;
	this.prenom = prenom;
	this.dateNaissance = dateNaissance;
	this.adressePostale = adressePostale;
	this.adresseMail = adresseMail;
	this.dateAdhesion = dateAdhesion;
	this.telephone = telephone;
	this.categorie = categorie;
}

public Adherent(int idAdherent, String nom, String prenom, LocalDate dateNaissance, String adressePostale,
		String adresseMail, LocalDate dateAdhesion, String telephone,String categorie, List<Exemplaire> listeEmprunte) {
	super();
	this.idAdherent = idAdherent;
	this.nom = nom;
	this.prenom = prenom;
	this.dateNaissance = dateNaissance;
	this.adressePostale = adressePostale;
	this.adresseMail = adresseMail;
	this.dateAdhesion = dateAdhesion;
	this.telephone = telephone;
	this.categorie = categorie;
	this.listeEmprunte = listeEmprunte;
}


public int getIdAdherent() {
	return idAdherent;
}
public void setIdAdherent(int idAdherent) {
	this.idAdherent = idAdherent;
}


public Adherent(String nom, String prenom) {
		super();
		this.nom = nom;
		this.prenom = prenom;
	}

public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public LocalDate getDateNaissance() {
		return dateNaissance;
	}

	public void setDateNaissance(LocalDate dateNaissance) {
		this.dateNaissance = dateNaissance;
	}

	public String getAdresseMail() {
		return adresseMail;
	}

	public void setAdresseMail(String adresseMail) {
		this.adresseMail = adresseMail;
	}

	public String getAdressePostale() {
		return adressePostale;
	}

	public void setAdressePostale(String adressePostale) {
		this.adressePostale = adressePostale;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public LocalDate getDateAdhesion() {
		return dateAdhesion;
	}

	public String getCategorie() {
		return categorie;
	}

	public void setCategorie(String categorie) {
		this.categorie = categorie;
	}

	public void setDateAdhesion(LocalDate dateAdhesion) {
		this.dateAdhesion = dateAdhesion;
	}

	public List<Exemplaire> getListeEmprunte() {
		return listeEmprunte;
	}
	public void setListeEmprunte(List<Exemplaire> listeEmprunte) {
		this.listeEmprunte = listeEmprunte;
	}

    public List<Exemplaire>emprunter(Exemplaire exemple,LocalDate datePret) {
		
		listeEmprunte.add(exemple);
		
		
		return listeEmprunte ;
		
	}

	@Override
	public String toString() {
		return "Adherent [idAdherent=" + idAdherent + ", nom=" + nom + ", prenom=" + prenom + ", dateNaissance="
				+ dateNaissance + ", adressePostale=" + adressePostale + ", adresseMail=" + adresseMail
				+ ", dateAdhesion=" + dateAdhesion + ", telephone=" + telephone + ", listeEmprunte=" + listeEmprunte
				+ "]";
	}


	
	
}
