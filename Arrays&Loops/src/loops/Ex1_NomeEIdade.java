package loops;
import java.util.Scanner;
public class Ex1_NomeEIdade {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String nome;
		int idade;
		
		
		while (true) {
		System.out.println("Digite o nome: ");
		nome = scan.next();
		if (nome.equals("0")) {
			break;
		}
		System.out.println("Digite a idade: ");
		idade = scan.nextInt();
		if (idade == 0) {
			break;
		}
		System.out.println("Nome: " + nome);
		System.out.println("Idade: " + idade);
		}
	}
}
