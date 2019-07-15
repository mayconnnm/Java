package parte_2;

public class CriarConta {

	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		primeiraConta.deposita(200);
		System.out.println(primeiraConta.getSaldo());

		primeiraConta.deposita(100);
		System.out.println(primeiraConta.getSaldo());

		Conta segundaConta = new Conta();
		segundaConta.deposita(50);

		System.out.println("Primeira conta tem : " + primeiraConta.getSaldo());
		System.out.println("Segunda conta tem : " + segundaConta.getSaldo());

		System.out.println(primeiraConta.agencia);
		System.out.println(primeiraConta.numero);

		System.out.println(segundaConta.agencia);

		segundaConta.agencia = 146;
		System.out.println("agora a segunda conta está na agência " + segundaConta.agencia);
	}
}
