package br.com.extend.scv.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import br.com.extend.scv.conexao.FabricaDeConexao;

public class ItemDAO {

	private Connection connection;

	public ItemDAO() {
		this.connection = new FabricaDeConexao().pegaConexao();
	}

	public boolean insereItem(int codVenda, String codProduto, int qtdItem, double subTotal){
		
		boolean inseriu = false;
		
		String sql = "INSERT INTO item( codVenda, codProduto, qtdItem, subTotal) VALUES ('"+codVenda+"','"+codProduto+"', '"+qtdItem+"', '"+subTotal+"')";

		try {
			PreparedStatement ps = connection.prepareStatement(sql);
							  ps.execute();
							  ps.close();
		inseriu = true;
		} 
		catch (SQLException e) {
			e.printStackTrace();
		inseriu = false;
		}
		return inseriu;
	}
	
	


}