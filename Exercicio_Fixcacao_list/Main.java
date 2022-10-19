public class Main {
    public static void main(String[] args) {

        Pizza p = new Pizza("Calabresa", 0, "P", false);
        Pizza p2 = new Pizza("Calabresa", 0, "M", false);

        Pedido pdd = new Pedido(null, "12/12/12");

        Ingrediente i = new Ingrediente("Mussarela");
        Ingrediente i2 = new Ingrediente("Banco");
        Ingrediente i3 = new Ingrediente("Banco");
        Ingrediente i4 = new Ingrediente("Banco");
        Ingrediente i5 = new Ingrediente("Banco");

        // metodo que adicionando ingrediente na pizza
        p.adcIngrediente(i);
        p.adcIngrediente(i2);
        p.adcIngrediente(i3);
        p.adcIngrediente(i4);
        p.adcIngrediente(i5);

        // metodo que adiciona pizza no pedido
        pdd.adcPizza(p);
        pdd.adcPizza(p2);

        // imprimir a quantidade de ingrediente que foi adicionado
        System.out.println("Quantidades de ingredientes adicionados: "+p.getQuantidadeIngrediente());

        // imprimir o valor calculado da pizza
        System.out.println("Preco calculado da pizza apos adicionar os ingredientes: "+p.calculaPizza());

        System.out.println(pdd.imprimeResumoPedido());

    }

}
