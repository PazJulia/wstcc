package br.unitins.julieta.model;

import javax.persistence.Entity;

@Entity
public class Alternativa extends DefaultEntity{
    public boolean verdadeira;
    public String descricao;
    public String explicacao; 
}
