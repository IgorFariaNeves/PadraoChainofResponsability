package padroescomportamentais.chainofresponsability;

public class FuncionarioDiretor extends Funcionario {

    public FuncionarioDiretor(Funcionario superior) {
        listaPedidos.add(TipoPedidoComplexo.getTipoPedidoComplexo());
        setFuncionarioSuperior(superior);
    }

    public String getDescricaoCargo() {
        return "Diretor";
    }
}
