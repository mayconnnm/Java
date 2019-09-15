package br.com.alura.parte_3.byteBank_heranca;

public class CalculadorImposto {

	private double imposto;

	public void registra(Tributavel t) {
		imposto += t.getValorImposto();

	}

	public double getTotalImposto() {
		return this.imposto;
	}
}
