package sacolao;

import java.util.ArrayList;

public class Sacolao {
    String nome;
    ArrayList<Fruta> listaFruta = new ArrayList<Fruta>();

    public void adicionaFruta(Fruta fruta) {
        listaFruta.add(fruta);
    }

    public int getQuantidadeFruta() {
        return listaFruta.size();

    }

    public double calculaValor() {

        double somarValor = 0.0;
        for (int i = 0; i < listaFruta.size(); i++) {
            Fruta fruta = (Fruta) listaFruta.get(i);
            somarValor += fruta.valor;
        }
        return somarValor;
    }

}
