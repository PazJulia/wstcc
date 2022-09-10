package br.unitins.julieta.model;

public enum EnumNivel {
    
    BASICO(1),
    INTERMEDIARIO(2),
    AVANCADO(3);

    private int valor;

    EnumNivel(int valor) {
        this.valor = valor;
    }
}
