package br.com.extend.scv.modelo;

public class Produto {

    private String codProduto;
    private int codCategoria;
    private String modelo;
    private String tipo;
    private String fabricante;
    private int qtdProduto;
    private String capacidade;
    private double precoCusto;
    private double precoVenda;
    private String imagem;
    
    
    
	
	public double getPrecoCusto() {
		return precoCusto;
	}
	public void setPrecoCusto(double precoCusto) {
		this.precoCusto = precoCusto;
	}
	public double getPrecoVenda() {
		return precoVenda;
	}
	public void setPrecoVenda(double precoVenda) {
		this.precoVenda = precoVenda;
	}
	public String getCodProduto() {
		return codProduto;
	}
	public void setCodProduto(String codProduto) {
		this.codProduto = codProduto;
	}
	public int getCodCategoria() {
		return codCategoria;
	}
	public void setCodCategoria(int codCategoria) {
		this.codCategoria = codCategoria;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getFabricante() {
		return fabricante;
	}
	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}
	public int getQtdProduto() {
		return qtdProduto;
	}
	public void setQtdProduto(int qtdProduto) {
		this.qtdProduto = qtdProduto;
	}
	public String getCapacidade() {
		return capacidade;
	}
	public void setCapacidade(String capacidade) {
		this.capacidade = capacidade;
	}
	
	public String getImagem() {
		return imagem;
	}
	public void setImagem(String imagem) {
		this.imagem = imagem;
	}

    
}
