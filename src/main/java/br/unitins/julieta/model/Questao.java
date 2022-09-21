package br.unitins.julieta.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Questao extends DefaultEntity {
    
    @Column(name = "texto_inicial")
    public String textoInicial;
    public String pergunta;

    @Column(name = "imagem_pergunta")
    public String imagemPergunta;
   
    @Column(name = "imagem_resultado")
    public String imagemResultado;

    @ManyToOne
    @JoinColumn(name = "id_linguagem")
    public Linguagem linguagem;
}
