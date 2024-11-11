class Candidato {
    private String nome;
    private String cpf;
    private int anosExperiencia;
    private String formacao;

    public Candidato(String nome, String cpf, int anosExperiencia) {
        this.nome = nome;
        this.cpf = cpf;
        this.anosExperiencia = 0; // inicializando com 0 anos de experiência
        this.formacao = "Indefinido"; //padrão
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public int getAnosExperiencia() {
        return this.anosExperiencia;
     }

     public void setAnosExperiencia(int anosExperiencia) {
        this.anosExperiencia = anosExperiencia;
     }

     public String getFormacao() {
        return this.formacao;
     }
  
     public void setFormacao(String formacao) {
        this.formacao = formacao;
     }
}
