package br.com.alura.parte_2;

public class TestaBanco {

	public static void main(String[] args) {
		Cliente c = new Cliente();
		c.nome = "Maycon";
		c.cpf = "10101010101";
		c.profissao = "Programador";

		Conta c2 = new Conta();
		c2.deposita(100);

		c2.titular = c;
		System.out.println(c2.titular.nome);

	}
}
