package com.company;

public class IdentificacaoJogador extends Identificacao
{
    private PosicaoNoCampo posicao;

    public IdentificacaoJogador(PosicaoNoCampo posicao) {
        this.posicao = posicao;
    }

    public IdentificacaoJogador(String n, int i, PosicaoNoCampo posicao) {
        super(n, i);
        this.posicao = posicao;
    }

    public IdentificacaoJogador(Identificacao id, PosicaoNoCampo posicao) {
        super(id);
        this.posicao = posicao;
    }

    public void setPosicao (PosicaoNoCampo posicao) { this.posicao = posicao; }
    public PosicaoNoCampo getPosicao ()             { return this.posicao; }

    @Override
    public String toString() {
        return "IdentificacaoJogador { " +
                "nome= '" + getNome() + "' " +
                "idade= '" + getIdade() + "' " +
                "posicao= '" + getPosicao() + "' }";
    }
}
