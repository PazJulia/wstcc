package br.unitins.julieta.model;

public enum EnumRanking {
    
    NENHUM(1),
    BRONZE(2),
    PRATA(3),
    OURO(4),
    DIAMANTE(5);

    private int ranking;

    EnumRanking(int ranking) {
        this.ranking = ranking;
    }
}
