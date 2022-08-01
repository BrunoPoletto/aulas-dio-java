package arrays;

import java.util.Random;

public class Ex4_ArrayMultidimensional {

	public static void main(String[] args) {
		Random random = new Random();
		
		int[][] m = new int[4][4];
		
		for (int x = 0; x < m.length; x++) { //Mexendo no eixo horizontal (x)
			for (int y = 0; y < m[x].length; y++) { //Mexendo no eixo vertical (y)
				m[x][y] = random.nextInt(9);
			}
		}
		System.out.println("Matriz: ");
		for (int[] linha : m) { 
			for (int nDaColuna : linha) {
				System.out.print(nDaColuna + " ");
			}
			System.out.println();
		}
	}

}
