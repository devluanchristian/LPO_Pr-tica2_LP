package sacolao;

public class Main {
    public static void main(String[] args) {

        Fruta fruta = new Fruta();
        fruta.nome = "Uva";
        Fruta fruta2 = new Fruta();
        fruta2.nome = "melancia";
        Fruta fruta3 = new Fruta();
        fruta3.nome = "banana";


        Sacolao sacolao = new Sacolao();
        sacolao.adicionaFruta(fruta);
        sacolao.adicionaFruta(fruta2);
        sacolao.adicionaFruta(fruta3);

        System.out.println(sacolao.getQuantidadeFruta());

    }
}
