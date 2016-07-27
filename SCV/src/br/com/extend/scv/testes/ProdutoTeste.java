package br.com.extend.scv.testes;

import br.com.extend.scv.dao.ProdutoDAO;
import br.com.extend.scv.modelo.Produto;

public class ProdutoTeste {

	public static void main(String[] args) {

		ProdutoDAO produtoDAO = new ProdutoDAO();
		
		/*
		for(Produto produto : produtoDAO.devolveListaComProdutos()){
			
			System.out.print(produto.getCodProduto());
			System.out.print(" | ");
			System.out.print(produto.getDescCategoria());
			System.out.print(" | ");
			System.out.print(produto.getModelo());
			System.out.print(" | ");
			System.out.print(produto.getTipo());
			System.out.print(" | ");
			System.out.print(produto.getFabricante());
			System.out.print(" | ");
			System.out.print(produto.getQtdProduto());
			System.out.print(" | ");
			System.out.print(produto.getCapacidade());
			System.out.print(" | ");
			System.out.print(produto.getPrecoCusto());
			System.out.print(" | ");
			System.out.print(produto.getPrecoVenda());
			System.out.print(" | ");
			System.out.print(produto.getImagem());
			System.out.println();	
		}
		*/
		Produto produto = produtoDAO.devolveProdutoOndeCodProdutoEh("1");
			
			System.out.print(produto.getCodProduto());
			System.out.print(" | ");
			System.out.print(produto.getCodCategoria());
			System.out.print(" | ");
			System.out.print(produto.getModelo());
			System.out.print(" | ");
			System.out.print(produto.getTipo());
			System.out.print(" | ");
			System.out.print(produto.getFabricante());
			System.out.print(" | ");
			System.out.print(produto.getQtdProduto());
			System.out.print(" | ");
			System.out.print(produto.getCapacidade());
			System.out.print(" | ");
			System.out.print(produto.getPrecoCusto());
			System.out.print(" | ");
			System.out.print(produto.getPrecoVenda());
			System.out.print(" | ");
			System.out.print(produto.getImagem());
			System.out.println();	
		
		
	}

}
