package application;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Pilha {

	public static void main(String[] args) {

		metodo1();

		System.out.println("Fim do programa");
	}

	public static void metodo1() {
		System.out.println("***M�TODO UM START***");
		metodo2();
		System.out.println("***M�TODO UM END***");

	}

	public static void metodo2() {

		System.out.println("***M�TODO DOIS START***");
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Informe uma lista de valores separados por virgula e depois"
					+ " a posi��o do valor que deseja visualizar. ");
			// declarar vector que separar por virgular cada valor
			String[] vector = sc.nextLine().split(",");
			int posicao = sc.nextInt();
			System.out.println(vector[posicao]);

		} catch (ArrayIndexOutOfBoundsException erroPosicaoInvalida) {
			System.out.println("Tu informaste uma posic�o que n�o existe dados.");
			//imprime na tela o rastreamento do stack
			//por default do java chama printstacktrace para te ajudar a achar o erro de exce��o n�o tratada 
			erroPosicaoInvalida.printStackTrace();

		}

		catch (InputMismatchException erroTipoDeDados) {
			System.out.println("Tu n�o informaste um n�mero inteiro.");
			erroTipoDeDados.printStackTrace();
		}

		sc.close();
		System.out.println("***M�TODO DOIS END***");

	}

}
