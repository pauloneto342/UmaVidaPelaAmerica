
class Personagem {
    String nome;
    int satisfacao;

    public Personagem(String nome, int satisfacao) {
        this.nome = nome;
        this.satisfacao = satisfacao;
    }

    public void modificarSatisfacao(int delta) {
        satisfacao += delta;
    }
}