package br;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        String path = "/ExecicioLeituraArquivoExemplo/src/br/arquivo.txt";
        
        ManipuladorArquivo.leitor(path);
        ManipuladorArquivo.escritor(path);

    }
}
