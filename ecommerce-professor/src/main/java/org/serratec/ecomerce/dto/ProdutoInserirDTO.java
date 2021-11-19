package org.serratec.ecomerce.dto;

import java.math.BigDecimal;

import org.serratec.ecomerce.dominio.Produto;

public class ProdutoInserirDTO {

	private String nome;
	private BigDecimal valorUnitario;
	private String descricao;
	
	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public BigDecimal getValorUnitario() {
		return valorUnitario;
	}

	public void setValorUnitario(BigDecimal valorUnitario) {
		this.valorUnitario = valorUnitario;
	}


	public Produto createProduto() {
		return new Produto(nome, descricao, valorUnitario, null);
	}
	
}
