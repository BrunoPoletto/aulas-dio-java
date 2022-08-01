package arrays;

import java.util.Scanner;

public class Ex2_Consoantes {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String[] letras =  new String[6];
		int qntCons = 0;
		int count = 0;
		do {
			System.out.println("Digite uma letra: ");
			String letra = scan.next();
			
			if (!(letra.equalsIgnoreCase("a") ||
			    letra.equalsIgnoreCase("e") ||
			    letra.equalsIgnoreCase("i") ||
			    letra.equalsIgnoreCase("o") ||
			    letra.equalsIgnoreCase("u"))) {
				letras[count] = letra;
				qntCons++;
			}
			count++;
			} while (count < letras.length);
		for (String consoante : letras) {
			if (consoante != null) {
				System.out.println(consoante + " ");	
		}
			
	}
		System.out.println("Quantidade de consoantes: " + qntCons);
	}
}
