package br.com.alura.parte_7;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;
import java.net.Socket;

public class OutrasEntradasTeste {

	public static void main(String[] args) throws Exception {

		// Classe para trabalhar com rede
		Socket s = new Socket();

		// Método de entrada com o arquivo
		// InputStream fis = new FileInputStream(
		// "C:\\Users\\SUPORTE-BR\\Documents\\GitHub\\Java-Alura\\Java\\src\\br\\com\\alura\\escrita.txt");

		// Método de entrada com o teclado
		// InputStream fis = System.in;

		// Método de entrada com a rede
		InputStream fis = s.getInputStream();
		Reader isr = new InputStreamReader(fis);
		BufferedReader br = new BufferedReader(isr);

		// Método de saída para o arquivo
		// OutputStream fos = new FileOutputStream(
		// "C:\\Users\\SUPORTE-BR\\Documents\\GitHub\\Java-Alura\\Java\\src\\br\\com\\alura\\copiandoArquivo.txt");

		// Método de saída para o console
		// OutputStream fos = System.out;

		// Método de saída com a rede
		OutputStream fos = s.getOutputStream();
		Writer osw = new OutputStreamWriter(fos);
		BufferedWriter bw = new BufferedWriter(osw);

		String linha = br.readLine();
		while (linha != null && !linha.isEmpty()) {
			bw.write(linha);
			bw.newLine();
			linha = br.readLine();
		}

		// Método para descarregar o fluxo
		bw.flush();
		bw.close();
		br.close();
	}
}