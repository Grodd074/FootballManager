package com.company;


enum PosicaoNoCampo {
    GUARDA_REDES, DEFESA, MEDIO, AVANCADO, LATERAL;
}

public class Jogador
{
    private Identificacao id;
    private Atributos atributos;

    public Jogador ()
    {
        this.atributos = new Atributos();
        this.id         = new Identificacao();
    }

    public Jogador (Atributos h, Identificacao id)
    {
        this.atributos = h;
        this.id = id;
    };

    public Jogador (Jogador j)
    {
        this.setHabilidade(j.getAtributos());
        this.setId(j.getId());
    }

    public Identificacao getId () { return this.id; }
    public Atributos getAtributos () { return this.atributos; }

    public void setId (Identificacao id) { this.id = id; }
    public void setHabilidade (Atributos h) { this.atributos = h; }

    public String toString () {
        StringBuilder sb = new StringBuilder();
        sb.append(this.getId().getNome());
        sb.append(" ");
        sb.append(this.getAtributos().getHabilidade());
        return sb.toString();
    }

}
