package br.com.extend.scv.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import br.com.extend.scv.conexao.FabricaDeConexao;
import br.com.extend.scv.modelo.Produto;

public class ProdutoDAO {

	private Connection connection;

	public ProdutoDAO() {
		this.connection = new FabricaDeConexao().pegaConexao();
	}

	public ArrayList<Produto> devolveListaComProdutos() {

		String sql = "select * from produto, categoria where produto.codCategoria = categoria.codCategoria";

		ArrayList<Produto> listaComProdutos = new ArrayList<Produto>();

		try {
			PreparedStatement ps = connection.prepareStatement(sql);

			ResultSet rs = ps.executeQuery();

			while (rs.next()) {

				Produto produto = new Produto();
				produto.setCodProduto(rs.getString("codProduto"));
				produto.setCodCategoria(rs.getInt("codCategoria"));
				produto.setModelo(rs.getString("modelo"));
				produto.setTipo(rs.getString("tipo"));
				produto.setFabricante(rs.getString("fabricante"));
				produto.setQtdProduto(rs.getInt("qtdProduto"));
				produto.setCapacidade(rs.getString("capacidade"));
				produto.setPrecoCusto(rs.getDouble("precoCusto"));
				produto.setPrecoVenda(rs.getDouble("precoVenda"));
				produto.setImagem(rs.getString("imagem"));

				listaComProdutos.add(produto);
			}
			rs.close();
			ps.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return listaComProdutos;
	}

	public Produto devolve_produto_onde_parametros_sao(String modelo, String tipo, String fabri, String capaci) {

		String sql = "SELECT * FROM produto where modelo = '" + modelo + "' and tipo='" + tipo + "' and fabricante='" + fabri + "' and capacidade='" + capaci+ "' ";

		Produto produto = null;

		try {
			
			PreparedStatement ps = connection.prepareStatement(sql);

			ResultSet rs = ps.executeQuery();

			if(rs.next()) {

					produto = new Produto();
					produto.setCodProduto(rs.getString("codProduto"));
					produto.setPrecoVenda(rs.getDouble("precoVenda"));						
			}
			rs.close();
			ps.close();
		} 
		catch (SQLException e) {
			e.printStackTrace();
		}
		return produto;
	}

	public ArrayList<Produto> SELECT_distinct_tipo_FROM_produto_where_modelo_eh(String modelo) {

		String sql = "SELECT distinct tipo FROM produto where modelo = '" + modelo + "' ";

		ArrayList<Produto> listaComProdutos = new ArrayList<Produto>();

		try {
			PreparedStatement ps = connection.prepareStatement(sql);

			ResultSet rs = ps.executeQuery();

			while (rs.next()) {

				Produto produto = new Produto();
						produto.setTipo(rs.getString("tipo"));

				listaComProdutos.add(produto);
			}
			rs.close();
			ps.close();
		} 
		catch (SQLException e) {
			e.printStackTrace();
		}
		return listaComProdutos;
	}

	public ArrayList<Produto> SELECT_distinct_modelo_FROM_produto_where_codCategoria_eh(String codCategoria) {

		String sql = "SELECT distinct modelo FROM produto where codCategoria = '" + codCategoria + "' ";

		ArrayList<Produto> listaComProdutos = new ArrayList<Produto>();

		try {
			PreparedStatement ps = connection.prepareStatement(sql);

			ResultSet rs = ps.executeQuery();

			while (rs.next()) {

				Produto produto = new Produto();
						produto.setModelo(rs.getString("modelo"));

				listaComProdutos.add(produto);
			}
			rs.close();
			ps.close();
		} 
		catch (SQLException e) {
			e.printStackTrace();
		}
		return listaComProdutos;
	}

	public ArrayList<Produto> SELECT_distinct_fabricante_FROM_produto_where_model_eh_and_tipo_eh(String modelo, String tipo) {

		String sql = "SELECT distinct fabricante FROM produto where modelo = '" + modelo + "' and tipo= '" + tipo + "' ";

		ArrayList<Produto> listaComProdutos = new ArrayList<Produto>();

		try {
			PreparedStatement ps = connection.prepareStatement(sql);

			ResultSet rs = ps.executeQuery();

			while (rs.next()) {

				Produto produto = new Produto();
						produto.setFabricante(rs.getString("fabricante"));

				listaComProdutos.add(produto);
			}
			rs.close();
			ps.close();
		} 
		catch (SQLException e) {
			e.printStackTrace();
		}
		return listaComProdutos;
	}

	public ArrayList<Produto> SELECT_distinct_capacidade_FROM_produto_where_modelo_eh_and_tipo_eh_and_fabricante_eh(String modelo, String tipo, String fabri) {

		String sql = "SELECT distinct capacidade FROM produto where modelo = '" + modelo + "' and tipo= '" + tipo + "' and fabricante= '" + fabri + "' ";

		ArrayList<Produto> listaComProdutos = new ArrayList<Produto>();

		try {
			PreparedStatement ps = connection.prepareStatement(sql);

			ResultSet rs = ps.executeQuery();

			while (rs.next()) {

				Produto produto = new Produto();
						produto.setCapacidade(rs.getString("capacidade"));

				listaComProdutos.add(produto);
			}
			rs.close();
			ps.close();
		} 
		catch (SQLException e) {
			e.printStackTrace();
		}
		return listaComProdutos;
	}
	
	public Produto devolveProdutoOndeCodProdutoEh(String codProduto) {

		String sql = "select * from produto, categoria where produto.codCategoria = categoria.codCategoria and codProduto='"+ codProduto +"' ";

		Produto produto = null;

		try {
			PreparedStatement ps = connection.prepareStatement(sql);

			ResultSet rs = ps.executeQuery();

			if (rs.next()) {

				produto = new Produto();
				produto.setCodProduto(rs.getString("codProduto"));
				produto.setCodCategoria(rs.getInt("codCategoria"));
				produto.setModelo(rs.getString("modelo"));
				produto.setTipo(rs.getString("tipo"));
				produto.setFabricante(rs.getString("fabricante"));
				produto.setQtdProduto(rs.getInt("qtdProduto"));
				produto.setCapacidade(rs.getString("capacidade"));
				produto.setPrecoCusto(rs.getDouble("precoCusto"));
				produto.setPrecoVenda(rs.getDouble("precoVenda"));
				produto.setImagem(rs.getString("imagem"));
			}
			rs.close();
			ps.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return produto;
	}

	public boolean atualizaQTDprodutoOndeCodProdutoEh(int novaQtd, String codProduto) {

		boolean atualisou = false;

		String sql = "update produto set qtdProduto = " + novaQtd + " where codProduto = '" + codProduto +"' ";

		try {
			PreparedStatement ps = connection.prepareStatement(sql);

			ps.execute();
			ps.close();

			atualisou = true;
		} 
		catch (SQLException e) {
			e.printStackTrace();

			atualisou = false;
		}

		return atualisou;
	}

	public void addRemoveProdutoLixeira(int lixeira, String codProduto) {

		String sql = "update produto set lixeira = "+lixeira+" where codProduto = '" + codProduto +"' ";

		try {
			PreparedStatement ps = connection.prepareStatement(sql);

			ps.execute();
			ps.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public boolean insereProduto(Produto produto) {

		boolean atualisou = false;

		String sql = "INSERT INTO produto (codProduto, codCategoria, modelo, tipo, fabricante, qtdProduto, capacidade, precoCusto, precoVenda, imagem) VALUES (?,?,?,?,?,?,?,?,?,?)";

		try {
			PreparedStatement ps = connection.prepareStatement(sql);
			
			ps.setString(1, produto.getCodProduto());

			ps.setInt(2, produto.getCodCategoria());
			ps.setString(3, produto.getModelo());
			ps.setString(4, produto.getTipo());
			ps.setString(5, produto.getFabricante());
			ps.setInt(6, produto.getQtdProduto());
			ps.setString(7, produto.getCapacidade());
			ps.setDouble(8, produto.getPrecoCusto());
			ps.setDouble(9, produto.getPrecoVenda());
			ps.setString(10, produto.getImagem());

			ps.execute();
			ps.close();

			atualisou = true;
		} catch (SQLException e) {
			e.printStackTrace();

			atualisou = false;
		}

		return atualisou;
	}

	public boolean atualizaProduto(Produto produto) {

		boolean atualisou = false;

		String sql = "update produto set modelo=?, tipo=?, fabricante=?, qtdProduto=?, capacidade=?, precoCusto=?, precoVenda=?, imagem=? where codProduto=?";

		try {
			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setString(1, produto.getModelo());
			ps.setString(2, produto.getTipo());
			ps.setString(3, produto.getFabricante());
			ps.setInt(4, produto.getQtdProduto());
			ps.setString(5, produto.getCapacidade());
			ps.setDouble(6, produto.getPrecoCusto());
			ps.setDouble(7, produto.getPrecoVenda());
			ps.setString(8, produto.getImagem());
			ps.setString(9, produto.getCodProduto());

			ps.execute();
			ps.close();

			atualisou = true;
		} catch (SQLException e) {
			e.printStackTrace();

			atualisou = false;
		}

		return atualisou;
	}

}