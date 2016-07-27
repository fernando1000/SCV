package br.com.extend.scv.testes;

import java.sql.Connection;
import java.sql.SQLException;

import br.com.extend.scv.conexao.FabricaDeConexao;


public class ConexaoTESTE {
	
	public static void main(String [] args) throws SQLException{
		
		Connection connection = new FabricaDeConexao().pegaConexao();
		System.out.println("Conexão aberta :)");
				   connection.close();
		System.out.println("Conexão fechada!!!");
	}	
}

