package br.com.alura.parte_3.funcionario;

public class SistemaInterno {

	private int senha = 1022;

	public void autentica(Autenticavel a) {
		boolean autentica = a.autentica(this.senha);
		if (autentica) {
			System.out.println("Pode entrar no sistema");
		} else {
			System.out.println("Não pode entrar no sistema");
		}
	}
}
