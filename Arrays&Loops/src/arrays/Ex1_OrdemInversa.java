package arrays;

public class Ex1_OrdemInversa {

	public static void main(String[] args) {

		int[] vetor = {0, 8, 19, 837, -200, 777};
		int count = 0;
		while (count < vetor.length) {
			System.out.println("Vetor: " + vetor[count]);
			count++;
		}
		
		for (int i = (vetor.length - 1); i >= 0; i--) {
			System.out.print(vetor[i] + " ");
		}
	}

}
