package br.unitins.julieta.model;

public enum TipoConquista {
    
    ASSIDUIDADE(1),
    MODULO(2),
    XP(3);

    private int valor;

    TipoConquista(int valor) {
        this.valor = valor;
    }
}
