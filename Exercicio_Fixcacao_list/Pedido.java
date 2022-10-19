import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Pedido {

    Random numPedido = new Random();
    private String data;
    Cliente cliente = new Cliente("Luan", "d123123");
    List<Pizza> listaPizza = new ArrayList<Pizza>();
    int numR = numPedido.nextInt(4);
    Pizza p = new Pizza();
    

    public Pedido(Random numPedido, String data) {

        this.numPedido = numPedido;
        this.data = data;

    }

    public Random getNumPedido() {
        return numPedido;
    }

    public void setNumPedido(Random numPedido) {
        this.numPedido = numPedido;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public int getQuantidadePizza() {
        return listaPizza.size();
    }

    public void adcPizza(Pizza p) {
        listaPizza.add(p);
    }
    

    public String imprimeResumoPedido() {
        return "Numero do Pedido: " + numR + "\nCliente: " + cliente.getNome() + "\nQuantidade de Pizza: "
                + getQuantidadePizza() + "\nValor Total do Pedido: " +p.calculaPizza();

    }

}
