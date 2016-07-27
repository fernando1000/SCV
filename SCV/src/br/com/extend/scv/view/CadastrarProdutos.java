package br.com.extend.scv.view;

import javax.swing.JOptionPane;

import br.com.extend.scv.dao.CategoriaDAO;
import br.com.extend.scv.dao.ProdutoDAO;
import br.com.extend.scv.modelo.Categoria;
import br.com.extend.scv.modelo.Produto;
import br.com.extend.scv.util.Utilitarios;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.text.MaskFormatter;

import java.text.ParseException;

import javax.swing.GroupLayout;
import javax.swing.JFormattedTextField;

public class CadastrarProdutos extends javax.swing.JFrame {
	
	private static final long serialVersionUID = 1L;
	
    private javax.swing.JComboBox cbNome;
    private javax.swing.JButton jB_123;
    private javax.swing.JButton jB_addNome;
    private javax.swing.JLabel jL_imagem;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jM_cancelar;
    private javax.swing.JMenu jM_consultar;
    private javax.swing.JMenu jM_novo;
    private javax.swing.JMenu jM_sair;
    private javax.swing.JMenu jM_salvar;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JTextField jTF_addNome;
    private javax.swing.JTextField jTF_capacidade;
    private javax.swing.JTextField jTF_fabri;
    private javax.swing.JTextField jTF_imagem;
    private javax.swing.JTextField jTF_modelo;
    private javax.swing.JTextField jTF_precoCusto;
    private javax.swing.JTextField jTF_precoVenda;
    private javax.swing.JTextField jTF_qtdProduto;
    private javax.swing.JTextField jTF_tipo;
    private javax.swing.JLabel lbCodigo;

		
ConsultarProdutos cp = new ConsultarProdutos();
Utilitarios utilitarios = new Utilitarios();

