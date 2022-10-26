package agenciaMoto;

import java.util.ArrayList;

public class Agencia {
    String nome;
    ArrayList<Moto> listaMoto = new ArrayList<Moto>();

    public void adicionarCarro(Moto moto) {
        listaMoto.add(moto);
    }

    public int getQuantidadeMoto() {
        return listaMoto.size();
    }

    public double calculaValor() {
        double somarValor = 0.0;
        for (int i = 0; i < listaMoto.size(); i++) {
            Moto moto = (Moto) listaMoto.get(i);
            somarValor += moto.valor;
        }
        return somarValor;
    }
}
