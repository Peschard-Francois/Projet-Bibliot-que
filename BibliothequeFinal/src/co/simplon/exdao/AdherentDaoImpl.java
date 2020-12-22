package co.simplon.exdao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import co.simplon.exo2.Adherent;






public class AdherentDaoImpl implements AdherentDAO{

	Connection connexion = null;
	PreparedStatement preparedStatement = null;
	
	
private DAOContext daoContext;
	
	public AdherentDaoImpl(DAOContext daoContext) {
		
		this.daoContext = daoContext;
		
		
	}
	
	
	public List<Adherent> lister() {
		
		List<Adherent> Ladherents = new ArrayList<Adherent>();
		
		Statement statement = null;
		ResultSet resultat = null;
		
	
try {
			
	        connexion = DAOContext.getConnection();
			statement = connexion.createStatement();
			// REQUETE SQL
			resultat = statement.executeQuery("SELECT codeMatricule,nom,prenom,dateNaissance,adresse,adresseMail,dateAdhesion,telephone,categorie FROM bibliotheque.adherent;");
			
			// RECUPERE LES DONNEES
			
			while(resultat.next()) {
				
				int codeM = resultat.getInt("codeMatricule");
				String nom = resultat.getString("nom");
				String prenom = resultat.getString("prenom");
				LocalDate dateNaissance = resultat.getDate("dateNaissance").toLocalDate();
				String adresse = resultat.getString("adresse");
				String adresseMail = resultat.getString("adresseMail");
				LocalDate dateAdhesion = resultat.getDate("dateAdhesion").toLocalDate();
				String telephone = resultat.getString("telephone");
				String categorie = resultat.getString("categorie");
				Adherent adherent = new Adherent();
	
				adherent.setIdAdherent(codeM);
				adherent.setNom(nom);
				adherent.setPrenom(prenom);
				adherent.setDateNaissance(dateNaissance);
				adherent.setAdressePostale(adresse);
				adherent.setAdresseMail(adresseMail);
				adherent.setDateAdhesion(dateAdhesion);
				adherent.setTelephone(telephone);
				adherent.setCategorie(categorie);
				
				
				Ladherents .add(adherent);
		
			}
				
			}catch (SQLException e) {
				e.printStackTrace();
			}

return Ladherents ;

	}
	
	@Override
	public void ajouter(Adherent adherent) {
		try {
			
			connexion = DAOContext.getConnection();
			preparedStatement = connexion.prepareStatement("INSERT INTO adherent(nom,prenom,dateNaissance,adresse,adresseMail,dateAdhesion,telephone,categorie) VALUES(?,?,?,?,?,?,?,?);");
			preparedStatement.setString(1, adherent.getNom());
			preparedStatement.setString(2, adherent.getPrenom());
			preparedStatement.setDate(3, Date.valueOf(adherent.getDateNaissance()));
			preparedStatement.setString(4, adherent.getAdressePostale());
			preparedStatement.setString(5, adherent.getAdresseMail());
			preparedStatement.setDate(6, Date.valueOf(adherent.getDateAdhesion()));
			preparedStatement.setString(7, adherent.getTelephone());
			preparedStatement.setString(8, adherent.getCategorie());
			
			preparedStatement.executeUpdate();
		} catch (SQLException e) {	
			e.printStackTrace();
		}
	}
	
	public void modifier(Adherent adherent) {
		
		
try {
			
			
			connexion = DAOContext.getConnection();
			preparedStatement = connexion.prepareStatement("UPDATE adherent SET nom = ?,prenom = ?,dateNaissance = ?,adresse = ?,adresseMail = ?,dateAdhesion = ?,telephone = ? ,categorie=? WHERE codeMatricule = ?;");
			
			preparedStatement.setString(1, adherent.getNom());
			preparedStatement.setString(2, adherent.getPrenom());
			preparedStatement.setDate(3, Date.valueOf(adherent.getDateNaissance()));
			preparedStatement.setString(4, adherent.getAdressePostale());
			preparedStatement.setString(5, adherent.getAdresseMail());
			preparedStatement.setDate(6, Date.valueOf(adherent.getDateAdhesion()));
			preparedStatement.setString(7, adherent.getTelephone());
			preparedStatement.setString(8, adherent.getCategorie());
			preparedStatement.setInt(9,adherent.getIdAdherent());
			
			preparedStatement.executeUpdate();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
	}
	
	public void effacer(Adherent adherent) {
		
		
		try {
		connexion = DAOContext.getConnection();
		preparedStatement = connexion.prepareStatement("DELETE FROM adherent WHERE codeMatricule = ?;");
		
		preparedStatement.setInt(1,adherent.getIdAdherent());
		
		
		preparedStatement.executeUpdate();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
	}
	
	
	
	
	
}
