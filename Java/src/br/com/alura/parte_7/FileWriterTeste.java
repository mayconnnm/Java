package br.com.alura.parte_7;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class FileWriterTeste {

	public static void main(String[] args) throws Exception {

		// FileWriter fw = new FileWriter(
		// "C:\\Users\\SUPORTE-BR\\Documents\\GitHub\\Java-Alura\\Java\\src\\br\\com\\alura\\lorem.txt");
		// fw.write("Testando uma nova classe"); // FileWriter não possui método para
		// criar uma nova linha, mas o java sim, o // método "System.lineSeparator()"
		// funciona da mesma forma que \n, mas ele é uma // boa prática pois o método
		// identifica o sistema operacional e cria essa nova // linha, já \n corre o
		// risco de não funcionar em todos os SO fw.write(System.lineSeparator());
		// fw.write(System.lineSeparator()); fw.write("Escrevendo depois da segunda
		// linha");
		// fw.close();

		BufferedWriter bw = new BufferedWriter(new FileWriter(
				"C:\\Users\\SUPORTE-BR\\Documents\\GitHub\\Java-Alura\\Java\\src\\br\\com\\alura\\lorem.txt"));

		bw.write("Testando uma nova classe");
		bw.newLine();
		bw.newLine();
		bw.write("Escrevendo depois da segunda linha");
		bw.close();
	}
}