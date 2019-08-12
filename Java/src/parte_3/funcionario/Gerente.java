package parte_3.funcionario;

// Extends significa que a classe filho recebe tudo que possuir na classe mãe
public class Gerente extends Funcionario {
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
		// Super indica que o atributo está definido na classe mãe
		return super.getSalario() /* super.salario */;
	}
}