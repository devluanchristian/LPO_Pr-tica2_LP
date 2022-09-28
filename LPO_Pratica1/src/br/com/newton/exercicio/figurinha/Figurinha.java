package br.com.newton.exercicio.figurinha;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Figurinha {

    public static void main(String args[]) {
        String[] nome = new String[5];
        String[] selecao = new String[5];
        int[] idade = new int[5];
        int sumIdade = 0, mediaIdade = 0;

        Scanner ler = new Scanner(System.in);
        for (int i = 0; i < nome.length; i++) {
            nome[i] = JOptionPane.showInputDialog("Entre com o nome do jogador da figurinha");
            selecao[i] = JOptionPane.showInputDialog("Entre com a selecao deste jogador");
            idade[i] = Integer.parseInt(JOptionPane.showInputDialog("Entre com a idade do jogador"));

        }
        for (int i = 0; i < idade.length; i++) {
            if (nome[i].equals("Marquinhos")) {
                JOptionPane.showMessageDialog(null, "Marquinhos vai levantar a taça", "Mensagem", 1);
            } else if (nome[i].equals("Hulk")) {
                JOptionPane.showMessageDialog(null, "Dessa vez não vai dar pra você", "Hulk", 2);

            }
            if (selecao[i].equals("Argentina")) {
                JOptionPane.showMessageDialog(null, "Adeus los hermanos", "Argentina", 2);

            }
            sumIdade = sumIdade + idade[i];
        }
        mediaIdade = (sumIdade / idade.length);
        JOptionPane.showMessageDialog(null, "A copa do mundo possui uma media de idade " + mediaIdade,
                "Media da Copa do Mundo", 1);

    }
}
