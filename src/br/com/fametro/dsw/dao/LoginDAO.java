package br.com.fametro.dsw.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

import br.com.fametro.dsw.jdbc.ConnectionFactory;
import br.com.fametro.dsw.modelo.Paciente;

import com.mysql.jdbc.Statement;

public class LoginDAO {
	public static boolean buscarUsuario(String usuario, String senha){
		Connection conexao = ConnectionFactory.abrirConexao();
		boolean res = false;
		int count = 0;
		try {
			Statement st = (Statement) conexao.createStatement();
			
			List ll = new LinkedList();
			ResultSet rs = st.executeQuery("SELECT * FROM paciente WHERE cpf = '" + usuario + "' "
					+ "OR email = '" + usuario + "'");
			while (rs.next()){
                count = rs.getInt(1);
 
                Paciente pp1 = new Paciente();
                pp1.setIdCliente(Integer.parseInt(res.getString("idCliente")));
                pp1.setNome(rs.getString("nome"));
                pp1.setIdadeBiologica(rs.getString("idadeBiologica"));
                pp1.setIdadeCronologica(rs.getString("idadeCronologica"));
                pp1.setImc(Float.parseFloat(rs.getString("imc")));
                
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
		
		return res;
	} 
}
