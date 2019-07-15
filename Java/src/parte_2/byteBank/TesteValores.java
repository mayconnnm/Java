package parte_2.byteBank;

public class TesteValores {
	public static void main(String[] args) {
		Contas conta = new Contas(10, 20);
//		conta.setAgencia(-50);
//		conta.setNumero(-350);
		System.out.println("Agência: " + conta.getAgencia() + " \nConta: " + conta.getNumero());
		Contas conta2 = new Contas(10, 30);
		Contas conta3 = new Contas(10, 40);

		System.out.println("O total de contas é: " + Contas.getTotal());

	}
}
