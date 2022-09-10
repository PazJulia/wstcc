package br.unitins.julieta.model;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

@Entity
public class Comando extends PanacheEntity {
    public int sequencia;
    public String nome;

    @ManyToOne
    @JoinColumn(name = "id_linguagem")
    public Linguagem linguagem;
}
