package br.com.newton.exercicio.frase;
import javax.swing.JOptionPane;
/**
*
* @author Luan Christian Rocha Do Carmo
*/


public class frase {
    public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog(null, "digite o nome"), vogais = "";
        nome = nome.toUpperCase();
        int cont = 0;
        for (int i = 0; i < nome.length(); i++){
            if(nome.charAt(i) == 'A' || nome.charAt(i) == 'E' || nome.charAt(i) == 'I' || nome.charAt(i) == 'O' || nome.charAt(i) == 'U'){
                vogais += nome.charAt(i)+" ";
                cont++;
            }
        }
        JOptionPane.showMessageDialog(null, "A palavra: "+nome.toLowerCase()+" possui: "+cont+" vogais\n"+" elas são: "+vogais.toLowerCase());
    }
}
