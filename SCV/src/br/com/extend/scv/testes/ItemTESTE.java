package br.com.extend.scv.testes;

import br.com.extend.scv.dao.ItemDAO;

public class ItemTESTE {

	public static void main(String[] args) {

		ItemDAO itemDAO = new ItemDAO();
			
		boolean inseriu = itemDAO.insereItem(1, "2", 23, 80);

		if(inseriu){
			System.out.println("inseriu com sucesso :D");	
		}
		else{
			System.out.println("erro ao inserir :(");	
		}
		
	}

}
