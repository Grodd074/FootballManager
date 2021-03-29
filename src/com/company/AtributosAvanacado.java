package com.company;

public class AtributosAvanacado extends AtributosJogador {
    public AtributosAvanacado() {
    }

    public AtributosAvanacado(float v, float res, float d, float i, float jdc, float r, float cdp) {
        super(v, res, d, i, jdc, r, cdp);
    }

    public AtributosAvanacado(AtributosJogador h) {
        super(h);
    }

    public float getHabilidade () {
        return 0.20f * getVelocidade() + 0.05f * getResistencia() + 0.05f * getDestreza() +
                0.15f * getImpulsao() + 0.20f * getJodoDeCabeca() + 0.25f * getRemate() + 0.10f * getCapacidaDePasse();
    }
}
