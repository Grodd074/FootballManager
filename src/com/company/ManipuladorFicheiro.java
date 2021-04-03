package com.company;

import java.io.*;
import java.util.Locale;
import java.util.Scanner;

public class ManipuladorFicheiro
{
    private String path;
    private FileWriter writer;
    private File file;

    public ManipuladorFicheiro(String path) {
        this.path = path;
    }

    public Estado leEstado () {
        Estado estado = new Estado();

        // Open reader
        BufferedReader csvReader = null;
        try {
            csvReader = new BufferedReader(new FileReader(this.path));
            leJogadores(estado, csvReader);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


        // Close reader
        try {
            csvReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return estado;
    }

    private void leJogadores (Estado estado, BufferedReader csvReader)
    {
        // nome;idade;posicao;pais;Habilidade;velocidade;resistencia;destreza;impulsao;jogo-de-cabeça;remate;capacidade-de-passe;(flexibilidade)
        String row = "";


        // Read first line
        try {
            row = csvReader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

        while ( row != null ) {
            String[] data = row.split(";");

            // Constuir jogador
            Jogador j = new Jogador();
            AtributosJogador a = new AtributosJogador();
            IdentificacaoJogador id;

            // Identificacao do jogador
            String nome = data[0];
            int idade = Integer.parseInt(data[1]);
            PosicaoNoCampo posicao = PosicaoNoCampo.valueOf(data[2].toUpperCase());
            Pais pais = Pais.valueOf(data[3].toUpperCase());
            id = new IdentificacaoJogador(nome, idade, posicao, pais);

            // Atributos do jogador
            float habilidade = Float.parseFloat(data[4]);
            float velocidade = Float.parseFloat(data[5]);
            float resistencia = Float.parseFloat(data[6]);
            float destreza = Float.parseFloat(data[7]);
            float impulsao = Float.parseFloat(data[8]);
            float jogoDeCabeca = Float.parseFloat(data[9]);
            float remate = Float.parseFloat(data[10]);
            float capacidadeDePasse = Float.parseFloat(data[11]);
            float flexibilidade = 0;

            if (posicao == PosicaoNoCampo.GUARDA_REDES) {
                flexibilidade = Float.parseFloat(data[12]);
                a = new AtributosRedes(velocidade, resistencia, destreza, impulsao, jogoDeCabeca, remate, capacidadeDePasse, flexibilidade);
            } else if (posicao == PosicaoNoCampo.MEDIO) {
                a = new AtributosMedio(velocidade, resistencia, destreza, impulsao, jogoDeCabeca, remate, capacidadeDePasse);
            } else if (posicao == PosicaoNoCampo.LATERAL) {
                a = new AtributosLateral(velocidade, resistencia, destreza, impulsao, jogoDeCabeca, remate, capacidadeDePasse);
            } else if (posicao == PosicaoNoCampo.DEFESA) {
                a = new AtributosDefesa(velocidade, resistencia, destreza, impulsao, jogoDeCabeca, remate, capacidadeDePasse);
            } else if (posicao == PosicaoNoCampo.AVANCADO) {
                a = new AtributosAvanacado(velocidade, resistencia, destreza, impulsao, jogoDeCabeca, remate, capacidadeDePasse);
            } else if (posicao == PosicaoNoCampo.SEM_POSICAO) {
                a = new AtributosJogador(velocidade, resistencia, destreza, impulsao, jogoDeCabeca, remate, capacidadeDePasse);
            }

            j = new Jogador(a, id);
            System.out.println(j);

            // Keep reading lines
            try {
                row = csvReader.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public void escreveEstado (Estado e) {
        StringBuilder sb = new StringBuilder();

        // Tenta abrir ficheiro para escrever
        try {
            this.writer = new FileWriter(this.path);
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }

        // Prepara string dos jogadores
        for (Jogador j : e.getJogadores()) {
            sb.append(j.toString());
            sb.append("\n");
        }

        // Escreve no ficheiro
        try {
            this.writer.write(sb.toString());
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }

        // Fecha ficheiro
        try {
            writer.close();
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
    }

}
