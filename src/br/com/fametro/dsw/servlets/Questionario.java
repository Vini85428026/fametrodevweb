package br.com.fametro.dsw.servlets;

import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;

import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.fametro.dsw.modelo.Paciente;
import br.com.fametro.dsw.servicos.QuestionarioServico;
import br.com.fametro.dsw.servicos.UsuarioServico;

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
		int idCliente = Integer.parseInt(request.getParameter("idCliente"));

		HashMap<String, Integer> map = new HashMap<String, Integer>();	
		map.put("radio1", Integer.parseInt(request.getParameter("radios1")));
		map.put("radio2", Integer.parseInt(request.getParameter("radios2")));
		map.put("radio3", Integer.parseInt(request.getParameter("radios3")));
		map.put("radio4", Integer.parseInt(request.getParameter("radios4")));
		map.put("radio5", Integer.parseInt(request.getParameter("radios5")));
		map.put("radio6", Integer.parseInt(request.getParameter("radios6")));
		map.put("radio7", Integer.parseInt(request.getParameter("radios7")));
		map.put("radio8", Integer.parseInt(request.getParameter("radios8")));
		map.put("radio9", Integer.parseInt(request.getParameter("radios9")));
		map.put("radio10", Integer.parseInt(request.getParameter("radios10")));
		map.put("radio11", Integer.parseInt(request.getParameter("radios11")));
		map.put("radio12", Integer.parseInt(request.getParameter("radios12")));
		map.put("radio13", Integer.parseInt(request.getParameter("radios13")));
		
		Paciente resultado;
		try {
			resultado = QuestionarioServico.inserirQuestionario(idCliente, map);
			if(resultado != null){
				request.setAttribute("nomeDoCliente", resultado.getNome());
				request.setAttribute("idadeBio", resultado.getIdadeBiologica());
				request.setAttribute("idadeCrono", resultado.getIdadeCronologica());
				request.setAttribute("mensagem", "Questionário resolvido com sucesso!");
				request.getRequestDispatcher("resultado.jsp").forward(request, response);
				System.out.println("Questionário resolvido com sucesso!");
			}else{
				request.setAttribute("mensagem", "Erro ao resolver questionário!");
				request.getRequestDispatcher("questions.jsp").forward(request, response);
				System.out.println("erro ao inserir questoes!");
			}		
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}

}
