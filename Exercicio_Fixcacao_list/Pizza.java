import java.util.ArrayList;
import java.util.List;

public class Pizza {

    private String nome;
    private String tamanho;
    private double valor;
    private boolean possuiBordaRecheada;
    List<Ingrediente> listaIngredientes = new ArrayList<Ingrediente>();

    public Pizza() {

    }

    public Pizza(String nome, String tamanho, double valor, boolean possuiBordaRecheada) {
        this.nome = nome;
        this.tamanho = tamanho;
        this.valor = valor;
        this.possuiBordaRecheada = possuiBordaRecheada;
    }

    public int getQuantidadeIngredientes() {
        return listaIngredientes.size();
    }

    public void adicionarIngredientesPizza(Ingrediente i) {
        listaIngredientes.add(i);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public boolean isPossuiBordaRecheada() {
        return possuiBordaRecheada;
    }

    public void setPossuiBordaRecheada(boolean possuiBordaRecheada) {
        this.possuiBordaRecheada = possuiBordaRecheada;
    }

    public void calculaPrecoPizza(String tamanho) {

        if (tamanho == "G") {
            this.valor = 45.00;

        } else if (tamanho == "M") {
            this.valor = 30.00;

        } else if (tamanho == "P") {
            this.valor = 20.00;

        } else if (getQuantidadeIngredientes() == 5) {
            this.valor += 5.00;
        } else if (isPossuiBordaRecheada() == true) {
            this.valor += 8.00;
        }
    }

}
