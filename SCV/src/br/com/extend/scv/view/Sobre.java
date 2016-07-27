package br.com.extend.scv.view;

import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.GroupLayout;
import javax.swing.ImageIcon;

public class Sobre extends javax.swing.JFrame {
	
    private javax.swing.JLabel jLabel_imagem;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;


    public Sobre() {
    	
        initComponents();
        getContentPane().add(jLabel_imagem);       
    }
    @SuppressWarnings("unchecked")
    private void initComponents() {

        jLabel_imagem = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Sobre");

        jLabel_imagem.setIcon(new ImageIcon(Sobre.class.getResource("/icones/X10D_2.jpg")));

        jLabel1.setText("Sistema de Controle de Vendas");

        jLabel2.setText("Versao: 1.0");

        jLabel3.setText("EXTEND DESENVOLVIMENTO DE SISTEMAS");

        jLabel4.setText("Todos os direitos reservados");

        jLabel5.setText("Contato:");

        jLabel6.setText("fernandopereira08@gmail.com");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addContainerGap()
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addComponent(jLabel_imagem)
        				.addComponent(jLabel1)
        				.addComponent(jLabel2)
        				.addComponent(jLabel3)
        				.addComponent(jLabel4)
        				.addGroup(layout.createSequentialGroup()
        					.addComponent(jLabel5)
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addComponent(jLabel6)))
        			.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addContainerGap()
        			.addComponent(jLabel_imagem)
        			.addGap(18)
        			.addComponent(jLabel1)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addComponent(jLabel2)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addComponent(jLabel3)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addComponent(jLabel4)
        			.addPreferredGap(ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabel5)
        				.addComponent(jLabel6))
        			.addContainerGap())
        );
        getContentPane().setLayout(layout);

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-315)/2, (screenSize.height-369)/2, 315, 369);
    }
        
}
