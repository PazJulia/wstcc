package br.unitins.julieta.model;

import javax.persistence.Entity;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

@Entity
public class Sequencia extends PanacheEntity {
    public int numero;
}