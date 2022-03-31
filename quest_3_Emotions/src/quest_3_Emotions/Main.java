package quest_3_Emotions;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {

	public static void main(String[] args) {
		
		
		try (Scanner texto = new Scanner(System.in)) {
			System.out.println("Olá, como você está? ");
			String frase = texto.nextLine();

			String nDivertido = ":-D"; // DIVERTIDO
			String nTriste = ":-/"; // TRISTE
			
			
			if(((int) Pattern.compile(nDivertido).matcher(frase).results().count()) > ((int) Pattern.compile(nTriste).matcher(frase).results().count())) {
				
				System.out.println("Divertido");
				
			}else if((int) Pattern.compile(nDivertido).matcher(frase).results().count() < (int) Pattern.compile(nTriste).matcher(frase).results().count()) {
				
				System.out.println("Triste");
			}else if((int) Pattern.compile(nDivertido).matcher(frase).results().count() ==(int) Pattern.compile(nTriste).matcher(frase).results().count()) {
				
				System.out.println("Neutro");
			}
		}
		
		
		
	}
	
	

		
	}
	

