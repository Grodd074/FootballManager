package com.company;

import java.util.ArrayList;

public class Estado
{
    private ArrayList<Jogador> todosJogadores;

    public Estado() {
        this.todosJogadores = new ArrayList<Jogador>();
    }

    public Estado(ArrayList<Jogador> jogadores) {
        this.todosJogadores = jogadores;
    }

    public ArrayList<Jogador> getJogadores () {
        return this.todosJogadores;
    }


}
