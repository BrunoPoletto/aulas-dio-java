package lists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Exemplos_List {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// List notas = new ArrayList();
		// List<Double> notas = new ArrayList<Double>(); //Generiks(jdk 5) diamond operator (<>)
		// ----
		
		List<Double> notas = new ArrayList<Double>();
		notas.add(7.0);
		notas.add(8.5);
		notas.add(9.3);
		notas.add(5.0);
		notas.add(7.0);
		notas.add(0.0);
		notas.add(3.6);
		
		//IMPRIMINDO LISTAS NO CONSOLE
		
		System.out.println(notas); // Esse e o próximo dão o mesmo resultado
		System.out.println(notas.toString()); // Mesma coisa que o de cima
		
		//MOSTRANDO POSIÇÃO DE ITEMS
		
		System.out.println("Nota 5.0 na posição: " + notas.indexOf(5.0));
		
		//ADICIONANDO ITENS À LISTA
		
		System.out.println("Adicionando nota 8.0 na posição 4: ");
		notas.add(4, 8.0); // (index, valor)
		
		// SUBSTITUINDO VALORES DE UM INDEX
		
		System.out.println("Substituindo nota 5.0 por 6.0:");
		notas.set(notas.indexOf(5.0), 6.0); // (index, valor)
		
		// CHECANDO VALORES DA LISTA
		
		System.out.println("Nota 5.0 está na lista? " + notas.contains(5.0));
		
		//EXIBINDO ITENS EM ORDEM
		
		System.out.println("Ordem que os números foram informados: ");
		//for (Double nota : notas) System.out.println(nota); //Meio diferente, só pra pular linha
		System.out.println(notas); //Da na mesma, mas sem pular linhas
		
		//EXIBINDO ITENS EM ÍNDICES ESPECÍFICOS
		
		System.out.println("Exibindo a terçeira nota adicionada: " + notas.get(2));
		
		//EXIBINDO A MENOR NOTA (não tem método nativo no List, mas tem na Collections)
		
		System.out.println("Menor nota da lista: " + Collections.min(notas));
		
		// EXIBINDO A MAIOR NOTA (mesma coisa)
		
		System.out.println("Maior nota da lista: " + Collections.max(notas));
		
		// EXIBINDO A SOMA DAS NOTAS (sem método na List também, mas tem o método iterator
		
		Iterator<Double> iterator = notas.iterator();
		Double soma = 0.0;
		while(iterator.hasNext()) {
			Double n = iterator.next();
			soma += n;
		}
		System.out.println("Soma das notas: " + soma);
		
		// EXIBINDO A MÉDIA DS NOTAS
		
		System.out.println("Média das notas: " + (soma / notas.size()));
		
		// REMOVENDO ITENS COM BASE NO VALOR
		
		notas.remove(0.0); // Esse é o valor, por isso double
		
		// REMOVENDO ITENS COM BASE NO INDEX
		
		notas.remove(0); // Esse é o index, sempre é int
		
		//REMOVENDO MULTIPLOS ITENS COM BASE NO VALOR
		
		Iterator<Double> iterator1 = notas.iterator();
		while(iterator1.hasNext()) {
			Double n1 = iterator1.next();
			if (n1 < 7) iterator1.remove();
		}
		System.out.println(notas);
		
		// APAGANDO TODOS OS ITENS DA LISTA
		System.out.println("Apagando toda a lista...");
		notas.clear();
		
		// CONFERINDO SE A LISTA ESTÁ VAZIA
		
		System.out.println("A lista está vazia? " + notas.isEmpty());
		
		
		
	}

}
