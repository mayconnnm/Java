package br.com.alura.parte_3.funcionario;

public abstract class Cliente /* implements Autenticavel */ {

	private Autenticacao aut;

	public Cliente() {
		this.aut = new Autenticacao();
	}

	public boolean autentica(int senha) {
		return this.aut.autentica(senha);
	}

	public void setSenha(int senha) {
		this.aut.setSenha(senha);
	}
}
