package com.application.projeto_web.Repository;

import com.application.projeto_web.Model.Clientes;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IClientesRepository extends JpaRepository<Clientes, Long> {
}
