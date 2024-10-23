package ProjetoChainOfResponsability;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestChainOfResponsibility {

    private Funcionario nivel1;
    private Funcionario nivel2;
    private Funcionario nivel3;

    @BeforeEach
    public void setUp() {
        nivel3 = new FuncionarioNivel3(null);
        nivel2 = new FuncionarioNivel2(nivel3);
        nivel1 = new FuncionarioNivel1(nivel2);
    }

    @Test
    public void deveResolverSuporteBasicoPorNivel1() {
        PedidoSuporte pedidoBasico = new PedidoSuporte(TipoSuporteBasico.getTipoSuporteBasico());
        assertEquals("Suporte Nível 1 resolveu o problema.", nivel1.resolverSuporte(pedidoBasico));
    }

    @Test
    public void deveResolverSuporteIntermediarioPorNivel2() {
        PedidoSuporte pedidoIntermediario = new PedidoSuporte(TipoSuporteIntermediario.getTipoSuporteIntermediario());
        assertEquals("Suporte Nível 2 resolveu o problema.", nivel1.resolverSuporte(pedidoIntermediario));
    }

    @Test
    public void deveResolverSuporteAvancadoPorNivel3() {
        PedidoSuporte pedidoAvancado = new PedidoSuporte(TipoSuporteAvancado.getTipoSuporteAvancado());
        assertEquals("Suporte Nível 3 resolveu o problema.", nivel1.resolverSuporte(pedidoAvancado));
    }

    @Test
    public void deveRetornarNenhumNivelResolveuProblemaParaTipoDesconhecido() {
        TipoSuporte tipoDesconhecido = new TipoSuporte() {};
        PedidoSuporte pedidoDesconhecido = new PedidoSuporte(tipoDesconhecido);
        assertEquals("Nenhum nível de suporte conseguiu resolver o problema.", nivel1.resolverSuporte(pedidoDesconhecido));
    }
}
