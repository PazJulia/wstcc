package br.unitins.julieta.model;

import javax.persistence.Entity;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

@Entity
public class Questao extends PanacheEntity {
    
    public String textoInicial;
    public String pergunta;
    public String imagemPergunta;
    public String imagemResultado;
}
