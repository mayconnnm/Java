package parte_2;

public class CriarConta {

	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 200;
		System.out.println(primeiraConta.pegaSaldo());

		primeiraConta.saldo += 100;
		System.out.println(primeiraConta.pegaSaldo());

		Conta segundaConta = new Conta();
		segundaConta.saldo = 50;

		System.out.println("Primeira conta tem : " + primeiraConta.pegaSaldo());
		System.out.println("Segunda conta tem : " + segundaConta.pegaSaldo());

		System.out.println(primeiraConta.agencia);
		System.out.println(primeiraConta.numero);

		System.out.println(segundaConta.agencia);

		segundaConta.agencia = 146;
		System.out.println("agora a segunda conta está na agência " + segundaConta.agencia);
	}
}
