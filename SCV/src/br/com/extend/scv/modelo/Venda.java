package br.com.extend.scv.modelo;

public class Venda {

	private int codVenda;
	private String dataVenda;
	private String horaVenda;
	private String usuario;
	private double total;
	
	
	
	
	
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	public int getCodVenda() {
		return codVenda;
	}
	public void setCodVenda(int codVenda) {
		this.codVenda = codVenda;
	}
	public String getDataVenda() {
		return dataVenda;
	}
	public void setDataVenda(String dataVenda) {
		this.dataVenda = dataVenda;
	}
	public String getHoraVenda() {
		return horaVenda;
	}
	public void setHoraVenda(String horaVenda) {
		this.horaVenda = horaVenda;
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	
}
