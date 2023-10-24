import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        String cap1 = "Bem vindo a historia de Ana e Anderson,um casal que pretende viver por toda américa,aqui você deverá decidir o destino inicial dessa aventura.";
        String esc1cap1 = "1 - Ana e Anderson necessitam de um veiculo,logo decidem economizar e pegar uma Vw Kombi 1986 que estava precisando de uma bela reforma";
        String esc2cap1 = "2 - Ana e Anderson necessitam de um veiculo,logo optam por um veiculo mais novo,para que não tenham dor de cabeça durante sua aventura.";

        System.out.println(cap1);
        System.out.println("Qual das opções eles devem optar: ");
        System.out.println(esc1cap1);
        System.out.println(esc2cap1);
        int EscUser = scanner.nextInt();

        if (EscUser == 1) {
            System.out.println(
                    "Eles encontraram uma Kombi que estava abandonada em um terreno,apesar de está precisando urgentemente de uma revisão,aquele carro era o complemento para tornar toda sua aventura viável");
            String cap2 = "Ao comprar a kombi,já notaram diversos problemas mecânicos e estruturais,onde havia inclusive um buraco no assoalho do carro";
            System.out.println("Qual das opções eles devem optar: ");
            String esc1cap2 = "1 - Decidiram então ir para casa,lá poderiam analisar com mais calma onde poderiam mandar o carro para uma reforma.";
            String esc2cap2 = "2 - Decidiram então levar o carro à oficina mais próxima,antes que ele parasse de funcionar no meio da rua.";
            System.out.println(cap2);
            System.out.println(esc1cap2);
            System.out.println(esc2cap2);
            EscUser = scanner.nextInt();

            if (EscUser == 1) {
                System.out.println(
                        "Tentar trazer um carro que estava parado por anos rodando até sua casa não foi uma boa ideia,o carro quebrou e fez com que gastasse mais com um guincho,trazendo gastos que não estavam planejados para aquele momento.");
            }

            else if (EscUser == 2) {
                System.out.println(
                        "Levar o carro imediatamente a uma oficina foi a melhor escolha que fizeram,visto que logo após a revisão o carro poderia chegar em casa em segurança,sem trazer novos custos não planejados e que assim possam iniciar usa aventura.");
            }

        } else if (EscUser == 2) {
            System.out.println(
                    "Devido ao alto custo de um veiculo mais novo,Ana e Anderson não consguirão custear a montagem do motorhome!");
            System.out.println("O que levaria a o fim tão precoce dessa história.");

        }
        scanner.close();
    }

}
