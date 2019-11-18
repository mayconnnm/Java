package br.com.alura.parte_7;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class LeituraTeste {

	public static void main(String[] args) throws Exception {

		// Fluxo de entada com arquivo
		FileInputStream fis = new FileInputStream(
				"C:\\Users\\SUPORTE-BR\\Documents\\GitHub\\Java-Alura\\Java\\src\\br\\com\\alura\\lorem.txt");
		// O FileInputStream possui um método de leitura, mas devolve somente valores
		// inteiros, para isso é necessário a classe InputStreamReader, ele é uma ponte
		// de fluxo de bytes para fluxo de caracteres, lê bytes e codifica em caracteres
		// InputStreamReader isr = new InputStreamReader(fis);
		Reader isr = new InputStreamReader(fis);
		// BufferedReader lê o texto de um fluxo de entrada de caracteres, armazena e
		// fornece uma leitura eficiente em caracteres, linhas e matrizes.
		BufferedReader br = new BufferedReader(isr);
		// String linha = br.readLine();
		String linha = "";

		while ((linha = br.readLine()) != null) {
			System.out.println(linha);
			// linha = br.readLine();
		}
		br.close();
		
		
	}
}
