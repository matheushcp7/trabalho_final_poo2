class CandidatoFabrica {
    public static Candidato criarCandidato(String nome, String cpf) {
        return new Candidato(nome, cpf);
    }
}

