package ProjetoChainOfResponsability;

public class FuncionarioNivel2 extends Funcionario {

    public FuncionarioNivel2(Funcionario superior) {
        listaSuportes.add(TipoSuporteIntermediario.getTipoSuporteIntermediario());
        setFuncionarioSuperior(superior);
    }

    public String getDescricaoCargo() {
        return "Suporte Nível 2";
    }
}
