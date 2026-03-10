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

    @Column(name = "data_Retirada")
    private LocalDate dataRetirada;

    @ManyToOne
    @JoinColumn(name = "ferramenta_id")
    private Ferramentas ferramentas;

    @ManyToOne
    @JoinColumn(name = "funcionario_id")
    private Funcionario funcionario;

    public Emprestimo() {

    }

    public Emprestimo(LocalDate dataDevolucao, LocalDate dataRetirada) {
        this.dataDevolucao = dataDevolucao;
        this.dataRetirada = dataRetirada;
    }

    public Integer getIdEmpestimo() {
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

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Emprestimo that = (Emprestimo) o;
        return Objects.equals(getIdEmpestimo(), that.getIdEmpestimo());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getIdEmpestimo());
    }
}
