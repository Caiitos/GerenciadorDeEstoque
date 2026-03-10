package com.estoquebackend.demo.entities;

import jakarta.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "Funcionario")
public class Funcionario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idFuncionario;

    @Column(length = 45, nullable = false)
    private String nome;

    @Column(length = 50, nullable = false)
    private String cpf;

    public Funcionario() {

    }

    public Funcionario(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public int getIdFuncionario() {
        return idFuncionario;
    }

    public void setIdFuncionario(Integer idFuncionario) {
        this.idFuncionario = idFuncionario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Funcionario that = (Funcionario) o;
        return getIdFuncionario() == that.getIdFuncionario();
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getIdFuncionario());
    }
}
