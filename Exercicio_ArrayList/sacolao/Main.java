package sacolao;

public class Main {
    public static void main(String[] args) {

        Fruta fruta = new Fruta();
        fruta.nome = "Uva";
        fruta.valor = 9;

        Fruta fruta2 = new Fruta();
        fruta2.nome = "melancia";
        fruta2.valor = 20;

        Fruta fruta3 = new Fruta();
        fruta3.nome = "banana";
        fruta3.valor = 5;

        Sacolao sacolao = new Sacolao();
        sacolao.adicionaFruta(fruta);
        sacolao.adicionaFruta(fruta2);
        sacolao.adicionaFruta(fruta3);

        System.out.println(sacolao.getQuantidadeFruta());
        System.out.println("valor total da compra "+ sacolao.calculaValor());
        

    }
}
