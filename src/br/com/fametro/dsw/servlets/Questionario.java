package br.com.fametro.dsw.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Questionario
 */
@WebServlet("/Questionario")
public class Questionario extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Questionario() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String radio1 = request.getParameter("radios1");
		String radio2 = request.getParameter("radios2");
		String radio3 = request.getParameter("radios3");
		String radio4 = request.getParameter("radios4");
		String radio5 = request.getParameter("radios5");
		String radio6 = request.getParameter("radios6");
		String radio7 = request.getParameter("radios7");
		String radio8 = request.getParameter("radios8");
		String radio9 = request.getParameter("radios9");
		String radio10 = request.getParameter("radios10");
		String radio11 = request.getParameter("radios11");
		String radio12 = request.getParameter("radios12");
		String radio13 = request.getParameter("radios13");
		
		System.out.println(radio1 + radio2 + radio3 + radio4);
				
	}

}
