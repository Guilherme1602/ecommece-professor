package org.serratec.ecomerce.servico;

import java.io.IOException;
import java.util.Optional;

import org.serratec.ecomerce.dominio.FotoProduto;
import org.serratec.ecomerce.dominio.Produto;
import org.serratec.ecomerce.repositorio.FotoRepository;
import org.serratec.ecomerce.repositorio.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public class FotoService {

	@Autowired
	private FotoRepository fotoRepository;
	
    @Autowired
	private ProdutoRepository produtoRepository;

	public FotoProduto inserir(Produto produto, MultipartFile file) throws IOException {
		FotoProduto foto = new FotoProduto();
		foto.setNome(file.getName());
		foto.setDados(file.getBytes());
		foto.setTipo(file.getContentType());
		foto.setProduto(produto);
		return fotoRepository.save(foto);
	}
	
	public FotoProduto buscar(Long id) {				
		Optional<Produto> produto = produtoRepository.findById(id);
				
		if(produto.isPresent()) {
			FotoProduto foto = produto.get().getFoto();
			return foto;			
		}		
		return null;
		
//		Optional<Foto> foto = fotoRepository.findById(id);
//		if(!foto.isPresent()) {
//			return null;
//		}
//		return foto.get();
	}

}
