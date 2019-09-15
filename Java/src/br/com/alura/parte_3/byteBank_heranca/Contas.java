package br.com.alura.parte_3.byteBank_heranca;

public abstract class Contas {
	protected double saldo;
	private int agencia;
	private int numero;
	private Client titular;
	private static int total;

	public Contas(int agencia, int numero) {
		if (agencia <= 0 || numero <= 0) {
			System.out.println("Agência ou Conta incorreta");
			return;
		}
		this.agencia = agencia;
		this.numero = numero;
		total++;
	}

	public double getSaldo() {
		return this.saldo;
	}

	public abstract void deposita(double valor);

	public void saca(double valor) throws SaldoException {
		if (this.saldo < valor) {
			throw new SaldoException("Saldo Insuficiente");
		}
		this.saldo -= valor;
	}

	public void transfere(double valor, Contas destino) throws SaldoException{
		saca(valor);
		destino.deposita(valor);
	}

	public static int getTotal() {
		return total;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		if (agencia <= 0) {
			System.out.println("Agência incorreta");
			return;
		}
		this.agencia = agencia;
	}

	public int getNumero() {
		return this.numero;
	}

	public void setNumero(int numero) {
		if (numero <= 0) {
			System.out.println("Número da conta incorreta");
			return;
		}
		this.numero = numero;
	}

	public void setTitular(Client cliente1) {
		this.titular = cliente1;
	}

	public Client getTitular() {
		return titular;
	}
}