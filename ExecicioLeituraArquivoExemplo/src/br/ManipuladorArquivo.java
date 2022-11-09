package br;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ManipuladorArquivo {
    static Scanner entrada;

    public static void leitor(String path) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader(path));
        System.out.println(bufferedReader.readLine());
        bufferedReader.close();

    }

    public static void escritor(String path) throws IOException {
        BufferedWriter buffwWriter = new BufferedWriter(new FileWriter(path));
        String linha = "";
        System.out.println("Escreva algo");
        entrada = new Scanner(System.in);
        linha = entrada.nextLine();
        buffwWriter.append(linha + "\n");
        buffwWriter.close();

    }
}
