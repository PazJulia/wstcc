package br.unitins.julieta.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Licao extends DefaultEntity{

    public Date data;
    public String explicacao;

    @ManyToMany
    @JoinTable(name = "Licao_Questao", joinColumns = @JoinColumn(name = "id_licao"), inverseJoinColumns = @JoinColumn(name = "id_questao"))
    public List<Questao> questoes;
}
