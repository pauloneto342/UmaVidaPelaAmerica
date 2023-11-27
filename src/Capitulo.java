import java.util.Scanner;
class Capitulo {
    
    String titulo;
    String descricao;
    Escolha[] escolhas;
    Personagem personagemAna;
    int satisfacaoChangeAna;
    Personagem personagemAnderson;
    int satisfacaoChangeAnderson;
    Scanner scanner;

    public Capitulo(String titulo, String descricao, Personagem personagemAna, int satisfacaoChangeAna, Personagem personagemAnderson, int satisfacaoChangeAnderson, Scanner scanner) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.personagemAna = personagemAna;
        this.satisfacaoChangeAna = satisfacaoChangeAna;
        this.personagemAnderson = personagemAnderson;
        this.satisfacaoChangeAnderson = satisfacaoChangeAnderson;
        this.scanner = scanner;
    }

    public void adicionarEscolhas(Escolha[] escolhas) {
        this.escolhas = escolhas;
    }

    public void mostrar() {
        System.out.println(titulo);
        System.out.println(descricao);
        for (int i = 0; i < escolhas.length; i++) {
            System.out.println("Escolha " + (i + 1) + ": " + escolhas[i].texto);
        }
    }

    public int escolher() {
        int escolha = scanner.nextInt();
        return escolha - 1;
    }

    public int getSatisfacaoChangeAna() {
        return satisfacaoChangeAna;
    }

    public int getSatisfacaoChangeAnderson() {
        return satisfacaoChangeAnderson;
    }

    public void executar() {
        mostrar();
        int escolha = escolher();
        Escolha escolhaSelecionada = escolhas[escolha];
        escolhaSelecionada.proximo.executar();
    }
}