import java.util.Scanner;

public class Questao2 {

	public static int verifica_senha(String senha) { // funcao que recebe uma senha e retorna o minimo de caracteres que a senha precisa para ser uma senha forte 
		int tamanho = 0; 
		
		if (senha.length() >= 6) return 0; // caso o tamanho da senha seja maior que 6, nao falta nunhum caracter, entao retorna 0
						  				  // caso contrario:
		tamanho = 6 - senha.length();    // calculo o numero minimo de caracteres que a senha precisa para ser uma senha forte
		
		return tamanho;                // retorno o minimo de caracteres

	}

	public static void main(String[] args) {
		String senha;
		Scanner scan = new Scanner(System.in); // variavel do tipo Scanner para receber entrada do teclado
		
		System.out.println("Digite a senha que deseja verificar: ");
		senha = scan.next(); //recebendo a senha que sera verificada
		
		System.out.println(verifica_senha(senha)); // imprimindo o resultado

	}
}
