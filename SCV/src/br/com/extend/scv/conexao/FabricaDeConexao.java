package br.com.extend.scv.conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class FabricaDeConexao {

	public Connection pegaConexao() {

		try {
			Class.forName("com.mysql.jdbc.Driver");

			return DriverManager.getConnection("jdbc:mysql://localhost/scv", "root", "root");
		} 
		catch (SQLException e) {
			e.printStackTrace();
		} 
		catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return null;

	}
}
