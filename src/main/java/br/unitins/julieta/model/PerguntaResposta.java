package br.unitins.julieta.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;


@Entity
public class PerguntaResposta extends Questao {
    
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_pergunta_resposta")
    public List<Alternativa> alternativas;
}
