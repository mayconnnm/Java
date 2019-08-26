package parte_4;

public class TesteMinhaExcecao {

	public static void main(String[] args) {
		Conta c = new Conta();
		try {
			c.deposita();
		} catch (MinhaExcecao e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
