package co.simplon.exo2;

import java.sql.SQLException;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

import co.simplon.exdao.AdherentDAO;
import co.simplon.exdao.DAOContext;
import co.simplon.exdao.*;


public class GestionAdherents {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		/*
		LocalDate dateNaissance =  LocalDate.of(1962,Month.JANUARY, 6);
		LocalDate dateAdhesion =  LocalDate.of(2018,Month.APRIL, 23);
		Adherent lolo = new Adherent(1, "Mitchell","Pete",dateNaissance,"Nevada", "Maverick@hotmail.com", dateAdhesion, "0132425465");
		System.out.println(lolo);
		
		
		LocalDate test  =  LocalDate.now();
		System.out.println(test);
		
		LocalDate dateNaissance1 = LocalDate.of(1979, Month.DECEMBER, 12);
		LocalDate dateEdition = LocalDate.of(2020, Month.MARCH, 10);
		LocalDate empruntJava = LocalDate.of(2020, Month.NOVEMBER, 18);
		
		Adherent lolo = new Adherent("Mitchell","Pete",dateNaissance, "Maverick@hotmail.com","Nevada");
		Adherent toto = new Adherent("Wick","John",dateNaissance1, "WickJohn@hotmail.com","New York");
		
		
		Bibliotheque BiblioKids = new Bibliotheque("Pompidou", "Paris");
		
		 BiblioKids.inscrire(toto);
		 BiblioKids.inscrire(lolo);
		  System.out.println(BiblioKids.toString());
		  
		 // SUPPRIMER UN ADHERENT
		 BiblioKids.desinscrire(toto);
		 System.out.println(BiblioKids.toString());
		
		
		
		 Exemplaire livreJava = new Exemplaire("Eyrolles",dateEdition);
		
		toto.emprunter(livreJava, empruntJava);
		System.out.println(toto);*/
		
		DAOContext.getConnection();
		
		
		
		
		
		 
	}
}



/**/