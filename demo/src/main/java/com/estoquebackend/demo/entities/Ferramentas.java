package com.estoquebackend.demo.entities;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.Objects;

@Entity
@Table(name = "Ferramentas")
public class Ferramentas {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idFerramenta;

    @Column(length = 45,  nullable = false,name = "nome_ferramenta")
    private String nomeFerramenta;

    @Column(length = 225,name = "descricao_ferramenta")
    private String descricaoFerramenta;

    @Column(name = "quantidade_ferramentas")
    private Integer quantidade;

    @Column(length = 45,name = "estado_ferramenta")
    private String estado;

    public Ferramentas() {
    }

    public Ferramentas(String nomeFerramenta, String descricaoFerramenta, Integer quantidade, String estado) {
        this.nomeFerramenta = nomeFerramenta;
        this.descricaoFerramenta = descricaoFerramenta;
        this.quantidade = quantidade;
        this.estado = estado;
    }

    public int getIdFerramenta() {
        return idFerramenta;
    }

    public void setIdFerramenta(int idFerramenta) {
        this.idFerramenta = idFerramenta;
    }

    public String getNomeFerramenta() {
        return nomeFerramenta;
    }

    public void setNomeFerramenta(String nomeFerramenta) {
        this.nomeFerramenta = nomeFerramenta;
    }

    public String getDescricaoFerramenta() {
        return descricaoFerramenta;
    }

    public void setDescricaoFerramenta(String descricaoFerramenta) {
        this.descricaoFerramenta = descricaoFerramenta;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Ferramentas that = (Ferramentas) o;
        return getIdFerramenta() == that.getIdFerramenta();
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getIdFerramenta());
    }
}
