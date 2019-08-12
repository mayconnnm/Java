package parte_3.funcionario;

public class Editor extends Funcionario {

	private String senha;

	public boolean autentica(String senha) {
		if (this.senha.equals(senha)) {
			return true;
		} else {
			return false;
		}
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public double bonificacao() {
		return + 100;
	}
}
