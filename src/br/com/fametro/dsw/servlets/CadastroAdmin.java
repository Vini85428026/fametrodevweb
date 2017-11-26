package br.com.fametro.dsw.servlets;

import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import br.com.fametro.dsw.servicos.UsuarioServico;

/**
 * Servlet implementation class CadastroPessoa
 */
@WebServlet("/CadastroAdmin")
public class CadastroAdmin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CadastroAdmin() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String login = request.getParameter("inputCadEmail");
		String senha = request.getParameter("inputCadSenha");
				
		boolean resultado;
		try {
			resultado = UsuarioServico.inserirUsuario(login, senha);
			
			if(resultado){
				request.setAttribute("mensagem", "Administrador inserido com sucesso!");
				request.getRequestDispatcher("login.jsp").forward(request, response);
				System.out.println("admin inserido com sucesso!");
			}else{
				request.setAttribute("mensagem", "Erro ao inserir administrador!");
				request.getRequestDispatcher("cadastroadm.jsp").forward(request, response);
				System.out.println("erro ao inserir admin!");
			}
		} catch (InvalidKeyException | ClassNotFoundException
				| NoSuchAlgorithmException | NoSuchPaddingException
				| IllegalBlockSizeException | BadPaddingException e) {
			e.printStackTrace();
			request.setAttribute("mensagem", "Erro ao inserir administrador!");
			request.getRequestDispatcher("cadastroadm.jsp").forward(request, response);
			System.out.println("erro ao inserir admin!");
		}		
	}

}
