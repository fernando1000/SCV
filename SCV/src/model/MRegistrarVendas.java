package model;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import br.com.extend.scv.dao.ItemDAO;
import br.com.extend.scv.dao.ProdutoDAO;
import br.com.extend.scv.dao.VendaDAO;
import br.com.extend.scv.modelo.Produto;
import br.com.extend.scv.modelo.Venda;
import br.com.extend.scv.util.Utilitarios;
import br.com.extend.scv.view.RegistrarVendas;


public class MRegistrarVendas {

	public void removerTudoJT(JTable tabela) {
		DefaultTableModel modelo = (DefaultTableModel) tabela.getModel();
		modelo.setNumRows(0);
	}

	public void modeloJT(JTable tabela) {
		DefaultTableModel dados = new DefaultTableModel(new Object[][] {},
									new String[] { "Cod", "Nome", "Modelo", "Tipo", "Capacidade", "QTD", "Val Unit", "SubTotal" });
		tabela.setModel(dados);
	}

	public void adicionaDados(JTable tabela, JTextField codProduto, JComboBox nome, JComboBox modelo, JComboBox tipo, JComboBox capaci, JTextField qtd, 
								JTextField precoVenda, JTextField subTotal) {
		
		DefaultTableModel model = (DefaultTableModel) tabela.getModel();
						  model.addRow(new Object[] { codProduto.getText(), nome.getSelectedItem(), modelo.getSelectedItem(),tipo.getSelectedItem(),
								  						capaci.getSelectedItem(), qtd.getText(), precoVenda.getText(), subTotal.getText() });
	}

	public void removerLinhaJT(JTable tabela, int linha) {
		DefaultTableModel dtm = (DefaultTableModel) tabela.getModel();
		dtm.removeRow(linha);
	}

	public void removerLinhaJT(JTable tabela) {
		int linhaSelecionada = tabela.getSelectedRow();
		if (linhaSelecionada < 0) {
			return;
		} else {
			removerLinhaJT(tabela, linhaSelecionada);
		}
	}

	/*
	public void subTotal(JTextField valorUni, JTextField qtd, JTextField subTotal) {
		
		double valor = Double.parseDouble(valorUni.getText());
		int quantidade = Integer.parseInt(qtd.getText());
		double tsubTotal = quantidade * valor;
		subTotal.setText(String.valueOf(tsubTotal));
	}
	*/
	
	public void total(JTextField subTotal, JTable tabela, JLabel total) {
		
		double ttotal = Double.parseDouble(subTotal.getText());
		
		for (int i = 0; tabela.getRowCount() > i; i++) {
			
			ttotal = ttotal + Double.parseDouble(String.valueOf(tabela.getValueAt(i, 7)));
			
		
			
		}
		String resultado = String.format("%.2f", ttotal);
		String resultadoComPonto = resultado.replace(",", ".");
		total.setText(String.valueOf(resultadoComPonto));
	}

	public void atualizarJT(JTable tabela, JLabel total) {
		int linhaSelecionada = tabela.getSelectedRow();
		Object selecionada = tabela.getValueAt(linhaSelecionada, 7);
		double totalObtido = Double.parseDouble(total.getText());
		String.valueOf(selecionada);
		double ttotal = totalObtido - Double.parseDouble((selecionada).toString());
		
		String resultado = String.format("%.2f", ttotal);
		String resultadoComPonto = resultado.replace(",", ".");
		
		total.setText(String.valueOf(resultadoComPonto));
	}

	public void botaoRemove(JTable tabela, JButton remover) {
		int linhaSelecionada = tabela.getSelectedRow();
		if (linhaSelecionada < 0) {
			remover.setVisible(false);
		} else {
			remover.setVisible(true);
		}
	}

	public void baixaProduto(JTable tabela, JLabel da, JLabel ho, JLabel usuario, JLabel total) {

		int codVenda = 0;

		int cont = 1;

		VendaDAO vendaDAO = new VendaDAO();

		for (Venda venda : vendaDAO.devolveListaComVendas()) {

			if (cont <= venda.getCodVenda()) {
				cont++;
			}
			codVenda = cont;
		}

		boolean inseriuVenda = vendaDAO.insereVenda(codVenda, da.getText(), ho.getText(), usuario.getText(), Double.valueOf(total.getText()));

		if (inseriuVenda) {
			
			boolean atualisouProduto = false;

			for (int i = 0; tabela.getRowCount() > i; i++) {
				
				String codProduto = String.valueOf(tabela.getValueAt(i, 0));
				int qtdItem = Integer.parseInt(String.valueOf(tabela.getValueAt(i, 5)));
				String subTotal = String.valueOf(tabela.getValueAt(i, 7));

				Venda venda = vendaDAO.devolveVendaOndeCodVendaEh(codVenda);

				if (codVenda == venda.getCodVenda()) {

					ItemDAO itemDAO = new ItemDAO();

					boolean inseriuItem = itemDAO.insereItem(codVenda, codProduto, qtdItem, Double.parseDouble(subTotal));

					if (inseriuItem) {

						ProdutoDAO produtoDAO = new ProdutoDAO();

						Produto produto = produtoDAO.devolveProdutoOndeCodProdutoEh(codProduto);

						if (codProduto.equals(produto.getCodProduto())) {
							
							int qtd = produto.getQtdProduto();
							int novaQtd = qtd - qtdItem;

							atualisouProduto = produtoDAO.atualizaQTDprodutoOndeCodProdutoEh(novaQtd, codProduto);

							if (atualisouProduto) {


								if (novaQtd == 0) {

									produtoDAO.addRemoveProdutoLixeira(1, codProduto);
								}
							} 
							else {
								JOptionPane.showMessageDialog(null, "erro ao atualizar a nova qtd");
							}
						}
					}
				}
			}
			
			
			if (atualisouProduto) {
				
				JOptionPane.showMessageDialog(null, "Venda efetuada com sucesso!!!");
								
			}
			
		}
	}
}