package org.serratec.ecomerce.repositorio;

import org.serratec.ecomerce.dominio.FotoProduto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FotoRepository extends JpaRepository<FotoProduto, Long>{	

}
