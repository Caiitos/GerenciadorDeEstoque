package com.estoquebackend.demo.controllers;

import com.estoquebackend.demo.entities.Ferramentas;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping
@RestController("/ferramentas")
public class FerramentaController {

    @Autowired
    private FerramentasService ferramentas;


}
