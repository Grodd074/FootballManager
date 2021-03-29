package com.company;



public class Jogador
{
    private IdentificacaoJogador id;
    private Atributos atributos;

    public Jogador ()
    {
        this.atributos  = new Atributos();
        this.id         = new IdentificacaoJogador();
    }

    public Jogador (Atributos h, IdentificacaoJogador id)
    {
        this.atributos = h;
        this.id = id;
    }

    public Jogador (Jogador j)
    {
        this.setHabilidade(j.getAtributos());
        this.setId(j.getId());
    }

    public IdentificacaoJogador getId () { return this.id; }
    public Atributos getAtributos () { return this.atributos; }

    public void setId (IdentificacaoJogador id) { this.id = id; }
    public void setHabilidade (Atributos h) { this.atributos = h; }

    public String toString () {
        StringBuilder sb = new StringBuilder();
        sb.append(this.getId());
        sb.append(";");
        sb.append(this.getAtributos());

        return sb.toString();
    }

}
