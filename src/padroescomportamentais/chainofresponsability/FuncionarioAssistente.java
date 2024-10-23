package padroescomportamentais.chainofresponsability;

public class FuncionarioAssistente extends Funcionario {

    public FuncionarioAssistente(Funcionario superior) {
        listaPedidos.add(TipoPedidoSimples.getTipoPedidoSimples());
        setFuncionarioSuperior(superior);
    }

    public String getDescricaoCargo() {
        return "Assistente";
    }
}
