package com.application.projeto_web.Repository;

import com.application.projeto_web.Model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IProdutoRepository extends JpaRepository<Produto, Long> {
}
