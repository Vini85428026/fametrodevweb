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
		mapper.put("imc", request.getParameter("inputCadIMC"));
		mapper.put("genero", request.getParameter("radiosCadGenero"));
		mapper.put("email", request.getParameter("inputCadEmail"));
		mapper.put("cpf", request.getParameter("inputCadCPF"));
		mapper.put("senha", request.getParameter("inputCadSenha"));
				
		HttpSession ses = request.getSession();
		try {
			boolean resultado = PacienteServico.inserirPaciente(mapper);
			if(resultado){
				ses.setAttribute("mensagem","Paciente inserido com sucesso!");
				response.sendRedirect("/fametrodevweb/dashboard.jsp");
				System.out.println("paciente inserido com sucesso!");
			}else{
				ses.setAttribute("mensagem","Erro ao inserir paciente!");
				response.sendRedirect("/fametrodevweb/cadastro.jsp");
				System.out.println("erro ao inserir paciente!");
			}	
		} catch (ClassNotFoundException | ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			ses.setAttribute("mensagem","Erro ao inserir paciente!");
			response.sendRedirect("/fametrodevweb/cadastro.jsp");
			System.out.println("erro ao inserir paciente!");
		}	
	}

}
