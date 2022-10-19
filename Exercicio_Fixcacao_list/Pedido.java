public class Pedido {
    private int numeroPedido;
    private String data;

    Cliente cliente;
    Pizza p = new Pizza();

    public Pedido(int numeroPedido, String data, Cliente cliente) {
        this.numeroPedido = numeroPedido;
        this.data = data;

    }

}
