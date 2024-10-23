package padroescomportamentais.chainofresponsability;

public class TipoPedidoModerado implements TipoPedido {

    private static TipoPedidoModerado tipoPedidoModerado = new TipoPedidoModerado();

    private TipoPedidoModerado() {}

    public static TipoPedidoModerado getTipoPedidoModerado() {
        return tipoPedidoModerado;
    }
}
