package br.com.alura.parte_3.funcionario;

public abstract class Funcionario {
	private String nome;
	private String cpf;
	// O modificador protected deixa o atributo público somente para a classe
	// mãe(classe onde extá implementada) e os filhos(que extendem)
	// protected double salario;
	private double salario;

	public Funcionario() {

	}

	public Funcionario(String nome, String cpf, double salario) {
		this.nome = nome;
		this.cpf = cpf;
		this.salario = salario;
	}

	public abstract double bonificacao();

		public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
}