package agenciaMoto;

public class Main {
    public static void main(String[] args) {

        Moto moto = new Moto();
        moto.nome = "CG";
        moto.cor = "Vermelha";

        Moto moto2 = new Moto();
        moto2.nome = "Tyger";
        moto2.cor = "Cinza";

        Agencia ag = new Agencia();
        ag.adicionarCarro(moto);
        ag.adicionarCarro(moto2);

        System.out.println(ag.getQuantidadeMoto());
    }
}
