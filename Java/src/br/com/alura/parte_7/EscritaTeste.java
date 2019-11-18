package br.com.alura.parte_7;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class EscritaTeste {

	public static void main(String[] args) throws Exception {

		OutputStream fos = new FileOutputStream(
				"C:\\Users\\SUPORTE-BR\\Documents\\GitHub\\Java-Alura\\Java\\src\\br\\com\\alura\\escrita.txt");
		Writer osw = new OutputStreamWriter(fos);
		BufferedWriter bw = new BufferedWriter(osw);

		bw.write("Escrevendo no arquivo para teste");
		bw.newLine(); // Criando uma nova linha
		bw.newLine();
		bw.write("Testando novamente");
		bw.append("\n" + "Será que funciona");
		bw.close();

	}
}