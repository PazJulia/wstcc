package br.unitins.julieta.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Modulo extends DefaultEntity {

    public String nome;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_modulo")
    public List<Licao> licoes;

}
