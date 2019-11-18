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

		// M�todo de entrada com o arquivo
		// InputStream fis = new FileInputStream(
		// "C:\\Users\\SUPORTE-BR\\Documents\\GitHub\\Java-Alura\\Java\\src\\br\\com\\alura\\escrita.txt");

		// M�todo de entrada com o teclado
		// InputStream fis = System.in;

		// M�todo de entrada com a rede
		InputStream fis = s.getInputStream();
		Reader isr = new InputStreamReader(fis);
		BufferedReader br = new BufferedReader(isr);

		// M�todo de sa�da para o arquivo
		// OutputStream fos = new FileOutputStream(
		// "C:\\Users\\SUPORTE-BR\\Documents\\GitHub\\Java-Alura\\Java\\src\\br\\com\\alura\\copiandoArquivo.txt");

		// M�todo de sa�da para o console
		// OutputStream fos = System.out;

		// M�todo de sa�da com a rede
		OutputStream fos = s.getOutputStream();
		Writer osw = new OutputStreamWriter(fos);
		BufferedWriter bw = new BufferedWriter(osw);

		String linha = br.readLine();
		while (linha != null && !linha.isEmpty()) {
			bw.write(linha);
			bw.newLine();
			linha = br.readLine();
		}

		// M�todo para descarregar o fluxo
		bw.flush();
		bw.close();
		br.close();
	}
}