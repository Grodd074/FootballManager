package com.company;

public class AtributosRedes extends AtributosJogador
{
    private float flexibilidade;

    public AtributosRedes ()
    {
        this(0, 0, 0, 0, 0, 0, 0, 0);
    }

    public AtributosRedes (float v, float res, float d, float i, float jdc, float r, float cdp, float flex)
    {
        super(v, res, d, i, jdc, r, cdp);
        this.flexibilidade = flex;
    }

    public AtributosRedes (AtributosRedes ar)
    {
        this (ar.getVelocidade(), ar.getResistencia(), ar.getDestreza(), ar.getImpulsao(),
              ar.getJodoDeCabeca(), ar.getRemate(), ar.getCapacidaDePasse(), ar.getFlexibilidade());
    }

    public float getFlexibilidade()
    {
        return this.flexibilidade;
    }

    public float getHabilidade () {
        return 0.08f * getVelocidade() + 0.01f * getResistencia() + 0.20f * getDestreza() +
                0.05f * getImpulsao() + 0.01f * getJodoDeCabeca() + 0.15f * getRemate() + 0.15f * getCapacidaDePasse() +
                0.35f * getFlexibilidade();
    }

    public String toString () {
        return super.toString() + ";" + getFlexibilidade();
    }
}
