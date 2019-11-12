package br.com.alura.parte_6;
import java.util.ArrayList;
import java.util.List;

public class WrapperTeste {

	public static void main(String[] args) {
		// Autoboxing
		Integer tRef = Integer.valueOf(10);
		// Unboxing
		int a = tRef.intValue();

		List<Integer> lista = new ArrayList<>();
		lista.add(10); // Por baixo dos panos faz Autoboxing Integer.valueOf(10)

		String s = "10";
		Integer g = Integer.valueOf(s);// Passa o tipo String para o tipo Integer
		int i = Integer.parseInt(s);// Passa o tipo String para o tipo primitivo int
		String r = String.valueOf(i);// Passa outro tipo para o tipo String
		System.out.println(i);
		System.out.println(g);
	}
}
