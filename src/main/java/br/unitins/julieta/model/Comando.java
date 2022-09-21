package br.unitins.julieta.model;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Comando extends DefaultEntity {
    public int sequencia;
    public String nome;

    @ManyToOne
    @JoinColumn(name = "id_linguagem")
    public Linguagem linguagem;
}
