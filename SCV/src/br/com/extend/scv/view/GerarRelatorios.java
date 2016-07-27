package br.com.extend.scv.view;

import br.com.extend.scv.util.Data;
import model.MGerarRelatorios;

public class GerarRelatorios extends javax.swing.JFrame {
	
    private javax.swing.ButtonGroup bG_relatorios;
    private javax.swing.JButton jB_anual;
    private javax.swing.JButton jB_diario;
    private javax.swing.JButton jB_entreDatas;
    private javax.swing.JButton jB_funcionario;
    private javax.swing.JButton jB_mensal;
    private javax.swing.JComboBox jCB_funcionario;
    private javax.swing.JComboBox jCB_mensal;
    private com.toedter.calendar.JDayChooser jDayChooser1;
    private javax.swing.JLabel jL_data;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField jTF_anual;
    private javax.swing.JTextField jTF_dataFinal;
    private javax.swing.JTextField jTF_dataInicial;


	MGerarRelatorios mGerarRelatorios = new MGerarRelatorios();
	Data data = new Data();

    public GerarRelatorios() {
        
    	initComponents();
        jL_data.setText(data.lerData());
        mGerarRelatorios.carregarJCBnome(jCB_funcionario);
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        bG_relatorios = new javax.swing.ButtonGroup();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jCB_funcionario = new javax.swing.JComboBox();
        jB_mensal = new javax.swing.JButton();
        jB_anual = new javax.swing.JButton();
        jB_funcionario = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jB_diario = new javax.swing.JButton();
        jL_data = new javax.swing.JLabel();
        jTF_dataInicial = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTF_dataFinal = new javax.swing.JTextField();
        jB_entreDatas = new javax.swing.JButton();
        jDayChooser1 = new com.toedter.calendar.JDayChooser();
        jCB_mensal = new javax.swing.JComboBox();
        jTF_anual = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Gerar Relatorios");


        jL_data.setText("Data atual");

        
        jLabel2.setText("Relatorio de Vendas Diario.:");
        jB_diario.setText("Gerar Relatorio");
        jB_diario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                
            	mGerarRelatorios.relDiario(jDayChooser1);
            }
        });

        
        jLabel3.setText("Relatorio de Vendas Mensal.:");
        jB_mensal.setText("Gerar Relatorio");
        jB_mensal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	
             	mGerarRelatorios.relMesal(String.valueOf(mGerarRelatorios.mesEmNumeros(jCB_mensal)));
            }
        });

        jLabel4.setText("Relatorio de Vendas Anual.:");
        jTF_anual.setToolTipText("Ex: AAAA");
        jB_anual.setText("Gerar Relatorio");
        jB_anual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	
            	mGerarRelatorios.relAnual(jTF_anual);
            }
        });

        jLabel1.setText("Relatorio de Vendas por Usuario.:");
        jB_funcionario.setText("Gerar Relatorio");
        jB_funcionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                
            	mGerarRelatorios.relFuncionario(jCB_funcionario);
            }
        });

        
        jLabel5.setText("Data Inicial.:");
        jTF_dataInicial.setToolTipText("Ex: AAAA-MM-DD");
        jLabel6.setText("Data Final.:");
        jTF_dataFinal.setToolTipText("Ex: AAAA-MM-DD");
        jB_entreDatas.setText("Gerar Relatorio");
        jB_entreDatas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	
            	mGerarRelatorios.relLivre(jTF_dataInicial, jTF_dataFinal);
            }
        });

        jCB_mensal.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "JANEIRO", "FEVEREIRO", "MARCO", "ABRIL", "MAIO", "JUNHO", "JULHO", "AGOSTO", "SETEMBRO", "OUTUBRO", "NOVEMBRO", "DEZEMBRO" }));


        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jL_data)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(53, 53, 53)
                                .addComponent(jDayChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jB_diario))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTF_dataInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel1))
                                .addGap(25, 25, 25)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jCB_funcionario, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTF_dataFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jCB_mensal, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jTF_anual, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(113, 113, 113)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jB_entreDatas)
                                        .addComponent(jB_anual)
                                        .addComponent(jB_funcionario))
                                    .addComponent(jB_mensal))))
                        .addContainerGap(245, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jL_data)
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jDayChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jB_diario))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 102, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jCB_mensal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jB_mensal))
                    .addComponent(jLabel3))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jB_anual)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(jTF_anual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jB_funcionario)
                    .addComponent(jCB_funcionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTF_dataInicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jTF_dataFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jB_entreDatas))
                .addGap(106, 106, 106))
        );

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-816)/2, (screenSize.height-638)/2, 816, 638);
    }
    
}
