import javax.swing.JOptionPane;

public class Questao2_v2 {

	public static void verifica_senha(String senha) { // funcao que recebe uma senha e retorna o minimo de caracteres que a senha precisa para ser uma senha forte
		int tamanho = 0, i = 0, j = 0;
		boolean minuscula = false, maiuscula = false, digito = false, esp = false; // variaveis boolenas que serao utilizadas para verificar se a senha atende aos requisitos
		String s_minuscula, s_maiuscula, s_digito, s_carac, carac_esp = "!@#$%^&*()-+"; // strings que serao imprimidas para cada caso em que a senha atenda os requisitos, ou nao.
		if (!senha.isEmpty()) { // verificando se a senha nao eh vazia
			while (i < senha.length()) { // laco para verificar cada caracter da string
				char c = senha.charAt(i);// recebendo o caracter que esta na posicao "i" da string
				if (c >= 48 && c <= 57) // caso o caracter seja um digito, a variável 'digito' recebe true
					digito = true;
				if (c >= 97 && c <= 122)// caso o caracter seja uma letra minuscula, a variável 'minuscula' recebe true
					minuscula = true;
				if (c >= 65 && c <= 90)// caso o caracter seja uma letra maiuscula, a variável 'maiuscula' recebe true
					maiuscula = true;
				while (j < carac_esp.length()) { // laco para verificar se a string possui algum dos caracteres especiais contidos na variavel 'carac_esp'
					char e = carac_esp.charAt(j);// recebendo o caracter que esta na posicao "j" da string
					if (c == e) { //caso o caracter seja um caracter especial, a variável 'esp' recebe true
						esp = true;
						break;
					}
					j++;// incrementa em 1 o indice j
				}
				j = 0;// o indice j é resetado para a verificacao do proximo caracter da linha 11 
				i++; // incrementa em 1 o indice i
				if (digito && minuscula && maiuscula && esp) //caso a senha atenda a todos os requisitos antes do fim do laco, pare a execucao do laco.
					break;
			}
			
			// setando valores nas variaveis que serao mostradas no resultado
			if (digito == true)
				s_digito = "A senha contém no mínimo 1 digito";
			else
				s_digito = "A senha não contém no mínimo 1 digito";

			if (minuscula == true)
				s_minuscula = "A senha contém no mínimo 1 letra em minúsculo";
			else
				s_minuscula = "A senha não contém no mínimo 1 letra em minúsculo";

			if (maiuscula == true)
				s_maiuscula = "A senha contém no mínimo 1 letra em maiúsculo";
			else
				s_maiuscula = "A senha não contém no mínimo 1 letra em maiúsculo";

			if (esp == true)
				s_carac = "A senha contém no mínimo 1 caracter especial";
			else
				s_carac = "A senha não contém no mínimo 1 caracter especial";
			
			//Condicoes de verificacao 
			if (senha.length() >= 6 && digito && minuscula && maiuscula && esp) { //caso a senha atenda a todos os requisitos
				JOptionPane.showInternalMessageDialog(null, "Senha forte!");
			
			}else { // caso nao atenda algum dos criterios 

				tamanho = 6 - senha.length();

				JOptionPane.showInternalMessageDialog(null, "Faltam : " + tamanho + " caracteres\n" + s_digito + "\n"
						+ s_minuscula + "\n" + s_maiuscula + "\n" + s_carac);
			}
		} else // caso a senha seja vazia
			JOptionPane.showInternalMessageDialog(null, "Senha vazia");

	}

	public static void main(String[] args) {
		String senha = JOptionPane.showInputDialog("Digite a senha que deseja verificar: "); // recebendo a senha que sera verificada

		verifica_senha(senha); // chamando a funcao

	}
}
