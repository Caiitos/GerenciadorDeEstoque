package com.estoquebackend.demo.entities;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "Setor")
public class Setor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idSetor;

    @Column(length = 50, nullable = false)
    private String nomeSetor;


    public Setor() {
    }

    public Setor(String nomeSetor) {
        this.nomeSetor = nomeSetor;
    }

    public Integer getIdSetor() {
        return idSetor;
    }

    public void setIdSetor(Integer idSetor) {
        this.idSetor = idSetor;
    }

    public String getNomeSetor() {
        return nomeSetor;
    }

    public void setNomeSetor(String nomeSetor) {
        this.nomeSetor = nomeSetor;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Setor setor = (Setor) o;
        return Objects.equals(idSetor, setor.idSetor);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(idSetor);
    }
}
