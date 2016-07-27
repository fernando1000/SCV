package br.com.extend.scv.testes;

import br.com.extend.scv.dao.VendaDAO;
import br.com.extend.scv.modelo.Venda;

public class VendaTESTE {

	public static void main(String[] args) {

		VendaDAO vendaDAO = new VendaDAO();
		
		/*
		for(Venda venda : vendaDAO.devolveListaComVendas()){
			
			System.out.print(venda.getCodVenda());
			System.out.print(" | ");
			System.out.print(venda.getDataVenda());
			System.out.print(" | ");
			System.out.print(venda.getHoraVenda());
			System.out.print(" | ");
			System.out.print(venda.getUsuario());
			System.out.print(" | ");
			System.out.print(venda.getTotal());
			System.out.println();	
		}
		*/
	
		/*
		boolean inseriu = vendaDAO.insereVenda(3, "2016-04-01", "16:30", "usuario", "400");

		if(inseriu){
			System.out.println("inseriu com sucesso :D");	
		}
		else{
			System.out.println("erro ao inserir :(");	
		}
		*/
	
		Venda venda = vendaDAO.devolveVendaOndeCodVendaEh(1);
	if(venda != null){
		System.out.print(venda.getCodVenda());
		System.out.print(" | ");
		System.out.print(venda.getDataVenda());
		System.out.print(" | ");
		System.out.print(venda.getHoraVenda());
		System.out.print(" | ");
		System.out.print(venda.getUsuario());
		System.out.print(" | ");
		System.out.print(venda.getTotal());
		System.out.println();	
	}
	else{
		System.out.print("venda esta nula");	
	}
		
	}

}
