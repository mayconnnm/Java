package br.com.alura.parte_7;

import java.io.PrintWriter;

public class PrintStreamWriter {

	public static void main(String[] args) throws Exception {

		// PrintStream ps = new PrintStream(
		// new
		// File("C:\\Users\\SUPORTE-BR\\Documents\\GitHub\\Java-Alura\\Java\\src\\br\\com\\alura\\lorem.txt"));
		//
		// ps.println("Testando com PrintStream");
		// ps.close();

		PrintWriter pw = new PrintWriter(
				"C:\\Users\\SUPORTE-BR\\Documents\\GitHub\\Java-Alura\\Java\\src\\br\\com\\alura\\lorem.txt");

		pw.println("Testando com PrintWriter");
		pw.close();

	}
}