package com.estoquebackend.demo.repository;

import com.estoquebackend.demo.entities.Funcionario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FuncionarioRepository extends JpaRepository<Funcionario, Integer> {

}
