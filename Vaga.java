import java.util.ArrayList;
import java.util.List;

public class Vaga {
    private String descricao;
    private Empresa empresa;
    private List<String> beneficios = new ArrayList<>();
    private List<VagaCandidato> observadores = new ArrayList<>();

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
    public String mostrarBeneficios() {
        return "Benefícios: " + String.join(", ", beneficios);
    }
}
