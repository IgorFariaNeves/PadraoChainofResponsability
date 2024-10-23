package padroescomportamentais.chainofresponsability;

public class TipoPedidoComplexo implements TipoPedido {

    private static TipoPedidoComplexo tipoPedidoComplexo = new TipoPedidoComplexo();

    private TipoPedidoComplexo() {}

    public static TipoPedidoComplexo getTipoPedidoComplexo() {
        return tipoPedidoComplexo;
    }
}
