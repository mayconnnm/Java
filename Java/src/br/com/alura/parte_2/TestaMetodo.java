package br.com.alura.parte_2;

public class TestaMetodo {
	public static void main(String[] args) {
		Conta conta = new Conta();
		conta.deposita(100);
		conta.deposita(50);
		System.out.println(conta.getSaldo());
		conta.saca(100);
		System.out.println(conta.getSaldo());

		Conta conta2 = new Conta();
		conta2.deposita(1000);
		if (conta2.transfere(300, conta)) {
			System.out.println("Transferência feita com sucesso");
		} else {
			System.out.println("Faltou dinheiro");
		}
		System.out.println(conta2);
	}
}
