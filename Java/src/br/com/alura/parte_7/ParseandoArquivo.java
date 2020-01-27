package br.com.alura.parte_7;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Locale;
import java.util.Scanner;

public class ParseandoArquivo {

	public static void main(String[] args) throws FileNotFoundException {

		int i = 461012;
		System.out.format("O valor é: %s%n", i);

		Scanner sc = new Scanner(
				new File("C:\\Users\\mmorais\\Documents\\Java-Alura\\Java\\src\\br\\com\\alura\\contas.csv"));

		while (sc.hasNextLine()) {
			String linha = sc.nextLine();
			// System.out.println(linha);

			Scanner linhaScanner = new Scanner(linha);
			linhaScanner.useLocale(Locale.US);
			// Este método quebra a linha como o método split
			linhaScanner.useDelimiter(",");

			String valor1 = linhaScanner.next();
			String valor2 = linhaScanner.next();
			String valor3 = linhaScanner.next();
			String valor4 = linhaScanner.next();
			String valor5 = linhaScanner.next();
			String valor6 = linhaScanner.next();

			// Passando o tipo do formato como String "%s" e depois os argumentos
			// String valorFormatado = String.format(" %s %s %s %s %s %s", valor1, valor2,
			// valor3, valor4, valor5, valor6);
			
			// Locale defini a formatação de acordo com a língua e país
			String valorFormatado = String.format(new Locale("pt", "BR"), " %s - %s - %s, %s, %s: %s", valor1, valor2, valor3,
					valor4, valor5, valor6);

			System.out.println(valorFormatado);
			linhaScanner.close();
			// String[] splitLinha = linha.split(",");
			// System.out.println(splitLinha[1]);
			
		}
		sc.close();
	}
}