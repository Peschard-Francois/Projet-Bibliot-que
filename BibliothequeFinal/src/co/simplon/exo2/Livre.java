package co.simplon.exo2;
public class Livre {

	private int id_livre;
	private String titre;
	private Auteur auteur;
	private Genre genre;
	private Editeur editeur;
	private Motcle motcle;
	
	public Livre() {
		super();
	}
	public Livre(int id_livre, String titre, Auteur auteur, Genre genre, Editeur editeur) {
		super();
		this.id_livre = id_livre;
		this.titre = titre;
		this.auteur = auteur;
		this.genre = genre;
		this.editeur = editeur;
	}
	public Livre(int id_livre, String titre, Auteur auteur, Genre genre, Editeur editeur, Motcle motcle) {
		super();
		this.id_livre = id_livre;
		this.titre = titre;
		this.auteur = auteur;
		this.genre = genre;
		this.editeur = editeur;
		this.motcle = motcle;
	}

	public Motcle getMotcle() {
		return motcle;
	}
	public void setMotcle(Motcle motcle) {
		this.motcle = motcle;
	}
	public int getId_livre() {
		return id_livre;
	}
	public void setId_livre(int id_livre) {
		this.id_livre = id_livre;
	}
	public Genre getGenre() {
		return genre;
	}
	public void setGenre(Genre genre) {
		this.genre = genre;
	}
	public Editeur getEditeur() {
		return editeur;
	}
	public void setEditeur(Editeur editeur) {
		this.editeur = editeur;
	}

	public int getId_auteur() {
		return id_livre;
	}
	public void setId_auteur(int id_auteur) {
		this.id_livre = id_auteur;
	}

	public String getTitre() {
		return titre;
	}
	public void setTitre(String titre) {
		this.titre = titre;
	}

	public Auteur getAuteur() {
		return auteur;
	}
	public void setAuteur(Auteur auteur) {
		this.auteur = auteur;
	}

	

	
	
	
	
}
