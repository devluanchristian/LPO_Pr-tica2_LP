import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private int numeroPedido;
    private String data;

    Cliente cliente;
    List<Pizza> listaPizza = new ArrayList<Pizza>();


    public Pedido(){
        


    }
    

    public Pedido(int numeroPedido, String data, Cliente cliente) {
        this.numeroPedido = numeroPedido;
        this.data = data;

    }
    public void adicionarPizza(Pizza i) {
        listaPizza.add(i);
    }


    public int getNumeroPedido() {
        return numeroPedido;
    }


    public void setNumeroPedido(int numeroPedido) {
        this.numeroPedido = numeroPedido;
    }


    public String getData() {
        return data;
    }


    public void setData(String data) {
        this.data = data;
    }


    



}
