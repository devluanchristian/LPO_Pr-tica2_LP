package agencia;
public class Main {
    public static void main(String[] args) {

        Carro carro = new Carro();
        carro.nome = "Palio";
        carro.cor = "Cinza";

        Carro carro2 = new Carro();
        carro2.nome = "Gol";
        carro2.cor = "Preta";

        Agencia ag = new Agencia();
        ag.nome = "Agencia do Luanzin";
        ag.adicionarCarro(carro);
        ag.adicionarCarro(carro2);
        System.out.println("Na "+ag.nome+" tem "+ag.getQuantidadeCarros()+" carros");
    }

}
