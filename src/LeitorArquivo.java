
import java.util.HashMap;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LeitorArquivo {

	public static HashMap<String, Personagem> lerPersonagens(){
		
		HashMap<String, Personagem> personagens = new HashMap<String, Personagem>();
		File arquivo = new File("rsc/content/personagens.txt");
		
		Scanner leitor;
		try {
			leitor = new Scanner(arquivo);
			
			while (leitor.hasNextLine())
			{
				String linha = leitor.nextLine();
				if (linha.equalsIgnoreCase("PERSONAGEM")) {
					Personagem personagem = lerPersonagem(leitor);
					personagens.put(personagem.getNome(), personagem);
				}
			}
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		
		return personagens;
	}

	private static Personagem lerPersonagem(Scanner leitor)
	{
		String nome = leitor.nextLine();
		int satisfacao = Integer.parseInt(leitor.nextLine());
		Personagem personagem = new Personagem (nome, satisfacao);
		return personagem;
	}

	public static HashMap<String, Capitulo> lerCapitulos(HashMap<String, Personagem> personagens, Scanner escaneador){
		
		HashMap<String, Capitulo> capitulos = new HashMap <String, Capitulo>();
		
		File arquivoCapitulo = new File("rsc/content/capitulos.txt");
		
		try {
			Scanner leitor = new Scanner(arquivoCapitulo);
			
			while (leitor.hasNextLine())
			{
				String linha = leitor.nextLine();
				if (linha.equalsIgnoreCase("CAPITULO"))
				{
					String capituloKey = leitor.nextLine();
					Capitulo capitulo = lerCapitulo(leitor, personagens, escaneador);
					capitulos.put(capituloKey, capitulo);
				}
				else if(linha.equalsIgnoreCase("CAPITULO_IMAGEM"))
				{
					String capituloKey = leitor.nextLine();
					CapituloImagem capituloImagem = lerCapituloImagem(leitor, personagens, escaneador);
					capitulos.put(capituloKey, capituloImagem);
				}
				
			}
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		
		return capitulos;
		
	}

	private static CapituloImagem lerCapituloImagem(Scanner leitor, HashMap<String, Personagem> personagens,
			Scanner escaneador) {
		
		String titulo = leitor.nextLine();
	    String descricao = leitor.nextLine();
	    
	    String keyPersonagem1 = leitor.nextLine();
	    int incrementoSatisfacao1 = Integer.parseInt(leitor.nextLine());
	   
	    String keyPersonagem2 = leitor.nextLine();
	    int incrementoSatisfacao2 = Integer.parseInt(leitor.nextLine());
	    
	    String imagem = "";
	    String linhaAtual = leitor.nextLine();
	    
	    linhaAtual = leitor.nextLine();
		while(!linhaAtual.equalsIgnoreCase("IMAGEM_FIM"))
		   {
				imagem += linhaAtual + "\n";
				linhaAtual = leitor.nextLine();
		   }
	    
	    Personagem personagem1 = personagens.get(keyPersonagem1);
	    Personagem personagem2 = personagens.get(keyPersonagem2);
	    
	    CapituloImagem capituloImagem = new CapituloImagem(titulo, descricao, personagem1, 
	    		incrementoSatisfacao1, personagem2, incrementoSatisfacao2, escaneador, imagem);
	    
	    return capituloImagem;
	}

	public static Capitulo lerCapitulo(Scanner leitor, HashMap<String, Personagem> personagens, Scanner escaneador)
	{
		String titulo = leitor.nextLine();
	    String descricao = leitor.nextLine();
	    
	    String keyPersonagem1 = leitor.nextLine();
	    int incrementoSatisfacao1 = Integer.parseInt(leitor.nextLine());
	   
	    String keyPersonagem2 = leitor.nextLine();
	    int incrementoSatisfacao2 = Integer.parseInt(leitor.nextLine());
	    
	    Personagem personagem1 = personagens.get(keyPersonagem1);
	    Personagem personagem2 = personagens.get(keyPersonagem2);
	    
	    Capitulo capitulo = new Capitulo(titulo, descricao, personagem1, 
	    		incrementoSatisfacao1, personagem2, incrementoSatisfacao2, escaneador);
	    
	    return capitulo;
	}
	
	public static void lerEscolhasCapitulo(HashMap<String, Capitulo> capitulos){
		
		File arquivoEscolha = new File("rsc/content/escolhas.txt");
		
		try {
			try (Scanner leitor = new Scanner(arquivoEscolha)) {
				while(leitor.hasNextLine())
				{
					String linhaAtual = leitor.nextLine();
					if (linhaAtual.equalsIgnoreCase("ESCOLHA"))
					{
						String capituloKeyAlvo = leitor.nextLine();
						String conteudo = leitor.nextLine();
						String proximoCapituloKey = leitor.nextLine();
						
						Capitulo capituloAlvo = capitulos.get(capituloKeyAlvo);
						Capitulo proximoCapitulo = capitulos.get(proximoCapituloKey);
						
						Escolha escolha = new Escolha(conteudo, proximoCapitulo);
						capituloAlvo.adicionarEscolhas(escolha);
						
					}
				}
			}
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		
	}
}

