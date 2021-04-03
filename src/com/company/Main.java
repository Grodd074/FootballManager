package com.company;

import java.io.IOException;
import java.util.ArrayList;


public class Main {

    public static void main(String[] args) throws IOException {
        System.out.println("Bem-vindos ao football manager 2021");

        // J1 Quaresma
        AtributosMedio h1 = new AtributosMedio(5, 7, 10, 4, 6, 8, 1);
        IdentificacaoJogador id1 = new IdentificacaoJogador("Quaresma", 25, PosicaoNoCampo.MEDIO, Pais.ALEMANHA);
        Jogador j1 = new Jogador(h1, id1);
        // J2 Casilhas
        AtributosRedes h2 = new AtributosRedes(5, 7, 10, 4, 6, 8, 1, 5);
        IdentificacaoJogador id2 = new IdentificacaoJogador("Casilhas", 32, PosicaoNoCampo.GUARDA_REDES, Pais.INGLATERRA);
        Jogador j2 = new Jogador(h2, id2);
        // J3 Ronaldo
        AtributosAvanacado h3 = new AtributosAvanacado(5, 7, 10, 4, 6, 8, 1);
        IdentificacaoJogador id3 = new IdentificacaoJogador("Ronaldo", 32, PosicaoNoCampo.AVANCADO, Pais.ESPANHA);
        Jogador j3 = new Jogador(h3, id3);
        // J4 Messi
        AtributosAvanacado h4 = new AtributosAvanacado(5, 7, 10, 4, 6, 8, 1);
        IdentificacaoJogador id4 = new IdentificacaoJogador("Messi", 32, PosicaoNoCampo.AVANCADO, Pais.PORTUGAL);
        Jogador j4 = new Jogador(h4, id4);
        // J5 Neymar
        AtributosLateral h5 = new AtributosLateral(5, 7, 10, 4, 6, 8, 1);
        IdentificacaoJogador id5 = new IdentificacaoJogador("Neymar", 32, PosicaoNoCampo.LATERAL, Pais.ITALIA);
        Jogador j5 = new Jogador(h5, id5);
        // J6 Defesas
        AtributosDefesa h6 = new AtributosDefesa(5, 7, 10, 4, 6, 8, 1);
        IdentificacaoJogador id6 = new IdentificacaoJogador("Daniel Xavier", 32, PosicaoNoCampo.DEFESA, Pais.FRANCA);
        Jogador j6 = new Jogador(h6, id6);

        IdentificacaoEquipa idEquip1 = new IdentificacaoEquipa("SEIXENSES FC", 74, "Seixas");
        IdentificacaoEquipa idEquip2 = new IdentificacaoEquipa("FCP", 103, "Porto");
        Equipa e1 = new Equipa(idEquip1);
        Equipa e2 = new Equipa(idEquip2);
        e1.addJogador(j1);
        e1.addJogador(j2);
        e1.addJogador(j3);
        e1.addJogador(j4);
        e1.addJogador(j5);
        e1.addJogador(j6);
        e2.addJogador(j1);
        e2.addJogador(j2);
        e2.addJogador(j3);
        e2.addJogador(j4);
        e2.addJogador(j5);
        e2.addJogador(j6);

        Partida p1 = new Partida(e1, e2);
        ResultadoPartida r1 = p1.jogarPartida();
        System.out.println(r1.golosEquipaCasa + "-" + r1.golosEquipaVisitante);


        // CSV ficheiro com jogadores
        Estado e = new Estado(e1.getListaJogadores());
        ManipuladorFicheiro f = new ManipuladorFicheiro("save.csv");
        f.escreveEstado(e);

        // Leitura do estado
        f.leEstado();
    }
}
