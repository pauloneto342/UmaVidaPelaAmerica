public class Personagem {
        String nome;
        int nivelSatisfacao;

        public Personagem(String nome, int nivelSatisfacao) {
            this.nome = nome;
            this.nivelSatisfacao = nivelSatisfacao;
        }

        public void aumentarSatisfacao(int quantidade) {
            nivelSatisfacao += quantidade;
            if (nivelSatisfacao > 100) {
                nivelSatisfacao = 100; 
            }
        }

        public void diminuirSatisfacao(int quantidade) {
            nivelSatisfacao -= quantidade;
            if (nivelSatisfacao < 0) {
                nivelSatisfacao = 0;
            }
        }
    }