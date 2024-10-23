package ProjetoChainOfResponsability;

public class TipoSuporteBasico implements TipoSuporte {

    private static TipoSuporteBasico tipoSuporteBasico = new TipoSuporteBasico();

    private TipoSuporteBasico() {}

    public static TipoSuporteBasico getTipoSuporteBasico() {
        return tipoSuporteBasico;
    }
}
