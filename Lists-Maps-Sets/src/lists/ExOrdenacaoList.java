package lists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

// ATALHOS PARA CRIAÇÃO DE CONSTRUCTORS, GETTER E SETTERS -> ALT + 3 (e depois pesquise) ou ALT + SHIFT + S (e selecione o que vai criar no menu)
public class ExOrdenacaoList {

	public static void main(String[] args) {
	
		List<Gato> meusGatos = new ArrayList<>() {{
			add(new Gato("Jon", 18, "preto"));
			add(new Gato("Simba", 6, "tigrado"));
			add(new Gato("Jon", 12, "amarelo"));
			add(new Gato("Zoey", 13, "cinza"));
			add(new Gato("Alessandro", 9, "marrom"));
		}};
		//MOSTRANDO A LISTA NA ORDEM DE INSERÇÃO
		System.out.println("MOSTRANDO A LISTA NA ORDEM DE INSERÇÃO");
		System.out.println(meusGatos);
		
		//RETORNANDO A LISTA DE FORMA ALEATÓRIA
		System.out.println("RETORNANDO A LISTA DE FORMA ALEATÓRIA");
		Collections.shuffle(meusGatos);
		System.out.println(meusGatos);
		
		//ORGANIZANDO EM ORDEM ALFABÉTICA (NOME)
		System.out.println("ORGANIZANDO EM ORDEM ALFABÉTICA (NOME)");
		Collections.sort(meusGatos); //Pra isso, precisa implementar o COMPARABLE na classe (na classe)
		System.out.println(meusGatos);
		
		//ORGANIZANDO EM ORDEM CRESCENTE (IDADE)
		System.out.println("ORGANIZANDO EM ORDEM CRESCENTE (IDADE)");
//		Collections.sort(meusGatos, new ComparatorIdade()); //Idêntico à função abaixo
		meusGatos.sort(new ComparatorIdade()); //Idêntico à função acima
		System.out.println(meusGatos);
		
		//ORGANIZANDO EM ORDEM ALFABÉTICA (COR)
		System.out.println("ORGANIZANDO EM ORDEM ALFABÉTICA (COR)");
		Collections.sort(meusGatos, new ComparatorCor()); //Idêntico à função abaixo
//		meusGatos.sort(new ComparatorCor()); //Idêntico à função acima
		System.out.println(meusGatos);
		
		
		//ORGANIZANDO COM TODOS OS DADOS (NOME, COR E IDADE) (precedência: nome, depois cor, depois idade)
		System.out.println("ORGANIZANDO COM TODOS OS DADOS (NOME, COR E IDADE)");
		meusGatos.sort(new ComparatorNomeCorIdade());
		System.out.println(meusGatos);
	}

}

class Gato implements Comparable<Gato>{
	private String nome;
	private Integer idade;
	private String cor;

	public Gato(String nome, Integer idade, String cor) {
		this.nome = nome;
		this.idade = idade;
		this.cor = cor;
	}

	public String getNome() {
		return nome;
	}

	public Integer getIdade() {
		return idade;
	}

	public String getCor() {
		return cor;
	}

	@Override
	public String toString() {
		return "[nome=" + nome + ", idade=" + idade + ", cor=" + cor + "]";
	}

	//Comparable faz com que dentro da classe, os itens sejam "comparáveis" usando o compareTo(Class item) abaixo
	@Override
	public int compareTo(Gato gato) { //Retorna um int entre -1 (subir index), 0 (valores iguais) ou 1 (descer index)
		
		return this.getNome().compareToIgnoreCase(gato.getNome());
	}
	

}
//Comparator é uma CLASSE que compara os itens da classe atribuída
class ComparatorIdade implements Comparator<Gato> { 

	@Override
	public int compare(Gato g1, Gato g2) { //comparando dois gatos, Retorna um int entre -1 (subir index), 0 (valores iguais) ou 1 (descer index)
		return Integer.compare(g1.getIdade(), g2.getIdade()); //Compara a idade dos gatos
	}
	
}

class ComparatorCor implements Comparator<Gato> {

	@Override
	public int compare(Gato g1, Gato g2) { //Retorna um int entre -1 (subir index), 0 (valores iguais) ou 1 (descer index)
		return g1.getCor().compareToIgnoreCase(g2.getCor());
	}
	
}

class ComparatorNomeCorIdade implements Comparator<Gato> {

	@Override
	public int compare(Gato g1, Gato g2) {
		int nome = g1.getNome().compareToIgnoreCase(g2.getNome());
		if (nome != 0) return nome;
		
		int cor = g1.getCor().compareToIgnoreCase(g2.getCor());
		if (cor != 0) return cor;
		
		return Integer.compare(g1.getIdade(), g2.getIdade());
	}
	
}