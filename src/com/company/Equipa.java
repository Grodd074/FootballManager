package com.company;

import java.util.ArrayList;

public class Equipa
{
    private AtributosEquipa atributosEquipa;
    private IdentificacaoEquipa id;
    private ArrayList<Jogador> listaJogadores;

    public Equipa (IdentificacaoEquipa id) {
        this.id = id;
        this.listaJogadores = new ArrayList<Jogador>();
        this.atributosEquipa = new AtributosEquipa(this.listaJogadores, 200, 9.0f);
    }

    public Equipa (IdentificacaoEquipa id, ArrayList<Jogador> lJogadores, float saldo, float espirito) {
        this.id = id;
        this.listaJogadores = lJogadores;
        this.atributosEquipa = new AtributosEquipa(this.listaJogadores, saldo, espirito);
    }

    public void addJogador (Jogador j) {
        this.listaJogadores.add(j);
    }


    public AtributosEquipa getAtributosEquipa() {
        return atributosEquipa;
    }

    public IdentificacaoEquipa getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Equipa{" +
                "nome='" + getId().getNome() + '\'' +
                ", listaJogadores=" + listaJogadores +
                '}';
    }

}
