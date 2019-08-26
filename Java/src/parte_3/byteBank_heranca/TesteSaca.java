package parte_3.byteBank_heranca;

public class TesteSaca {
	public static void main(String[] args) {
		ContaCorrente cc = new ContaCorrente(6030, 473927);
		ContaCorrente cc2 = new ContaCorrente(3071, 400718);

		cc.deposita(200);
		cc2.deposita(100);

		try {
			cc.transfere(300, cc2);
		} catch (SaldoException e) {
			System.out.println(e.getMessage());
		}

		cc.getSaldo();
		System.out.println(cc.getSaldo());
		System.out.println(cc2.getSaldo());
	}
}
