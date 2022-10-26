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
}
