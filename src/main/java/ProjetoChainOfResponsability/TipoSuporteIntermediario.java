package ProjetoChainOfResponsability;

public class TipoSuporteIntermediario implements TipoSuporte {

    private static TipoSuporteIntermediario tipoSuporteIntermediario = new TipoSuporteIntermediario();

    private TipoSuporteIntermediario() {}

    public static TipoSuporteIntermediario getTipoSuporteIntermediario() {
        return tipoSuporteIntermediario;
    }
}
