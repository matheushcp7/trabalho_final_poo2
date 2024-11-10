public abstract class VagaDecorator extends Vaga {
    protected Vaga vaga;

    public VagaDecorator(Vaga vaga) {
        super(vaga.getDescricao(), vaga.getEmpresa());
        this.vaga = vaga;
    }

    public abstract void adicionarBeneficio();
}
