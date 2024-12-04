package com.generation.gamefica.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.generation.gamefica.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {

}
