package hei.devbew.refbiere.servlets;

import java.io.Console;
import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import hei.devweb.refbiere.entities.Pays;
import hei.devweb.refbiere.manager.PaysManager;


@WebServlet("/pays")
public class PaysServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		List<Pays> listePays = PaysManager.getInstance().listerPays();
		//System.out.println("Liste des pays via Servlet:" +listePays);
		request.setAttribute("listePays", listePays);
		
		RequestDispatcher view = request.getRequestDispatcher("/WEB-INF/pays.jsp");
		view.forward(request, response);
	}
	
	
}
