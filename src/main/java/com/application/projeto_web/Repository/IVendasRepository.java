package com.application.projeto_web.Repository;

import com.application.projeto_web.Model.Venda;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IVendasRepository extends JpaRepository<Venda, Long> {
}
