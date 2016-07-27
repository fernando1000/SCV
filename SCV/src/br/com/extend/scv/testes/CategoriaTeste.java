package br.com.extend.scv.testes;

import br.com.extend.scv.dao.CategoriaDAO;
import br.com.extend.scv.modelo.Categoria;

public class CategoriaTeste {

	public static void main(String[] args) {

		/*
		CategoriaDAO categDAO = new CategoriaDAO();
		
		for(Categoria categ : categDAO.devolveListaComCategorias()){
			
			System.out.print(categ.getDescCategoria());
			System.out.println();		
		}
		*/
		int i;
        for (i = 0; i < 5; i++) {
            if (++i % 3 == 0) {
                break;
            }
        }
        System.out.println(i);
	}
}
