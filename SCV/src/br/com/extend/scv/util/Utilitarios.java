package br.com.extend.scv.util;

import java.awt.Color;
import java.awt.Component;
import java.awt.TextField;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import br.com.extend.scv.dao.CategoriaDAO;
import br.com.extend.scv.dao.LoginDAO;
import br.com.extend.scv.dao.ProdutoDAO;
import br.com.extend.scv.dao.VendaDAO;
import br.com.extend.scv.modelo.Categoria;
import br.com.extend.scv.modelo.Login;
import br.com.extend.scv.modelo.Produto;
import br.com.extend.scv.modelo.Venda;

import javax.swing.JPasswordField;
import javax.swing.JTable;

public class Utilitarios {
	
	
	public void mConsultarVendasAdicionarDados(JTable tabela) {
		
		DefaultTableModel dados = new DefaultTableModel(new Object[][] {}, new String[] { "CodVenda", "Data da Venda", "Hora da Venda", "Vendedor", "Total" });
		  tabela.setModel(dados);
		DefaultTableModel model = (DefaultTableModel) tabela.getModel();

		VendaDAO vendaDAO = new VendaDAO();

		for (Venda venda : vendaDAO.devolveListaComVendas()) {

			model.addRow(new Object[] { venda.getCodVenda(), venda.getDataVenda(), venda.getHoraVenda(), venda.getUsuario(), venda.getTotal() });
		}
	}

	
    public DefaultTableModel adicionarUsuario(){

    	LoginDAO loginDAO = new LoginDAO();
    	
        ArrayList lista = loginDAO.devolveListaComUsuarios(); //this.consultarUsuario();
        
        DefaultTableModel dados = new DefaultTableModel(new Object[][]{}, new String[]{"Codigo", "Usuario"});
        
            for (int i = 0; i < lista.size(); i++) {
            	
                Login mcu = (Login) lista.get(i);
                
                dados.addRow(new String[]{"" + mcu.getCodUsuario(), mcu.getUsuario(), mcu.getSenha()});
            }
            return dados;
    }
    
    public DefaultTableModel adicionarProdutos(){
    	
    	ProdutoDAO produtoDAO = new ProdutoDAO();
    	
            ArrayList lista = produtoDAO.devolveListaComProdutos(); //this.consultarProdutos();
            DefaultTableModel dados = new DefaultTableModel(
            							new Object[][]{}, 
            								new String[]{"Codigo", "Categoria", "Modelo", "Tipo", "Fabricante", "QTD", 
            										     "Capacidade", "Preco de Custo", "Preco de Venda", "imagem"});
            for (int a = 0; a < lista.size(); a++) {
            	
            	Produto produto = (Produto) lista.get(a);
            	dados.addRow(new String[]{"" + produto.getCodProduto(), String.valueOf(produto.getCodCategoria()), produto.getModelo(), produto.getTipo(), 
            									produto.getFabricante(), String.valueOf(produto.getQtdProduto()), produto.getCapacidade(), 
            									String.valueOf(produto.getPrecoCusto()), String.valueOf(produto.getPrecoVenda()), produto.getImagem()});
            }
            return dados;
    }
	

public void buscarImagem(JTextField jtf, JLabel jl, Component tela){
        try{
        JFileChooser buscaFoto = new JFileChooser();
        //buscaFoto.setCurrentDirectory(new File("/Documents and Settings/Fernando/Desktop/PI Eu_3.1/Sistema PI_vesao 3.0/src/imagensEquipamentos"));
        buscaFoto.setDialogTitle("Carregar imagem do Produto");
        buscaFoto.showOpenDialog(tela);
        String foto = buscaFoto.getSelectedFile().getPath();
        jtf.setText(foto);
        jl.setIcon(new ImageIcon(jtf.getText()));
        }
        catch(Exception erro){
        JOptionPane.showMessageDialog(null, "Imagem nao encontrada :( " + erro);
        }
}

public void carregarJCBnome(JComboBox nome){
	
	CategoriaDAO categDAO = new CategoriaDAO();

        	for(Categoria categ : categDAO.devolveListaComCategorias()){
        		
        		nome.addItem( categ.getDescCategoria() );    
        	}      
}

public void habilitarJCB(JFrame tela, boolean abilita){
    for (int i=0; i < tela.getContentPane().getComponentCount(); i++){
                   Component c = tela.getContentPane().getComponent(i);
                     if (c instanceof JComboBox) {
                         JComboBox jcb = (JComboBox) c;
                         jcb.setEnabled(abilita);
            }
        }
    }

public void limparJTF(JFrame tela){
    //tela = new javax.swing.JFrame();
    for (int i=0; i < tela.getContentPane().getComponentCount(); i++){
                   Component c = tela.getContentPane().getComponent(i);
                     if (c instanceof JTextField) {
                         JTextField jtf = (JTextField) c;
                         jtf.setText("");
             }
        }
    }

public void habilitarJTF(JFrame tela, boolean abilita){
    for (int i=0; i < tela.getContentPane().getComponentCount(); i++){
                   Component c = tela.getContentPane().getComponent(i);
                     if (c instanceof JTextField) {
                         JTextField jtf = (JTextField) c;
                         jtf.setEnabled(abilita);
            }
        }
    }

public void limparTF(JFrame tela){
    for (int i=0; i < tela.getContentPane().getComponentCount(); i++){
                   Component c = tela.getContentPane().getComponent(i);
                     if (c instanceof TextField) {
                         TextField tf = (TextField) c;
                         tf.setText("");
             }
        }
    }

public void habilitarTF(JFrame tela, boolean abilita){
    for (int i=0; i < tela.getContentPane().getComponentCount(); i++){
                   Component c = tela.getContentPane().getComponent(i);
                     if (c instanceof TextField) {
                         TextField tf = (TextField) c;
                         tf.setEnabled(abilita);
            }
        }
    }

public void habilitarJB(JFrame tela, boolean abilita){
    for (int i=0; i < tela.getContentPane().getComponentCount(); i++){
                   Component c = tela.getContentPane().getComponent(i);
                     if (c instanceof JButton) {
                         JButton jb = (JButton) c;
                         jb.setEnabled(abilita);
            }
        }
    }

public void corBrancoJTF(JFrame tela){
    for (int i=0; i < tela.getContentPane().getComponentCount(); i++){
                   Component c = tela.getContentPane().getComponent(i);
                     if (c instanceof JTextField) {
                         JTextField jtf = (JTextField) c;
                         jtf.setBackground(Color.WHITE);
             }
        }
    }

