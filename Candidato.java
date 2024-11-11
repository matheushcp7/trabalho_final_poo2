class Candidato {
    private String nome;
    private String cpf;
    private int anosExperiencia;

    public Candidato(String nome, String cpf, int anosExperiencia) {
        this.nome = nome;
        this.cpf = cpf;
        this.anosExperiencia = 0; // inicializando com 0 anos de experiência
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
}
