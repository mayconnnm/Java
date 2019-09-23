package br.com.alura.parte_6;
import java.util.ArrayList;
import java.util.List;

public class WrapperTeste {

	public static void main(String[] args) {
		// Autoboxing
		Integer tRef = Integer.valueOf(10);
		// Unboxing
		tRef.intValue();

		List<Integer> lista = new ArrayList<>();
		lista.add(10); // Por baixo dos panos faz Autoboxing Integer.valueOf(10)

		String s = "10";
		Integer g = Integer.valueOf(s);// Passa o valor para o tipo Integer
		int i = Integer.parseInt(s);// Passa o valor para o tipo primitivo int
		System.out.println(i);
		System.out.println(g);
	}
}
