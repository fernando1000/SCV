package br.com.extend.scv.view;

import br.com.extend.scv.modelo.Produto;
import br.com.extend.scv.util.Utilitarios;

public class ConsultarProdutos extends javax.swing.JFrame {

	private static final long serialVersionUID = 1L;


	Utilitarios utilitarios = new Utilitarios();

	
	Produto mcp= new Produto();

	public ConsultarProdutos() {
        initComponents();
        btNovo.setVisible(false);
        btSalvar.setVisible(false);
        btExcluir.setVisible(false);
        btConsultar.setVisible(false);
        btCancelar.setVisible(false);
        jT_consultarProdutos.setModel(utilitarios.adicionarProdutos());
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jT_consultarProdutos = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        btNovo = new javax.swing.JMenu();
        btSalvar = new javax.swing.JMenu();
        btAlterar = new javax.swing.JMenu();
        btConsultar = new javax.swing.JMenu();
        btExcluir = new javax.swing.JMenu();
        btCancelar = new javax.swing.JMenu();
        btSair = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Consultar Produtos");

        jT_consultarProdutos.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jT_consultarProdutos);
        jT_consultarProdutos.getAccessibleContext().setAccessibleParent(null);

        btNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/novo.png"))); // NOI18N
        btNovo.setText("Novo");
        jMenuBar1.add(btNovo);

        btSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/salvarG.png"))); // NOI18N
        btSalvar.setText("Salvar");
        jMenuBar1.add(btSalvar);

        btAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/alterar.png"))); // NOI18N
        btAlterar.setText("Atualizar");
        btAlterar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btAlterarMousePressed(evt);
            }
        });
        jMenuBar1.add(btAlterar);

        btConsultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/find.png"))); // NOI18N
        btConsultar.setText("Consultar");
        jMenuBar1.add(btConsultar);

        btExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/excluir.png"))); // NOI18N
        btExcluir.setText("Excluir");
        jMenuBar1.add(btExcluir);

        btCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/cancela.png"))); // NOI18N
        btCancelar.setText("Cancelar");
        jMenuBar1.add(btCancelar);

        btSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/sair.png"))); // NOI18N
        btSair.setText("Sair");
        btSair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btSairMousePressed(evt);
            }
        });
        jMenuBar1.add(btSair);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 764, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 506, Short.MAX_VALUE)
                .addContainerGap())
        );

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-800)/2, (screenSize.height-600)/2, 800, 600);
    }// </editor-fold>//GEN-END:initComponents

    private void btSairMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btSairMousePressed
        dispose();
}//GEN-LAST:event_btSairMousePressed

    private void btAlterarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btAlterarMousePressed
       jT_consultarProdutos.setModel( utilitarios.adicionarProdutos());
    }
    //GEN-LAST:event_btAlterarMousePressed
//    public static void main(String args[]) {
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new ConsultarProdutos().setVisible(true);
//            }
//        });// Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu btAlterar;
    private javax.swing.JMenu btCancelar;
    private javax.swing.JMenu btConsultar;
    private javax.swing.JMenu btExcluir;
    private javax.swing.JMenu btNovo;
    private javax.swing.JMenu btSair;
    private javax.swing.JMenu btSalvar;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jT_consultarProdutos;
    // End of variables declaration//GEN-END:variables

}
