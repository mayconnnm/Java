package br.com.alura.parte_7;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class LeituraTeste {

	public static void main(String[] args) throws Exception {

		// Fluxo de entada com arquivo
		FileInputStream fis = new FileInputStream("lorem.txt");
		// O FileInputStream possui um método de leitura, mas devolve somente valores
		// inteiros, para isso é necessário a classe InputStreamReader, ele é uma ponte
		// de fluxo de bytes para fluxo de caracteres, lê bytes e codifica em caracteres
		InputStreamReader isr = new InputStreamReader(fis);
		// BufferedReader lê o texto de um fluxo de entrada de caracteres, armazena e
		// fornece uma leitura eficiente em caracteres, linhas e matrizes.
		BufferedReader br = new BufferedReader(isr);
		String linha = br.readLine();
		System.out.println(linha);
		br.close();
	}
}
