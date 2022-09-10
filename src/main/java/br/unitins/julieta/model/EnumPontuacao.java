package br.unitins.julieta.model;

public enum EnumPontuacao {

    UM_XP("01_XP", 1),
    DOIS_XP("02_XP", 5),
    TRES_XP("03_XP", 10);

    private String descricao;
    private int valor;

    EnumPontuacao(String descricao, int valor) {
        this.descricao = descricao;
        this.valor = valor;
    }
    
}