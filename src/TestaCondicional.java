
public class TestaCondicional {

	public static void main(String[] args) {

		System.out.println("Testando condicionais");
		int idade = 15;
		int quantidadePessoas = 3;
		if (idade >= 18) {
			System.out.println("Voc� tem mais de 18 anos");
			System.out.println("Seja bem vindo.");
		} else {
			if (quantidadePessoas >= 3) {
				System.out.println("Voc� nao tem 18 anos mas pode entrar" 
			+ " acompanhado por 3 ou mais pessoas");
			} else {
				System.out.println("Infelizmente voc� n�o pode entrar.");
			}

		}

	}

}
