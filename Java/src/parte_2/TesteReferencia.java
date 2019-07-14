package parte_2;

public class TesteReferencia {
	public static void main(String[] args) {

		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 300;

		System.out.println("saldo da primeira conta: " + primeiraConta.pegaSaldo());

		Conta segundaConta = primeiraConta;

		System.out.println("saldo da segunda conta: " + segundaConta.pegaSaldo());

		segundaConta.saldo += 100;
		System.out.println("saldo da segunda conta: " + segundaConta.pegaSaldo());

		System.out.println(primeiraConta.pegaSaldo());

		if (primeiraConta == segundaConta) {
			System.out.println("São a mesma conta");
		} else {
			System.out.println("Contas diferentes");
		}
	}
}
