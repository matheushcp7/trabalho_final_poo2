public class Main {
    public static void main(String[] args) {
        // Criando a empresa
        Empresa empresa = new Empresa("Tech Solutions");
        
        // Criando o candidato
        Candidato candidato = CandidatoFabrica.criarCandidato("João Silva", "123.456.789-00");
        
        // Criando a vaga
        Vaga vaga = new Vaga("Desenvolvedor de Software", empresa);

        // Criando o observador (VagaCandidato)
        VagaCandidato vagaCandidato = new VagaCandidato(vaga, candidato);
        vaga.adicionarObservador(vagaCandidato); // Registrando o candidato como observador da vaga

        // Decorando a vaga com benefícios
        ValeAlimentacaoDecorator valeAlimentacao = new ValeAlimentacaoDecorator(vaga);
        valeAlimentacao.adicionarBeneficio();
        ValeTransporteDecorator valeTransporte = new ValeTransporteDecorator(vaga);
        valeTransporte.adicionarBeneficio();
        PlanoSaudeDecorator planoSaude = new PlanoSaudeDecorator(vaga);
        planoSaude.adicionarBeneficio();

        // Adicionando benefícios à vaga e notificando os observadores
         // Vai chamar notificarObservadores() automaticamente
          // Vai chamar notificarObservadores() automaticamente
              // Vai chamar notificarObservadogitres() automaticamente

        // Mostrando a descrição da vaga, a empresa e os benefícios
        System.out.println("\nVaga: " + vagaCandidato.getVaga().getDescricao());
        System.out.println("Empresa: " + vagaCandidato.getVaga().getEmpresa().getNome());
        System.out.println("Candidato: " + vagaCandidato.getCandidato().getNome());
        System.out.println(vaga.mostrarBeneficios());
    }
}
