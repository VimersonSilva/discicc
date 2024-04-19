package com.disciplinascc.discicc.entities;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "tb_periodo_list")
public class PeriodoList {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nomePeriodo;

    public PeriodoList(){

    }

    public PeriodoList(Long id, String name){
        this.id = id;
        this.nomePeriodo = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNomePeriodo() {
        return nomePeriodo;
    }

    public void setNomePeriodo(String nomePeriodo) {
        this.nomePeriodo = nomePeriodo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PeriodoList that = (PeriodoList) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
