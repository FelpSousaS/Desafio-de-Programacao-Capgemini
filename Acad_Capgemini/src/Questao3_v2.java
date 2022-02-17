import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.swing.JOptionPane;

public class Questao3_v2 {

	public static boolean verifica_anagrama(String subs1, String subs2) { // funcao que recebe duas substrings e retorna
																			// se elas são anagramas, ou nao
		char[] c_sub1 = subs1.toCharArray(); // transformando subs1 em um vetor de caracteres
		char[] c_sub2 = subs2.toCharArray();// transformando subs1 em um vetor de caracteres

		Arrays.sort(c_sub1); // ordenando o array de caracteres c_sub1
		Arrays.sort(c_sub2); // ordenando o array de caracteres c_sub2

		/*
		 * verificando se as duas substrings tem o mesmo tamanho, pois caso nao tenham,
		 * nao sera necessario realizar as verificacoes, visto que nao atende a
		 * definicao de anagrama.
		 */
		if (subs1.length() == subs2.length()) {
			for (int i = 0; i < subs1.length(); i++) {
				if (c_sub1[i] != c_sub2[i]) // verificando se as substrings sao diferentes. Se forem, retorno falso.
					return false;
			}
			return true;
		} else
			return false;

	}

	public static int anagrama(String palavra) {
		int cont = 0;
		for (int i = 1; i < palavra.length(); i++) {
			List<String> armazena_sub = new ArrayList<>(); // ArrayList para armazenar as substrings.
			for (int j = 0; j < palavra.length(); j++) {
				if (i + j <= palavra.length()) {
					armazena_sub.add(palavra.substring(j, i + j)); // armazenando as substrings contidas na palavra.
				}
			}

			for (int p = 0; p < armazena_sub.size(); p++) {
				for (int q = p + 1; q < armazena_sub.size(); q++) {
					// verificando se as substrings armazenadas sao anagramas. Se forem incrementa o
					// contador.
					if (verifica_anagrama(armazena_sub.get(p), armazena_sub.get(q))) {
						cont++;
					}
				}
			}
		}
		return cont;
	}

	public static void main(String[] args) {
		String palavra = JOptionPane.showInputDialog("Digite a palavra que deseja analisar: ");
		JOptionPane.showInternalMessageDialog(null,
				"Número de pares de substrings que são anagramas: \n                          " + "               "
						+ anagrama(palavra));
	}
}