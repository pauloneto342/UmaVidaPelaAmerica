import java.util.Scanner;

public class App {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Personagem ana = new Personagem("Ana", 50);
        Personagem anderson = new Personagem("Anderson", 50);

        Capitulo cap1 = new Capitulo("Capítulo 1", "Bem-vindo à história de Ana e Anderson, um casal que pretende viver por toda a América. "
                + "Aqui você deverá decidir o destino inicial dessa aventura.", "Ana e Anderson decidem economizar e pegar uma VW Kombi 1986 que precisa de uma reforma.",
                "Ana e Anderson optam por um veículo mais novo para evitar problemas durante a viagem.", ana, 50, scanner);

        Capitulo cap2 = new Capitulo("Capítulo 2", "Eles encontraram uma Kombi que estava abandonada em um terreno, apesar de estar precisando urgentemente de uma revisão, aquele carro era o complemento para tornar toda sua aventura viável.",
                "Decidiram então ir para casa, lá poderiam analisar com mais calma onde poderiam mandar o carro para uma reforma.",
                "Decidiram então levar o carro à oficina mais próxima, antes que ele parasse de funcionar no meio da rua.", ana, 0, scanner);

        Capitulo cap3 = new Capitulo("Capítulo 3", "Tentar trazer um carro que estava parado por anos rodando até sua casa não foi uma boa ideia, o carro quebrou e fez com que gastassem mais com um guincho, trazendo gastos que não estavam planejados para aquele momento.",
                null, null, anderson, -30, scanner);

        Capitulo cap4 = new Capitulo("Capítulo 4", "Levar o carro imediatamente à oficina foi a melhor escolha que fizeram, visto que logo após a revisão o carro poderia chegar em casa em segurança, sem trazer novos custos não planejados e que assim possam iniciar sua aventura.",
                null, null, anderson, 20, scanner);

        Capitulo final1 = new Capitulo("Final 1", "Devido ao alto custo de um veículo mais novo, Ana e Anderson não conseguiram custear a montagem do motorhome!",
                null, null, ana, -50, scanner);

        Capitulo final2 = new Capitulo("Final 2", "A2 aventura de Ana e Anderson está prestes a começar. Eles partiram em sua Kombi reformada, cheios de entusiasmo e determinação.",
                null, null, ana, 10, scanner);

        // Início da história interativa
        cap1.mostrar();
        int escolhaCap1 = escolherOpcao(scanner);

        ana.diminuirSatisfacao(cap1.alteracaoSatisfacao); 
        System.out.println("Nível de satisfação de Ana: " + ana.nivelSatisfacao);
        System.out.println("Nível de satisfação de Anderson: " + anderson.nivelSatisfacao);

        if (escolhaCap1 == 1) {
            cap2.mostrar();
            int escolhaCap2 = escolherOpcao(scanner);

            ana.diminuirSatisfacao(cap2.alteracaoSatisfacao); 
            System.out.println("Nível de satisfação de Ana: " + ana.nivelSatisfacao);
            System.out.println("Nível de satisfação de Anderson: " + anderson.nivelSatisfacao);

            if (escolhaCap2 == 1) {
                cap3.mostrar();
                int escolhaCap3 = escolherOpcao(scanner);

                anderson.diminuirSatisfacao(cap3.alteracaoSatisfacao); 
                System.out.println("Nível de satisfação de Ana: " + ana.nivelSatisfacao);
                System.out.println("Nível de satisfação de Anderson: " + anderson.nivelSatisfacao);

                if (escolhaCap3 == 1) {
                    final1.mostrar();
                } else {
                    cap4.mostrar();
                    int escolhaCap4 = escolherOpcao(scanner);

                    anderson.diminuirSatisfacao(cap4.alteracaoSatisfacao); 
                    System.out.println("Nível de satisfação de Ana: " + ana.nivelSatisfacao);
                    System.out.println("Nível de satisfação de Anderson: " + anderson.nivelSatisfacao);

                    if (escolhaCap4 == 1) {
                        final2.mostrar();
                    }
                }
            }
        }

        // Fechar o scanner
        scanner.close();
    }

    public static int escolherOpcao(Scanner scanner) {
        int escolha = 0;
        while (escolha != 1 && escolha != 2) {
            System.out.print("Escolha 1 ou 2: ");
            escolha = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer
        }
        return escolha;
    }
}
