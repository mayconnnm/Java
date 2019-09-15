package br.com.alura.parte_3.byteBank_heranca;

public class ContasTeste {
	public static void main(String[] args) {
		Contas cc = new ContaCorrente(01, 01);
		Contas cp = new ContaPoupanca(01, 02);

		cc.deposita(500);
		cp.deposita(200);
		try {
			cc.transfere(1000, cp);
			cc.saca(10);
		} catch (SaldoException e) {
			e.printStackTrace();
		}
		System.out.println(cp.getSaldo());
		System.out.println(cc.getSaldo());

	}
}