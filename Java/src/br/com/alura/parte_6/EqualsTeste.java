package br.com.alura.parte_6;

import java.util.ArrayList;
import java.util.List;

import br.com.alura.parte_3.byteBank_heranca.ContaCorrente;
import br.com.alura.parte_3.byteBank_heranca.Contas;

public class EqualsTeste {

	public static void main(String[] args) {
		List<Contas> lista = new ArrayList<>();
		Contas c1 = new ContaCorrente(1012, 3131);
		lista.add(c1);
		Contas c2 = new ContaCorrente(1010, 4564);
		lista.add(c2);

		Contas c3 = new ContaCorrente(1010, 4564);
		System.out.println(lista.contains(c3));
		
		for (Contas conta : lista) {
			System.out.println(conta);
		}
	}
}