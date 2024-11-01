package ProjetoChainOfResponsability;

public class TipoRecursoBancoDados implements TipoRecurso {

    private static TipoRecursoBancoDados tipoRecursoBancoDados = new TipoRecursoBancoDados();

    private TipoRecursoBancoDados() {};

    public static TipoRecursoBancoDados getTipoRecursoBancoDados() {
        return tipoRecursoBancoDados;
    }
}