 public void corAmareloJTF(JFrame tela){
    for (int i=0; i < tela.getContentPane().getComponentCount(); i++){
                   Component c = tela.getContentPane().getComponent(i);
                     if (c instanceof JTextField) {
                         JTextField jtf = (JTextField) c;
                         jtf.setBackground(Color.YELLOW);
             }
        }
    }

public void corBrancoTF(JFrame tela){
    for (int i=0; i < tela.getContentPane().getComponentCount(); i++){
                   Component c = tela.getContentPane().getComponent(i);
                     if (c instanceof TextField) {
                         TextField tf = (TextField) c;
                         tf.setBackground(Color.WHITE);
             }
        }
    }

 public void corAmareloTF(JFrame tela){
    for (int i=0; i < tela.getContentPane().getComponentCount(); i++){
                   Component c = tela.getContentPane().getComponent(i);
                     if (c instanceof TextField) {
                         TextField tf = (TextField) c;
                         tf.setBackground(Color.YELLOW);
             }
        }
    }

public void corAmareloJPF(JFrame tela){
    for (int i=0; i < tela.getContentPane().getComponentCount(); i++){
                   Component c = tela.getContentPane().getComponent(i);
                     if (c instanceof JPasswordField) {
                         JPasswordField jpf = (JPasswordField) c;
                         jpf.setBackground(Color.YELLOW);
             }
        }
    }

public void corBrancoJPF(JFrame tela){
    for (int i=0; i < tela.getContentPane().getComponentCount(); i++){
                   Component c = tela.getContentPane().getComponent(i);
                     if (c instanceof JPasswordField) {
                         JPasswordField jpf = (JPasswordField) c;
                         jpf.setBackground(Color.WHITE);
             }
        }
    }

public void habilitarJPF(JFrame tela, boolean abilita){
    for (int i=0; i < tela.getContentPane().getComponentCount(); i++){
                   Component c = tela.getContentPane().getComponent(i);
                     if (c instanceof JPasswordField) {
                         JPasswordField jpf = (JPasswordField) c;
                         jpf.setEnabled(abilita);
            }
        }
    }

public void limparJPF(JFrame tela){
    for (int i=0; i < tela.getContentPane().getComponentCount(); i++){
                   Component c = tela.getContentPane().getComponent(i);
                     if (c instanceof JPasswordField) {
                         JPasswordField jpf = (JPasswordField) c;
                         jpf.setText("");
             }
        }
    }
}