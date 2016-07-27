package br.com.extend.scv.view;

import br.com.extend.scv.dao.LoginDAO;
import br.com.extend.scv.util.Data;
import javax.swing.JLabel;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.GroupLayout;
import javax.swing.ImageIcon;

public class Menu extends javax.swing.JFrame {

	private static final long serialVersionUID = 1L;

	private javax.swing.JMenuBar jMenuBar;
	private javax.swing.JMenu jMenu_arquivo;
	private javax.swing.JMenu jMenu_consultar;
	private javax.swing.JMenu jMenu_configuracao;
	private javax.swing.JMenu jMenu_ajuda;
	private javax.swing.JMenuItem jMenuItem_cadastrarProdutos;
	private javax.swing.JMenuItem jMenuItem_registrarVendas;
	private javax.swing.JMenuItem jMenuItem_gerarRelatorios;
	private javax.swing.JMenuItem jMenuItem_sair;
	private javax.swing.JMenuItem jMenuItem_consultarProdutos;
	private javax.swing.JMenuItem jMenuItem_consultarVendas;
	private javax.swing.JMenuItem jMenuItem_configuracaoUsuario;
	private javax.swing.JMenuItem jMenuItem_configuracaoProduto;
	private javax.swing.JMenuItem jMenuItem_sobre;
	private javax.swing.JLabel jLabel_usuario;
	private javax.swing.JLabel jLabel_data;
	private javax.swing.JLabel jLabel_hora;
	private org.netbeans.examples.lib.timerbean.Timer timer;
	private JLabel jLabel_backGround;

	Data data = new Data();
	LoginDAO loginDAO = new LoginDAO();
	

	public Menu() {
		
		//setIconImage(Toolkit.getDefaultToolkit().getImage(Menu.class.getResource("/icones/X10D_2.jpg")));
		
		initComponents();
		timer.start();
		jLabel_usuario.setText(jLabel_usuario.getText() +" "+ LoginView.usuarioLogado);
		jLabel_data.setText(jLabel_data.getText() +" "+ data.lerData());
		
		//setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{getContentPane(), jLabel_usuario, jLabel_backGround, jLabel_data, jLabel_hora, jMenuBar, jMenu_arquivo, jMenuItem_cadastrarProdutos, jMenuItem_registrarVendas, jMenuItem_gerarRelatorios, jMenuItem_sair, jMenu_consultar, jMenuItem_consultarProdutos, jMenuItem_consultarVendas, jMenu_configuracao, jMenuItem_configuracaoUsuario, jMenuItem_configuracaoProduto, jMenu_ajuda, jMenuItem_sobre}));
	}

