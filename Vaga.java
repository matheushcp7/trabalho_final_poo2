import java.util.ArrayList;
import java.util.List;

public class Vaga {
    private String descricao;
    private Empresa empresa;
    private List<String> beneficios = new ArrayList<>();
    private List<VagaCandidato> observadores = new ArrayList<>();
    private EstrategiaSelecao estrategiaSelecao;

    public Vaga(String descricao, Empresa empresa) {
        this.descricao = descricao;
        this.empresa = empresa;
    }

    public String getDescricao() {
        return descricao;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void adicionarBeneficio(String beneficio) {
        beneficios.add(beneficio);
        notificarObservadores();
    }

    public String mostrarBeneficios() {
        return "Benefícios: " + String.join(", ", beneficios);
    }

    public void adicionarObservador(VagaCandidato candidato) {
        observadores.add(candidato);
    }

    public void removerObservador(VagaCandidato candidato) {
        observadores.remove(candidato);
    }

    public void notificarObservadores() {
        for (VagaCandidato observador : observadores) {
            observador.atualizar();
        }
    }
    public void setEstrategiaSelecao(EstrategiaSelecao estrategia) {
        this.estrategiaSelecao = estrategia;
    }
    //método para aplicar a estratégia de seleção a um candidato
    public boolean selecionarCandidato(Candidato candidato) {
        if (estrategiaSelecao == null) {
            throw new IllegalStateException("Nenhuma estratégia de seleção definida.");
        }
        return estrategiaSelecao.selecionarCandidato(candidato);
    }
}
