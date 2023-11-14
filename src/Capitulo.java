import java.util.Scanner;

class Capitulo {
    String titulo;
    String descricao;
    String[] escolhas;
    Personagem personagemAna;
    int satisfacaoChangeAna;
    Personagem personagemAnderson;
    int satisfacaoChangeAnderson;
    Scanner scanner;

    public Capitulo(String titulo, String descricao, String[] escolhas, Personagem personagemAna, int satisfacaoChangeAna, Personagem personagemAnderson, int satisfacaoChangeAnderson, Scanner scanner) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.escolhas = escolhas;
        this.personagemAna = personagemAna;
        this.satisfacaoChangeAna = satisfacaoChangeAna;
        this.personagemAnderson = personagemAnderson;
        this.satisfacaoChangeAnderson = satisfacaoChangeAnderson;
        this.scanner = scanner;
    }

    public void mostrar() {
        System.out.println(titulo);
        System.out.println(descricao);
        
        
        for (int i = 0; i < escolhas.length; i++) {
            System.out.println("Escolha " + (i + 1) + ": " + escolhas[i]);
        }
    }

    public int escolher() {
        int escolha;
        
       
        do {
            System.out.print("Digite o número da sua escolha: ");
            escolha = scanner.nextInt();
        } while (escolha < 1 || escolha > escolhas.length);


        return escolha - 1;
    }

    public int getSatisfacaoChangeAna() {
        return satisfacaoChangeAna;
    }

    public int getSatisfacaoChangeAnderson() {
        return satisfacaoChangeAnderson;
    }
}
