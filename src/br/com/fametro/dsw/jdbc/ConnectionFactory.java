package br.com.fametro.dsw.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	public static Connection abrirConexao() throws ClassNotFoundException {
		try {
			DriverManager.registerDriver(new com.mysql.jdbc.Driver());
			return DriverManager.getConnection("jdbc:mysql://localhost:3306/idadebiologica","root","root");
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
		
	}
	

    public static boolean FecharConexao() throws ClassNotFoundException {
 
        try { 
            ConnectionFactory.abrirConexao().close();
            return true;
        } catch (SQLException e) {
            return false;
        }
    }
}
