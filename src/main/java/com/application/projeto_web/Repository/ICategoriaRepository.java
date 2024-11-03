package com.application.projeto_web.Repository;

import com.application.projeto_web.Model.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICategoriaRepository extends JpaRepository<Categoria, Long> {
}
