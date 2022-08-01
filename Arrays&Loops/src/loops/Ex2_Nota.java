package loops;

import java.util.Scanner;

public class Ex2_Nota {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int nota = 1; 
		System.out.println("Digite a nota:");
		nota = scan.nextInt();
		
		while (nota < 0 || nota > 10) {
			System.out.println("Nota inválida. Digite uma nota entre 0 e 10");
			nota = scan.nextInt();
		}
	}

}
