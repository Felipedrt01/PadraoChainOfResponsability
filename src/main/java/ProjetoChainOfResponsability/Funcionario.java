package ProjetoChainOfResponsability;

import java.util.ArrayList;

public abstract class Funcionario {

    protected ArrayList listaSuportes = new ArrayList();
    private Funcionario funcionarioSuperior;

    public Funcionario getFuncionarioSuperior() {
        return funcionarioSuperior;
    }

    public void setFuncionarioSuperior(Funcionario funcionarioSuperior) {
        this.funcionarioSuperior = funcionarioSuperior;
    }

    public abstract String getDescricaoCargo();

    public String resolverSuporte(PedidoSuporte pedido) {
        if (listaSuportes.contains(pedido.getTipoSuporte())) {
            return getDescricaoCargo() + " resolveu o problema.";
        } else {
            if (funcionarioSuperior != null) {
                return funcionarioSuperior.resolverSuporte(pedido);
            } else {
                return "Nenhum nível de suporte conseguiu resolver o problema.";
            }
        }
    }
}
