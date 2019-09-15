package br.com.alura.parte_3.funcionario;

public class FuncionarioTeste {

	public static void main(String[] args) {
		Funcionario f = new Gerente();
		f.setNome("Maycon");
		f.setCpf("155.607.667-39");
		f.setSalario(1000);

		System.out.println("Salário: " + f.getSalario() + " Bonificação: " + f.bonificacao());
	}
}
