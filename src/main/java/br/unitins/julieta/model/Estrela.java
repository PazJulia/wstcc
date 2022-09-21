package br.unitins.julieta.model;

public enum Estrela {
    
    UMA(1),
    DUAS(2),
    TRES(3);

    private int quantidade;

    Estrela(int quantidade) {
        this.quantidade = quantidade;
    }
}
