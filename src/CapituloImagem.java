import java.util.Scanner;

public class CapituloImagem extends Capitulo{
	
	private String imagem;

	public CapituloImagem(String titulo, String descricao, Personagem personagemAna, 
			int satisfacaoChangeAna, Personagem personagemAnderson, 
			int satisfacaoChangeAnderson, Scanner scanner, String imagem) {
		
			super(titulo, descricao, personagemAna, 
				satisfacaoChangeAna, personagemAnderson, 
				satisfacaoChangeAnderson, scanner);
			
			this.imagem = imagem;
			
		
	}
	
	@Override
	protected void mostrar()
	{
		super.mostrar();
		System.out.println(imagem);
	}
	
	

}
