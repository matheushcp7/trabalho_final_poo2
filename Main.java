public class Main {
    public static void main(String[] args) {
        // Criando a empresa
        Empresa empresa1 = new Empresa("Tech Solutions", "123.456.789-99");
        
        // Criando o candidato
        Candidato candidato1 = CandidatoFabrica.criarCandidato("João Silva", "123.456.789-00", 5);//5 anos de experiencia
        candidato1.setFormacao("Graduação"); 
        Candidato candidato2 = CandidatoFabrica.criarCandidato("João Doria", "123.456.789-01", 10);//10 anos de experiencia
        candidato2.setFormacao("Ensino Médio"); 
        
        // Criando a vaga
        Vaga vaga1 = new Vaga("Desenvolvedor de Software", empresa1);
        Vaga vaga2 = new Vaga("Faxineira", empresa1);
        
         // Definindo a estratégia de seleção
         EstrategiaSelecao estrategiaExperiencia = new SelecaoExperiencia(3);
         vaga1.setEstrategiaSelecao(estrategiaExperiencia);
 
         // Verificando se o candidato atende à estratégia definida
         if (vaga1.selecionarCandidato(candidato1)) {
             System.out.println("O candidato " + candidato1.getNome() + " atende aos requisitos da vaga.");
         } else {
             System.out.println("O candidato " + candidato1.getNome() + " não atende aos requisitos da vaga.");
         }
          // Verificando o segundo candidato
        if (vaga1.selecionarCandidato(candidato2)) {
            System.out.println("O candidato " + candidato2.getNome() + " atende aos requisitos da vaga.");
        } else {
            System.out.println("O candidato " + candidato2.getNome() + " não atende aos requisitos da vaga.");
        }

        // Definindo a estratégia de seleção por formação para vaga2
        EstrategiaSelecao estrategiaFormacao = new SelecaoPorFormacao("Graduação");
        vaga2.setEstrategiaSelecao(estrategiaFormacao);

        // Verificando se o candidato atende aos requisitos de formação para vaga2
        if (vaga2.selecionarCandidato(candidato1)) {
            System.out.println("O candidato " + candidato1.getNome() + " atende aos requisitos de formação da vaga.");
        } else {
            System.out.println("O candidato " + candidato1.getNome() + " não atende aos requisitos de formação da vaga.");
        }

        // Verificando o segundo candidato para vaga2
        if (vaga2.selecionarCandidato(candidato2)) {
            System.out.println("O candidato " + candidato2.getNome() + " atende aos requisitos de formação da vaga.");
        } else {
            System.out.println("O candidato " + candidato2.getNome() + " não atende aos requisitos de formação da vaga.");
        }
    
        // Criando o observador (VagaCandidato)
        VagaCandidato vagaCandidato1 = new VagaCandidato(vaga1, candidato1);
        vaga1.adicionarObservador(vagaCandidato1); 
        
        VagaCandidato vagaCandidato2 = new VagaCandidato(vaga2, candidato2);
        vaga2.adicionarObservador(vagaCandidato2);
        
        BeneficioFacade beneficios = new BeneficioFacade(vaga2);
        beneficios.adicionarTodos();

        // Decorando a vaga com benefícios
        ValeAlimentacaoDecorator valeAlimentacao = new ValeAlimentacaoDecorator(vaga1);
        valeAlimentacao.adicionarBeneficio();
        ValeTransporteDecorator valeTransporte = new ValeTransporteDecorator(vaga1);
        valeTransporte.adicionarBeneficio();
        PlanoSaudeDecorator planoSaude = new PlanoSaudeDecorator(vaga1);
        planoSaude.adicionarBeneficio();
    }
}
