package br.com.alura.parte_6;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import br.com.alura.parte_3.byteBank_heranca.Client;
import br.com.alura.parte_3.byteBank_heranca.ContaCorrente;
import br.com.alura.parte_3.byteBank_heranca.Contas;

public class ClassesAnonimas {

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

		// Classe anônima
		listaContas.sort(new Comparator<Contas>() {
			@Override
			public int compare(Contas c1, Contas c2) {
				String nome = c1.getTitular().getNome();
				String nome2 = c2.getTitular().getNome();
				return nome.compareTo(nome2);
			}
		});
		
		// Classe anônima
		Comparator<Contas> comp = new Comparator<Contas>() {

			@Override
			public int compare(Contas c1, Contas c2) {
				return Integer.compare(c1.getNumero(), c2.getNumero());
			}
		};
		
		listaContas.sort(comp);

		for (Contas contas : listaContas) {
			System.out.println(contas + ", " + contas.getTitular().getNome());
		}
	}
}