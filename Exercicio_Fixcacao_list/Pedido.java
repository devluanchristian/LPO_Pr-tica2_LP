import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private int numeroPedido;
    private String data;
    Cliente cliente;
    List<Pizza> listaPizza = new ArrayList<Pizza>();
    

    public Pedido(int numeroPedido, String data, Cliente cliente) {
        this.numeroPedido = numeroPedido;
        this.data = data;

    }

}
