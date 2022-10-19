import java.util.ArrayList;
import java.util.List;

public class Pizza {
    private String nome;
    private double valor;
    private String tamanho;
    private boolean possuiBordaRecheada;
    List<Ingrediente> listaIngrediente = new ArrayList<Ingrediente>();



    public Pizza(){}
    public Pizza(String nome, double valor, String tamanho, boolean possuiBordaRecheada) {
        this.nome = nome;
        this.valor = valor;
        this.tamanho = tamanho;
        this.possuiBordaRecheada = possuiBordaRecheada;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public boolean isPossuiBordaRecheada() {
        return possuiBordaRecheada;
    }

    public void setPossuiBordaRecheada(boolean possuiBordaRecheada) {
        this.possuiBordaRecheada = possuiBordaRecheada;
    }

    // metodos
    public int getQuantidadeIngrediente() {
        return listaIngrediente.size();
    }

    public void adcIngrediente(Ingrediente i) {
        listaIngrediente.add(i);
    }

    public double calculaPizza() {
        if (getTamanho() == "G") {
            this.valor = 45.00;
        } else if (getTamanho() == "M") {
            this.valor = 30.00;
        } else if (getTamanho() == "P") {
            this.valor = 20.00;
        }

        if (getQuantidadeIngrediente() == 5) {
            this.valor += 5.00;
        }
        if (isPossuiBordaRecheada() == true) {
            this.valor += 8.00;
        }
        return this.valor;
    }

}
