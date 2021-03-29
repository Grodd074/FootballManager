package com.company;

public class AtributosDefesa extends AtributosJogador {
    public AtributosDefesa() {
    }

    public AtributosDefesa(float v, float res, float d, float i, float jdc, float r, float cdp) {
        super(v, res, d, i, jdc, r, cdp);
    }

    public AtributosDefesa(AtributosJogador h) {
        super(h);
    }

    public float getHabilidade () {
        return 0.20f * getVelocidade() + 0.10f * getResistencia() + 0.20f * getDestreza() +
                0.15f * getImpulsao() + 0.05f * getJodoDeCabeca() + 0.05f * getRemate() + 0.25f * getCapacidaDePasse();
    }
}
