package br.unitins.julieta.model;

import java.util.Date;

import javax.persistence.Entity;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

@Entity
public class Matricula extends PanacheEntity{
    
    public Date data;
    public Integer assiduidade;
    public Integer assiduidadeSemanal;
    public Integer assiduidadeMensal;
    public Integer totalPontuacao;
}
