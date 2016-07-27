package br.com.extend.scv.view;

import javax.swing.JOptionPane;
import br.com.extend.scv.dao.LoginDAO;
import br.com.extend.scv.modelo.Login;
import br.com.extend.scv.util.Utilitarios;
import java.awt.Color;

public class ConfUsuario extends javax.swing.JFrame {
	
	private static final long serialVersionUID = 1L;
	
Utilitarios mConfUsuario=new Utilitarios();
Utilitarios utilitarios=new Utilitarios();

        public ConfUsuario() {
        initComponents();

        jTF_codUsuario.setEnabled(true);
        jB_pesquisar.setEnabled(false);
        jM_salvar.setVisible(false);
        jM_cancelar.setVisible(false);
        jM_alterar.setVisible(false);
        jM_excluir.setVisible(false);
        utilitarios.habilitarTF(this, false);
        utilitarios.habilitarJPF(this, false);
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        label1 = new java.awt.Label();
        label2 = new java.awt.Label();
        label3 = new java.awt.Label();
        jTF_usuario = new java.awt.TextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jT_tabela = new javax.swing.JTable();
        label4 = new java.awt.Label();
        jTF_codUsuario = new java.awt.TextField();
        jB_pesquisar = new javax.swing.JButton();
        jPF_senha = new javax.swing.JPasswordField();
        jPF_senha2 = new javax.swing.JPasswordField();
        jMenuBar1 = new javax.swing.JMenuBar();
        jM_novo = new javax.swing.JMenu();
        jM_salvar = new javax.swing.JMenu();
        jM_alterar = new javax.swing.JMenu();
        jM_consultar = new javax.swing.JMenu();
        jM_excluir = new javax.swing.JMenu();
        jM_gerenciar = new javax.swing.JMenu();
        jM_cancelar = new javax.swing.JMenu();
        jM_sair = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Configuracao de Usuario");
        setName("NovoUsuario"); // NOI18N

        label1.setText("Nome do usuario:");

        label2.setText("Senha:");

        label3.setText("Confirme a senha:");

        jTF_usuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTF_usuarioKeyReleased(evt);
            }
        });

        jT_tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jT_tabela.setEnabled(false);
        jScrollPane1.setViewportView(jT_tabela);

        label4.setText("Codigo:");

        jTF_codUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTF_codUsuarioKeyReleased(evt);
            }
        });

        jB_pesquisar.setText("Pesquisar");
        jB_pesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_pesquisarActionPerformed(evt);
            }
        });

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

        jM_gerenciar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/configure.png"))); // NOI18N
        jM_gerenciar.setText("Gerenciar");
        jM_gerenciar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jM_gerenciarMousePressed(evt);
            }
        });
        jMenuBar1.add(jM_gerenciar);

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
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPF_senha2, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
                    .addComponent(jPF_senha, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTF_codUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jB_pesquisar))
                    .addComponent(jTF_usuario, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE))
                .addGap(152, 152, 152)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jB_pesquisar)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTF_codUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTF_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPF_senha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPF_senha2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(111, Short.MAX_VALUE))
        );

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-800)/2, (screenSize.height-600)/2, 800, 600);
    }// </editor-fold>//GEN-END:initComponents

    private void jM_novoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jM_novoMousePressed
       utilitarios.habilitarTF(this, true);
       utilitarios.habilitarJPF(this, true);
       jTF_usuario.setBackground(Color.YELLOW);
       jPF_senha.setBackground(Color.YELLOW);
       jPF_senha2.setBackground(Color.YELLOW);
       jTF_codUsuario.setEnabled(false);
       jM_cancelar.setVisible(true);
       jM_novo.setVisible(false);
       jM_salvar.setVisible(true);
    }//GEN-LAST:event_jM_novoMousePressed

    private void jM_excluirMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jM_excluirMousePressed
    	
        
        LoginDAO loginDAO = new LoginDAO();
        
        loginDAO.deletaLoginOndeCodUsuarioEh(Integer.parseInt(jTF_codUsuario.getText()));
        
        utilitarios.limparTF(this);
        utilitarios.limparJPF(this);
        jT_tabela.setVisible(false);
        jM_consultar.setVisible(true);
        jM_alterar.setVisible(false);
        jM_excluir.setVisible(false);
        jM_cancelar.setVisible(false);
        jM_salvar.setVisible(false);
    }//GEN-LAST:event_jM_excluirMousePressed

    private void jM_sairMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jM_sairMousePressed
        dispose();
    }//GEN-LAST:event_jM_sairMousePressed

    private void jM_salvarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jM_salvarMousePressed
        char[] pass = jPF_senha.getPassword();
        String strPassword = String.valueOf(pass);
        char[] pass2 = jPF_senha2.getPassword();
        String strPassword2 = String.valueOf(pass2) ;
    if(jTF_codUsuario.getText().isEmpty()){
        if(jTF_usuario.getText().isEmpty() || strPassword.isEmpty() || strPassword2.isEmpty()){
        JOptionPane.showMessageDialog(null, "Favor digitar todos os campos");
        }
        else
            if(strPassword.equals(strPassword2)){
            	

		LoginDAO loginDAO = new LoginDAO();
		
		boolean inseriuUsuario = loginDAO.insereUsuario(jTF_usuario.getText(), strPassword);
		
                if (inseriuUsuario){
                	
                JOptionPane.showMessageDialog(null, "Usuario cadastrado com sucesso!!!");
                utilitarios.limparTF(this);
                utilitarios.corBrancoTF(this);
                utilitarios.habilitarTF(this, false);
                utilitarios.limparJPF(this);
                utilitarios.corBrancoJPF(this);
                utilitarios.habilitarJPF(this, false);
                jM_salvar.setVisible(false);
                jM_cancelar.setVisible(false);
                jM_alterar.setVisible(false);
                jM_excluir.setVisible(false);
                jM_novo.setVisible(true);
                jT_tabela.setVisible(false);
                jM_consultar.setVisible(true);
                }
            }
            else{
            JOptionPane.showMessageDialog(null, "Incompatibilidade na senha. \nFavor verificar. ");
            }
    }
        else{
            if(jTF_usuario.getText().isEmpty() || strPassword.isEmpty() || strPassword2.isEmpty()){
            JOptionPane.showMessageDialog(null, "Favor digitar todos os campos");
            }
            else
                if(strPassword.equals(strPassword2)){
                	

		LoginDAO loginDAO = new LoginDAO();

		boolean atualisouUsuario = loginDAO.atualisaUsuario(jTF_usuario.getText(), strPassword, Integer.parseInt(jTF_codUsuario.getText()));


                    if(atualisouUsuario){
                    	
                    JOptionPane.showMessageDialog(null, "Dados alterados com sucesso!!!");
                    utilitarios.limparTF(this);
                    utilitarios.corBrancoTF(this);                    
                    utilitarios.habilitarTF(this, false);
                    utilitarios.limparJPF(this);
                    utilitarios.corBrancoJPF(this);
                    utilitarios.habilitarJPF(this, false);
                    jM_salvar.setVisible(false);
                    jM_cancelar.setVisible(false);
                    jM_alterar.setVisible(false);
                    jM_excluir.setVisible(false);
                    jM_novo.setVisible(true);
                    jT_tabela.setVisible(false);
                    jM_consultar.setVisible(true);
                    jM_gerenciar.setVisible(true);
                    }
                }
                else{
                JOptionPane.showMessageDialog(null, "Incompatibilidade na senha. \nFavor verificar. ");
                }
            }
    }//GEN-LAST:event_jM_salvarMousePressed

    private void jM_cancelarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jM_cancelarMousePressed
        utilitarios.corBrancoTF(this);
        utilitarios.corBrancoJPF(this);
        jTF_codUsuario.setEnabled(true);
        jB_pesquisar.setEnabled(false);
        jM_novo.setVisible(true);
        jM_salvar.setVisible(false);
        jM_cancelar.setVisible(false);
        jM_alterar.setVisible(false);
        jM_excluir.setVisible(false);
        jM_consultar.setVisible(true);
        jM_gerenciar.setVisible(true);
        jT_tabela.setVisible(false);
        utilitarios.habilitarTF(this, false);
        utilitarios.limparTF(this);
        utilitarios.habilitarJPF(this, false);
        utilitarios.limparJPF(this);
    }//GEN-LAST:event_jM_cancelarMousePressed

    private void jTF_usuarioKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTF_usuarioKeyReleased
    String usuario = jTF_usuario.getText();   
    if(usuario.length() > 10){   
    JOptionPane.showMessageDialog(null, "Campo excedeu tamanho maximo permitido (10 caracteres)");   
    jTF_usuario.setText("");
    }
    else{
    
    	
    
    
	LoginDAO loginDAO = new LoginDAO();
	
	for(Login login : loginDAO.devolveListaComUsuarios()){
		
		if(jTF_usuario.getText().equals(login.getUsuario())){
			
			JOptionPane.showMessageDialog(null, "Usuario jah existe");
			jTF_usuario.setText("");
		}
	}
    }
    }//GEN-LAST:event_jTF_usuarioKeyReleased

    private void jM_consultarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jM_consultarMousePressed
        jT_tabela.setVisible(true);
        jT_tabela.setModel(mConfUsuario.adicionarUsuario());
        jM_consultar.setVisible(false);
        jM_cancelar.setVisible(true);
    }//GEN-LAST:event_jM_consultarMousePressed

    private void jM_alterarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jM_alterarMousePressed
        jM_alterar.setVisible(false);
        jTF_codUsuario.setEnabled(false);
        jTF_usuario.setEnabled(true);
        jPF_senha.setEnabled(true);
        jPF_senha2.setEnabled(true);
        utilitarios.corAmareloTF(this);
        utilitarios.corAmareloJPF(this);
        jTF_codUsuario.setBackground(Color.white);
        jM_salvar.setVisible(true);
        jB_pesquisar.setEnabled(false);
        jM_excluir.setVisible(false);
    }//GEN-LAST:event_jM_alterarMousePressed

    private void jTF_codUsuarioKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTF_codUsuarioKeyReleased
        jB_pesquisar.setEnabled(true);
    }//GEN-LAST:event_jTF_codUsuarioKeyReleased

    private void jB_pesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_pesquisarActionPerformed
        if(jTF_codUsuario.getText().isEmpty()){
        JOptionPane.showMessageDialog(null, "Favor digitar algum codigo");
        }
        else{
        	
        
        LoginDAO loginDAO = new LoginDAO();
    	
        Login login = loginDAO.devolveUsuarioOndeCodUsuarioEh(Integer.parseInt(jTF_codUsuario.getText()));
        
            	
                if(login != null){
                	
                jTF_usuario.setText(login.getUsuario());
                jPF_senha.setText(login.getSenha());
                jM_alterar.setVisible(true);
                jM_excluir.setVisible(true);
                
                }
            
       }
    }//GEN-LAST:event_jB_pesquisarActionPerformed

    private void jM_gerenciarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jM_gerenciarMousePressed
        utilitarios.limparTF(this);
        utilitarios.habilitarTF(this, false);
        utilitarios.limparJPF(this);
        utilitarios.habilitarJPF(this, false);
        jTF_codUsuario.setEnabled(true);
        jTF_codUsuario.setBackground(Color.YELLOW);
        jTF_usuario.setBackground(Color.WHITE);
        jPF_senha.setBackground(Color.WHITE);
        jPF_senha2.setBackground(Color.WHITE);
        jM_cancelar.setVisible(true);
        jM_novo.setVisible(false);
        jM_gerenciar.setVisible(false);
        jM_salvar.setVisible(false);
    }//GEN-LAST:event_jM_gerenciarMousePressed

//    public static void main(String args[]) {
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new ConfUsuario().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jB_pesquisar;
    private javax.swing.JMenu jM_alterar;
    private javax.swing.JMenu jM_cancelar;
    private javax.swing.JMenu jM_consultar;
    private javax.swing.JMenu jM_excluir;
    private javax.swing.JMenu jM_gerenciar;
    private javax.swing.JMenu jM_novo;
    private javax.swing.JMenu jM_sair;
    private javax.swing.JMenu jM_salvar;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPasswordField jPF_senha;
    private javax.swing.JPasswordField jPF_senha2;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private java.awt.TextField jTF_codUsuario;
    private java.awt.TextField jTF_usuario;
    private javax.swing.JTable jT_tabela;
    private java.awt.Label label1;
    private java.awt.Label label2;
    private java.awt.Label label3;
    private java.awt.Label label4;
    // End of variables declaration//GEN-END:variables
}