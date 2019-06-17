package parte_1;

public class TesteComIf {

	public static void main(String[] args) {
		System.out.println("Testando condicionais");
		int idade = 20;
		int quantidadePessoas = 2;
		boolean acompanhado; // = quantidadePessoas > 2;

		if (quantidadePessoas >= 2) {
			acompanhado = true;
		} else {
			acompanhado = false;
		}
		if (idade >= 18 || acompanhado /* quantidadePessoas >= 2 */ ) {
			System.out.println("Seja bem vindo!");
		} else {
			System.out.println("Infelizmente você não pode entrar");
		}
	}
}
