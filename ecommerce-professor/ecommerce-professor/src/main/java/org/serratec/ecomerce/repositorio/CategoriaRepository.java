package org.serratec.ecomerce.repositorio;

import org.serratec.ecomerce.dominio.Categoria;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoriaRepository extends CrudRepository<Categoria, Long> {

}
