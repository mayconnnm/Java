package parte_3;

public class FuncionarioTeste {

	public static void main(String[] args) {
		Funcionario f = new Funcionario();
		f.setNome("Maycon");
		f.setCpf("155.607.667-39");
		f.setSalario(1000);

		System.out.println("Salário: " + f.getSalario() + " Bonificação: " + f.bonificacao());

		FuncionarioTipo ft = new FuncionarioTipo("Maycon", "155.607.667-39", 3000, 10);
		System.out.println(ft.bonificacao());
	}
}
