package br.unitins.julieta.model;

import javax.persistence.Entity;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

@Entity
public class Comando extends PanacheEntity {
    public int sequencia;
    public String nome;
}
