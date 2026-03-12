package com.estoquebackend.demo.services;

import com.estoquebackend.demo.entities.Funcionario;
import com.estoquebackend.demo.entities.Material;
import com.estoquebackend.demo.repository.FuncionarioRepository;
import com.estoquebackend.demo.repository.MateriaisRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class MaterialServices {

    @Autowired
    private MateriaisRepository repository;

    @Autowired
    private FuncionarioRepository funcionarioRepository;

    public List<Material> findAll(){
        return repository.findAll();
    }

    public Material buscarPorId(Integer id){
        return repository.findById(id).orElse(null);
    }

    public Material salvarMaterial(Material m){
        return repository.save(m);
    }

    public void atualizarMaterial(Material m, Integer id){
        Material materialExistente = repository.findById(id).orElse(null);

        if (materialExistente != null){
            materialExistente.setNomeMaterial(m.getNomeMaterial());
            materialExistente.setQuantidadeMaterial(m.getQuantidadeMaterial());
            materialExistente.setDescricaoMaterial(m.getDescricaoMaterial());
            materialExistente.setSetor(m.getSetor());
            repository.save(materialExistente);
        }
    }

    public void retirarMaterial(Integer id,int quantidade,Integer idFuncionario){
        Material m = repository.findById(id).orElse(null);
        Funcionario f = funcionarioRepository.findById(idFuncionario).orElse(null);

        if (m != null && m.getQuantidadeMaterial() > 0){
            m.setSetor(m.getSetor());
            m.setQuantidadeMaterial(m.getQuantidadeMaterial() - quantidade);
            m.setFuncionario(f);
            m.setDataRetiradaMaterial(LocalDateTime.now());
            repository.save(m);
        }
    }

    public void deletarMaterial(Integer id){
         repository.deleteById(id);
    }

}
