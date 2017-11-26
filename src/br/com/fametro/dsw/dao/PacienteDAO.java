package br.com.fametro.dsw.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

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
	
	public List<Paciente> buscar(String pesquisa) throws ClassNotFoundException, ParseException{
		
		Connection conexao = ConnectionFactory.abrirConexao();
		int count = 0;
		try {
			Statement st = (Statement) conexao.createStatement();
			
			List ll = new LinkedList();
			ResultSet res = st.executeQuery("SELECT * FROM paciente WHERE email LIKE '%" + pesquisa + "%' OR "
					+ "nome LIKE '%" + pesquisa + "%'");
			while (res.next()){
                count = res.getInt(1);
 
                Paciente pp1 = new Paciente();
                pp1.setIdCliente(Integer.parseInt(res.getString("idCliente")));
                pp1.setNome(res.getString("nome"));
                pp1.setIdadeBiologica(res.getString("idadeBiologica"));
                pp1.setIdadeCronologica(res.getString("idadeCronologica"));
                pp1.setImc(Float.parseFloat(res.getString("imc")));
                
                ll.add(pp1);                
            }
			
			if(count > 0){
				return ll;
			}

			st.close();	
		} catch (SQLException e) {
			System.out.println(e);
		}finally{
			ConnectionFactory.FecharConexao();
		}
		
		return null;
	}
	
	public static Paciente buscarPorId(int id) throws ClassNotFoundException{
		Connection conexao = ConnectionFactory.abrirConexao();
		int count = 0;
		try {
			Statement st = (Statement) conexao.createStatement();
			Paciente pp1 = new Paciente();
			
			ResultSet res = st.executeQuery("SELECT * FROM paciente WHERE idCliente = '" + id + "'");
			while (res.next()){
                count = res.getInt(1);  
                pp1.setIdCliente(Integer.parseInt(res.getString("idCliente")));
                pp1.setNome(res.getString("nome"));
                pp1.setIdadeBiologica(res.getString("idadeBiologica"));
                pp1.setIdadeCronologica(res.getString("idadeCronologica"));
                pp1.setImc(Float.parseFloat(res.getString("imc")));
                pp1.setAltura(Float.parseFloat(res.getString("altura")));
                pp1.setPeso(Float.parseFloat(res.getString("peso")));
                pp1.setEmail(res.getString("email"));
            }
			
			if(count > 0){
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
}
