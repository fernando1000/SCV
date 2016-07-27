package br.com.extend.scv.testes;

import br.com.extend.scv.dao.LoginDAO;
import br.com.extend.scv.modelo.Login;

public class LoginTeste {

	public static void main(String[] args) {

		LoginDAO loginDAO = new LoginDAO();
		
		for(Login login : loginDAO.devolveListaComUsuarios()){
			
			System.out.print(login.getCodUsuario());
			System.out.print(" | ");
			System.out.print(login.getUsuario());
			System.out.print(" | ");
			System.out.print(login.getSenha());
			System.out.println();	
		}

	}

}
