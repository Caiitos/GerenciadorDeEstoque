package com.estoquebackend.demo.services;

import com.estoquebackend.demo.entities.Emprestimo;
import com.estoquebackend.demo.entities.Ferramentas;
import com.estoquebackend.demo.entities.Funcionario;
import com.estoquebackend.demo.repository.EmprestimoRepository;
import com.estoquebackend.demo.repository.FerramentasRepository;
import com.estoquebackend.demo.repository.FuncionarioRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class EmprestimoService {

    @Autowired
    private EmprestimoRepository repository;

    @Autowired
    private FerramentasRepository ferramentasRepository;

    @Autowired
    private FuncionarioRepository funcionarioRepository;

    public List<Emprestimo> findAll() {
        return repository.findAll();
    }

    @Transactional
    public void registarEmprestimoFerramenta(Integer idferramenta, Funcionario idFun, int quantidade){
        Ferramentas ferramentas = ferramentasRepository.findById(idferramenta).orElse(null);

        if (ferramentas != null && ferramentas.getQuantidade() > 0) {
            ferramentas.setQuantidade(ferramentas.getQuantidade() - quantidade);
            ferramentasRepository.save(ferramentas);

            Emprestimo e = new Emprestimo();

            e.setFerramentas(ferramentas);
            e.setFuncionario(idFun);
            e.setDataRetirada(LocalDate.now());
            repository.save(e);
        }
    }

    @Transactional
    public void registrarDevolucaoFerramenta(Integer idEmprestimo,int quantidade){
        Emprestimo e = repository.findById(idEmprestimo).orElse(null);

        if (e != null && e.getDataRetirada() == null) {
            Ferramentas f = e.getFerramentas();

            f.setQuantidade(f.getQuantidade() + quantidade);
            ferramentasRepository.save(f);

            e.setDataDevolucao(LocalDate.now());
            repository.save(e);
        }
    }

    public Emprestimo salvarEmprestimo(Emprestimo e) {
        return repository.save(e);
    }

    public void deletarEmprestimo(Integer id) {
        repository.deleteById(id);
    }


}
