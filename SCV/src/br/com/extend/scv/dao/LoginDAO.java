package br.com.extend.scv.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import br.com.extend.scv.conexao.FabricaDeConexao;
import br.com.extend.scv.modelo.Login;

public class LoginDAO {

	private Connection connection;

	public LoginDAO() {
		this.connection = new FabricaDeConexao().pegaConexao();
	}

	public ArrayList<Login> devolveListaComUsuarios(){

		String sql = "SELECT * from login";

		ArrayList <Login> listaComlogins = new ArrayList<Login>();

		try {
			PreparedStatement ps = connection.prepareStatement(sql);

			ResultSet rs = ps.executeQuery();


			while(rs.next()) {
				
				Login login = new Login();
				
				login.setCodUsuario(rs.getInt("codUsuario"));
				login.setUsuario(rs.getString("usuario"));
				login.setSenha(rs.getString("senha"));
				
				listaComlogins.add(login);
			}			
			rs.close();
			ps.close();
		} 
		catch (SQLException e) {
			e.printStackTrace();
		}
		return listaComlogins;
	}

	public Login devolveUsuarioOndeCodUsuarioEh(int codUsuario){

		String sql = "select * from login where codUsuario=" + codUsuario;

		Login login = null;
		
		try {
			PreparedStatement ps = connection.prepareStatement(sql);

			ResultSet rs = ps.executeQuery();


			if(rs.next()) {
				
				login = new Login();
				
				login.setCodUsuario(rs.getInt("codUsuario"));
				login.setUsuario(rs.getString("usuario"));
				login.setSenha(rs.getString("senha"));			
			}			
			rs.close();
			ps.close();
		} 
		catch (SQLException e) {
			e.printStackTrace();
		}
		return login;
	}

	public Login devolveUsuarioOndeUsuarioEh(String usuario){

		String sql = "SELECT * FROM login WHERE usuario LIKE '" + usuario.replaceAll("'", "''") + "%'";

		Login login = null;
		
		try {
			PreparedStatement ps = connection.prepareStatement(sql);

			ResultSet rs = ps.executeQuery();


			if(rs.next()) {
				
				login = new Login();
				
				login.setCodUsuario(rs.getInt("codUsuario"));
				login.setUsuario(rs.getString("usuario"));
				login.setSenha(rs.getString("senha"));			
			}			
			rs.close();
			ps.close();
		} 
		catch (SQLException e) {
			e.printStackTrace();
		}
		return login;
	}

	
	public void deletaLoginOndeCodUsuarioEh(int codUsuario) {
		
		String sql = "delete from login where codUsuario = " + codUsuario;

		try {
			PreparedStatement ps = connection.prepareStatement(sql);
	
			ps.execute();
			ps.close();		
		} 
		catch (SQLException e) {
			e.printStackTrace();	
		}		
	}

	public boolean insereUsuario(String usuario, String senha) {

		boolean atualisou = false;
		
		String sql = "INSERT INTO login ( usuario, senha) VALUES ('"+ usuario +"','"+ senha +"')";

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

	public boolean atualisaUsuario(String usuario, String senha, int codUsuario) {

		boolean atualisou = false;
		
		String sql = "update login set usuario='"+ usuario +"', senha='"+ senha +"' where codUsuario="+ codUsuario;

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