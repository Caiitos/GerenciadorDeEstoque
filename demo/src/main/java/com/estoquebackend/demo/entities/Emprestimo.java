package com.estoquebackend.demo.entities;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.Objects;

@Entity
@Table(name = "emprestimo")
public class Emprestimo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idEmprestimo;

    @Column(name = "data_devolucao")
    private LocalDate dataDevolucao;

    @Column(name = "data_retirada")
    private LocalDate dataRetirada;

    @Column(name = "quantidade")
    private Integer quantidade;

    @ManyToOne
    @JoinColumn(name = "fk_ferramenta")
    private Ferramentas ferramentas;

    @ManyToOne
    @JoinColumn(name = "fk_funcionario")
    private Funcionario funcionario;

    public Emprestimo() {

    }

    public Emprestimo(LocalDate dataDevolucao, LocalDate dataRetirada, Funcionario funcionario, Ferramentas ferramentas, Integer quantidade) {
        this.dataDevolucao = dataDevolucao;
        this.dataRetirada = dataRetirada;
        this.ferramentas = ferramentas;
        this.funcionario = funcionario;
        this.quantidade = quantidade;
    }

    public Integer getIdEmprestimo() {
        return idEmprestimo;
    }

    public void setIdEmprestimo(Integer idEmprestimo) {
        this.idEmprestimo = idEmprestimo;
    }

    public LocalDate getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(LocalDate dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    public LocalDate getDataRetirada() {
        return dataRetirada;
    }

    public void setDataRetirada(LocalDate dataRetirada) {
        this.dataRetirada = dataRetirada;
    }

    public Ferramentas getFerramentas() {
        return ferramentas;
    }

    public void setFerramentas(Ferramentas ferramentas) {
        this.ferramentas = ferramentas;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Emprestimo that = (Emprestimo) o;
        return Objects.equals(getIdEmprestimo(), that.getIdEmprestimo());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getIdEmprestimo());
    }
}
