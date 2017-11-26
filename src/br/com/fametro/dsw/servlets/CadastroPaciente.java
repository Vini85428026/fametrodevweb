package br.com.fametro.dsw.servlets;

import java.io.IOException;
import java.text.ParseException;
import java.util.HashMap;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import br.com.fametro.dsw.servicos.PacienteServico;

/**
 * Servlet implementation class CadastroPaciente
 */
@WebServlet("/CadastroPaciente")
public class CadastroPaciente extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CadastroPaciente() {
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
		HashMap<String, String> mapper = new HashMap<String, String>();
		mapper.put("nome", request.getParameter("inputCadNome"));
		mapper.put("dataNasc", request.getParameter("inputCadIdade"));
		mapper.put("peso", request.getParameter("inputCadPeso"));
		mapper.put("altura", request.getParameter("inputCadAltura"));
		mapper.put("genero", request.getParameter("radiosCadGenero"));
		mapper.put("email", request.getParameter("inputCadEmail"));
		mapper.put("cpf", request.getParameter("inputCadCPF"));
		mapper.put("senha", request.getParameter("inputCadSenha"));
				
		try {
			boolean resultado = PacienteServico.inserirPaciente(mapper);
			if(resultado){
				request.setAttribute("mensagem", "Paciente inserido com sucesso!");
				request.getRequestDispatcher("login.jsp").forward(request, response);
				System.out.println("paciente inserido com sucesso!");
			}else{
				request.setAttribute("mensagem", "Erro ao inserir paciente!");
				request.getRequestDispatcher("cadastro.jsp").forward(request, response);
				System.out.println("erro ao inserir paciente!");
			}	
		} catch (ClassNotFoundException | ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			request.setAttribute("mensagem", "Erro ao inserir paciente!");
			request.getRequestDispatcher("cadastro.jsp").forward(request, response);
			System.out.println("erro ao inserir paciente!");
		}	
	}

}
