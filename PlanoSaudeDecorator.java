public class PlanoSaudeDecorator extends VagaDecorator {

    public PlanoSaudeDecorator(Vaga vaga) {
        super(vaga);
    }

    @Override
    public void adicionarBeneficio() {
        vaga.adicionarBeneficio("Plano de Saúde");
    }
}
