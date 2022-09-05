package br.unitins.julieta.model;

import javax.persistence.Entity;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

@Entity
public class Usuario extends PanacheEntity {
    public String nome;
    public String email;
    public String senha;
}
