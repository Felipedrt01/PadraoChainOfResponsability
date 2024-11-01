package ProjetoChainOfResponsability;

public class RequisicaoAcesso {

    private TipoRecurso tipoRecurso;

    public RequisicaoAcesso(TipoRecurso tipoRecurso) {
        this.tipoRecurso = tipoRecurso;
    }

    public TipoRecurso getTipoRecurso() {
        return tipoRecurso;
    }

    public void setTipoRecurso(TipoRecurso tipoRecurso) {
        this.tipoRecurso = tipoRecurso;
    }
}
