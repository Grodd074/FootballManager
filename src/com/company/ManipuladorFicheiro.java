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

    public ManipuladorFicheiro(String path) throws IOException {
        //this.filePath =
        //writer = new FileWriter(path);
    }

    public Estado leEstado () {
        //file = new File(path);
        //scan = new Scanner(file);
    }

    public void escreveEstado (Estado e) {
        String content = "";
        //content = e.getX() + " " + e.getY() + " " + e.getZ();
        try {
            this.writer.write(content);
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }

        try {
            writer.close();
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
    }


}
