package br.unitins.julieta.model;

public enum Nivel {
    
    BASICO(1),
    INTERMEDIARIO(2),
    AVANCADO(3);

    private int valor;

    Nivel(int valor) {
        this.valor = valor;
    }
}
