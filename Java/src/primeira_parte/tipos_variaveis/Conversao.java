package primeira_parte.tipos_variaveis;

public class Conversao {

	public static void main(String[] args) {
		double salario = 1270.50;
		double valor1 = 0.2;
		double valor2 = 0.1;
		float pontoFlutuante = 3.14f;
		long numeroGrande = 32251564654654l;
		// int valor = salario;
		int valor = (int) salario;
		short valorPequeno = 2131;
		byte b = 127;

		System.out.println(valor);
	}
}
