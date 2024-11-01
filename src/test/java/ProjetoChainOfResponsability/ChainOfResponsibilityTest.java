package ProjetoChainOfResponsability;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ChainOfResponsibilityTest {

    private Administrador administradorBancoDados;
    private Administrador administradorRede;
    private Administrador administradorServidor;

    @BeforeEach
    public void setUp() {
        // Configuração da cadeia de responsabilidade
        administradorServidor = new AdministradorServidor(null);
        administradorRede = new AdministradorRede(administradorServidor);
        administradorBancoDados = new AdministradorBancoDados(administradorRede);
    }

    @Test
    public void testAcessoBancoDados() {
        RequisicaoAcesso acessoBancoDados = new RequisicaoAcesso(TipoRecursoBancoDados.getTipoRecursoBancoDados());
        String resultado = administradorBancoDados.aprovarAcesso(acessoBancoDados);
        assertEquals("Administrador de Banco de Dados", resultado);
    }

    @Test
    public void testAcessoRede() {
        RequisicaoAcesso acessoRede = new RequisicaoAcesso(TipoRecursoRede.getTipoRecursoRede());
        String resultado = administradorBancoDados.aprovarAcesso(acessoRede);
        assertEquals("Administrador de Rede", resultado);
    }

    @Test
    public void testAcessoServidor() {
        RequisicaoAcesso acessoServidor = new RequisicaoAcesso(TipoRecursoServidor.getTipoRecursoServidor());
        String resultado = administradorBancoDados.aprovarAcesso(acessoServidor);
        assertEquals("Administrador de Servidores", resultado);
    }

}
