package org.serratec.ecomerce.dto;

import org.serratec.ecomerce.dominio.FotoProduto;
import org.serratec.ecomerce.dominio.Produto;

public class FotoDTO {
	private String nome;
	private String url;
	
	public FotoDTO(FotoProduto foto, Produto produto) {
		this.nome = foto.getNome();
		this.url = ProdutoDTO.generateUrlFoto(produto);	 
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}	
}
