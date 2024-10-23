package ProjetoChainOfResponsability;

public class FuncionarioNivel1 extends Funcionario {

    public FuncionarioNivel1(Funcionario superior) {
        listaSuportes.add(TipoSuporteBasico.getTipoSuporteBasico());
        setFuncionarioSuperior(superior);
    }

    public String getDescricaoCargo() {
        return "Suporte Nível 1";
    }
}
