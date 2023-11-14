import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Personagem ana = new Personagem("Ana", 50);
        Personagem anderson = new Personagem("Anderson", 50);

        String[] escolhasCap1 = {"Ana e Anderson necessitam de um veículo, logo decidem economizar e pegar uma Vw Kombi 1986 que estava precisando de uma bela reforma.",
                                 "Ana e Anderson necessitam de um veículo, logo optam por um veículo mais novo, para que não tenham dor de cabeça durante sua aventura."};

        String[] escolhasCap2 = {"Decidiram então ir para casa, lá poderiam analisar com mais calma onde poderiam mandar o carro para uma reforma.",
                                "Decidiram então levar o carro à oficina mais próxima, antes que ele parasse de funcionar no meio da rua."};

        String[] escolhasCap3 = {"...", "..."};
        String[] escolhasCap4 = {"...", "..."};
        String[] escolhasFinal1 = {"..."};

        Capitulo cap1 = new Capitulo("Capítulo 1", "Bem-vindo à história de Ana e Anderson, um casal que pretende viver por toda a América. "
                + "Aqui você deverá decidir o destino inicial dessa aventura.", escolhasCap1, ana, -20, anderson, -10, scanner);

        Capitulo cap2 = new Capitulo("Capítulo 2", "Eles encontraram uma Kombi que estava abandonada em um terreno, apesar de estar precisando urgentemente de uma revisão, aquele carro era o complemento para tornar toda sua aventura viável.",
                escolhasCap2, ana, 0, anderson, -5, scanner);

        Capitulo cap3 = new Capitulo("Capítulo 3", "Tentar trazer um carro que estava parado por anos rodando até sua casa não foi uma boa ideia, o carro quebrou e fez com que gastassem mais com um guincho, trazendo gastos que não estavam planejados para aquele momento.",
                escolhasCap3, anderson, -30, ana, -10, scanner);

        Capitulo cap4 = new Capitulo("Capítulo 4", "Levar o carro imediatamente à oficina foi a melhor escolha que fizeram, visto que logo após a revisão o carro poderia chegar em casa em segurança, sem trazer novos custos não planejados e que assim possam iniciar sua aventura.",
                escolhasCap4, anderson, 20, ana, 10, scanner);

        Capitulo final1 = new Capitulo("Final 1", "Devido ao alto custo de um veículo mais novo, Ana e Anderson não conseguiram custear a montagem do motorhome!",
                escolhasFinal1, ana, -50, anderson, -30, scanner);

        cap1.mostrar();
        int escolhaCap1 = cap1.escolher();
        ana.modificarSatisfacao(cap1.getSatisfacaoChangeAna());
        anderson.modificarSatisfacao(cap1.getSatisfacaoChangeAnderson());
        System.out.println(ana.nome + ": Nível de satisfação: " + ana.satisfacao);
        System.out.println(anderson.nome + ": Nível de satisfação: " + anderson.satisfacao);

        if (escolhaCap1 == 0) {
            cap2.mostrar();
            int escolhaCap2 = cap2.escolher();
            ana.modificarSatisfacao(cap2.getSatisfacaoChangeAna());
            anderson.modificarSatisfacao(cap2.getSatisfacaoChangeAnderson());
            System.out.println(ana.nome + ": Nível de satisfação: " + ana.satisfacao);
            System.out.println(anderson.nome + ": Nível de satisfação: " + anderson.satisfacao);

            if (escolhaCap2 == 0) {
                cap3.mostrar();
                int escolhaCap3 = cap3.escolher();
                ana.modificarSatisfacao(cap3.getSatisfacaoChangeAna());
                anderson.modificarSatisfacao(cap3.getSatisfacaoChangeAnderson());
                System.out.println(ana.nome + ": Nível de satisfação: " + ana.satisfacao);
                System.out.println(anderson.nome + ": Nível de satisfação: " + anderson.satisfacao);

                if (escolhaCap3 == 0) {
                    System.out.println("Fim da história. " + ana.nome + " ficou com baixo nível de satisfação e a aventura acabou.");
                } else {
                    cap4.mostrar();
                    int escolhaCap4 = cap4.escolher();
                    ana.modificarSatisfacao(cap4.getSatisfacaoChangeAna());
                    anderson.modificarSatisfacao(cap4.getSatisfacaoChangeAnderson());
                    System.out.println(ana.nome + ": Nível de satisfação: " + ana.satisfacao);
                    System.out.println(anderson.nome + ": Nível de satisfação: " + anderson.satisfacao);

                    if (escolhaCap4 == 0) {
                        System.out.println("Fim da história. " + anderson.nome + " decidiu levar o carro à oficina e a aventura continua.");
                    } else {
                        System.out.println("Fim da história. " + anderson.nome + " ficou com baixo nível de satisfação e a aventura acabou.");
                    }
                }
            }
        } else {
            final1.mostrar();
            ana.modificarSatisfacao(final1.getSatisfacaoChangeAna());
            anderson.modificarSatisfacao(final1.getSatisfacaoChangeAnderson());
            System.out.println(ana.nome + ": Nível de satisfação: " + ana.satisfacao);
            System.out.println(anderson.nome + ": Nível de satisfação: " + anderson.satisfacao);
            System.out.println("Fim da história. " + ana.nome + " ficou com baixo nível de satisfação e a aventura acabou.");
        }

        scanner.close();
    }
}