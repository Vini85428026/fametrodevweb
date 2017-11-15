package br.com.fametro.dsw.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;

import com.mysql.jdbc.Statement;

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
	
	public Paciente buscar(String pesquisa) throws ClassNotFoundException, ParseException{
		
		Connection conexao = ConnectionFactory.abrirConexao();
		int count = 0;
		try {
			Statement st = (Statement) conexao.createStatement();
			Paciente pp = new Paciente();
			
			ResultSet res = st.executeQuery("SELECT * FROM paciente WHERE email='" + pesquisa + "' LIMIT 1");
			while (res.next()){
                count = res.getInt(1);
 
                pp.setIdCliente(Integer.parseInt(res.getString("idCliente")));
                pp.setNome(res.getString("nome"));
                pp.setIdadeBiologica(res.getString("idadeBiologica"));
                pp.setIdadeCronologica(res.getString("idadeCronologica"));
            }
			
			if(count > 0){
				return pp;
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
