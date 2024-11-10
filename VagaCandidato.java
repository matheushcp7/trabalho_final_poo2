public class VagaCandidato {
    private Vaga vaga;
    private Candidato candidato;

    public VagaCandidato(Vaga vaga, Candidato candidato) {
        this.vaga = vaga;
        this.candidato = candidato;
    }

    public Vaga getVaga() {
        return vaga;
    }

    public Candidato getCandidato() {
        return candidato;
    }

    public void atualizar() {
        System.out.println("O candidato " + candidato.getNome() + " foi avisado que a vaga '" 
                + vaga.getDescricao() + "' foi alterada.\nNovos dados:\n" 
                + "Descrição: " + vaga.getDescricao() 
                + "\nEmpresa: " + vaga.getEmpresa().getNome() 
                + "\n" + vaga.mostrarBeneficios());
    }
}
