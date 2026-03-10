package com.estoquebackend.demo.repository;

import com.estoquebackend.demo.entities.Material;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MateriaisRepository extends JpaRepository<Material, Integer> {
}
