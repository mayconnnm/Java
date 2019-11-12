package br.com.alura.parte_6;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import br.com.alura.parte_3.byteBank_heranca.ContaCorrente;
import br.com.alura.parte_3.byteBank_heranca.ContaPoupanca;
import br.com.alura.parte_3.byteBank_heranca.Contas;

public class OrdenandoLista {
	public static void main(String[] args) {
		Contas c1 = new ContaCorrente(6030, 473927);
		c1.deposita(100);

		Contas c2 = new ContaPoupanca(635, 975);
		c2.deposita(100);

		Contas c3 = new ContaCorrente(47, 458);
		c3.deposita(100);

		Contas c4 = new ContaPoupanca(120, 154);
		c4.deposita(100);

		List<Contas> lista = new ArrayList<>();
		lista.add(c1);
		lista.add(c2);
		lista.add(c3);
		lista.add(c4);

		for (Contas contas : lista) {
			System.out.println(contas);
		}
		
		
		NaoSeiAinda comparator = new NaoSeiAinda();
		// Compara e ordena as contas por número
		lista.sort(comparator);
		
		System.out.println();
		
		for (Contas contas : lista) {
			System.out.println(contas);
		}
	}
}

class NaoSeiAinda implements Comparator<Contas> {

	@Override
	public int compare(Contas c1, Contas c2) {
		if (c1.getNumero() < c2.getNumero())
			return -1;
		if (c1.getNumero() > c2.getNumero())
			return +1;
		return 0;
	}
}