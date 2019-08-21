package parte_3.byteBank_heranca;

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
	
	public boolean saca(double valor) {
		if (this.saldo >= valor) {
//			System.out.println("Você sacou: " + valor);
			this.saldo -= valor;
			return true;
		} else {
//			System.out.println("Você não possui saldo o suficiente, saldo: " + this.saldo);
			return false;
		}
	}

	public boolean transfere(double valor, Contas destino) {
		if (saca(valor)) {
			destino.deposita(valor);
			return true;
		} else {
			return false;
		}
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