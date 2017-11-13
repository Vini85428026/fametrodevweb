package br.com.fametro.dsw.servicos;

import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import br.com.fametro.dsw.dao.UsuarioDAO;
import br.com.fametro.dsw.modelo.Usuario;

public class UsuarioServico {

	public static boolean inserirUsuario(String login, String senha) throws InvalidKeyException, ClassNotFoundException, NoSuchAlgorithmException, NoSuchPaddingException, IllegalBlockSizeException, BadPaddingException{
		Usuario us = new Usuario();
		UsuarioDAO usDao = new UsuarioDAO();
		us.setLogin(login);
		us.setSenha(senha);
		
		return usDao.inserir(us);
		
	}
}
