package io.github.rafaatrevisan.clientes.model.repository;

import io.github.rafaatrevisan.clientes.model.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {
}
