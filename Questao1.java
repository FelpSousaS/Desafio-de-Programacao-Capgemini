import java.util.Scanner;

public class Questao1 {
	// a funcao 'escada' recebe um inteiro n e imprime uma escada de tamanho n.
	public static void escada(int n) {
		// 'i' = indice, 'nvezes' = quantidade de degraus da escada, 'aux' = a
		// quantidade de "*" em cada degrau.
		int i = 0, nvezes = 0, aux = n - 1;

		while (nvezes < n) { // laco de repeticao que vai ate n-1
			while (n > i) { // laco para imprimir cada degrau da escada
				if (i < aux)
					System.out.print(" "); // condicao para imprimir espaco
				else
					System.out.print("*"); // caso contrario, imprime "*"
				i++; // indice incrementa em 1
			}
			System.out.println(); // quebra de linha dos degraus
			nvezes++; // incrementando a quantidade de degraus
			aux--; // decrementando a condição da linha 11
			i = 0; // zerando o indice para o proximo degrau
		}

	}

	public static void main(String[] args) {
		int n; // variavel para receber a altura da escada

		Scanner scan = new Scanner(System.in); // variavel do tipo Scanner para receber entrada do teclado

		System.out.println("Digite a altura da escada: ");
		n = scan.nextInt(); // recebendo entrada do teclado

		escada(n); // chamando a funcao escada

	}
}
