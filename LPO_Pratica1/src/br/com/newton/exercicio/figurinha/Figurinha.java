package br.com.newton.exercicio.figurinha;

import java.util.Scanner;

public class Figurinha {

	public static void main(String[] args) {
		String[]nomes = new String[5];
		String[]selecao = new String[5];
		int[]idade = new int[5];
		int media = 0;
		
		
		for(int i = 0; i < 4; i++) {
			
			System.out.println("Informe o nome de uma selecao: ");
			selecao[i] = new Scanner(System.in).nextLine();
			
			System.out.println("Informe o nome de algum jogador da(o) "+selecao[i]);
			nomes[i] = new Scanner(System.in).nextLine();
			
			System.out.println("Qual a idade do jogador "+nomes[i]+ " da selecao da(o) "+selecao[i]);
			idade[i] = new Scanner(System.in).nextInt();
			
			switch(nomes[i]) {
			case "Marquinhos":
				System.out.println("Marquinhos vai levantar a taça do Hexa. ");
				break;
			case "Hulk":
				System.out.println("Dessa vez não vai dar para você! . ");
				break;
			}
			switch(selecao[i]) {
			case "Argentina":
				System.out.println("Adeus los hermanos!!!. ");
				break;
			
		}
			media = idade[i]/5;
			System.out.println(media);

	}
		
  }
}
