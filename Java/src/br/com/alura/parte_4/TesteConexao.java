package br.com.alura.parte_4;

public class TesteConexao {

	public static void main(String[] args) {

		try (Conexao con = new Conexao()) {
			con.lerDados();
		} catch (IllegalStateException e) {
			System.out.println("Deu erro na conexão");
		}
	}
}