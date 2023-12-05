import java.util.Scanner;
public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Personagem ana = new Personagem("Ana", 50);
        Personagem anderson = new Personagem("Anderson", 50);

        Capitulo cap1 = new Capitulo("Capítulo 1", "Bem-vindo à história de Ana e Anderson, um casal que pretende viver por toda a América. "
                + "Aqui você deverá decidir o destino inicial dessa aventura.", ana, -20, anderson, -10, scanner);

        Capitulo cap2 = new Capitulo("Capítulo 2", "Eles encontraram uma Kombi que estava abandonada em um terreno, apesar de estar precisando urgentemente de uma revisão, aquele carro era o complemento para tornar toda sua aventura viável.",
                ana, 0, anderson, -5, scanner);

        Capitulo cap3 = new Capitulo("Capítulo 3", "Tentar trazer um carro que estava parado por anos rodando até sua casa não foi uma boa ideia, o carro quebrou e fez com que gastassem mais com um guincho, trazendo gastos que não estavam planejados para aquele momento.",
                anderson, -30, ana, -10, scanner);

        Capitulo cap4 = new Capitulo("Capítulo 4", "Levar o carro imediatamente à oficina foi a melhor escolha que fizeram, visto que logo após a revisão o carro poderia chegar em casa em segurança, sem trazer novos custos não planejados e que assim possam iniciar sua aventura.",
                anderson, 20, ana, 10, scanner);

        Capitulo final1 = new Capitulo("Final 1", "Devido ao alto custo de um veículo mais novo, Ana e Anderson não conseguiram custear a montagem do motorhome!",
                ana, -50, anderson, -30, scanner);

        Escolha[] escolhasCap1 = {
                new Escolha("Ana e Anderson necessitam de um veículo, logo decidem economizar e pegar uma Vw Kombi 1986 que estava precisando de uma bela reforma.", cap2),
                new Escolha("Ana e Anderson necessitam de um veículo, logo optam por um veículo mais novo, para que não tenham dor de cabeça durante sua aventura.", final1)
        };
        cap1.adicionarEscolhas(escolhasCap1);

        Escolha[] escolhasCap2 = {
                new Escolha("Decidiram então ir para casa, lá poderiam analisar com mais calma onde poderiam mandar o carro para uma reforma.", cap3),
                new Escolha("Decidiram então levar o carro à oficina mais próxima, antes que ele parasse de funcionar no meio da rua.", cap4)
        };
        cap2.adicionarEscolhas(escolhasCap2);

        Capitulo raiz = cap1;

        raiz.executar();

        scanner.close();
    }
}