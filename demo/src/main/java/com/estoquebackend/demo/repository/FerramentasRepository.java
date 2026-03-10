package com.estoquebackend.demo.repository;

import com.estoquebackend.demo.entities.Ferramentas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FerramentasRepository extends JpaRepository<Ferramentas, Integer> {

}
