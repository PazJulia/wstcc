package br.unitins.julieta.model;

import javax.persistence.Entity;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

@Entity
public class Alternativa extends PanacheEntity{
    public boolean verdadeira;
    public String descricao;
    public String explicacao; 
}
