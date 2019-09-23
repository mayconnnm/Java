package br.com.alura.parte_6;

import java.util.ArrayList;
import java.util.List;

public class OutrosWrappers {
	public static void main(String[] args) {
		Double d = Double.valueOf(3.2);
		double db = d.doubleValue(); // Unboxing
		Double bl = Double.valueOf(db); // Autoboxing
		System.out.println(bl);

		List<Number> lista = new ArrayList<>();
		Number refFloat = Float.valueOf(50);
		Number refShort = Short.valueOf((short) 30);
		lista.add(refShort);
		lista.add(refFloat);
	}
}
