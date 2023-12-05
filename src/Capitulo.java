import java.util.Scanner;

class Capitulo {

    private String titulo;
    private String descricao;
    private Escolha[] escolhas;
    private Personagem personagemAna;
    private int satisfacaoChangeAna;
    private Personagem personagemAnderson;
    private int satisfacaoChangeAnderson;
    private Scanner scanner;

    public Capitulo(String titulo, String descricao, Personagem personagemAna, int satisfacaoChangeAna, Personagem personagemAnderson, int satisfacaoChangeAnderson, Scanner scanner) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.personagemAna = personagemAna;
        this.satisfacaoChangeAna = satisfacaoChangeAna;
        this.personagemAnderson = personagemAnderson;
        this.satisfacaoChangeAnderson = satisfacaoChangeAnderson;
        this.scanner = scanner;
    }

    void adicionarEscolhas(Escolha[] escolhas) {
        this.escolhas = escolhas;
    }

    private void mostrar() {
        System.out.println(titulo);
        System.out.println(descricao);
        for (int i = 0; i < escolhas.length; i++) {
            System.out.println("Escolha " + (i + 1) + ": " + escolhas[i].getTexto());
        }
    }

    private int escolher() {
        int escolha = scanner.nextInt();
        return escolha - 1;
    }

    private int getSatisfacaoChangeAna() {
        return satisfacaoChangeAna;
    }

    private int getSatisfacaoChangeAnderson() {
        return satisfacaoChangeAnderson;
    }

    public void executar() {
        mostrar();
        int escolha = escolher();
        
        if (escolha >= 0 && escolha < escolhas.length) {
            Escolha escolhaSelecionada = escolhas[escolha];
            escolhaSelecionada.getProximo().executar();
            
           
            System.out.println("Satisfação de " + personagemAna.getNome() + ": " + personagemAna.getSatisfacao());
            System.out.println("Satisfação de " + personagemAnderson.getNome() + ": " + personagemAnderson.getSatisfacao());
        } else {
            System.out.println("Escolha inválida. Tente novamente.");
            executar();
        }
    }
}