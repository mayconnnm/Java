package br.com.alura.parte_6;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

import br.com.alura.parte_3.byteBank_heranca.Client;
import br.com.alura.parte_3.byteBank_heranca.ContaCorrente;
import br.com.alura.parte_3.byteBank_heranca.Contas;

public class Lambdas {

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

		// Lambda
		// listaContas.sort((Contas c10, Contas c20) -> {
		// return Integer.compare(c10.getNumero(), c20.getNumero());
		// });

		// Lambda mais enxuta, a lista é de contas, logo o compilador sabe que a
		// implementação será de contas e por isso não precisamos definir o tipo das
		// variáveis
		// listaContas.sort((c10, c20) -> Integer.compare(c10.getNumero(),
		// c20.getNumero()));

		// Compare as duas contas e retorne os nomes
		Comparator<Contas> comp = (ct, cs) -> ct.getTitular().getNome().compareTo(cs.getTitular().getNome());

		listaContas.sort(comp);

		// Lamba em forEach
		// listaContas.forEach((contas) -> System.out.println(contas + ", " +
		// contas.getTitular().getNome()));

		for (Contas contas : listaContas) {
			System.out.println(contas + ", " + contas.getTitular().getNome());
		}
	}
}