package ProjetoChainOfResponsability;

public class AdministradorBancoDados extends Administrador {

    public AdministradorBancoDados(Administrador superior) {
        listaRecursos.add(TipoRecursoBancoDados.getTipoRecursoBancoDados());
        setAdministradorSuperior(superior);
    }

    public String getDescricaoCargo() {
        return "Administrador de Banco de Dados";
    }
}
