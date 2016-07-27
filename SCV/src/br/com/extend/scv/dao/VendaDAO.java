package br.com.extend.scv.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import br.com.extend.scv.conexao.FabricaDeConexao;
import br.com.extend.scv.modelo.Venda;


public class VendaDAO {

	private Connection connection;

	public VendaDAO() {
		this.connection = new FabricaDeConexao().pegaConexao();
	}

	public ArrayList<Venda> devolveListaComVendas(){

		String sql = "SELECT * from venda";

		ArrayList <Venda> listaComVendas = new ArrayList<Venda>();

		try {
			PreparedStatement ps = connection.prepareStatement(sql);

			ResultSet rs = ps.executeQuery();

			while(rs.next()) {
				
				Venda venda = new Venda();
				
				venda.setCodVenda(rs.getInt("codVenda"));
				venda.setDataVenda(rs.getString("dataVenda"));
				venda.setHoraVenda(rs.getString("horaVenda"));
				venda.setUsuario(rs.getString("usuario"));
				venda.setTotal(rs.getDouble("total"));
				
				listaComVendas.add(venda);
			}			
			rs.close();
			ps.close();
		} 
		catch (SQLException e) {
			e.printStackTrace();
		}
		return listaComVendas;
	}

	public boolean insereVenda(int codVenda, String data, String hora, String usuario , double total){
				
		boolean inseriu = false;
		
		String sql = "INSERT INTO venda(codVenda, dataVenda, horaVenda, usuario, total) VALUES " + "('"+codVenda+"','"+data+"', '"+hora+"', '"+usuario+"', '"+total+"')";

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
	
	public Venda devolveVendaOndeCodVendaEh(int codVenda){

		String sql = "SELECT * from venda where codVenda = " + codVenda;

		Venda venda = null;
		
		try {
			PreparedStatement ps = connection.prepareStatement(sql);

			ResultSet rs = ps.executeQuery();

			if(rs.next()) {
				
				venda = new Venda();
				venda.setCodVenda(rs.getInt("codVenda"));
				venda.setDataVenda(rs.getString("dataVenda"));
				venda.setHoraVenda(rs.getString("horaVenda"));
				venda.setUsuario(rs.getString("usuario"));
				venda.setTotal(rs.getDouble("total"));			
			}			
			rs.close();
			ps.close();
		} 
		catch (SQLException e) {
			e.printStackTrace();
		}
		return venda;
	}

	
	

}