	@SuppressWarnings("unchecked")
	private void initComponents() {

		jLabel_backGround = new JLabel();
		jMenuBar = new javax.swing.JMenuBar();
		jMenu_arquivo = new javax.swing.JMenu();
		jMenu_consultar = new javax.swing.JMenu();
		jMenu_configuracao = new javax.swing.JMenu();
		jMenu_ajuda = new javax.swing.JMenu();
		jMenuItem_cadastrarProdutos = new javax.swing.JMenuItem();
		jMenuItem_registrarVendas = new javax.swing.JMenuItem();
		jMenuItem_gerarRelatorios = new javax.swing.JMenuItem();
		jMenuItem_sair = new javax.swing.JMenuItem();
		jMenuItem_consultarProdutos = new javax.swing.JMenuItem();
		jMenuItem_consultarVendas = new javax.swing.JMenuItem();
		jMenuItem_configuracaoUsuario = new javax.swing.JMenuItem();
		jMenuItem_configuracaoProduto = new javax.swing.JMenuItem();
		jMenuItem_sobre = new javax.swing.JMenuItem();
		jLabel_usuario = new javax.swing.JLabel();
		jLabel_data = new javax.swing.JLabel();
		jLabel_hora = new javax.swing.JLabel();
		timer = new org.netbeans.examples.lib.timerbean.Timer();
		
		
		timer.addTimerListener(new org.netbeans.examples.lib.timerbean.TimerListener() {
			public void onTime(java.awt.event.ActionEvent evt) {
				
				jLabel_hora.setText(data.lerHora());
			}
		});

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setTitle("Sistema de Controle de Vendas");

		jLabel_backGround.setIcon(new ImageIcon(Menu.class.getResource("/icones/papelaria2.png")));

		jLabel_data.setText("Data:");

		jLabel_hora.setText("Hora:");

		jLabel_usuario.setText("Usuario:");

		
		jMenuBar.add(jMenu_arquivo);
		
		jMenu_arquivo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/arquivo.png")));
		jMenu_arquivo.setText("Arquivo");
		jMenu_arquivo.add(jMenuItem_cadastrarProdutos);
		jMenu_arquivo.add(jMenuItem_registrarVendas);
		jMenu_arquivo.add(jMenuItem_gerarRelatorios);
		jMenu_arquivo.add(jMenuItem_sair);

		jMenuItem_cadastrarProdutos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/cadastrar.png")));
		jMenuItem_cadastrarProdutos.setText("Cadastrar Produtos");
		jMenuItem_cadastrarProdutos.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				
				CadastrarProdutos cp = new CadastrarProdutos();
				cp.setVisible(true);
			}
		});
		
		jMenuItem_registrarVendas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/dinheiro.png")));
		jMenuItem_registrarVendas.setText("Registrar Vendas");
		jMenuItem_registrarVendas.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				
				RegistrarVendas rv = new RegistrarVendas();
				rv.setVisible(true);
			}
		});

		jMenuItem_gerarRelatorios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/gerarRelatorio.png")));
		jMenuItem_gerarRelatorios.setText("Gerar Relatorios");
		jMenuItem_gerarRelatorios.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				
				GerarRelatorios g = new GerarRelatorios();
				g.setVisible(true);
			}
		});

		jMenuItem_sair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/exit.png")));
		jMenuItem_sair.setText("Sair");
		jMenuItem_sair.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				
				System.exit(0);
			}
		});

		jMenuBar.add(jMenu_consultar);

		jMenu_consultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/search.png")));
		jMenu_consultar.setText("Consultar");
		jMenu_consultar.add(jMenuItem_consultarProdutos);
		jMenu_consultar.add(jMenuItem_consultarVendas);

		jMenuItem_consultarProdutos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/produto.png")));
		jMenuItem_consultarProdutos.setText("Produtos");
		jMenuItem_consultarProdutos.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				
				ConsultarProdutos cp = new ConsultarProdutos();
				cp.setVisible(true);
			}
		});

		jMenuItem_consultarVendas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/vendas.png")));
		jMenuItem_consultarVendas.setText("Vendas");
		jMenuItem_consultarVendas.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				
				ConsultarVendas cv = new ConsultarVendas();
				cv.setVisible(true);
			}
		});

		jMenuBar.add(jMenu_configuracao);

		jMenu_configuracao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/configure.png")));
		jMenu_configuracao.setText("Configuracao");
		jMenu_configuracao.add(jMenuItem_configuracaoUsuario);
		jMenu_configuracao.add(jMenuItem_configuracaoProduto);

		jMenuItem_configuracaoUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/user.png")));
		jMenuItem_configuracaoUsuario.setText("Usuario");
		jMenuItem_configuracaoUsuario.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				
				ConfUsuario cu = new ConfUsuario();
				cu.setVisible(true);
			}
		});

		jMenuItem_configuracaoProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/produto.png")));
		jMenuItem_configuracaoProduto.setText("Produto");
		jMenuItem_configuracaoProduto.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				
				ConfProduto cp = new ConfProduto();
				cp.setVisible(true);
			}
		});

		jMenuBar.add(jMenu_ajuda);

		jMenu_ajuda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/ajuda.png")));
		jMenu_ajuda.setText("Ajuda");
		jMenu_ajuda.add(jMenuItem_sobre);

		jMenuItem_sobre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/X10D.PNG")));
		jMenuItem_sobre.setText("Sobre");
		jMenuItem_sobre.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
								
				Sobre s = new Sobre();
				s.setVisible(true);
			}
		});
		

		setJMenuBar(jMenuBar);
		

		javax.swing.GroupLayout groupLayout = new javax.swing.GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(jLabel_usuario)
					.addGap(143)
					.addComponent(jLabel_data)
					.addGap(144)
					.addComponent(jLabel_hora)
					.addContainerGap(315, Short.MAX_VALUE))
				.addComponent(jLabel_backGround, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 784, Short.MAX_VALUE)
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addComponent(jLabel_backGround, GroupLayout.PREFERRED_SIZE, 498, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 106, Short.MAX_VALUE)
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addComponent(jLabel_hora)
						.addComponent(jLabel_usuario)
						.addComponent(jLabel_data))
					.addContainerGap())
		);
		
		getContentPane().setLayout(groupLayout);

		java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
		setBounds((screenSize.width - 800) / 2, (screenSize.height - 600) / 2, 800, 600);
	}
}
