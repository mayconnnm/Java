package parte_2;

public class SaqueNegativo {

	public static void main(String[] args) {
		Conta c1 = new Conta();
		c1.deposita(100);
		System.out.println(c1.saca(200));
		System.out.println(c1.getSaldo());

//		c1.saldo = c1.saldo - 101;
		System.out.println(c1.getSaldo());
	}
}
