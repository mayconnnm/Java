package br.com.alura.parte_2.byteBank;

public class TesteGetSet {

	public static void main(String[] args) {
		Contas conta = new Contas(6030, 473927);
//		conta.setNumero(473927);

		Client cliente1 = new Client();

		cliente1.setNome("Maycon");
		cliente1.setCpf("100.100.100-00");
		cliente1.setProfissao("Desenvolvedor");
		conta.setTitular(cliente1);
		System.out.println(conta.getTitular().getNome());
		conta.getTitular().setProfissao("Programador");
		Client titularDaConta = conta.getTitular();
		Client cliente2 = cliente1;
		System.out.println(titularDaConta);
		System.out.println(cliente2);
	}
}
