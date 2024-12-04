package com.generation.gamefica.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import com.generation.gamefica.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
	
	@Query("SELECT p FROM Produto p WHERE LOWER(p.categoria.categoria) LIKE LOWER(CONCAT('%', :nomeCategoria, '%'))")
	List<Produto> buscarProdutosPorNomeCategoria(@Param("nomeCategoria") String nomeCategoria);


}
