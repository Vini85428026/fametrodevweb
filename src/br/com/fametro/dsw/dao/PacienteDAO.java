package br.com.fametro.dsw.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.fametro.dsw.jdbc.ConnectionFactory;
import br.com.fametro.dsw.modelo.Paciente;

public class PacienteDAO {
	public boolean inserir(Paciente pa) throws ClassNotFoundException {
		Connection conexao = ConnectionFactory.abrirConexao();
		boolean result = false;
		try {
			PreparedStatement stmt = conexao.prepareStatement("INSERT INTO paciente "  +
			" (nome, dataDeNascimento, peso, altura, imc, genero, email, cpf, senha) " + 
			" Values (?, ?, ?, ?, ?, ?, ?, ?, MD5(?))") ;
			stmt.setString(1, pa.getNome());
			stmt.setDate(2, new java.sql.Date(pa.getDataDeNascimento().getTime()));
			stmt.setFloat(3, pa.getPeso());
			stmt.setFloat(4, pa.getAltura());
			stmt.setFloat(5, pa.getImc());
			stmt.setString(6, pa.getGenero());
			stmt.setString(7, pa.getEmail());
			stmt.setString(8, pa.getCpf());
			stmt.setString(9, pa.getSenha());
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
