package loops;
import java.util.Scanner;
public class Ex6_Fatorial {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o número:");
		int num = scan.nextInt();
		int fatorado = 1;
		
		
		for (int i = num; i >= 1; i--) {
			fatorado *= i;
		}
		System.out.println("Fatorial de " + num + ": " + fatorado);
		
		
		
		
	}

}
