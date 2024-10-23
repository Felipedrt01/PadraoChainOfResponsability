package ProjetoChainOfResponsability;

public class TipoSuporteAvancado implements TipoSuporte {

    private static TipoSuporteAvancado tipoSuporteAvancado = new TipoSuporteAvancado();

    private TipoSuporteAvancado() {}

    public static TipoSuporteAvancado getTipoSuporteAvancado() {
        return tipoSuporteAvancado;
    }
}
