package br.com.alura.parte_6;

public class TesteArray {
	public static void main(String[] args) {

		int[] idades = new int[5];
//		idades[0] = 10;
//		idades[1] = 20;
//		idades[2] = 30;
//		idades[3] = 40;
//		idades[4] = 50;

//		int idade1 = idades[0];
//		int idade2 = idades[1];
//		int idade3 = idades[2];
//		int idade4 = idades[3];
//		int idade5 = idades[4];

//		System.out.println(idade1);
//		System.out.println(idade2);
//		System.out.println(idade3);
//		System.out.println(idade4);
//		System.out.println(idade5);

		for (int i = 0; i < idades.length; i++) {
			System.out.println(idades[i] = i * i);
		}

		for (int i = 0; i < idades.length; i++) {
			System.out.println(idades[i]);
		}
	}
}
