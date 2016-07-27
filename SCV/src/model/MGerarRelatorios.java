package model;

import com.toedter.calendar.JDayChooser;

import br.com.extend.scv.conexao.FabricaDeConexao;
import br.com.extend.scv.dao.LoginDAO;
import br.com.extend.scv.modelo.Login;

import java.util.HashMap;
import java.io.InputStream;
import java.net.URL;
import java.sql.Connection;
import java.util.Calendar;
import java.util.Map;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;

public class MGerarRelatorios {

	private Connection connection;

	public MGerarRelatorios() {
		this.connection = new FabricaDeConexao().pegaConexao();
	}

	LoginDAO loginDAO = new LoginDAO();
	
	
	private String diretorioRelatorioDATA ="C:/scv/relatorios/VendasPorData.jasper";

	Calendar calendar = Calendar.getInstance();
	String dia = "" + calendar.get(Calendar.DATE);
	int mes = calendar.get(Calendar.MONTH);
	String ano = "" + calendar.get(Calendar.YEAR);
	String mesCerto = "" + (mes + 1);

	public void carregarJCBnome(JComboBox nome) {

		for (Login login : loginDAO.devolveListaComUsuarios()) {

			nome.addItem(login.getUsuario());
		}
	}

	public void relDiario(JDayChooser jDayChooser) {

		String diaFormatado = ano + "-" + mesCerto + "-" + jDayChooser.getDay();
		
		Map parametros = new HashMap();			
			parametros.put("dataInicio", diaFormatado);
			parametros.put("dataFim", diaFormatado);

		
		try {
			JasperPrint jasperPrint = JasperFillManager.fillReport(diretorioRelatorioDATA, parametros, connection );
			JasperViewer jasperViewer = new JasperViewer(jasperPrint, false);
						 jasperViewer.setVisible(true);			
		} 
		catch (JRException ex) {
			JOptionPane.showMessageDialog(null, ex);
		}
	}

	public void relMesal(String mm) {
		
		int maxDia = 0;
		
		if (mm.equals("2")) {
			maxDia = 28;
		} 
		else if (mm.equals("4")) {
			maxDia = 30;
		} 
		else if (mm.equals("6")) {
			maxDia = 30;
		} 
		else if (mm.equals("9")) {
			maxDia = 30;
		} 
		else if (mm.equals("11")) {
			maxDia = 30;
		} 
		else {
			maxDia = 31;
		}
		
		String primeiroDiaDoMes = ano + "-" + mm + "-" + 01;
		String ultimoDiaDoMes =  ano + "-" + mm + "-" + maxDia;
				
		Map parametros = new HashMap();
			parametros.put("dataInicio", primeiroDiaDoMes);
			parametros.put("dataFim", ultimoDiaDoMes);
		
		try {
			JasperPrint jasperPrint = JasperFillManager.fillReport(diretorioRelatorioDATA, parametros, connection );
			JasperViewer jasperViewer = new JasperViewer(jasperPrint, false);
						 jasperViewer.setVisible(true);			
		} 
		catch (JRException ex) {
			JOptionPane.showMessageDialog(null, ex);
		}		
	}

	public void relAnual(JTextField an) {
		
		String primeiroDiaDoAno = an.getText() + "-" + 01 + "-" + 01;
		String ultimoDiaDoAno = an.getText() + "-" + 12 + "-" + 31;
				
		Map parametros = new HashMap();
			parametros.put("dataInicio", primeiroDiaDoAno);
			parametros.put("dataFim", ultimoDiaDoAno);
		
		try {
			JasperPrint jasperPrint = JasperFillManager.fillReport(diretorioRelatorioDATA, parametros, connection );
			JasperViewer jasperViewer = new JasperViewer(jasperPrint, false);
						 jasperViewer.setVisible(true);			
		} 
		catch (JRException ex) {
			JOptionPane.showMessageDialog(null, ex);
		}		
	}
	

	public void relFuncionario(JComboBox nome) {
		
		Map parametros = new HashMap();
			parametros.put("usuario", nome.getSelectedItem());
		
		try {
			JasperPrint jasperPrint = JasperFillManager.fillReport("C:/scv/relatorios/VendasUsuario.jasper", parametros, connection );
			JasperViewer jasperViewer = new JasperViewer(jasperPrint, false);
						 jasperViewer.setVisible(true);			
		} 
		catch (JRException ex) {
			JOptionPane.showMessageDialog(null, ex);
		}
	}

	public void relLivre(JTextField dataInicial, JTextField dataFinal) {

		Map parametros = new HashMap();
			parametros.put("dataInicio", dataInicial.getText());
			parametros.put("dataFim", dataFinal.getText());
		
		try {
			JasperPrint jasperPrint = JasperFillManager.fillReport(diretorioRelatorioDATA, parametros, connection );
			JasperViewer jasperViewer = new JasperViewer(jasperPrint, false);
						 jasperViewer.setVisible(true);			
		} 
		catch (JRException ex) {
			JOptionPane.showMessageDialog(null, ex);
		}		
	}

	public int mesEmNumeros(JComboBox mensal) {

		int m = 0;
		
		if (mensal.getSelectedItem().equals("JANEIRO")) {
			m = 1;
		} 
		else if (mensal.getSelectedItem().equals("FEVEREIRO")) {
			m = 2;
		} 
		else if (mensal.getSelectedItem().equals("MARCO")) {
			m = 3;
		} 
		else if (mensal.getSelectedItem().equals("ABRIL")) {
			m = 4;
		} 
		else if (mensal.getSelectedItem().equals("MAIO")) {
			m = 5;
		} 
		else if (mensal.getSelectedItem().equals("JUNHO")) {
			m = 6;
		} 
		else if (mensal.getSelectedItem().equals("JULHO")) {
			m = 7;
		} 
		else if (mensal.getSelectedItem().equals("AGOSTO")) {
			m = 8;
		} 
		else if (mensal.getSelectedItem().equals("SETEMBRO")) {
			m = 9;
		} 
		else if (mensal.getSelectedItem().equals("OUTUBRO")) {
			m = 10;
		} 
		else if (mensal.getSelectedItem().equals("NOVEMBRO")) {
			m = 11;
		} 
		else {
			m = 12;
		}
		return m;
	}
}