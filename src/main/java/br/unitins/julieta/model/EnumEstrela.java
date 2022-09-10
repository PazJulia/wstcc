package br.unitins.julieta.model;

public enum EnumEstrela {
    
    UMA(1),
    DUAS(2),
    TRES(3);

    private int quantidade;

    EnumEstrela(int quantidade) {
        this.quantidade = quantidade;
    }
}
