package ProjetoChainOfResponsability;

import java.util.ArrayList;

public abstract class Administrador {

    protected ArrayList listaRecursos = new ArrayList();
    private Administrador administradorSuperior;

    public Administrador getAdministradorSuperior() {
        return administradorSuperior;
    }

    public void setAdministradorSuperior(Administrador administradorSuperior) {
        this.administradorSuperior = administradorSuperior;
    }

    public abstract String getDescricaoCargo();

    public String aprovarAcesso(RequisicaoAcesso requisicao) {
        if (listaRecursos.contains(requisicao.getTipoRecurso())) {
            return getDescricaoCargo();
        } else {
            if (administradorSuperior != null) {
                return administradorSuperior.aprovarAcesso(requisicao);
            } else {
                return "Acesso não autorizado";
            }
        }
    }
}
