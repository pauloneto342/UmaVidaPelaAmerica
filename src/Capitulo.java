import java.util.Scanner;

class Capitulo {
    String titulo;
    String descricao;
    String opcao1;
    String opcao2;
    Personagem personagemAna;
    int satisfacaoChangeAna;
    Personagem personagemAnderson;
    int satisfacaoChangeAnderson;
    Scanner scanner;

    public Capitulo(String titulo, String descricao, String opcao1, String opcao2, Personagem personagemAna, int satisfacaoChangeAna, Personagem personagemAnderson, int satisfacaoChangeAnderson, Scanner scanner) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.opcao1 = opcao1;
        this.opcao2 = opcao2;
        this.personagemAna = personagemAna;
        this.satisfacaoChangeAna = satisfacaoChangeAna;
        this.personagemAnderson = personagemAnderson;
        this.satisfacaoChangeAnderson = satisfacaoChangeAnderson;
        this.scanner = scanner;
    }

    public void mostrar() {
        System.out.println(titulo);
        System.out.println(descricao);
        System.out.println("Escolha 1: " + opcao1);
        System.out.println("Escolha 2: " + opcao2);
    }

    public int escolher() {
        int escolha = scanner.nextInt();
        return escolha;
    }

    public int getSatisfacaoChangeAna() {
        return satisfacaoChangeAna;
    }

    public int getSatisfacaoChangeAnderson() {
        return satisfacaoChangeAnderson;
    }
}