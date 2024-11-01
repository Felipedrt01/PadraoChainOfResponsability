package ProjetoChainOfResponsability;

public class AdministradorServidor extends Administrador {

    public AdministradorServidor(Administrador superior) {
        listaRecursos.add(TipoRecursoServidor.getTipoRecursoServidor());
        setAdministradorSuperior(superior);
    }

    public String getDescricaoCargo() {
        return "Administrador de Servidores";
    }
}
