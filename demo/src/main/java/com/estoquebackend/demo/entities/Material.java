package com.estoquebackend.demo.entities;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.Objects;

@Entity
@Table(name = "Materiais")
public class Material {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idMaterial;

    @Column(length = 45, nullable = false)
    private String nomeMaterial;

    @Column(length = 45, name = "descricao_material")
    private String descricaoMaterial;

    @Column(name = "quantidade_materiais", nullable = false)
    private Integer quantidadeMaterial;

    @ManyToOne
    @JoinColumn(name = "fk_setor")
    private Setor setor;

    @ManyToOne
    @JoinColumn(name = "fk_funcionario")
    private Funcionario funcionario;

    @Column(length = 45, nullable = false, name = "data_reitrada_de_material")
    private LocalDateTime dataRetiradaMaterial;


    public Material() {
    }

    public Material(String nomeMaterial, String descricaoMaterial, Integer quantidadeMaterial,
                    Setor setor, Funcionario funcionario, LocalDateTime dataRetiradaMaterial) {

        this.nomeMaterial = nomeMaterial;
        this.descricaoMaterial = descricaoMaterial;
        this.quantidadeMaterial = quantidadeMaterial;
        this.setor = setor;
        this.funcionario = funcionario;
        this.dataRetiradaMaterial = dataRetiradaMaterial;
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

    public Setor getSetor() {
        return setor;
    }

    public void setSetor(Setor setor) {
        this.setor = setor;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public LocalDateTime getDataRetiradaMaterial() {
        return dataRetiradaMaterial;
    }

    public void setDataRetiradaMaterial(LocalDateTime dataRetiradaMaterial) {
        this.dataRetiradaMaterial = dataRetiradaMaterial;
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