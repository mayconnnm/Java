package parte_4;

public class Fluxo {

	public static void main(String[] args) {
		System.out.println("Ini do Main");
		metodo1();
		System.out.println("Fim do Main");
	}

	public static void metodo1() {
		System.out.println("Ini do Metodo1");
		try {
			metodo2();
		} catch (NullPointerException | ArithmeticException e) {
			String msg = e.getMessage();
			System.out.println("Exceção: " + msg);
			e.printStackTrace();
		}
		System.out.println("Fim do Metodo1");
	}

	public static void metodo2() {
		System.out.println("Ini do Metodo2");
		// for (int i = 0; i <= 5; i++) {
		// System.out.println(i);
		// Conta c = null;
		// c.deposita();
		// }
		// System.out.println("Fim do Metodo2");

		// ArithmeticException ae = new ArithmeticException();
		// throw ae;

		// throw new ArithmeticException("Deu erro");
		// throw new MinhaExcecao("Deu erro");

	}
}