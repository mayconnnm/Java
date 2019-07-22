package parte_3;

public class ControleBonificacao {

	private double soma;

	public void registra(Funcionario f) {
		this.soma = f.bonificacao();
	}

	public double getSoma() {
		return soma;
	}
}
