package padroescomportamentais.chainofresponsability;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PedidoTest {

    FuncionarioDiretor diretor;
    FuncionarioGerente gerente;
    FuncionarioAssistente assistente;

    @BeforeEach
    void setUp() {
        diretor = new FuncionarioDiretor(null);
        gerente = new FuncionarioGerente(diretor);
        assistente = new FuncionarioAssistente(gerente);
    }

    @Test
    void deveRetornarAssistenteParaPedidoSimples() {
        assertEquals("Assistente", assistente.aprovarPedido(new Pedido(TipoPedidoSimples.getTipoPedidoSimples())));
    }

    @Test
    void deveRetornarGerenteParaPedidoModerado() {
        assertEquals("Gerente", assistente.aprovarPedido(new Pedido(TipoPedidoModerado.getTipoPedidoModerado())));
    }

    @Test
    void deveRetornarDiretorParaPedidoComplexo() {
        assertEquals("Diretor", assistente.aprovarPedido(new Pedido(TipoPedidoComplexo.getTipoPedidoComplexo())));
    }

    @Test
    void deveRetornarSemAprovacaoParaPedidoDesconhecido() {
        assertEquals("Sem aprovação", assistente.aprovarPedido(new Pedido(new TipoPedido() {})));
    }
}
