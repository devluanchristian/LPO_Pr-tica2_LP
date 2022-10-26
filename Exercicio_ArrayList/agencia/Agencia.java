package agencia;

import java.util.ArrayList;

public class Agencia {
    String nome;

    // Criando uma lista de CArros do Tipo Carro.
    // Um ArrayList de Carros

    ArrayList<Carro> listaCarro = new ArrayList<Carro>();

    // Criando um metodo sem retorno, para incluir tipos de Carro
    // dentro da lista de carros
    public void adicionarCarro(Carro c) {
        listaCarro.add(c);

    }

    // Uitilizando a propriedade size de class ArrayList para contar
    // a quantidade de carros da lista
    public int getQuantidadeCarros() {
        return listaCarro.size();
    }

    public double calculaValor() {
        double somaValor = 0.0;

        for (int i = 0; i < listaCarro.size(); i++) {
            Carro c = (Carro) listaCarro.get(i);
            somaValor += c.valor;
        }
        
        return somaValor;
    }

}
