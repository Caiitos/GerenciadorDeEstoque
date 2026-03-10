package com.estoquebackend.demo.services;

import com.estoquebackend.demo.entities.Ferramentas;
import com.estoquebackend.demo.repository.FerramentasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FerramentaService {

    @Autowired
    private FerramentasRepository repository;

    public List<Ferramentas> listar(){}
}
