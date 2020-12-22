package co.simplon.exdao;

import java.util.List;

import co.simplon.exo2.Adherent;



public interface AdherentDAO {

	
	List<Adherent> lister();
	void ajouter(Adherent adherent);
	void modifier(Adherent adherent);
	void effacer(Adherent adherent);
	
	
	
}
