package parte_3.funcionario;

public class ReferenciaTeste {
	public static void main(String[] args) {
		Gerente g1 = new Gerente();
		g1.setNome("Nunes");
		g1.setCpf("155.607.667-39");
		g1.setSalario(10000);

		System.out.println("Nome: " + g1.getNome() + " CPF: " + g1.getCpf() + " Salário: " + g1.getSalario()
				+ " Comissão: " + g1.bonificacao());

		Funcionario e = new Editor();
		e.setNome("Morais");
		e.setCpf("155.600.100-00");
		e.setSalario(5000);
	}
}
