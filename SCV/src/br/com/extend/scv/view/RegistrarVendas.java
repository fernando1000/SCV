package br.com.extend.scv.view;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JOptionPane;

import br.com.extend.scv.dao.CategoriaDAO;
import br.com.extend.scv.dao.ProdutoDAO;
import br.com.extend.scv.modelo.Categoria;
import br.com.extend.scv.modelo.Produto;
import br.com.extend.scv.util.Data;
import br.com.extend.scv.util.Utilitarios;
import model.MRegistrarVendas;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle.ComponentPlacement;

public class RegistrarVendas extends javax.swing.JFrame {

	private static final long serialVersionUID = 1L;

	private javax.swing.JButton jB_addProduto;
	private javax.swing.JButton jB_calcularTroco;
	private javax.swing.JButton jB_confirmarVenda;
	private javax.swing.JButton jB_remover;
	private javax.swing.JComboBox jCB_capaci;
	private javax.swing.JComboBox jCB_fabri;
	private javax.swing.JComboBox jCB_modelo;
	private javax.swing.JComboBox jCB_categoria;
	private javax.swing.JComboBox jCB_tipo;
	private javax.swing.JLabel jL_data;
	private javax.swing.JLabel jL_hora;
	private javax.swing.JLabel jL_total;
	private javax.swing.JLabel jL_troco;
	private javax.swing.JLabel jL_usuario;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel10;
	private javax.swing.JLabel jLabel11;
	private javax.swing.JLabel jLabel12;
	private javax.swing.JLabel jLabel13;
	private javax.swing.JLabel jLabel15;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JLabel jLabel5;
	private javax.swing.JLabel jLabel6;
	private javax.swing.JLabel jLabel7;
	private javax.swing.JLabel jLabel8;
	private javax.swing.JLabel jLabel9;
	private javax.swing.JMenu jM_cancelar;
	private javax.swing.JMenu jM_novo;
	private javax.swing.JMenu jM_sair;
	private javax.swing.JMenuBar jMenuBar1;
	private javax.swing.JScrollPane jScrollPane1;
	private javax.swing.JTextField jTF_codCategoria;
	private javax.swing.JTextField jTF_codProduto;
	private javax.swing.JTextField jTF_dinheiroRecebido;
	private javax.swing.JTextField jTF_precoVenda;
	private javax.swing.JTextField jTF_qtd;
	private javax.swing.JTextField jTF_subTotal;
	private javax.swing.JTable jT_tabela;
	private org.netbeans.examples.lib.timerbean.Timer timer;

	Utilitarios utilitarios = new Utilitarios();
	MRegistrarVendas mRegistrarVendas = new MRegistrarVendas();
	int vezCBnome = 0;
	int vezCBmodelo = 0;
	int vezCBtipo = 0;
	int vezCBfabri = 0;
	int vezCBcapaci = 0;
	Data data = new Data();

	public RegistrarVendas() {

		initComponents();
		jL_usuario.setText(LoginView.usuarioLogado);
		jL_data.setText(data.lerData());
		timer.start();
		mRegistrarVendas.modeloJT(jT_tabela);
		jM_cancelar.setVisible(false);
		utilitarios.habilitarJB(this, false);
		utilitarios.carregarJCBnome(jCB_categoria);
		utilitarios.habilitarJTF(this, false);
		utilitarios.habilitarJCB(this, false);
	}

