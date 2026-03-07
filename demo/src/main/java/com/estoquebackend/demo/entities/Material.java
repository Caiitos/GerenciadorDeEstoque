package com.estoquebackend.demo.entities;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.Objects;

@Entity
@Table(name = "Materiais")
public class Material {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idMaterial;

    @Column(length = 45, nullable = false)
    private String nomeMaterial;

    @Column(length = 45)
    private String descricaoMaterial;

    @Column
    private Integer quantidadeMaterial;

    private LocalDate dataRetirada;
    private LocalDate dataDevolucao;

    public Material() {
    }

    public Material(String nomeMaterial, String descricaoMaterial, Integer quantidadeMaterial, LocalDate dataRetirada, LocalDate dataDevolucao) {
        this.nomeMaterial = nomeMaterial;
        this.descricaoMaterial = descricaoMaterial;
        this.quantidadeMaterial = quantidadeMaterial;
        this.dataRetirada = dataRetirada;
        this.dataDevolucao = dataDevolucao;
    }


    public Integer getIdMaterial() {
        return idMaterial;
    }

    public void setIdMaterial(Integer idMaterial) {
        this.idMaterial = idMaterial;
    }

    public String getNomeMaterial() {
        return nomeMaterial;
    }

    public void setNomeMaterial(String nomeMaterial) {
        this.nomeMaterial = nomeMaterial;
    }

    public String getDescricaoMaterial() {
        return descricaoMaterial;
    }

    public void setDescricaoMaterial(String descricaoMaterial) {
        this.descricaoMaterial = descricaoMaterial;
    }

    public Integer getQuantidadeMaterial() {
        return quantidadeMaterial;
    }

    public void setQuantidadeMaterial(Integer quantidadeMaterial) {
        this.quantidadeMaterial = quantidadeMaterial;
    }

    public LocalDate getDataRetirada() {
        return dataRetirada;
    }

    public void setDataRetirada(LocalDate dataRetirada) {
        this.dataRetirada = dataRetirada;
    }

    public LocalDate getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(LocalDate dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Material material = (Material) o;
        return Objects.equals(getIdMaterial(), material.getIdMaterial());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getIdMaterial());
    }
}