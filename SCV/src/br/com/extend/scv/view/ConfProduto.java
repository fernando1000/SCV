package br.com.extend.scv.view;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import br.com.extend.scv.dao.CategoriaDAO;
import br.com.extend.scv.dao.ProdutoDAO;
import br.com.extend.scv.modelo.Categoria;
import br.com.extend.scv.modelo.Produto;
import br.com.extend.scv.util.Utilitarios;
import java.awt.Color;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.GroupLayout;

public class ConfProduto extends javax.swing.JFrame {
	
	private static final long serialVersionUID = 1L;
	    
    private javax.swing.JButton jB_123;
    private javax.swing.JButton jB_alterarCategoria;
    private javax.swing.JButton jB_salvarCategoria;
    private javax.swing.JLabel jL_imagem;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jM_alterar;
    private javax.swing.JMenu jM_cancelar;
    private javax.swing.JMenu jM_consultar;
    private javax.swing.JMenu jM_excluir;
    private javax.swing.JMenu jM_sair;
    private javax.swing.JMenu jM_salvar;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JTextField jTF_capacidade;
    private javax.swing.JTextField jTF_categoria;
    private javax.swing.JTextField jTF_codCategoria;
    private javax.swing.JTextField jTF_codProduto;
    private javax.swing.JTextField jTF_fabri;
    private javax.swing.JTextField jTF_imagem;
    private javax.swing.JTextField jTF_modelo;
    private javax.swing.JTextField jTF_precoCusto;
    private javax.swing.JTextField jTF_precoVenda;
    private javax.swing.JTextField jTF_qtdProduto;
    private javax.swing.JTextField jTF_tipo;
	
    ConsultarProdutos consultarProdutos = new ConsultarProdutos();
	Utilitarios utilitarios = new Utilitarios();

    public ConfProduto() {

        initComponents();

        utilitarios.habilitarJTF(this, false);
        utilitarios.habilitarJB(this, false);
        jM_excluir.setVisible(false);
        jM_salvar.setVisible(false);
        jM_cancelar.setVisible(false);
        jM_alterar.setVisible(false);
        jTF_codProduto.setEnabled(true);
        jTF_codProduto.setBackground(Color.YELLOW);
    }
    @SuppressWarnings("unchecked")
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTF_modelo = new javax.swing.JTextField();
        jTF_tipo = new javax.swing.JTextField();
        jTF_fabri = new javax.swing.JTextField();
        jTF_capacidade = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jTF_imagem = new javax.swing.JTextField();
        jB_123 = new javax.swing.JButton();
        jL_imagem = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTF_codProduto = new javax.swing.JTextField();
        jTF_categoria = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jTF_codCategoria = new javax.swing.JTextField();
        jB_salvarCategoria = new javax.swing.JButton();
        jB_alterarCategoria = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jM_salvar = new javax.swing.JMenu();
        jM_alterar = new javax.swing.JMenu();
        jM_consultar = new javax.swing.JMenu();
        jM_excluir = new javax.swing.JMenu();
        jM_cancelar = new javax.swing.JMenu();
        jM_sair = new javax.swing.JMenu();
        jTF_precoCusto = new javax.swing.JTextField();
        jTF_precoVenda = new javax.swing.JTextField();
        jTF_qtdProduto = new javax.swing.JTextField();
        
        
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Configuracao de Produtos");

        jLabel2.setText("Categoria:");
        jLabel3.setText("Modelo:");
        jLabel4.setText("Tipo:");
        jLabel5.setText("Fabricante:");
        jLabel6.setText("QTD de Produto:");
        jLabel7.setText("Capacidade:");
        jLabel8.setText("Preco de Custo:");
        jLabel1.setText("Imagem:");

