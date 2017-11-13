package br.com.fametro.dsw.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import br.com.fametro.dsw.jdbc.ConnectionFactory;
import br.com.fametro.dsw.modelo.Usuario;

public class UsuarioDAO {
	
	public boolean inserir(Usuario us) throws ClassNotFoundException, InvalidKeyException, NoSuchAlgorithmException, NoSuchPaddingException, IllegalBlockSizeException, BadPaddingException{
			Connection conexao = ConnectionFactory.abrirConexao();
			boolean result = false;
			try {
				PreparedStatement stmt = conexao.prepareStatement("INSERT INTO usuario "  +
				" (login, senha) " + 
				" Values (?, MD5(?))") ;
				stmt.setString(1, us.getLogin());
				stmt.setString(2, us.getSenha());
				if(stmt.executeUpdate() > 0){
					result = true;
				}

				stmt.close();	
			} catch (SQLException e) {
				System.out.println(e);
				result = false;
			}			
			ConnectionFactory.FecharConexao();
			
			return result;
	}
}
