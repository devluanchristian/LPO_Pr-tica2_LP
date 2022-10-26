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

    public void calculaPreco() {

    }

}
