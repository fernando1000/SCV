package br.com.extend.scv.view;

import javax.swing.JOptionPane;

import br.com.extend.scv.dao.LoginDAO;
import br.com.extend.scv.modelo.Login;

public class LoginView extends javax.swing.JFrame {

	private static final long serialVersionUID = 1L;

	private java.awt.Label label_DigiteUsuarioSenhaEntrarSistema;
	private java.awt.Label label_usuario;
	private java.awt.Label label_senha;
    private java.awt.TextField textField_usuario;
    private javax.swing.JPasswordField jPasswordField_senha;
    private javax.swing.JButton jButton_entrar;
    public static String usuarioLogado;


	public LoginView() {
		
        initComponents();
    }

    public static void main(String args[]) {
    	
        java.awt.EventQueue.invokeLater(new Runnable() {
        	
            public void run() {
            	
                new LoginView().setVisible(true);
            }
      });
    }

	
    @SuppressWarnings("unchecked")
    private void initComponents() {

    	
        label_usuario = new java.awt.Label();
        label_senha = new java.awt.Label();
        textField_usuario = new java.awt.TextField();
        label_DigiteUsuarioSenhaEntrarSistema = new java.awt.Label();
        jButton_entrar = new javax.swing.JButton();
        jPasswordField_senha = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");

        label_usuario.setText("Usuario:");

        label_senha.setText("Senha:");

        label_DigiteUsuarioSenhaEntrarSistema.setAlignment(java.awt.Label.CENTER);
        label_DigiteUsuarioSenhaEntrarSistema.setText("Digite o usuario e senha para entrar no sistema");

        jButton_entrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/login.png"))); // NOI18N
        jButton_entrar.setText("Entrar");
        jButton_entrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	            	
                //LoginView.setUsuario(jTF_usuario.getText());
                char[] pass = jPasswordField_senha.getPassword();
                String strPassword = String.valueOf(pass) ;
                
                LoginDAO loginDAO = new LoginDAO();
                
                Login login = loginDAO.devolveUsuarioOndeUsuarioEh(textField_usuario.getText());
                
                    if (login != null) {
                    	
                        if(login.getUsuario().equals(textField_usuario.getText()) && login.getSenha().equals(strPassword)){
                        	
                        usuarioLogado = textField_usuario.getText();
                        		
                        Menu m = new Menu();
                             m.setVisible(true);
                        
                             dispose();
                        }
                        else{
                        JOptionPane.showMessageDialog(null, "Usuario ou Senha incompativel!");
                        }
                    }
                    else{
                    JOptionPane.showMessageDialog(null, "Usuario nao esta cadastrado!");
                    }            	
            }
        });

        javax.swing.GroupLayout groupLayout = new javax.swing.GroupLayout(getContentPane());
        
        getContentPane().setLayout(groupLayout);
        
        groupLayout.setHorizontalGroup(groupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        		   .addGroup(groupLayout.createSequentialGroup()
        		   .addGroup(groupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                   .addGroup(groupLayout.createSequentialGroup()
                   .addContainerGap()
                   .addComponent(jButton_entrar))
                   .addGroup(javax.swing.GroupLayout.Alignment.LEADING, groupLayout.createSequentialGroup()
                   .addGap(41, 41, 41)
                   .addGroup(groupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                   .addComponent(label_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                   .addComponent(label_senha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                   .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                   .addGroup(groupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                   .addComponent(jPasswordField_senha, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE)
                   .addComponent(textField_usuario, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE))))
                   .addGap(105, 105, 105))
                   .addGroup(groupLayout.createSequentialGroup()
                   .addGap(29, 29, 29)
                   .addComponent(label_DigiteUsuarioSenhaEntrarSistema, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                   .addContainerGap(38, Short.MAX_VALUE)));
        
        groupLayout.setVerticalGroup(groupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                   .addGroup(groupLayout.createSequentialGroup()
                   .addContainerGap()
                   .addComponent(label_DigiteUsuarioSenhaEntrarSistema, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                   .addGap(46, 46, 46)
                   .addGroup(groupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                   .addComponent(label_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                   .addComponent(textField_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                   .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                   .addGroup(groupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                   .addComponent(label_senha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                   .addComponent(jPasswordField_senha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                   .addGap(20, 20, 20)
                   .addComponent(jButton_entrar)
                   .addContainerGap(35, Short.MAX_VALUE))
        );

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-350)/2, (screenSize.height-250)/2, 350, 250);
    }

  
}
