package padroescomportamentais.chainofresponsability;

public class TipoPedidoSimples implements TipoPedido {

    private static TipoPedidoSimples tipoPedidoSimples = new TipoPedidoSimples();

    private TipoPedidoSimples() {}

    public static TipoPedidoSimples getTipoPedidoSimples() {
        return tipoPedidoSimples;
    }
}
