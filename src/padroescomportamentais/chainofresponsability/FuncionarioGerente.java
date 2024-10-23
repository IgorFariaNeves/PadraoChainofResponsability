package padroescomportamentais.chainofresponsability;

public class FuncionarioGerente extends Funcionario {

    public FuncionarioGerente(Funcionario superior) {
        listaPedidos.add(TipoPedidoModerado.getTipoPedidoModerado());
        setFuncionarioSuperior(superior);
    }

    public String getDescricaoCargo() {
        return "Gerente";
    }
}
