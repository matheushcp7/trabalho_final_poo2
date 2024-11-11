public class SelecaoExperiencia implements EstrategiaSelecao{
        private int anosExperiencia;
    
        public SelecaoExperiencia(int anosExperiencia) {
            this.anosExperiencia = anosExperiencia;
        }
    
        @Override
        public boolean selecionarCandidato(Candidato candidato) {
            int experienciaCandidato = obterExperienciaDoCandidato(candidato);
            return experienciaCandidato >= anosExperiencia;
        }
    
        private int obterExperienciaDoCandidato(Candidato candidato) {
            return candidato.getAnosExperiencia(); // obtém a experiência real do candidato
        }
    }
    