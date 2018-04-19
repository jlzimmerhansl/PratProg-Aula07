package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Pais;
import service.PaisService;

/**
 * Servlet implementation class ManterPaisController
 */
@WebServlet("/ManterPais.do")
public class ManterPaisController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String acao = request.getParameter("acao");
		
		PaisService paisservice = new PaisService();
		
		switch (acao) {
			case "Criar":
				String pNome = request.getParameter("nome");
				Long pPopulacao = Long.parseLong(request.getParameter("populacao"));
				Double pArea = Double.parseDouble(request.getParameter("area"));
				//instanciar o javabean
				Pais pais = new Pais();
				pais.setNome(pNome);
				pais.setPopulacao(pPopulacao);
				pais.setArea(pArea);
				
				/*service*/
				paisservice.criar(pais);
				
				pais = paisservice.carregar(pais.getId());
				request.setAttribute("pais", pais);
				request.getRequestDispatcher("Pais.jsp").forward(request, response);
				break;
			case "Listar":
					List <Pais> paiseslist = paisservice.listar();
			request.setAttribute("paiseslist", paiseslist);
					request.getRequestDispatcher("ListarPaises.jsp").forward(request, response);
					break;
			}
		
	}

	
	
	



}