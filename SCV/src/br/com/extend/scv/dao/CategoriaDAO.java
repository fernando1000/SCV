package br.com.extend.scv.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.extend.scv.conexao.FabricaDeConexao;
import br.com.extend.scv.modelo.Categoria;

public class CategoriaDAO {

	private Connection connection;

	public CategoriaDAO() {
		this.connection = new FabricaDeConexao().pegaConexao();
	}

	public List<Categoria> devolveListaComCategorias(){

		String sql = "SELECT * FROM categoria order by descCategoria";

		List<Categoria> listaComCategorias = new ArrayList<Categoria>();

		try {
			PreparedStatement ps = connection.prepareStatement(sql);

			ResultSet rs = ps.executeQuery();


			while(rs.next()) {
				
				Categoria categoria = new Categoria();
						  categoria.setCodCategoria(rs.getInt("codCategoria"));
						  categoria.setDescCategoria(rs.getString("descCategoria"));
				
				listaComCategorias.add(categoria);
			}			
			rs.close();
			ps.close();
		} 
		catch (SQLException e) {
			e.printStackTrace();
		}
		return listaComCategorias;
	}

	public Categoria devolveCategoriaOndeDescCategoriaEh(String cbNome){

		String sql = "SELECT * FROM categoria WHERE descCategoria LIKE '" + cbNome + "%'";

		Categoria categoria = null;
		
		try {
			PreparedStatement ps = connection.prepareStatement(sql);

			ResultSet rs = ps.executeQuery();

			if(rs.next()) {
				
				categoria = new Categoria();
   			    categoria.setDescCategoria(rs.getString("descCategoria"));
				categoria.setCodCategoria(rs.getInt("codCategoria"));
			}			
			rs.close();
			ps.close();
		} 
		catch (SQLException e) {
			e.printStackTrace();
		}
		return categoria;
	}
	
	public Categoria devolveCategoriaOndeCodCategoriaEh(int codCategoria){

		String sql = "SELECT * FROM categoria WHERE codCategoria = " + codCategoria;

		Categoria categoria = null;
		
		try {
			PreparedStatement ps = connection.prepareStatement(sql);

			ResultSet rs = ps.executeQuery();

			if(rs.next()) {
				
				categoria = new Categoria();
   			    categoria.setDescCategoria(rs.getString("descCategoria"));
				categoria.setCodCategoria(rs.getInt("codCategoria"));
			}			
			rs.close();
			ps.close();
		} 
		catch (SQLException e) {
			e.printStackTrace();
		}
		return categoria;
	}
	
	public boolean insereCategoria(String descCategoria) {

		boolean atualisou = false;
		
		String sql = "insert into categoria (descCategoria) values('" + descCategoria + "')";

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
	
	public boolean atualisaCategoria(String descCategoria, int codCategoria) {

		boolean atualisou = false;
		
		String sql = "update categoria set descCategoria='"+ descCategoria +"' where codCategoria=" + codCategoria;

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

}