package parte_3.byteBank_heranca;

public class ContaCorrente extends Contas implements Tributavel {

	public ContaCorrente(int agencia, int numero) {
		super(agencia, numero);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void saca(double valor) throws SaldoException{
		double valorSacado = valor + 0.02;
		System.out.println(valorSacado);
		super.saca(valorSacado);
	}

	@Override
	public void deposita(double valor) {
		this.saldo += valor;
	}

	@Override
	public double getValorImposto() {
		return getSaldo() * 0.01;
	}
}