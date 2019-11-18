package br.com.alura.parte_7;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class FileWriterTeste {

	public static void main(String[] args) throws Exception {

		// FileWriter fw = new FileWriter(
		// "C:\\Users\\SUPORTE-BR\\Documents\\GitHub\\Java-Alura\\Java\\src\\br\\com\\alura\\lorem.txt");
		// fw.write("Testando uma nova classe"); // FileWriter n�o possui m�todo para
		// criar uma nova linha, mas o java sim, o // m�todo "System.lineSeparator()"
		// funciona da mesma forma que \n, mas ele � uma // boa pr�tica pois o m�todo
		// identifica o sistema operacional e cria essa nova // linha, j� \n corre o
		// risco de n�o funcionar em todos os SO fw.write(System.lineSeparator());
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