	@SuppressWarnings("unchecked")
	private void initComponents() {

		timer = new org.netbeans.examples.lib.timerbean.Timer();
		jLabel2 = new javax.swing.JLabel();
		jLabel3 = new javax.swing.JLabel();
		jLabel1 = new javax.swing.JLabel();
		jLabel6 = new javax.swing.JLabel();
		jLabel4 = new javax.swing.JLabel();
		jLabel5 = new javax.swing.JLabel();
		jTF_codCategoria = new javax.swing.JTextField();
		jLabel8 = new javax.swing.JLabel();
		jLabel7 = new javax.swing.JLabel();
		jLabel9 = new javax.swing.JLabel();
		jLabel10 = new javax.swing.JLabel();
		jLabel11 = new javax.swing.JLabel();
		jLabel12 = new javax.swing.JLabel();
		jCB_categoria = new javax.swing.JComboBox();
		jCB_modelo = new javax.swing.JComboBox();
		jCB_tipo = new javax.swing.JComboBox();
		jCB_fabri = new javax.swing.JComboBox();
		jCB_capaci = new javax.swing.JComboBox();
		jTF_precoVenda = new javax.swing.JTextField();
		jB_addProduto = new javax.swing.JButton();
		jLabel13 = new javax.swing.JLabel();
		jTF_subTotal = new javax.swing.JTextField();
		jTF_qtd = new javax.swing.JTextField();
		jTF_codProduto = new javax.swing.JTextField();
		jL_usuario = new javax.swing.JLabel();
		jL_data = new javax.swing.JLabel();
		jL_hora = new javax.swing.JLabel();
		jScrollPane1 = new javax.swing.JScrollPane();
		jT_tabela = new javax.swing.JTable();
		jB_remover = new javax.swing.JButton();
		jL_total = new javax.swing.JLabel();
		jB_confirmarVenda = new javax.swing.JButton();
		jTF_dinheiroRecebido = new javax.swing.JTextField();
		jB_calcularTroco = new javax.swing.JButton();
		jL_troco = new javax.swing.JLabel();
		jLabel15 = new javax.swing.JLabel();
		jMenuBar1 = new javax.swing.JMenuBar();
		jM_novo = new javax.swing.JMenu();
		jM_cancelar = new javax.swing.JMenu();
		jM_sair = new javax.swing.JMenu();

		timer.addTimerListener(new org.netbeans.examples.lib.timerbean.TimerListener() {
			public void onTime(java.awt.event.ActionEvent evt) {

				jL_hora.setText(data.lerHora());
				jB_remover.setEnabled(true);
				mRegistrarVendas.botaoRemove(jT_tabela, jB_remover);
			}
		});

		setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
		setTitle("Registrar Vendas");

		jLabel2.setText("Categoria:");

		jLabel3.setText("Modelo:");

		jLabel1.setText("Codigo:");

		jLabel6.setText("QTD de Produto:");

		jLabel4.setText("Tipo:");

		jLabel5.setText("Fabricante:");

		jLabel8.setText("Valor Unitario:");

		jLabel7.setText("Capacidade:");

		jLabel9.setText("Data da venda:");

		jLabel10.setText("Hora da venda:");

		jLabel11.setText("Usuario:");

		jLabel12.setFont(new java.awt.Font("Verdana", 1, 14));
		jLabel12.setText("Total R$.:");


				
				
				
	
		
		
		jTF_codProduto.addActionListener(new java.awt.event.ActionListener(){
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				
				ProdutoDAO produtoDAO = new ProdutoDAO();

					Produto produto = produtoDAO.devolveProdutoOndeCodProdutoEh(jTF_codProduto.getText());

					if (produto != null) {
						
						jTF_codCategoria.setText(String.valueOf(produto.getCodCategoria()));
						jTF_codProduto.setText(String.valueOf(produto.getCodProduto()));
						
						
						CategoriaDAO categoriaDAO = new CategoriaDAO();

						Categoria categoria = categoriaDAO.devolveCategoriaOndeCodCategoriaEh(Integer.valueOf(jTF_codCategoria.getText())); 

							if (categoria != null) {
								
								jCB_categoria.addItem(categoria.getDescCategoria());
								
								//JOptionPane.showMessageDialog(null, "entrou");
								
							}
							else{
								
								JOptionPane.showMessageDialog(null, "Nao achou o categoria :(");
							}			
						
						
						
						//jCB_categoria.addItem(categoria.getDescCategoria());;
						jCB_modelo.addItem(produto.getModelo());
						jCB_tipo.addItem(produto.getTipo());
						jCB_fabri.addItem(produto.getFabricante());
						jCB_capaci.addItem(produto.getCapacidade());
						jTF_precoVenda.setText(String.valueOf(produto.getPrecoVenda()));

						jTF_qtd.setEnabled(true);
						jTF_qtd.setBackground(Color.yellow);
						jTF_qtd.requestFocus();

					}
					else{
						
						JOptionPane.showMessageDialog(null, "Nao achou o produto :(");
						jTF_codProduto.setText("");
					}				
			}
		});
		
		
		jCB_categoria.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {

				if (vezCBnome == 1) {

					CategoriaDAO categoriaDAO = new CategoriaDAO();

					for (Categoria categoria : categoriaDAO.devolveListaComCategorias()) {

						if (categoria.getDescCategoria().equals(jCB_categoria.getSelectedItem())) {

							jTF_codCategoria.setText(String.valueOf(categoria.getCodCategoria()));
							jCB_modelo.removeAllItems();

							ProdutoDAO produtoDAO = new ProdutoDAO();

							for (Produto produto : produtoDAO.SELECT_distinct_modelo_FROM_produto_where_codCategoria_eh(jTF_codCategoria.getText())){

								jCB_modelo.addItem(produto.getModelo());
							}
						}
					}
				}
				vezCBnome = 1;
			}
		});

		jCB_modelo.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {

				if (vezCBmodelo == 1) {

					jCB_tipo.removeAllItems();

					ProdutoDAO produtoDAO = new ProdutoDAO();

					if (jCB_modelo.getSelectedItem() != null) {

						for (Produto produto : produtoDAO.SELECT_distinct_tipo_FROM_produto_where_modelo_eh(
								jCB_modelo.getSelectedItem().toString())) {

							jCB_tipo.addItem(produto.getTipo());
						}
					}
				}
				vezCBmodelo = 1;
				// jTF_qtd.setText("");
			}
		});

		jCB_tipo.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {

				if (vezCBtipo == 1) {
					jCB_fabri.removeAllItems();

					ProdutoDAO produtoDAO = new ProdutoDAO();

					if (jCB_modelo.getSelectedItem() != null & jCB_tipo.getSelectedItem() != null) {

						for (Produto produto : produtoDAO
								.SELECT_distinct_fabricante_FROM_produto_where_model_eh_and_tipo_eh(
										jCB_modelo.getSelectedItem().toString(),
										jCB_tipo.getSelectedItem().toString())) {

							jCB_fabri.addItem(produto.getFabricante());
						}
					}
				}
				vezCBtipo = 1;
				jTF_qtd.setText("");
			}
		});

		jCB_fabri.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {

				if (vezCBfabri == 1) {

					jCB_capaci.removeAllItems();

					ProdutoDAO produtoDAO = new ProdutoDAO();

					if (jCB_modelo.getSelectedItem() != null & jCB_tipo.getSelectedItem() != null
							& jCB_fabri.getSelectedItem() != null) {

						for (Produto produto : produtoDAO
								.SELECT_distinct_capacidade_FROM_produto_where_modelo_eh_and_tipo_eh_and_fabricante_eh(
										jCB_modelo.getSelectedItem().toString(), jCB_tipo.getSelectedItem().toString(),
										jCB_fabri.getSelectedItem().toString())) {

							jCB_capaci.addItem(produto.getCapacidade());
						}
					}
				}
				vezCBfabri = 1;
				jTF_qtd.setText("");
			}
		});

		jCB_capaci.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {

				if (vezCBcapaci == 1) {

					jTF_precoVenda.setText("");

					ProdutoDAO produtoDAO = new ProdutoDAO();

					if (jCB_modelo.getSelectedItem() != null & jCB_tipo.getSelectedItem() != null 
														     & jCB_fabri.getSelectedItem() != null & jCB_capaci.getSelectedItem() != null) {

						Produto produto = produtoDAO.devolve_produto_onde_parametros_sao(
																					jCB_modelo.getSelectedItem().toString(), jCB_tipo.getSelectedItem().toString(),
																					jCB_fabri.getSelectedItem().toString(), jCB_capaci.getSelectedItem().toString());

						if (produto != null) {

							jTF_codProduto.setText(String.valueOf(produto.getCodProduto()));

							jTF_precoVenda.setText(String.valueOf(produto.getPrecoVenda()));

							jTF_qtd.setEnabled(true);
							jTF_qtd.setBackground(Color.yellow);
							jTF_qtd.requestFocus();

						}
					}

				}
				vezCBcapaci = 1;
				jTF_qtd.setText("");
			}
		});

		jB_addProduto.setText("Add Produto");
		jB_addProduto.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {

				if(jTF_qtd.getText().equals("")){
								
					JOptionPane.showMessageDialog(null, "Favor informar a quantidade");
					
					jTF_subTotal.setText("");
				}
				else{
					
				//mRegistrarVendas.subTotal(jTF_precoVenda, jTF_qtd, jTF_subTotal);
				mRegistrarVendas.total(jTF_subTotal, jT_tabela, jL_total);
				mRegistrarVendas.adicionaDados(jT_tabela, jTF_codProduto, jCB_categoria, jCB_modelo, jCB_tipo, jCB_capaci, jTF_qtd, jTF_precoVenda, jTF_subTotal);
				jB_calcularTroco.setEnabled(true);
				jB_confirmarVenda.setEnabled(true);
				jTF_dinheiroRecebido.setEnabled(true);
				jTF_dinheiroRecebido.setText("");
				jTF_dinheiroRecebido.setBackground(Color.YELLOW);
				jL_troco.setText("0");
				}
	
				
			}
		});

		jLabel13.setText("Sub Total:");

		jTF_qtd.setToolTipText("Favor digitar apenas caracteres numericos");
		jTF_qtd.addKeyListener(new java.awt.event.KeyAdapter() {
			public void keyReleased(java.awt.event.KeyEvent evt) {

				
				if(!jTF_qtd.getText().toString().equals("") ){
					
				
				
				if (Integer.parseInt(jTF_qtd.getText()) == 0 ) {
					
					
					JOptionPane.showMessageDialog(null, "NAO eh possivel vender 0 produto voce precisa vender no minimo 1 produto");
					jTF_qtd.setText("");
					jTF_subTotal.setText("");
		
				} 
				else {

					ProdutoDAO produtoDAO = new ProdutoDAO();

					Produto produto = produtoDAO.devolveProdutoOndeCodProdutoEh(jTF_codProduto.getText());

					if (produto != null) {

						if (Integer.parseInt(jTF_qtd.getText()) > produto.getQtdProduto()) {

							JOptionPane.showMessageDialog(null, "NAO temos essa quantidade de produto ");
							jTF_qtd.setText("");
							jTF_subTotal.setText("");
						}
						else{
					
							double total = Double.parseDouble(jTF_qtd.getText()) * Double.parseDouble(jTF_precoVenda.getText());
							
							String resultado = String.format("%.2f",total);
							
							String resultadoComPonto = resultado.replace(",", ".");
							
							jTF_subTotal.setFont(new Font("Times New Roman", Font.BOLD, 24));
							jTF_subTotal.setText(resultadoComPonto);
						}
					}
				}
				
				}
				
				
			}
		});

		jL_usuario.setText("Nome");

		jL_data.setText("Data atual");

		jL_hora.setText("Hora atual");

		jT_tabela
				.setModel(new javax.swing.table.DefaultTableModel(
						new Object[][] { { null, null, null, null }, { null, null, null, null },
								{ null, null, null, null }, { null, null, null, null } },
						new String[] { "Title 1", "Title 2", "Title 3", "Title 4" }));
		jScrollPane1.setViewportView(jT_tabela);

		jB_remover.setText("remover");
		jB_remover.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {

				mRegistrarVendas.atualizarJT(jT_tabela, jL_total);
				mRegistrarVendas.removerLinhaJT(jT_tabela);
				jTF_dinheiroRecebido.setText("");
				jL_troco.setText("0");
			}
		});

		jL_total.setFont(new java.awt.Font("Verdana", 1, 24));
		jL_total.setText("0");

		jB_confirmarVenda.setText("Confirmar Venda");
		jB_confirmarVenda.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {

				mRegistrarVendas.baixaProduto(jT_tabela, jL_data, jL_hora, jL_usuario, jL_total);
								
				jM_cancelar.setVisible(false);
				jM_novo.setVisible(true);
				jCB_modelo.removeAllItems();
				jCB_tipo.removeAllItems();
				jCB_fabri.removeAllItems();
				jCB_capaci.removeAllItems();
				utilitarios.habilitarJCB(RegistrarVendas.this, false);
				utilitarios.habilitarJTF(RegistrarVendas.this, false);
				utilitarios.habilitarJB(RegistrarVendas.this, false);
				utilitarios.limparJTF(RegistrarVendas.this);
				utilitarios.corBrancoJTF(RegistrarVendas.this);
				jB_remover.setVisible(false);
				mRegistrarVendas.removerTudoJT(jT_tabela);
				jL_total.setText("0");
				jL_troco.setText("0");
	
				
			}
		});

		jB_calcularTroco.setText("Calcular Troco");
		jB_calcularTroco.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {

				
				
				String dinheiroRecebido = jTF_dinheiroRecebido.getText().replace(",", "."); 
					   
				
					   
					   
				if (dinheiroRecebido.isEmpty()) {
					
					JOptionPane.showMessageDialog(null, "Favor digitar o valor recebido pelo cliente");
				} 
				else if (Double.parseDouble(dinheiroRecebido) < Double.parseDouble(jL_total.getText())) {
					
					JOptionPane.showMessageDialog(null, "Valor recebido eh inferior ao valor total  \nFavor verificar");
				} 
				else {
					
					double troco = Double.parseDouble(dinheiroRecebido) - Double.parseDouble(jL_total.getText());
					
					String trocoString = String.format("%.2f", troco);
					
					
					jL_troco.setText(trocoString);
				}
			}
		});

		jL_troco.setFont(new java.awt.Font("Verdana", 1, 24));
		jL_troco.setText("0");

		jLabel15.setFont(new java.awt.Font("Verdana", 1, 14));
		jLabel15.setText("Troco R$.:");

		jM_novo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/novo.png"))); // NOI18N
		jM_novo.setText("Novo");
		jM_novo.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mousePressed(java.awt.event.MouseEvent evt) {

				jM_cancelar.setVisible(true);
				jM_novo.setVisible(false);
				utilitarios.habilitarJCB(RegistrarVendas.this, true);
				jB_addProduto.setEnabled(true);
				jTF_codProduto.setEnabled(true);
				jTF_codProduto.requestFocus();
			}
		});
		jMenuBar1.add(jM_novo);

		jM_cancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/cancela.png"))); // NOI18N
		jM_cancelar.setText("Cancelar");
		jM_cancelar.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mousePressed(java.awt.event.MouseEvent evt) {

				jM_cancelar.setVisible(false);
				jM_novo.setVisible(true);
				jCB_modelo.removeAllItems();
				jCB_tipo.removeAllItems();
				jCB_fabri.removeAllItems();
				jCB_capaci.removeAllItems();
				utilitarios.habilitarJCB(RegistrarVendas.this, false);
				utilitarios.limparJTF(RegistrarVendas.this);
				utilitarios.habilitarJTF(RegistrarVendas.this, false);
				utilitarios.corBrancoJTF(RegistrarVendas.this);
				utilitarios.habilitarJB(RegistrarVendas.this, false);
				jB_remover.setVisible(false);
				mRegistrarVendas.removerTudoJT(jT_tabela);
				jL_total.setText("0");
				jL_troco.setText("0");
			}
		});
		jMenuBar1.add(jM_cancelar);

		jM_sair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/sair.png"))); // NOI18N
		jM_sair.setText("Sair");
		jM_sair.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mousePressed(java.awt.event.MouseEvent evt) {

				dispose();
			}
		});

		jMenuBar1.add(jM_sair);

		setJMenuBar(jMenuBar1);

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		layout.setHorizontalGroup(
			layout.createParallelGroup(Alignment.TRAILING)
				.addGroup(layout.createSequentialGroup()
					.addGap(24)
					.addGroup(layout.createParallelGroup(Alignment.LEADING, false)
						.addGroup(layout.createSequentialGroup()
							.addComponent(jLabel10)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(jL_hora))
						.addGroup(layout.createSequentialGroup()
							.addGroup(layout.createParallelGroup(Alignment.TRAILING)
								.addComponent(jLabel9)
								.addComponent(jLabel11))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(layout.createParallelGroup(Alignment.LEADING)
								.addComponent(jL_usuario)
								.addComponent(jL_data))))
					.addContainerGap(639, Short.MAX_VALUE))
				.addGroup(layout.createSequentialGroup()
					.addContainerGap()
					.addGroup(layout.createParallelGroup(Alignment.TRAILING)
						.addComponent(jLabel6)
						.addComponent(jLabel8)
						.addComponent(jLabel7)
						.addComponent(jLabel5)
						.addComponent(jLabel2)
						.addComponent(jLabel3)
						.addComponent(jLabel4)
						.addComponent(jLabel1)
						.addComponent(jLabel13))
					.addGap(14)
					.addGroup(layout.createParallelGroup(Alignment.LEADING)
						.addComponent(jB_addProduto)
						.addGroup(layout.createParallelGroup(Alignment.LEADING)
							.addComponent(jTF_subTotal, 152, 152, 152)
							.addGroup(layout.createSequentialGroup()
								.addComponent(jTF_codCategoria, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(jTF_codProduto, GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
								.addPreferredGap(ComponentPlacement.RELATED))
							.addComponent(jTF_qtd, 152, 152, 152)
							.addComponent(jTF_precoVenda, 152, 152, 152)
							.addComponent(jCB_capaci, 0, 152, Short.MAX_VALUE)
							.addComponent(jCB_fabri, 0, 152, Short.MAX_VALUE)
							.addComponent(jCB_tipo, 0, 152, Short.MAX_VALUE)
							.addComponent(jCB_modelo, 0, 152, Short.MAX_VALUE)
							.addComponent(jCB_categoria, 0, 152, Short.MAX_VALUE)))
					.addGap(10)
					.addGroup(layout.createParallelGroup(Alignment.TRAILING)
						.addGroup(layout.createSequentialGroup()
							.addGroup(layout.createParallelGroup(Alignment.LEADING, false)
								.addGroup(layout.createSequentialGroup()
									.addComponent(jB_remover)
									.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
									.addComponent(jB_confirmarVenda))
								.addComponent(jScrollPane1, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 488, GroupLayout.PREFERRED_SIZE))
							.addGap(45))
						.addGroup(layout.createSequentialGroup()
							.addGroup(layout.createParallelGroup(Alignment.TRAILING)
								.addGroup(layout.createSequentialGroup()
									.addComponent(jLabel12)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(jL_total)
									.addGap(65))
								.addGroup(layout.createSequentialGroup()
									.addGroup(layout.createParallelGroup(Alignment.TRAILING)
										.addComponent(jB_calcularTroco)
										.addComponent(jLabel15))
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addGroup(layout.createParallelGroup(Alignment.LEADING)
										.addComponent(jL_troco)
										.addComponent(jTF_dinheiroRecebido, GroupLayout.PREFERRED_SIZE, 84, GroupLayout.PREFERRED_SIZE))))
							.addGap(272))))
		);
		layout.setVerticalGroup(
			layout.createParallelGroup(Alignment.LEADING)
				.addGroup(layout.createSequentialGroup()
					.addContainerGap()
					.addGroup(layout.createParallelGroup(Alignment.TRAILING)
						.addGroup(layout.createParallelGroup(Alignment.BASELINE)
							.addComponent(jL_total)
							.addComponent(jLabel12, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE))
						.addGroup(layout.createSequentialGroup()
							.addGroup(layout.createParallelGroup(Alignment.LEADING)
								.addGroup(layout.createSequentialGroup()
									.addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 301, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addGroup(layout.createParallelGroup(Alignment.LEADING)
										.addComponent(jB_confirmarVenda, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE)
										.addComponent(jB_remover)))
								.addGroup(layout.createSequentialGroup()
									.addGroup(layout.createParallelGroup(Alignment.BASELINE)
										.addComponent(jTF_codCategoria, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(jLabel1)
										.addComponent(jTF_codProduto, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(layout.createParallelGroup(Alignment.BASELINE)
										.addComponent(jCB_categoria, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(jLabel2))
									.addGap(12)
									.addGroup(layout.createParallelGroup(Alignment.BASELINE)
										.addComponent(jCB_modelo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(jLabel3))
									.addGap(12)
									.addGroup(layout.createParallelGroup(Alignment.BASELINE)
										.addComponent(jCB_tipo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(jLabel4))
									.addGap(12)
									.addGroup(layout.createParallelGroup(Alignment.BASELINE)
										.addComponent(jCB_fabri, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(jLabel5))
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addGroup(layout.createParallelGroup(Alignment.BASELINE)
										.addComponent(jCB_capaci, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(jLabel7))
									.addGap(12)
									.addGroup(layout.createParallelGroup(Alignment.BASELINE)
										.addComponent(jTF_precoVenda, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(jLabel8))
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(layout.createParallelGroup(Alignment.BASELINE)
										.addComponent(jTF_qtd, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(jLabel6))
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addGroup(layout.createParallelGroup(Alignment.BASELINE)
										.addComponent(jLabel13)
										.addComponent(jTF_subTotal, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE))
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(jB_addProduto)))
							.addGap(4)))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(layout.createParallelGroup(Alignment.TRAILING)
						.addGroup(layout.createSequentialGroup()
							.addGroup(layout.createParallelGroup(Alignment.BASELINE)
								.addComponent(jTF_dinheiroRecebido, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(jB_calcularTroco))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(layout.createParallelGroup(Alignment.BASELINE)
								.addComponent(jL_troco)
								.addComponent(jLabel15, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE))
							.addGap(84))
						.addGroup(layout.createSequentialGroup()
							.addGroup(layout.createParallelGroup(Alignment.BASELINE)
								.addComponent(jL_usuario)
								.addComponent(jLabel11))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(layout.createParallelGroup(Alignment.BASELINE)
								.addComponent(jL_data)
								.addComponent(jLabel9))
							.addGap(12)
							.addGroup(layout.createParallelGroup(Alignment.BASELINE)
								.addComponent(jL_hora)
								.addComponent(jLabel10))
							.addGap(57))))
		);
		getContentPane().setLayout(layout);

		java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
		setBounds((screenSize.width - 816) / 2, (screenSize.height - 638) / 2, 816, 638);
	}

}
