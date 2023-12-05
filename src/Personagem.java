class Personagem {
    private String nome;
    private int satisfacao;

    public Personagem(String nome, int satisfacao) {
        this.nome = nome;
        this.satisfacao = satisfacao;
    }

    private void modificarSatisfacao(int modificacao) {
        this.satisfacao += modificacao;
    }

    public String getNome() {
        return nome;
    }

    public int getSatisfacao() {
        return satisfacao;
    }

    public void setSatisfacao(int satisfacao) {
        if (satisfacao >= 0) {
            this.satisfacao = satisfacao;
        } else {
            System.out.println("A satisfação não pode ser negativa.");
        }
    }
}