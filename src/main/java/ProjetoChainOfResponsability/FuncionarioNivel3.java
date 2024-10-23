package ProjetoChainOfResponsability;

public class FuncionarioNivel3 extends Funcionario {

    public FuncionarioNivel3(Funcionario superior) {
        listaSuportes.add(TipoSuporteAvancado.getTipoSuporteAvancado());
        setFuncionarioSuperior(superior);
    }

    public String getDescricaoCargo() {
        return "Suporte Nível 3";
    }
}
