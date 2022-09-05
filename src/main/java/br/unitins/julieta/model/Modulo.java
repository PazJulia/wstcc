package br.unitins.julieta.model;

import javax.persistence.Entity;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

@Entity
public class Modulo extends PanacheEntity {
    public Integer id;
    public String nome;
}
