package br.com.newton.paiva.teste;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
public class Exemplo5 {

	public static void main(String[] args) {
		JFrame janela = new JFrame("Interface Grafica");
		JButton botao = new JButton("Botão do Swing");
		JLabel texto = new JLabel("Numero de clicks: 0");
		JPanel painel = new JPanel();
		
		
		painel.add(botao);
		painel.add(texto);
		janela.getContentPane().add(painel);
		janela.setSize(500,500);
		janela.setVisible(true);

	}

}
