package br.unitins.julieta.model;

import javax.persistence.Entity;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

@Entity
public class Conquista extends PanacheEntity{
    
    public String nome;
    public String imagem;
    public String regra;
    public Integer quantidade;
}
