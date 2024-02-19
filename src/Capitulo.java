import java.util.Scanner;
import java.util.ArrayList;

class Capitulo {

    private String titulo;
    private String descricao;
    private ArrayList<Escolha> escolhas;
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
        this.escolhas = new ArrayList<Escolha>();
    }

    void adicionarEscolhas(Escolha escolha) {
        this.escolhas.add(escolha);
    }

    protected void mostrar() {
        System.out.println(titulo);
        System.out.println(descricao);
        
        try{
        	for (int i = 0; i < escolhas.size(); i++) {
                System.out.println("Escolha " + (i + 1) + ": " + escolhas.get(i).getTexto());
        	}
        
        }catch (Exception e)
        {
        	System.out.println("Nenhuma escolha adicionada ao capitulo ");
        }
        	
    }
        
    private int escolher() {
        int escolha = scanner.nextInt();
        return escolha - 1;
    }

    @SuppressWarnings("unused")
    private int getSatisfacaoChangeAna() {
        return satisfacaoChangeAna;
    }

    @SuppressWarnings("unused")
    private int getSatisfacaoChangeAnderson() {
        return satisfacaoChangeAnderson;
    }

    public void executar() {
        mostrar();
        int escolha = escolher();
        
        if (escolha >= 0 && escolha < escolhas.size()) {
            Escolha escolhaSelecionada = escolhas.get(escolha);
            escolhaSelecionada.getProximo().executar();
            
            System.out.println("Satisfação de " + personagemAna.getNome() + ": " + personagemAna.getSatisfacao());
            System.out.println("Satisfação de " + personagemAnderson.getNome() + ": " + personagemAnderson.getSatisfacao());
        } else {
            System.out.println("Escolha inválida. Tente novamente.");
            executar();
        }
    }
}