public class ValeAlimentacaoDecorator extends VagaDecorator {

    public ValeAlimentacaoDecorator(Vaga vaga) {
        super(vaga);
    }

    @Override
    public void adicionarBeneficio() {
        vaga.adicionarBeneficio("Vale Alimentação");
    }
}
