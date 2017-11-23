package br.com.fametro.dsw.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import br.com.fametro.dsw.jdbc.ConnectionFactory;
import br.com.fametro.dsw.modelo.Paciente;
import br.com.fametro.dsw.modelo.Usuario;

import com.mysql.jdbc.Statement;

public class LoginDAO {
	public static Paciente buscarPaciente(String usuario, String senha) throws ClassNotFoundException{
		Connection conexao = ConnectionFactory.abrirConexao();
		int count = 0;
		try {
			Statement st = (Statement) conexao.createStatement();
			Statement st2 = (Statement) conexao.createStatement();
			Paciente pp1 = new Paciente();
			String password = "";
			
			ResultSet rs = st.executeQuery("SELECT * FROM paciente WHERE cpf = '" + usuario + "' "
					+ "OR email = '" + usuario + "' LIMIT 1");
			
			ResultSet rsSenha = st2.executeQuery("SELECT MD5('" + senha + "') as hash_senha");
			
			while (rs.next()){
                count = rs.getInt(1);
 
                pp1.setIdCliente(Integer.parseInt(rs.getString("idCliente")));
                pp1.setNome(rs.getString("nome"));
                pp1.setIdadeBiologica(rs.getString("idadeBiologica"));
                pp1.setIdadeCronologica(rs.getString("idadeCronologica"));
                pp1.setImc(Float.parseFloat(rs.getString("imc")));
                password = rs.getString("senha");
                              
            }
			
			while(rsSenha.next()){
				senha = rsSenha.getString("hash_senha");
			}
			
			if(count > 0 && password.equals(senha)){
				return pp1;
			}

			st.close();	
		} catch (SQLException e) {
			System.out.println(e);
		}finally{
			ConnectionFactory.FecharConexao();
		}
		
		return null;
	} 
	
	public static Usuario buscarUsuario(String usuario, String senha) throws ClassNotFoundException{
		Connection conexao = ConnectionFactory.abrirConexao();
		int count = 0;
		try {
			Statement st = (Statement) conexao.createStatement();
			Statement st2 = (Statement) conexao.createStatement();
			Usuario us = new Usuario();
			String password = "";
			
			ResultSet rs = st.executeQuery("SELECT * FROM usuario WHERE login = '" + usuario + "' LIMIT 1");
			
			ResultSet rsSenha = st2.executeQuery("SELECT MD5('" + senha + "') as hash_senha");
			
			while (rs.next()){
                count = rs.getInt(1);
                us.setIdUsuario(Integer.parseInt(rs.getString("idUsuario")));
                us.setLogin(rs.getString("login"));   
                password = rs.getString("senha");
            }
			
			while(rsSenha.next()){
				senha = rsSenha.getString("hash_senha");
			}
			
			if(count > 0 && password.equals(senha)){
				return us;
			}

			st.close();	
		} catch (SQLException e) {
			System.out.println(e);
		}finally{
			ConnectionFactory.FecharConexao();
		}
		
		return null;
	} 
}
