public class ValeTransporteDecorator extends VagaDecorator {

    public ValeTransporteDecorator(Vaga vaga) {
        super(vaga);
    }

    @Override
    public void adicionarBeneficio() {
        vaga.adicionarBeneficio("Vale Transporte");
    }
}
