package ProjetoChainOfResponsability;

public class AdministradorRede extends Administrador {

    public AdministradorRede(Administrador superior) {
        listaRecursos.add(TipoRecursoRede.getTipoRecursoRede());
        setAdministradorSuperior(superior);
    }

    public String getDescricaoCargo() {
        return "Administrador de Rede";
    }
}
