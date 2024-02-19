import java.util.Scanner;
import java.util.HashMap;
public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        HashMap<String, Personagem> personagens = LeitorArquivo.lerPersonagens();
        HashMap<String, Capitulo> capitulos = LeitorArquivo.lerCapitulos(personagens, scanner);
        LeitorArquivo.lerEscolhasCapitulo(capitulos);
        
        Capitulo raiz = capitulos.get("cap1");

        raiz.executar();

        scanner.close();
    }
}