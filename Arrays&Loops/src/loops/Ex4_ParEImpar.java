package loops;

import java.util.Scanner;

public class Ex4_ParEImpar {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int qntNum;
		int count = 0;
		int num;
		int pares = 0;
		int impares = 0;
		
		
		System.out.println("Digite a quantidade de números que vamos checar:");
		qntNum = scan.nextInt();
		
		do {
			System.out.println("Digire um número:");
			num = scan.nextInt();
			if (num % 2 == 0) {
				pares++;
			} else {
				impares++;
			}
			count++;
		} while (count < qntNum);
		
		System.out.println("Quantidade de números pares: " + pares);
		System.out.println("Quantidade de números ímpares: " + impares);
	}

}