        jB_123.setText("...");
        jB_123.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_123ActionPerformed(evt);
            }
        });

        jLabel9.setText("Codigo do Produto:");

        

        jTF_codProduto.addActionListener(new java.awt.event.ActionListener(){
        	public void actionPerformed(java.awt.event.ActionEvent evt) {
        		
            	ProdutoDAO produtoDAO  = new ProdutoDAO();
            	
            	Produto produto = produtoDAO.devolveProdutoOndeCodProdutoEh(jTF_codProduto.getText());

                        if(produto != null){
                        	
                            jTF_codCategoria.setText(String.valueOf(produto.getCodCategoria()));
                            jTF_categoria.setText(String.valueOf(produto.getCodCategoria()));
                            jTF_modelo.setText(produto.getModelo());
                            jTF_tipo.setText(produto.getTipo());
                            jTF_fabri.setText(produto.getFabricante());
                            jTF_qtdProduto.setText(String.valueOf(produto.getQtdProduto()));
                            jTF_capacidade.setText(produto.getCapacidade());
                            jTF_precoCusto.setText(String.valueOf(produto.getPrecoCusto()));
                            jTF_precoVenda.setText(String.valueOf(produto.getPrecoVenda()));
                            jTF_imagem.setText(produto.getImagem());
                            jL_imagem.setIcon(new ImageIcon(jTF_imagem.getText()));
                            jM_alterar.setVisible(true);
                            jM_cancelar.setVisible(true);
                            jB_alterarCategoria.setEnabled(true);
                            jM_excluir.setVisible(true);
                        }
                        else{
                        JOptionPane.showMessageDialog(null, "Codigo nao existe");
                        }           		
        	}
        });
        
        
		
		

        
        
        

        jLabel10.setText("Codigo da Categoria:");

        jB_salvarCategoria.setText("Salvar");
        jB_salvarCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_salvarCategoriaActionPerformed(evt);
            }
        });

        jB_alterarCategoria.setText("Alterar Categoria");
        jB_alterarCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_alterarCategoriaActionPerformed(evt);
            }
        });

        jLabel11.setText("Preco de Venda:");

        jM_salvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/salvarG.png"))); // NOI18N
        jM_salvar.setText("Salvar");
        jM_salvar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
            	
                jM_salvarMousePressed(evt);
            }
        });
        jMenuBar1.add(jM_salvar);

        jM_alterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/alterar.png"))); // NOI18N
        jM_alterar.setText("Alterar");
        jM_alterar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jM_alterarMousePressed(evt);
            }
        });
        jMenuBar1.add(jM_alterar);

        jM_consultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/find.png"))); // NOI18N
        jM_consultar.setText("Consultar");
        jM_consultar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jM_consultarMousePressed(evt);
            }
        });
        jMenuBar1.add(jM_consultar);

        jM_excluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/excluir.png"))); // NOI18N
        jM_excluir.setText("Excluir");
        jM_excluir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jM_excluirMousePressed(evt);
            }
        });
        jMenuBar1.add(jM_excluir);

        jM_cancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/cancela.png"))); // NOI18N
        jM_cancelar.setText("Cancelar");
        jM_cancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jM_cancelarMousePressed(evt);
            }
        });
        jMenuBar1.add(jM_cancelar);

        jM_sair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/sair.png"))); // NOI18N
        jM_sair.setText("Sair");
        jM_sair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jM_sairMousePressed(evt);
            }
        });
        jMenuBar1.add(jM_sair);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.TRAILING)
        		.addGroup(layout.createSequentialGroup()
        			.addContainerGap()
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(layout.createParallelGroup(Alignment.TRAILING)
        					.addComponent(jLabel10)
        					.addComponent(jLabel9))
        				.addGroup(layout.createParallelGroup(Alignment.TRAILING)
        					.addComponent(jLabel5)
        					.addComponent(jLabel6)
        					.addComponent(jLabel4)
        					.addComponent(jLabel3)
        					.addComponent(jLabel2)
        					.addComponent(jLabel7)
        					.addGroup(layout.createParallelGroup(Alignment.LEADING)
        						.addComponent(jLabel8)
        						.addGroup(layout.createParallelGroup(Alignment.TRAILING)
        							.addComponent(jLabel1)
        							.addComponent(jLabel11)))))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(layout.createParallelGroup(Alignment.TRAILING)
        				.addGroup(layout.createSequentialGroup()
        					.addComponent(jTF_codCategoria, GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
        					.addPreferredGap(ComponentPlacement.UNRELATED)
        					.addComponent(jB_alterarCategoria, GroupLayout.PREFERRED_SIZE, 142, GroupLayout.PREFERRED_SIZE))
        				.addGroup(layout.createParallelGroup(Alignment.TRAILING, false)
        					.addComponent(jTF_fabri, Alignment.LEADING)
        					.addComponent(jTF_tipo, Alignment.LEADING)
        					.addComponent(jTF_modelo, Alignment.LEADING)
        					.addComponent(jTF_categoria, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE))
        				.addGroup(layout.createSequentialGroup()
        					.addGap(1)
        					.addGroup(layout.createParallelGroup(Alignment.LEADING)
        						.addComponent(jTF_qtdProduto, GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE)
        						.addComponent(jTF_capacidade, GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE)
        						.addComponent(jTF_precoCusto, GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE)
        						.addComponent(jTF_precoVenda, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE)
        						.addComponent(jTF_imagem, GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE)))
        				.addComponent(jTF_codProduto, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addComponent(jB_salvarCategoria)
        				.addComponent(jB_123))
        			.addGap(18)
        			.addComponent(jL_imagem, GroupLayout.PREFERRED_SIZE, 381, GroupLayout.PREFERRED_SIZE)
        			.addContainerGap())
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.TRAILING)
        		.addGroup(layout.createSequentialGroup()
        			.addContainerGap(27, Short.MAX_VALUE)
        			.addGroup(layout.createParallelGroup(Alignment.TRAILING, false)
        				.addGroup(layout.createSequentialGroup()
        					.addComponent(jL_imagem, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        					.addContainerGap())
        				.addGroup(layout.createSequentialGroup()
        					.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        						.addComponent(jTF_codProduto, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        						.addComponent(jLabel9))
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        						.addComponent(jTF_codCategoria, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        						.addComponent(jLabel10)
        						.addComponent(jB_alterarCategoria))
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        						.addComponent(jTF_categoria, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        						.addComponent(jLabel2)
        						.addComponent(jB_salvarCategoria))
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        						.addComponent(jTF_modelo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        						.addComponent(jLabel3))
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        						.addComponent(jTF_tipo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        						.addComponent(jLabel4))
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        						.addComponent(jTF_fabri, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        						.addComponent(jLabel5))
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        						.addComponent(jTF_qtdProduto, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        						.addComponent(jLabel6))
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        						.addComponent(jTF_capacidade, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        						.addComponent(jLabel7))
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        						.addComponent(jTF_precoCusto, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        						.addComponent(jLabel8))
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        						.addComponent(jTF_precoVenda, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        						.addComponent(jLabel11))
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        						.addComponent(jLabel1)
        						.addComponent(jB_123)
        						.addComponent(jTF_imagem, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        					.addGap(209))))
        );
        getContentPane().setLayout(layout);

        getAccessibleContext().setAccessibleParent(this);

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-800)/2, (screenSize.height-600)/2, 800, 600);
    }// </editor-fold>//GEN-END:initComponents


    private void jM_sairMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jM_sairMousePressed
    dispose();
    }//GEN-LAST:event_jM_sairMousePressed

    private void jM_salvarMousePressed(java.awt.event.MouseEvent evt) {

		Produto produto = new Produto();
		  		produto.setModelo(jTF_modelo.getText());
		  		produto.setTipo(jTF_tipo.getText());
		  		produto.setFabricante(jTF_fabri.getText());
		  		produto.setQtdProduto(Integer.parseInt(jTF_qtdProduto.getText()));
		  		produto.setCapacidade(jTF_capacidade.getText());
		  		
		        String precoCusto = jTF_precoCusto.getText();
	            String precoCustoFormatado = precoCusto.replace(",", ".");
	            produto.setPrecoCusto(Double.parseDouble(precoCustoFormatado));
	            
	            String precoVenda = jTF_precoVenda.getText();
	            String precoVendaFormatado = precoVenda.replace(",", ".");
	            produto.setPrecoVenda(Double.parseDouble(precoVendaFormatado));
	     
		  		produto.setImagem(jTF_imagem.getText());
		  		produto.setCodProduto(jTF_codProduto.getText());

				ProdutoDAO produtoDAO = new ProdutoDAO();
		
		boolean atualisouProduto = produtoDAO.atualizaProduto(produto);

				

         if(atualisouProduto){
        	 
        	 if(produto.getQtdProduto() > 0){
        		 
        		 produtoDAO.addRemoveProdutoLixeira(0, produto.getCodProduto());
        	 }
        	 
         JOptionPane.showMessageDialog(null, "Dados alterados com sucesso!!!");
         jM_salvar.setVisible(false);
         jM_cancelar.setVisible(false);
         jM_consultar.setVisible(true);
         consultarProdutos.setVisible(false);
         utilitarios.limparJTF(this);
         utilitarios.habilitarJTF(this, false);
         jTF_codProduto.setEnabled(true);
         utilitarios.corBrancoJTF(this);
         jTF_codProduto.setBackground(Color.YELLOW);
         utilitarios.habilitarJB(this, false);
         jL_imagem.setEnabled(false);
         }
         else{
         JOptionPane.showMessageDialog(null, "Erro");
         }
    }//GEN-LAST:event_jM_salvarMousePressed

    private void jM_cancelarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jM_cancelarMousePressed
        utilitarios.habilitarJTF(this, false);
        jTF_codProduto.setEnabled(true);
        utilitarios.habilitarJB(this, false);
        jM_alterar.setVisible(false);
        jM_excluir.setVisible(false);
        utilitarios.limparJTF(this);
        jM_cancelar.setVisible(false);
        jM_salvar.setVisible(false);
        utilitarios.corBrancoJTF(this);
        jTF_codProduto.setBackground(Color.YELLOW);
        consultarProdutos.setVisible(false);
        jM_consultar.setVisible(true);
    }//GEN-LAST:event_jM_cancelarMousePressed

    private void jM_consultarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jM_consultarMousePressed
       consultarProdutos.setVisible(true);
       jM_consultar.setVisible(false);
       jM_cancelar.setVisible(true);
    }//GEN-LAST:event_jM_consultarMousePressed

    private void jB_123ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_123ActionPerformed
        utilitarios.buscarImagem(jTF_imagem, jL_imagem, this);
    }//GEN-LAST:event_jB_123ActionPerformed


    private void jM_alterarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jM_alterarMousePressed
        utilitarios.habilitarJTF(this, true);
        jB_123.setEnabled(true); 
        jM_alterar.setVisible(false);
        jM_salvar.setVisible(true);
        jM_cancelar.setVisible(true);
        jM_excluir.setVisible(false);
        utilitarios.corAmareloJTF(this);
        jTF_codProduto.setBackground(Color.WHITE);
        jTF_codProduto.setEnabled(false);
        jTF_categoria.setBackground(Color.WHITE);
        jTF_categoria.setEnabled(false);
        jTF_imagem.setBackground(Color.WHITE);
        jTF_imagem.setEnabled(false);
        jTF_codCategoria.setBackground(Color.WHITE);
        jTF_codCategoria.setEnabled(false);
    }//GEN-LAST:event_jM_alterarMousePressed

    

    private void jB_alterarCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_alterarCategoriaActionPerformed
        jTF_categoria.setEnabled(true);
        jTF_categoria.setBackground(Color.YELLOW);
        jB_salvarCategoria.setEnabled(true);
    }//GEN-LAST:event_jB_alterarCategoriaActionPerformed

    private void jB_salvarCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_salvarCategoriaActionPerformed
    if(jTF_categoria.getText().isEmpty()){
        JOptionPane.showMessageDialog(null, "Favor escrever o nome da categoria");
        }
        else{
        	

	CategoriaDAO categoriaDAO = new CategoriaDAO();

	boolean atualisouCategoria = categoriaDAO.atualisaCategoria(jTF_categoria.getText(), Integer.parseInt(jTF_codCategoria.getText()));

            if(atualisouCategoria){
            	
            JOptionPane.showMessageDialog(null, "Categoria alterada com sucesso!!!");
            jB_alterarCategoria.setEnabled(false);
            jB_salvarCategoria.setEnabled(false);
            jTF_categoria.setEnabled(false);
            jTF_categoria.setBackground(Color.WHITE);
            }
            else{
            JOptionPane.showMessageDialog(null, "Erro");
            }
        }
    }//GEN-LAST:event_jB_salvarCategoriaActionPerformed

    private void jM_excluirMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jM_excluirMousePressed
    	
        
        ProdutoDAO produtoDAO = new ProdutoDAO();
        
        produtoDAO.addRemoveProdutoLixeira(1, jTF_codProduto.getText());
        
        
        utilitarios.limparJTF(this);
        consultarProdutos.setVisible(false);
        jM_consultar.setVisible(true);
        jM_alterar.setVisible(false);
        jM_excluir.setVisible(false);
        jM_cancelar.setVisible(false);
        jM_salvar.setVisible(false);
        
}
    
    
    
    

}
