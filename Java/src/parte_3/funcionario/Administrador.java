package parte_3.funcionario;

// Só podemos extender uma classe, mas podemos implementar várias classes ou até mesmo extender e implementar
public class Administrador extends Funcionario /* implements Autenticavel */ {

	private Autenticacao aut;

	@Override
	public double bonificacao() {
		return 50;
	}

	public boolean autentica(int senha) {
		return this.aut.autentica(senha);
	}

	public void setSenha(int senha) {
		this.aut.autentica(senha);
	}
}
