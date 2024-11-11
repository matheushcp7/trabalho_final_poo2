public class SelecaoPorFormacao implements EstrategiaSelecao {

    private String nivelFormacao;

    public SelecaoPorFormacao(String nivelFormacao) {
        this.nivelFormacao = nivelFormacao;
    }

    @Override
    public boolean selecionarCandidato(Candidato candidato) {
        String formacaoCandidato = obterFormacaoDoCandidato(candidato);
        return formacaoCandidato.equalsIgnoreCase(nivelFormacao);
    }

    private String obterFormacaoDoCandidato(Candidato candidato) {
        return candidato.getFormacao(); // obtém a formação real do candidato
    }
}
