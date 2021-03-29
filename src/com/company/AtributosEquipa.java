package com.company;

import java.util.ArrayList;

public class AtributosEquipa extends Atributos {
    ArrayList<Jogador> listaJogadores;
    private float saldo;
    private float espirito;

    public AtributosEquipa(ArrayList<Jogador> listaJogadores, float saldo, float espirito) {
        this.listaJogadores = listaJogadores;
        this.saldo = saldo;
        this.espirito = espirito;
    }

    public float getSaldo() {
        return saldo;
    }

    public float getEspirito() {
        return espirito;
    }

    public float getHabilidade () {
        float sum = 0;
        for (Jogador j : listaJogadores) {
            sum += j.getAtributos().getHabilidade();
        }
        return sum;
    }

}
