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
 * Servlet implementation class Controller
 */
@WebServlet(urlPatterns = "/accueil", loadOnStartup = 1)
public class Controller extends HttpServlet {
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
    public Controller() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
		this.getServletContext().getRequestDispatcher("/WEB-INF/gestionBibliotheque.jsp").forward(request, response);
		
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
		
	}

}
	


