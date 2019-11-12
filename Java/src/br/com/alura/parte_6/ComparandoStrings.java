package br.com.alura.parte_6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import br.com.alura.parte_3.byteBank_heranca.Client;
import br.com.alura.parte_3.byteBank_heranca.ContaCorrente;
import br.com.alura.parte_3.byteBank_heranca.Contas;

public class ComparandoStrings {

	public static void main(String[] args) {

		Contas c1 = new ContaCorrente(1020, 123);
		Client cl1 = new Client();
		cl1.setNome("Maycon");
		c1.setTitular(cl1);
		c1.deposita(500);

		Contas c2 = new ContaCorrente(1020, 5654);
		Client cl2 = new Client();
		cl2.setNome("Nunes");
		c2.setTitular(cl2);
		c2.deposita(500);

		Contas c3 = new ContaCorrente(1020, 0210);
		Client cl3 = new Client();
		cl3.setNome("Morais");
		c3.setTitular(cl3);
		c3.deposita(500);

		Contas c4 = new ContaCorrente(1020, 155);
		Client cl4 = new Client();
		cl4.setNome("Maiquinho");
		c4.setTitular(cl4);
		c4.deposita(500);

		List<Contas> listaContas = new ArrayList<>();
		listaContas.add(c1);
		listaContas.add(c2);
		listaContas.add(c3);
		listaContas.add(c4);

		for (Contas contas : listaContas) {
			System.out.println(contas + ", " + contas.getTitular().getNome());
		}

//		TitularComparator tc = new TitularComparator(); // Ordenando por titular
//		NumeroComparator nc = new NumeroComparator(); // Ordenando por número da conta
//		listaContas.sort(nc);

		// Passando o código dessa forma, será criado a referência que é passado para o
		// método e irá gerar o resultado
		listaContas.sort(new TitularComparator());

		// A forma de utilizar a ordem natual na instância é passando null como
		// parâmetro
		// listaContas.sort(null);

		System.out.println();

		for (Contas contas : listaContas) {
			System.out.println(contas + ", " + contas.getTitular().getNome());
		}

		// Utilizando o método sort da classe Collections funciona da mesma forma que
		// o método da classe List
		// Collections.sort(listaContas, new NumeroComparator());

		// Esse método ordena por ordem natural, para isso é obrigado a implementar a
		// interface Comparable e implementar o método compareTo na classe da lista que
		// foi declarada - Contas
		// Collections.sort(listaContas);

		// Esse método reverte a ordem
		// Collections.reverse(listaContas);
	}
}

class TitularComparator implements Comparator<Contas> {

	@Override
	public int compare(Contas c1, Contas c2) {

		String nome = c1.getTitular().getNome();
		String nome2 = c2.getTitular().getNome();

		return nome.compareTo(nome2);
	}
}

class NumeroComparator implements Comparator<Contas> {

	@Override
	public int compare(Contas c1, Contas c2) {

		// Todos esses returns funcionam da mesma forma
		return Integer.compare(c1.getNumero(), c2.getNumero()); // sendo esse o mais elegante

//		return c1.getNumero() - c2.getNumero();

//		if (c1.getNumero() < c2.getNumero())
//			return -1;
//		if (c1.getNumero() > c2.getNumero())
//			return +1;
//		return 0;
	}
}