package co.simplon.controller;

import java.io.IOException;
import java.time.LocalDate;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.simplon.exdao.AdherentDAO;
import co.simplon.exdao.DAOContext;
import co.simplon.exo2.Adherent;

/**
 * Servlet implementation class AddMofierAdherent
 */
@WebServlet("/AddMofierAdherent")
public class AddMofierAdherent extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	private AdherentDAO adherentDao;
	public void init() throws ServletException {
		DAOContext.init(getServletContext());
		DAOContext daoContext = new DAOContext();

		this.adherentDao = daoContext.getAdherentDao();
	}
	
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddMofierAdherent() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		String action = request.getParameter("action");
		Adherent adherent = new Adherent();
	
		 if  (action != null ) {

			 switch(action) {
			 
			 case "update" : 
				request.setAttribute("idAdherent", request.getParameter("id"));
				request.setAttribute("nomtest", request.getParameter("nom"));
			    request.setAttribute("prenomtest", request.getParameter("prenom"));
			    request.setAttribute("dateNaissancetest", request.getParameter("datenaissance"));
			    request.setAttribute("adressePostaletest",  request.getParameter("adresse"));
			    request.setAttribute("adresseMailtest", request.getParameter("adresseMail"));
			    request.setAttribute("teltest", request.getParameter("telephone"));
			    request.setAttribute("catgtest", request.getParameter("catg"));
			    
			    System.out.println("adherent modifier");
			    request.setAttribute("Ladherents", adherentDao.lister());
				this.getServletContext().getRequestDispatcher("/WEB-INF/addupdate.jsp").forward(request, response);
			    break;
			    
			 case "delete" :
				 adherent.setIdAdherent(Integer.parseInt(request.getParameter("id")));
				 this.adherentDao.effacer(adherent);
				 System.out.println("adherent  supprimer");
				 request.setAttribute("Ladherents", adherentDao.lister());
					this.getServletContext().getRequestDispatcher("/WEB-INF/gestionAdherent.jsp").forward(request, response);
				 break;
				 
				 default:
					 this.getServletContext().getRequestDispatcher("/WEB-INF/addupdate.jsp").forward(request, response);
					 break;

			 }

		 }
		
		 
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String idAdherent = request.getParameter("idA");
		String noma = request.getParameter("nomA");
		String prenoma = request.getParameter("prenomA");
		String datenA = request.getParameter("datenA");
		String adresseA = request.getParameter("adresseA");
		String emailA = request.getParameter("emailA");
		LocalDate dateDay = LocalDate.now();
		String telA = request.getParameter("telA");
		String catg = request.getParameter("catg");
		
		
		
		 if (request.getParameter("listeAd") != null) {

			
			request.setAttribute("Ladherents", adherentDao.lister());
			this.getServletContext().getRequestDispatcher("/WEB-INF/gestionAdherent.jsp").forward(request, response);

			}else if (request.getParameter("add1") != null  || request.getParameter("add2") != null) {

			          if(noma != "" && noma!= null ) {
			               Adherent adherent = new Adherent();
			               adherent.setNom(noma);
			               adherent.setPrenom(prenoma);
			               adherent.setDateNaissance(LocalDate.parse(datenA));
			               adherent.setAdressePostale(adresseA);
			               adherent.setAdresseMail(emailA);
			               adherent.setDateAdhesion(dateDay);
			               adherent.setTelephone(telA);
			               adherent.setCategorie(catg);
			               adherentDao.ajouter(adherent);
			}
			request.setAttribute("Ladherents", adherentDao.lister());
			this.getServletContext().getRequestDispatcher("/WEB-INF/gestionAdherent.jsp").forward(request, response);

			}else if (request.getParameter("modi") != null) {
				      
				       if(idAdherent != "" && idAdherent!= null ) {
					       Adherent adherent = new Adherent();
					       adherent.setIdAdherent(Integer.parseInt(idAdherent));
					       adherent.setNom(noma);
					       adherent.setPrenom(prenoma);
					       adherent.setDateNaissance(LocalDate.parse(datenA));
					       adherent.setAdressePostale(adresseA);
					       adherent.setAdresseMail(emailA);
					       adherent.setDateAdhesion(dateDay);
					       adherent.setTelephone(telA);
					       adherent.setCategorie(catg);
					       adherentDao.modifier(adherent);
				
			}
		 
			request.setAttribute("Ladherents", adherentDao.lister());
			this.getServletContext().getRequestDispatcher("/WEB-INF/gestionAdherent.jsp").forward(request, response);
			
			}
	}

}
