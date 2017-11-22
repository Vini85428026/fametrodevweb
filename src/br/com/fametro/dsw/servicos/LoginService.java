package br.com.fametro.dsw.servicos;

import br.com.fametro.dsw.dao.LoginDAO;

public class LoginService {
	public static boolean buscarUsuario(String usuario, String senha) {
		LoginDAO logDAO = new LoginDAO();
		
		return logDAO.buscarUsuario(usuario, senha);
	}
}
