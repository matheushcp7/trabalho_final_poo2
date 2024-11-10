public class BeneficioFacade {
    private Vaga vaga;

    public BeneficioFacade(Vaga vaga) {
        this.vaga = vaga;
    }

    public void adicionarTodos() {
        ValeAlimentacaoDecorator valeAlimentacao = new ValeAlimentacaoDecorator(vaga);
        valeAlimentacao.adicionarBeneficio();
        
        ValeTransporteDecorator valeTransporte = new ValeTransporteDecorator(vaga);
        valeTransporte.adicionarBeneficio();
        
        PlanoSaudeDecorator planoSaude = new PlanoSaudeDecorator(vaga);
        planoSaude.adicionarBeneficio();
    }
}
