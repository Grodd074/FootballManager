package com.company;

public class AtributosLateral extends AtributosJogador {
    public AtributosLateral() {
    }

    public AtributosLateral(float v, float res, float d, float i, float jdc, float r, float cdp) {
        super(v, res, d, i, jdc, r, cdp);
    }

    public AtributosLateral(AtributosJogador h) {
        super(h);
    }

    public float getHabilidade () {
        return 0.25f * getVelocidade() + 0.15f * getResistencia() + 0.10f * getDestreza() +
                0.20f * getImpulsao() + 0.10f * getJodoDeCabeca() + 0.05f * getRemate() + 0.15f * getCapacidaDePasse();
    }
}
