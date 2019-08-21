package parte_3.funcionario;

// Extends significa que a classe filho recebe tudo que possuir na classe mãe
public class Gerente extends Funcionario /* implements Autenticavel */ {

	private Autenticacao aut;

	public Gerente() {
		this.aut = new Autenticacao();
	}

	public double bonificacao() {
		// Super indica que o atributo está definido na classe mãe
		return super.getSalario() /* super.salario */;
	}

	public boolean autentica(int senha) {
		return this.aut.autentica(senha);
	}

	public void setSenha(int senha) {
		this.aut.setSenha(senha);
	}
}