package com.estoquebackend.demo.services;

import com.estoquebackend.demo.entities.Ferramentas;
import com.estoquebackend.demo.repository.FerramentasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FerramentaService {

    @Autowired
    private FerramentasRepository repository;

    public List<Ferramentas> findAll(){
        return repository.findAll();
    }

    public Ferramentas buscarPorId(Integer id){
        return repository.findById(id).orElse(null);
    }

    public Ferramentas salvarFerramenta(Ferramentas f){
        return repository.save(f);
    }

    public void retirarFerramenta(Integer id){
        Ferramentas f = repository.findById(id).orElse(null);

        if (f != null && f.getQuantidade() > 0){
            f.setQuantidade(f.getQuantidade() - 1);
            repository.save(f);
        }
    }

    public void atualizarFerramenta(Integer id, Ferramentas f){
        Ferramentas ferramentaExistente = repository.findById(id).orElse(null);

        if (ferramentaExistente != null) {
            ferramentaExistente.setNomeFerramenta(f.getNomeFerramenta());
            ferramentaExistente.setQuantidade(f.getQuantidade());
            ferramentaExistente.setDescricaoFerramenta(f.getDescricaoFerramenta());
            ferramentaExistente.setEstado(f.getEstado());
            repository.save(ferramentaExistente);

        }

    }

    public void deletarFerramenta(Integer id){
        repository.deleteById(id);
    }

}
