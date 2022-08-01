package loops;

import java.util.Scanner;

public class Ex5_Tabuada {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = 0;
		
		System.out.println("Digite o número entre 1 a 10 o qual faremos a tabuada:");
		num = scan.nextInt();
		while (num <= 0 || num > 10) {
			System.out.println("Número inválido. Digite um número entre 1 e 10");
			num = scan.nextInt();
		}
		
		System.out.println("Tabuada do " + num + ":");
		for (int count = 1; count <= 10; count++) {
			System.out.println(num + " x " + count + " = " + (num * count));
		}
		
	}

}
