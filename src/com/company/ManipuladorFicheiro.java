package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ManipuladorFicheiro
{
    private String filePath;
    private FileWriter writer;
    private File file;
    private Scanner scan;

    public ManipuladorFicheiro(String path) {
        this.filePath = path;
    }

    public Estado leEstado () {
        this.file = new File(filePath);
        Estado estado = new Estado();
        try {
            this.scan = new Scanner(this.file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        return estado;
    }

    public void escreveEstado (Estado e) {
        StringBuilder sb = new StringBuilder();

        // Tenta abrir ficheiro para escrever
        try {
            this.writer = new FileWriter(this.filePath);
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
