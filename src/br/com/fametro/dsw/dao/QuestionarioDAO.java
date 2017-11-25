package br.com.fametro.dsw.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.HashMap;

import br.com.fametro.dsw.jdbc.ConnectionFactory;
import br.com.fametro.dsw.modelo.Paciente;

public class QuestionarioDAO {
	public Paciente inserirQuestionario(int idCliente, HashMap<String, Integer> map) throws ClassNotFoundException {
		Connection conexao = ConnectionFactory.abrirConexao();
		boolean result = false;
		try {
			PreparedStatement stmt = conexao.prepareStatement("INSERT INTO formulario "  +
			" (valorResposta1,valorResposta2,valorResposta3,valorResposta4,valorResposta5,valorResposta6,"
			+ "valorResposta7,valorResposta8,valorResposta9,valorResposta10,valorResposta11,valorResposta12,"
			+ "valorResposta13,idCliente, idadeCronologica, idadeBiologica) " + 
			" Values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ? ,?)") ;
			stmt.setInt(1, map.get("radio1"));
			stmt.setInt(2, map.get("radio2"));
			stmt.setInt(3, map.get("radio3"));
			stmt.setInt(4, map.get("radio4"));
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
