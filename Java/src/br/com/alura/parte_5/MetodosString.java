package br.com.alura.parte_5;

public class MetodosString {

	public static void main(String[] args) {
		// char data[] = { 'a', 'b', 'c' };
		// String str = new String(data);
		// System.out.println(str);

// charAt retorna um caracter especificado na posição que for passada.		
		// String numero = "ABCD";
		// char valor = numero.charAt(1);
		// System.out.println(valor);

// codePointAt retorna o valor em unicode(número) do caractere que for especificado no index.	
		// String str = "java";
		// System.out.println(str.codePoint At(1));

// compareTo compara dois objetos do mesmo tipo(String, Long, Integer, Double, Float, Short, Byte e Boolean).
// Se o primeiro valor for igual ao segundo retorna 0.
// Se o primeiro valor for maior que o segundo retorna 1.
// Se o primeiro valor for menor que o segundo retorna -1;		
// compareToIgnoreCase faz o mesmo que o compareTo, só que ignora qualquer diferença entre maiúscula e minúscula.
		// String str = "Java COFFEE";
		// System.out.println(str.compareTo("Java COFFEE"));
		// System.out.println(str.compareToIgnoreCase("java coffee") == 0 ? true :
		// false);

// endsWith verifica se a String termina com o valor especificado.
		// String valor = "certificação java";
		// System.out.println(valor.endsWith("ava"));

// startsWith verifica se a String inicia com o valor especificado.
		// String valor = "certificação java";
		// System.out.println(valor.startsWith("certificação"));

// startsWith quando contém o parâmetro int toffset serve para dizer de qual
// posição deve começar a verificação.
		// String valor = "certificação java";
		// System.out.println(valor.startsWith("ica", 6));

// toCharArray converte uma String em um Array de char.
		// String valor = "diploma";
		// for (char c : valor.toCharArray()) {
		// System.out.println(c);
		// }

// getBytes converte uma String em um vetor de byte[].
		// String valor = "teste";
		// for (byte result : valor.getBytes()) {
		// System.out.println("Byte: " + result);
		// }

// isEmpty verifica se uma string está vazia ou não.
		// String s = "";
		// System.out.println(s.isEmpty());

// split divide a string em várias outras strings com base no regex passado.	
//		 String valor = "front - back - mobile";
//		 for (String result : valor.split("-")) {
//		 System.out.println(result);
//		 }

// split com limit, o tamanho do vetor será de acordo de quantas vezes o regex será aplicado.
		// String valor = "front - back - mobile - banco";
		// for (String result : valor.split("-",2)) {
		// System.out.println(result);
		// }

// subString e subSequence ambos retornam uma parte específica de uma determina string.		
// Sendo que subString retorna uma nova string e subSequence retorna um charSequence.
// charSequence é uma interface e a string é uma implementação dela.		
		// String valor = "front - back - mobile";
		// System.out.println(valor.substring(0, 5)); // Da posição inicial até a final
		// System.out.println(valor.substring(8)); // apartir da posição inicial
		// System.out.println(valor.subSequence(0, 5));

// toLowerCase converte toda a string para minúscula.
// toUpperCase converte toda a string para maiúscula.
// trim remove os espaços em branco do início e final da string.
		// String valor = " Rio de Janeiro ";
		// System.out.println(valor.toLowerCase());
		// System.out.println(valor.toUpperCase());
		// System.out.println(valor.trim());

// valueOf converte diversos tipos(long, int, short, byte, double, float, char, boolean, object...) para string.		
		// boolean b = true;
		// System.out.println(String.valueOf(b));
		// float f = -10;
		// System.out.println(String.valueOf(f));
		// int i = 9;
		// System.out.println(String.valueOf(i));
		// double d = 10.30;
		// System.out.println(String.valueOf(d));

// format realiza a formatação de uma string.		
		// String result = String.format("Hoje nós processamos %,d transações", 100000);
		// System.out.println(result);
		//
		// result = String.format("10 / 3 = %.2f", 10.0 / 3.0);
		// System.out.println(result);
	}
}