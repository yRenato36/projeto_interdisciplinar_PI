package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.DAO;

/**
 * Classe responsável por fazer o intermédio entre a camada VIEW e MODEL, todas as requisições que chegam de VIEW(documentos .jsp) 
 * passam por aqui, então vão para o MODEL. Logo, o MODEL devolve uma resposta, que também passa por aqui e vai para VIEW.
 * @author Renato da Silva Santana 3º ADS
 */
@WebServlet(urlPatterns = {"/Controller", "/cadastro-empresa"})
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
	DAO dao = new DAO();
	
    /**
     * Default constructor. 
     */
    public Controller() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		//testando conexão
		dao.testeconnection();
	}

}
