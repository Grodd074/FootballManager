package com.company;

public class AtributosJogador extends Atributos
{
    protected float velocidade;
    protected float resistencia;
    protected float destreza;
    protected float impulsao;
    protected float jodoDeCabeca;
    protected float remate;
    protected float capacidadeDePasse;

    public AtributosJogador ()
    {
        this(0, 0, 0, 0, 0, 0, 0);
    }

    public AtributosJogador(float v, float res, float d, float i, float jdc, float r, float cdp)
    {
        this.velocidade = v;
        this.resistencia = res;
        this.destreza = d;
        this.impulsao = i;
        this.jodoDeCabeca = jdc;
        this.remate = r;
        this.capacidadeDePasse = cdp;
    }

    public AtributosJogador(AtributosJogador h)
    {
        this.velocidade = h.getVelocidade();
        this.resistencia = h.getResistencia();
        this.destreza = h.getDestreza();
        this.impulsao = h.getImpulsao();
        this.jodoDeCabeca = h.getJodoDeCabeca();
        this.remate = h.getRemate();
        this.capacidadeDePasse = h.getCapacidaDePasse();
    }

    /*public float getHabilidade () {
        return 0.15f * getVelocidade() + 0.10f * getResistencia() + 0.12f * getDestreza() +
                0.13f * getImpulsao() + 0.20f * getJodoDeCabeca() + 0.12f * getRemate() + 0.18f * getCapacidaDePasse();
    }*/
    public float getVelocidade ()       { return this.velocidade; }
    public float getResistencia ()      { return this.resistencia; }
    public float getDestreza ()         { return this.destreza; }
    public float getImpulsao ()         { return this.impulsao; }
    public float getJodoDeCabeca ()     { return this.jodoDeCabeca; }
    public float getRemate ()           { return this.remate; }
    public float getCapacidaDePasse () { return this.capacidadeDePasse; }

    public void setVelocidade (float v)         { this.velocidade = v; }
    public void setResistencia (float res)      { this.resistencia = res; }
    public void setDestreza (float d)           { this.destreza = d; }
    public void setImpulsao (float i)           { this.impulsao = i; }
    public void setJodoDeCabeca (float jdc)     { this.jodoDeCabeca = jdc; }
    public void setRemate (float r)             { this.remate = r; }
    public void setCapacidaDePasse (float cdp) { this.capacidadeDePasse = cdp; }

    public boolean equals(Object o) {
        if (this == o)
            return true;
        if ((o == null) || (this.getClass() != o.getClass()))
            return false;
        AtributosJogador h = (AtributosJogador) o;
        return (this.velocidade == (h.getVelocidade())      &&
                this.resistencia == (h.getResistencia())    &&
                this.destreza == (h.getDestreza())          &&
                this.impulsao == (h.getImpulsao())          &&
                this.jodoDeCabeca == (h.getJodoDeCabeca())  &&
                this.remate == (h.getRemate())              &&
                this.capacidadeDePasse == (h.getCapacidaDePasse()));
    }
    public String toString () {
        StringBuilder sb = new StringBuilder();
        sb.append(this.getHabilidade());
        sb.append(";");
        sb.append(this.getVelocidade());
        sb.append(";");
        sb.append(this.getResistencia());
        sb.append(";");
        sb.append(this.getDestreza());
        sb.append(";");
        sb.append(this.getImpulsao());
        sb.append(";");
        sb.append(this.getJodoDeCabeca());
        sb.append(";");
        sb.append(this.getRemate());
        sb.append(";");
        sb.append(this.getCapacidaDePasse());
        return sb.toString();
    }

    public Atributos clone () { return new AtributosJogador(this); }
}
