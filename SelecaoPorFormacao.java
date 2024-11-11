public class SelecaoPorFormacao implements EstrategiaSelecao{

    private String nivelFormacao;

    public SelecaoPorFormacao(String nivelFormacao) {
        this.nivelFormacao = nivelFormacao;
    }

    @Override
    public boolean selecionarCandidato(Candidato candidato) {
        // Lógica simulada: Supomos que o candidato tenha um campo "formacao"
        String formacaoCandidato = obterFormacaoDoCandidato(candidato);
        return formacaoCandidato.equalsIgnoreCase(nivelFormacao);
    }

    private String obterFormacaoDoCandidato(Candidato candidato) {
        // Função simulada. Adapte conforme necessário.
        return "Graduação"; // Exemplo fixo para fins de demonstração
    }
}
