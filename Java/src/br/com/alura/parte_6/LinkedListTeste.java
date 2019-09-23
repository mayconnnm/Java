package br.com.alura.parte_6;

import java.util.LinkedList; 
import java.util.List;

import br.com.alura.parte_3.byteBank_heranca.ContaCorrente;
import br.com.alura.parte_3.byteBank_heranca.Contas;

public class LinkedListTeste {

	public static void main(String[] args) {
		List<Contas> lista = new LinkedList<>();
		Contas c1 = new ContaCorrente(1012, 3131);
		lista.add(c1);
		Contas c2 = new ContaCorrente(1010, 4564);
		lista.add(c2);
		lista.remove(1);
		Contas c3 = new ContaCorrente(1012, 3131);
		lista.add(c3);
		Contas c4 = new ContaCorrente(1010, 4564);
		lista.add(c4);

		for (int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(i));
		}
		
		System.out.println();

		for (Contas conta : lista) {
			System.out.println(conta);
		}
	}
}