package com.company;

public class AtributosMedio extends AtributosJogador {
    public AtributosMedio() {
    }

    public AtributosMedio(float v, float res, float d, float i, float jdc, float r, float cdp) {
        super(v, res, d, i, jdc, r, cdp);
    }

    public AtributosMedio(AtributosJogador h) {
        super(h);
    }

    public float getHabilidade () {
        return 0.15f * getVelocidade() + 0.05f * getResistencia() + 0.20f * getDestreza() +
                0.25f * getImpulsao() + 0.05f * getJodoDeCabeca() + 0.05f * getRemate() + 0.25f * getCapacidaDePasse();
    }
}
