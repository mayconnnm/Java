package br.com.alura.parte_4;

public class FluxoError {
	public static void main(String[] args) {
		System.out.println("Ini do Main");
		try {
			metodo1();
		} catch (MinhaExcecao | NullPointerException | ArithmeticException e) {
			e.printStackTrace();
		}
		System.out.println("Fim do Main");
	}

	public static void metodo1() throws MinhaExcecao {
		System.out.println("Ini do Metodo1");
		metodo2();
		System.out.println("Fim do Metodo1");
	}

	public static void metodo2() throws MinhaExcecao {
		System.out.println("Init do método2");
		// metodo2();
		// throw new MinhaExcecao("Deu erro");
		System.out.println("Fim do Metodo2");

	}
}
