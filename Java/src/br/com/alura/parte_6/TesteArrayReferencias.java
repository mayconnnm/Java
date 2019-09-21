package br.com.alura.parte_6;

import br.com.alura.parte_3.byteBank_heranca.ContaCorrente;
import br.com.alura.parte_3.byteBank_heranca.ContaPoupanca;
import br.com.alura.parte_3.byteBank_heranca.Contas;

public class TesteArrayReferencias {

	public static void main(String[] args) {

		Contas[] contas = new Contas[10];
		ContaCorrente c1 = new ContaCorrente(6030, 473927);
		contas[0] = c1;

		ContaPoupanca c2 = new ContaPoupanca(3071, 400718);
		contas[1] = c2;

		System.out.println(contas[1].getNumero());
		ContaCorrente ref = (ContaCorrente) contas[0];
		System.out.println(ref.getAgencia());

		Object[] obj = new Object[10];
		ContaCorrente cc = new ContaCorrente(1020, 3040);
		obj[0] = cc;
		System.out.println(obj[0]);
	}
}