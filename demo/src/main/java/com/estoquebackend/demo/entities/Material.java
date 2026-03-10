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

    @ManyToOne
    @JoinColumn(name = "setor_id")
    private Setor setor;

    @ManyToOne
    @JoinColumn(name = "funcionario_id")
    private Funcionario funcionario;


    public Material() {
    }

    public Material(String nomeMaterial, String descricaoMaterial, Integer quantidadeMaterial) {
        this.nomeMaterial = nomeMaterial;
        this.descricaoMaterial = descricaoMaterial;
        this.quantidadeMaterial = quantidadeMaterial;
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