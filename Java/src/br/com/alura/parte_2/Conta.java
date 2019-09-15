package br.com.alura.parte_2;

public class Conta {
	private double saldo;
	int agencia;
	int numero;
	Cliente titular;

	void deposita(double valor) {
		this.saldo += valor;
	}

	public boolean saca(double valor) {
		if (valor <= this.saldo) {
//			System.out.println("Você sacou: " + valor);
			this.saldo -= valor;
			return true;
		} else {
//			System.out.println("Você não possui saldo o suficiente, saldo: " + this.saldo);
			return false;
		}
	}

	public boolean transfere(double valor, Conta destino) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			destino.deposita(valor);
			return true;
		} else {
			return false;
		}
	}

	public double getSaldo() {
		return this.saldo;
	}
}