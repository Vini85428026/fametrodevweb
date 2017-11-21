package br.com.fametro.dsw.servlets;

import java.io.IOException;
import java.text.ParseException;
import java.util.HashMap;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.fametro.dsw.modelo.Paciente;
import br.com.fametro.dsw.servicos.PacienteServico;

/**
 * Servlet implementation class PesquisarPaciente
 */
@WebServlet("/PesquisarPaciente")
public class PesquisarPaciente extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PesquisarPaciente() {
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
		String pesquisa = request.getParameter("inputPesquisa");
		
		try {
			List pacientes = PacienteServico.buscarPaciente(pesquisa);
			if(pacientes != null){		
				request.setAttribute("listaPesquisa", pacientes);
				System.out.println(pacientes);
			}else{
				request.setAttribute("mensagem", "undefined");
			}
		} catch (ClassNotFoundException | ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		request.getRequestDispatcher("pesquisa.jsp").forward(request, response);
	}

}
