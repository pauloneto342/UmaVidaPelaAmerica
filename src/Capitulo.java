import java.util.Scanner;

public class Capitulo {
        String nome;
        String texto;
        String escolha1;
        String escolha2;
        Personagem personagem;
        int alteracaoSatisfacao;
        Scanner escaneador;

        public Capitulo(String nome, String texto, String escolha1, String escolha2, Personagem personagem, int alteracaoSatisfacao, Scanner escaneador) {
            this.nome = nome;
            this.texto = texto;
            this.escolha1 = escolha1;
            this.escolha2 = escolha2;
            this.personagem = personagem;
            this.alteracaoSatisfacao = alteracaoSatisfacao;
            this.escaneador = escaneador;
        }

        public void mostrar() {
            System.out.println(nome + "\n" + texto);
            System.out.println("Escolhas:");
            System.out.println("1 - " + escolha1);
            System.out.println("2 - " + escolha2);
        }

        public int escolher() {
            int escolha = 0;
            while (escolha != 1 && escolha != 2) {
                System.out.print("Escolha 1 ou 2: ");
                escolha = escaneador.nextInt();
                escaneador.nextLine(); 
            }
            return escolha;
        }
    }

    