package br.com.alura.parte_2;

public class TesteReferencia {
	public static void main(String[] args) {

		Conta primeiraConta = new Conta();
		primeiraConta.deposita(300);

		System.out.println("saldo da primeira conta: " + primeiraConta.getSaldo());

		Conta segundaConta = primeiraConta;

		System.out.println("saldo da segunda conta: " + segundaConta.getSaldo());

		segundaConta.deposita(100);
		System.out.println("saldo da segunda conta: " + segundaConta.getSaldo());

		System.out.println(primeiraConta.getSaldo());

		if (primeiraConta == segundaConta) {
			System.out.println("São a mesma conta");
		} else {
			System.out.println("Contas diferentes");
		}
	}
}
