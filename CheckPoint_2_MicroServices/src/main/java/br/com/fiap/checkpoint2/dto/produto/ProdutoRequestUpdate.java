package br.com.fiap.checkpoint2.dto.produto;

import java.time.LocalDate;

public class ProdutoRequestUpdate {

	private Long codigo_produto;	
	private String nome;
	private double preco;
	private LocalDate data_validade;
	private LocalDate data_garantia;
	private boolean em_estoque;
	
	public Long getCodigo_produto() {
		return codigo_produto;
	}
	public void setCodigo_produto(Long codigo_produto) {
		this.codigo_produto = codigo_produto;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public LocalDate getData_validade() {
		return data_validade;
	}
	public void setData_validade(LocalDate data_validade) {
		this.data_validade = data_validade;
	}
	public LocalDate getData_garantia() {
		return data_garantia;
	}
	public void setData_garantia(LocalDate data_garantia) {
		this.data_garantia = data_garantia;
	}
	public boolean isEm_estoque() {
		return em_estoque;
	}
	public void setEm_estoque(boolean em_estoque) {
		this.em_estoque = em_estoque;
	}
	
	
	
}
