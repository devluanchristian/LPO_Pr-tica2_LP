
public class Main {
    public static void main(String[] args) {

        Pizza p = new Pizza();

        Ingrediente i = new Ingrediente("Mussarela");
        Ingrediente i2 = new Ingrediente("Bacon");

        //p.listaIngredientes.add(i);
        
        //p.listaIngredientes.add(i2);

        //p.adicionarIngredientesPizza(i);
       // p.adicionarIngredientesPizza(i2);

       p.calculaPrecoPizza("G");




        System.out.println(p.getQuantidadeIngredientes());

    }
        

}
