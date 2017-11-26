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
import javax.servlet.http.HttpSession;

import br.com.fametro.dsw.servicos.LoginService;
import br.com.fametro.dsw.servicos.QuestionarioServico;

/**
 * Servlet implementation class Login
 */
@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Login() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.getRequestDispatcher("login.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String login = request.getParameter("usuario");
		String senha = request.getParameter("password");
		//HTTP Session
		HttpSession sessao = request.getSession();
		
		HashMap<String, String> paciente;
		try {
			paciente = LoginService.buscarUsuario(login, senha);
			if(paciente != null){
				List questoes = QuestionarioServico.buscarQuestionarios(Integer.parseInt(paciente.get("id")));
				
				sessao.setAttribute("id", paciente.get("id"));
				sessao.setAttribute("nome", paciente.get("nome"));
				sessao.setAttribute("tipo", paciente.get("tipo"));
				sessao.setAttribute("imc", paciente.get("imc"));
				sessao.setAttribute("idadeCrono", paciente.get("idadeCrono"));
				sessao.setAttribute("idadeBio", paciente.get("idadeBio"));
				sessao.setAttribute("listaQuestionario", questoes);
				
				if(paciente.get("tipo") == "admin"){
					request.getRequestDispatcher("dashboard.jsp").forward(request, response);
				}else{
					request.getRequestDispatcher("dashboard2.jsp").forward(request, response);
				}
				
			}else{
				request.setAttribute("mensagem", "undefined");
				request.getRequestDispatcher("login.jsp").forward(request, response);
			}
			
		} catch (ClassNotFoundException | NumberFormatException | ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		
	}

}
