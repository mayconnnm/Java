package br.com.alura.parte_2;

public class TestaConta {

	public static void main(String[] args) {

		Conta c1 = new Conta();
		System.out.println(c1.getSaldo());
		System.out.println(c1.titular);

		c1.titular = new Cliente();
		c1.titular.nome = "Maycon";
		System.out.println(c1.titular.nome);

	}
}
