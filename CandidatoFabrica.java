class CandidatoFabrica {
    public static Candidato criarCandidato(String nome, String cpf, int anosExperiencia) {
        return new Candidato(nome, cpf, anosExperiencia);
    }
}