package br.com.newton.paiva.teste;

import javax.swing.JOptionPane;

public class Exemplo3 {

	public static void main(String[] args) {
		float nota1, nota2, nota3, calculaMedia;

		nota1 = Float.parseFloat(JOptionPane.showInputDialog("Digite a primeira nota"));
		nota2 = Float.parseFloat(JOptionPane.showInputDialog("Digite a segunda nota"));
		nota3 = Float.parseFloat(JOptionPane.showInputDialog("Digite a terceira nota"));

		calculaMedia = nota1 + nota2 + nota3 / 3;
		JOptionPane.showMessageDialog(null, "Resultado da média = " + calculaMedia, "Resultado", 1);

		if (calculaMedia < 60) {
			JOptionPane.showMessageDialog(null, "Reprovado", null, 0);
		} else {
			JOptionPane.showMessageDialog(null, "Aprovado");
		}
	}

}
