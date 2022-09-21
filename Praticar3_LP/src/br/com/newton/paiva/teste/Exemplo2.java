package br.com.newton.paiva.teste;

import javax.swing.JOptionPane;

public class Exemplo2 {

	public static void main(String[] args) {
		int valorA = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor A: "));
		int valorB = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor B: "));

		int resultado = valorA * valorB;

		JOptionPane.showMessageDialog(null, "Resultado final: " + resultado, "Resultado", 1);

	}

}