    public CadastrarProdutos() {

        initComponents();
        utilitarios.carregarJCBnome(cbNome);
        jM_novo.setVisible(true);
        jM_salvar.setVisible(false);
        jM_cancelar.setVisible(false);
        jB_addNome.setEnabled(false);
        cbNome.setEnabled(false);
        jB_123.setEnabled(false);
        utilitarios.habilitarJTF(this, false);
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        lbCodigo = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTF_addNome = new javax.swing.JTextField();
        jTF_modelo = new javax.swing.JTextField();
        jTF_tipo = new javax.swing.JTextField();
        jTF_fabri = new javax.swing.JTextField();
        jTF_capacidade = new javax.swing.JTextField();
        cbNome = new javax.swing.JComboBox();
        jB_addNome = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jTF_imagem = new javax.swing.JTextField();
        jB_123 = new javax.swing.JButton();
        jL_imagem = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jM_novo = new javax.swing.JMenu();
        jM_salvar = new javax.swing.JMenu();
        jM_consultar = new javax.swing.JMenu();
        jM_cancelar = new javax.swing.JMenu();
        jM_sair = new javax.swing.JMenu();
        jTF_qtdProduto = new javax.swing.JTextField();
        
        jTF_precoCusto = new javax.swing.JTextField();
        jTF_precoVenda = new javax.swing.JTextField();

       /* 
        try {
			MaskFormatter maskFormatter_reais = new MaskFormatter("####,##");

        } 
        catch (ParseException e) {
			e.printStackTrace();
		}
        */
        
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastrar Produtos");

        lbCodigo.setText("Nova Categoria:");

        jLabel2.setText("Categoria:");

        jLabel3.setText("Modelo:");

        jLabel4.setText("Tipo:");

        jLabel5.setText("Fabricante:");

        jLabel6.setText("QTD de Produto:");

        jLabel7.setText("Codigo de Barras:");

        jLabel8.setText("Preco de Custo R$");

        jTF_addNome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTF_addNomeKeyReleased(evt);
            }
        });

        cbNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbNomeActionPerformed(evt);
            }
        });

        jB_addNome.setText("Adicionar");
        jB_addNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_addNomeActionPerformed(evt);
            }
        });

        jLabel1.setText("Imagem:");

        jB_123.setText("...");
        jB_123.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_123ActionPerformed(evt);
            }
        });

        jLabel9.setText("Preco de Venda R$");

        jM_novo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/novo.png"))); // NOI18N
        jM_novo.setText("Novo");
        jM_novo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jM_novoMousePressed(evt);
            }
        });
        jMenuBar1.add(jM_novo);

        jM_salvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/salvarG.png"))); // NOI18N
        jM_salvar.setText("Salvar");
        jM_salvar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jM_salvarMousePressed(evt);
            }
        });
        jMenuBar1.add(jM_salvar);

        jM_consultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/find.png"))); // NOI18N
        jM_consultar.setText("Consultar");
        jM_consultar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jM_consultarMousePressed(evt);
            }
        });
        jMenuBar1.add(jM_consultar);

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
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addGap(20)
        			.addGroup(layout.createParallelGroup(Alignment.TRAILING)
        				.addComponent(jLabel9)
        				.addComponent(jLabel8)
        				.addComponent(jLabel6)
        				.addComponent(jLabel5)
        				.addComponent(jLabel4)
        				.addComponent(jLabel3)
        				.addComponent(jLabel2)
        				.addComponent(lbCodigo)
        				.addComponent(jLabel7)
        				.addComponent(jLabel1))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addComponent(jTF_capacidade, GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
        				.addComponent(jTF_addNome, GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
        				.addComponent(cbNome, 0, 178, Short.MAX_VALUE)
        				.addComponent(jTF_modelo, GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
        				.addComponent(jTF_tipo, GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
        				.addComponent(jTF_fabri, GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
        				.addComponent(jTF_qtdProduto, GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
        				.addComponent(jTF_precoVenda, GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
        				.addComponent(jTF_precoCusto, GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
        				.addComponent(jTF_imagem, GroupLayout.PREFERRED_SIZE, 178, GroupLayout.PREFERRED_SIZE))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addComponent(jB_123)
        				.addComponent(jB_addNome, GroupLayout.PREFERRED_SIZE, 88, GroupLayout.PREFERRED_SIZE))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addComponent(jL_imagem, GroupLayout.PREFERRED_SIZE, 367, GroupLayout.PREFERRED_SIZE)
        			.addGap(35))
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(layout.createSequentialGroup()
        					.addGap(105)
        					.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        						.addComponent(jLabel7)
        						.addComponent(jTF_capacidade, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        					.addGap(27)
        					.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        						.addComponent(lbCodigo)
        						.addComponent(jTF_addNome, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        						.addComponent(jB_addNome))
        					.addPreferredGap(ComponentPlacement.UNRELATED)
        					.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        						.addComponent(jLabel2)
        						.addComponent(cbNome, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        					.addPreferredGap(ComponentPlacement.UNRELATED)
        					.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        						.addComponent(jLabel3)
        						.addComponent(jTF_modelo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        					.addPreferredGap(ComponentPlacement.UNRELATED)
        					.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        						.addComponent(jLabel4)
        						.addComponent(jTF_tipo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        					.addPreferredGap(ComponentPlacement.UNRELATED)
        					.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        						.addComponent(jLabel5)
        						.addComponent(jTF_fabri, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        					.addPreferredGap(ComponentPlacement.UNRELATED)
        					.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        						.addComponent(jLabel6)
        						.addComponent(jTF_qtdProduto, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        					.addPreferredGap(ComponentPlacement.UNRELATED)
        					.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        						.addComponent(jLabel9)
        						.addComponent(jTF_precoVenda, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        					.addPreferredGap(ComponentPlacement.UNRELATED)
        					.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        						.addComponent(jLabel8)
        						.addComponent(jTF_precoCusto, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        					.addPreferredGap(ComponentPlacement.UNRELATED)
        					.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        						.addComponent(jLabel1)
        						.addComponent(jTF_imagem, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        						.addComponent(jB_123)))
        				.addGroup(layout.createSequentialGroup()
        					.addContainerGap()
        					.addComponent(jL_imagem, GroupLayout.PREFERRED_SIZE, 493, GroupLayout.PREFERRED_SIZE)))
        			.addContainerGap(24, Short.MAX_VALUE))
        );
        getContentPane().setLayout(layout);

        getAccessibleContext().setAccessibleParent(this);

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-800)/2, (screenSize.height-600)/2, 800, 600);
    }// </editor-fold>//GEN-END:initComponents


    private void jM_novoMousePressed(java.awt.event.MouseEvent evt) {
    	
        jM_cancelar.setVisible(true);
        jM_novo.setVisible(false);
        jB_addNome.setEnabled(true);
        cbNome.setEnabled(true);
        jL_imagem.setIcon(null);
        jB_123.setEnabled(true);
        utilitarios.habilitarJTF(this, true);
         
    }

    private void jM_sairMousePressed(java.awt.event.MouseEvent evt) {
    dispose();
    }

    private void jM_salvarMousePressed(java.awt.event.MouseEvent evt) {
    	
            String modelo = jTF_modelo.getText();
            String tipo = jTF_tipo.getText();
            String fabri = jTF_fabri.getText();
            int qtdProd = Integer.parseInt(jTF_qtdProduto.getText());
            String capaci = jTF_capacidade.getText();
            String precoCusto = jTF_precoCusto.getText();
            String precoCustoFormatado = precoCusto.replace(",", ".");
            
            String precoVenda = jTF_precoVenda.getText();
            String precoVendaFormatado = precoVenda.replace(",", ".");
              
            
            String imagem = jTF_imagem.getText();
            if(modelo.isEmpty() || tipo.isEmpty() || fabri.isEmpty() || capaci.isEmpty() || precoCusto.isEmpty() || precoVenda.isEmpty()){
            JOptionPane.showMessageDialog(null, "Favor preencher todos os campos");
            }    
            else{
            	
            	
            	CategoriaDAO categoriaDAO = new CategoriaDAO();
            	
            	Categoria categoria = categoriaDAO.devolveCategoriaOndeDescCategoriaEh((String) cbNome.getSelectedItem());
            	      
        
            if (categoria != null) {
            	
                if (categoria.getDescCategoria().equalsIgnoreCase((String) cbNome.getSelectedItem())) {
                	
                int codCategoria = categoria.getCodCategoria();
                

			Produto produto = new Produto();
					produto.setCodProduto(capaci);
			  		produto.setCodCategoria(codCategoria);
			  		produto.setModelo(modelo);
			  		produto.setTipo(tipo);
			  		produto.setFabricante(fabri);
			  		produto.setQtdProduto(qtdProd);
			  		produto.setCapacidade(capaci);
			  		produto.setPrecoCusto(Double.parseDouble(precoCustoFormatado));
			  		produto.setPrecoVenda(Double.parseDouble(precoVendaFormatado));
			  		produto.setImagem(imagem);
			
			ProdutoDAO produtoDAO = new ProdutoDAO();
			
			boolean inseriuProduto = produtoDAO.insereProduto(produto);	
			  		
                    if (inseriuProduto) {
                    JOptionPane.showMessageDialog(null, "Dados inseridos com sucesso!!!");
                    }
                    else {
                    JOptionPane.showMessageDialog(null, "Erro ao inserir na tabela de produto");
                    }
                }    
            }
            else {
            JOptionPane.showMessageDialog(null, "Categoria eh nula");
            }
        
            jM_novo.setVisible(true);
            jM_salvar.setVisible(false);
            jM_cancelar.setVisible(false);
            jL_imagem.setEnabled(false);
            jB_addNome.setEnabled(false);
            cbNome.setEnabled(false);
            utilitarios.limparJTF(this);
            utilitarios.habilitarJTF(this, false);
            }
    }//GEN-LAST:event_jM_salvarMousePressed

    private void jM_cancelarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jM_cancelarMousePressed
        jM_salvar.setVisible(false);
        jM_consultar.setVisible(true);
        jM_cancelar.setVisible(false);
        jM_novo.setVisible(true);
        jB_addNome.setEnabled(false);
        cbNome.setEnabled(false);
        jL_imagem.setIcon(null);
        jB_123.setEnabled(false);
        utilitarios.limparJTF(this);
        utilitarios.habilitarJTF(this, false);
        cp.setVisible(false);
    }//GEN-LAST:event_jM_cancelarMousePressed

    private void cbNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbNomeActionPerformed
        jM_salvar.setVisible(true);
        jM_cancelar.setVisible(true);
        jM_novo.setVisible(false);
    }//GEN-LAST:event_cbNomeActionPerformed

    private void jB_addNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_addNomeActionPerformed
    	

	CategoriaDAO categoriaDAO = new CategoriaDAO();
	
	boolean inseriuCategoria = categoriaDAO.insereCategoria(jTF_addNome.getText().toUpperCase());

       if (inseriuCategoria){
       JOptionPane.showMessageDialog(null, "Nome cadastrado com sucesso!!!");
       }
       else {
       JOptionPane.showMessageDialog(null, "Erro ao cadastrar o nome");
       }
        cbNome.addItem(jTF_addNome.getText());
        jTF_addNome.setText("");
        jTF_addNome.setEnabled(false);
    }//GEN-LAST:event_jB_addNomeActionPerformed

    private void jTF_addNomeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTF_addNomeKeyReleased
    	

	CategoriaDAO categoriaDAO = new CategoriaDAO();

	Categoria categoria = categoriaDAO.devolveCategoriaOndeDescCategoriaEh( jTF_addNome.getText().replaceAll("'", "''") );


        
            if (categoria != null) {
            	
                if (categoria.getDescCategoria().equalsIgnoreCase(jTF_addNome.getText())) {
                
                	JOptionPane.showMessageDialog(null, "Nome jah existente na lista");
                }
            }
        
        
    }//GEN-LAST:event_jTF_addNomeKeyReleased

    private void jM_consultarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jM_consultarMousePressed
       cp.setVisible(true);
       jM_consultar.setVisible(false);
       jM_cancelar.setVisible(true);
    }//GEN-LAST:event_jM_consultarMousePressed

    private void jB_123ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_123ActionPerformed
        
    	utilitarios.buscarImagem(jTF_imagem, jL_imagem, this);
    }
    
    
    
}
