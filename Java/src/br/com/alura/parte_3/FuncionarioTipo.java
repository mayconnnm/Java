package br.com.alura.parte_3;

public class FuncionarioTipo {
	private String nome;
	private String cpf;
	private double salario;
	private int tipo = 0; // tipo 0 = Funcionário Comun, tipo 1 = Gerente, tipo 2 = Diretor
	private String senha;

	public FuncionarioTipo(String nome, String cpf, double salario, int tipo) {
		this.nome = nome;
		this.cpf = cpf;
		this.salario = salario;
		this.tipo = tipo;
	}

	public boolean autentica(String senha) {
		if (this.senha.equals(senha)) {
			return true;
		} else {
			return false;
		}
	}

	public double bonificacao() {
		if (this.tipo == 1) {
			return this.salario * 0.2;
		} else if (this.tipo == 2) {
			return this.salario * 0.3;
		}
		return this.salario * 0.1;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	public int getTipo() {
		return this.tipo;
	}

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