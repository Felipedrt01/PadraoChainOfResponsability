package ProjetoChainOfResponsability;

public class Main {

    public static void main(String[] args) {

        // Criando a cadeia de responsabilidade
        Funcionario nivel3 = new FuncionarioNivel3(null);
        Funcionario nivel2 = new FuncionarioNivel2(nivel3);
        Funcionario nivel1 = new FuncionarioNivel1(nivel2);

        // Criando diferentes pedidos de suporte
        PedidoSuporte pedidoBasico = new PedidoSuporte(TipoSuporteBasico.getTipoSuporteBasico());
        PedidoSuporte pedidoIntermediario = new PedidoSuporte(TipoSuporteIntermediario.getTipoSuporteIntermediario());
        PedidoSuporte pedidoAvancado = new PedidoSuporte(TipoSuporteAvancado.getTipoSuporteAvancado());

        // Tentativa de resolver pedidos em diferentes níveis
        System.out.println("Tentando resolver suporte básico:");
        System.out.println(nivel1.resolverSuporte(pedidoBasico));

        System.out.println("\nTentando resolver suporte intermediário:");
        System.out.println(nivel1.resolverSuporte(pedidoIntermediario));

        System.out.println("\nTentando resolver suporte avançado:");
        System.out.println(nivel1.resolverSuporte(pedidoAvancado));

        // Criando um pedido que não pode ser resolvido
        TipoSuporte tipoDesconhecido = new TipoSuporte() {};  // Um tipo de suporte desconhecido
        PedidoSuporte pedidoDesconhecido = new PedidoSuporte(tipoDesconhecido);

        System.out.println("\nTentando resolver um suporte desconhecido:");
        System.out.println(nivel1.resolverSuporte(pedidoDesconhecido));
    }
}
