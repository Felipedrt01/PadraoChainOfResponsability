package ProjetoChainOfResponsability;

public class TipoRecursoServidor implements TipoRecurso {

    private static TipoRecursoServidor tipoRecursoServidor = new TipoRecursoServidor();

    private TipoRecursoServidor() {};

    public static TipoRecursoServidor getTipoRecursoServidor() {
        return tipoRecursoServidor;
    }
}
