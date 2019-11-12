package br.com.alura.parte_3.byteBank_heranca;

public class ContaPoupanca extends Contas {

	public ContaPoupanca(int agencia, int numero) {
		super(agencia, numero);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void deposita(double valor) {
		this.saldo += valor;
	}
	
	@Override
	public String toString() {
		return "Conta-Poupanca: " + "Ag. " + this.getAgencia() + " Conta " + this.getNumero();
	}
}
