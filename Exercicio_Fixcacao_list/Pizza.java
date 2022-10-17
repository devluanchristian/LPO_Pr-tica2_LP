public class Pizza {
    private String nome;
    private String tamanho;
    private double valor;
    private boolean possuiBordaRecheada;
    
    public Pizza(String nome, String tamanho, double valor, boolean possuiBordaRecheada) {
        this.nome = nome;
        this.tamanho = tamanho;
        this.valor = valor;
        this.possuiBordaRecheada = possuiBordaRecheada;
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

    


}
