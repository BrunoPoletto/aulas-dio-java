package arrays;

import java.util.Random;

public class Ex3_NumerosAleatorios {

	public static void main(String[] args) {

		Random random = new Random();
		int[] numeros = new int[20];
		
		for (int i = 0; i < numeros.length; i++) {
			int numero = random.nextInt(100);
			numeros[i] = numero;
		}
		System.out.println("Numeros gerados:");
		for (int x : numeros) {
			System.out.print(x + " ");
		}
		System.out.println("\nSucessores dos numeros gerados:");
		for (int x : numeros) {
			System.out.print((x + 1) + " ");
		}
	}

}
