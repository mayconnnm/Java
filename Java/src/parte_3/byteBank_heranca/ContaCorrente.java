package parte_3.byteBank_heranca;

public class ContaCorrente extends Contas {

	public ContaCorrente(int agencia, int numero) {
		super(agencia, numero);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean saca(double valor) {
		double valorSacado = valor + 0.2;
		System.out.println(valorSacado);
		return super.saca(valorSacado);
	}
}
