package ProjetoChainOfResponsability;

public class TipoRecursoRede implements TipoRecurso {

    private static TipoRecursoRede tipoRecursoRede = new TipoRecursoRede();

    private TipoRecursoRede() {};

    public static TipoRecursoRede getTipoRecursoRede() {
        return tipoRecursoRede;
    }
}
