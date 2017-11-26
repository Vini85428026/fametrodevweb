package br.com.fametro.dsw.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

import com.mysql.jdbc.Statement;

import br.com.fametro.dsw.jdbc.ConnectionFactory;
import br.com.fametro.dsw.modelo.Paciente;
import br.com.fametro.dsw.modelo.Questionario;

public class QuestionarioDAO {
	public boolean inserirQuestionario(int idCliente, HashMap<String, Integer> map, int idadeCrono, String idadeBio) throws ClassNotFoundException {
		Connection conexao = ConnectionFactory.abrirConexao();
		boolean result = false;
		try {
			PreparedStatement stmt = conexao.prepareStatement("INSERT INTO formulario "  +
			" (valorResposta1,valorResposta2,valorResposta3,valorResposta4,valorResposta5,valorResposta6,"
			+ "valorResposta7,valorResposta8,valorResposta9,valorResposta10,valorResposta11,valorResposta12,"
			+ "valorResposta13,idCliente, idadeCronologica, idadeBiologica) " + 
			" VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ? ,?)") ;
			stmt.setInt(1, map.get("radio1"));
			stmt.setInt(2, map.get("radio2"));
			stmt.setInt(3, map.get("radio3"));
			stmt.setInt(4, map.get("radio4"));
			stmt.setInt(5, map.get("radio5"));
			stmt.setInt(6, map.get("radio6"));
			stmt.setInt(7, map.get("radio7"));
			stmt.setInt(8, map.get("radio8"));
			stmt.setInt(9, map.get("radio9"));
			stmt.setInt(10, map.get("radio10"));
			stmt.setInt(11, map.get("radio11"));
			stmt.setInt(12, map.get("radio12"));
			stmt.setInt(13, map.get("radio13"));
			stmt.setInt(14, idCliente);
			stmt.setInt(15, idadeCrono);
			stmt.setString(16, idadeBio);
			if(stmt.executeUpdate() > 0){
				PreparedStatement stmt2 = conexao.prepareStatement("UPDATE paciente SET"  +
				" idadeCronologica = ?, idadeBiologica = ? WHERE idCliente = ?") ;
				stmt2.setInt(1, idadeCrono);
				stmt2.setString(2, idadeBio);
				stmt2.setInt(3, idCliente);
				
				if(stmt2.executeUpdate() > 0){
					result = true;
				}
			}

			stmt.close();	
		} catch (SQLException e) {
			System.out.println(e);
			result = false;
		} finally{
			ConnectionFactory.FecharConexao();
		}		
		
		return result;
	}
	
	public List<Questionario> buscarQuestionarios(int idCliente) throws ClassNotFoundException, ParseException{
		Connection conexao = ConnectionFactory.abrirConexao();
		int count = 0;
		try {
			Statement st = (Statement) conexao.createStatement();
			
			List ll = new LinkedList();
			ResultSet res = st.executeQuery("SELECT DATE_FORMAT(datacadastro, '%d/%m/%Y %H:%i:%s') as datacadastro"
					+ ", idadeBiologica, idadeCronologica FROM formulario WHERE idCliente = " + idCliente + 
					" ORDER BY idFormulario DESC");
			while (res.next()){
                count = res.getInt(1);
 
                Questionario qq = new Questionario();
                qq.setIdadeBiologica(res.getString("idadeBiologica"));
                qq.setIdadeCronologica(res.getString("idadeCronologica"));
                qq.setDatacriacao(res.getString("datacadastro"));
                
                ll.add(qq);                
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
}
