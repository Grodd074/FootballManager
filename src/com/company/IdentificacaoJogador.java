package com.company;

enum PosicaoNoCampo {
    SEM_POSICAO, GUARDA_REDES, DEFESA, MEDIO, AVANCADO, LATERAL
}

public class IdentificacaoJogador extends Identificacao
{
    private PosicaoNoCampo posicao;
    private Pais pais;

    public IdentificacaoJogador() {
        this.posicao = PosicaoNoCampo.SEM_POSICAO;
        this.pais = Pais.SEM_PAIS;
    }

    public IdentificacaoJogador(String nome, int idade, PosicaoNoCampo posicao, Pais pais) {
        super(nome, idade);
        this.posicao = posicao;
        this.pais = pais;
    }

    public IdentificacaoJogador(Identificacao id, PosicaoNoCampo posicao, Pais pais) {
        super(id);
        this.posicao = posicao;
        this.pais = pais;
    }

    public void setPosicao (PosicaoNoCampo posicao) { this.posicao = posicao; }
    public void setPais (Pais pais) { this.pais = pais; }

    public PosicaoNoCampo getPosicao () { return this.posicao; }
    public Pais getPais()               { return this.pais; }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(super.toString());
        sb.append(";");
        sb.append(this.getPosicao());
        sb.append(";");
        sb.append(this.getPais());

        return sb.toString();
    }
}
