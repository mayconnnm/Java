package parte_3.byteBank_heranca;

public class TesteTributavel {
	public static void main(String[] args) {

		ContaCorrente cc = new ContaCorrente(6030, 473927);
		cc.deposita(100);

		SeguroVida sg = new SeguroVida();

		CalculadorImposto ci = new CalculadorImposto();
		ci.registra(cc);
		
		System.out.println(ci.getTotalImposto());
	}
}
