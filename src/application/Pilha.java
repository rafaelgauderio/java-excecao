package application;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Pilha {

	public static void main(String[] args) {

		metodo1();

		System.out.println("Fim do programa");
	}

	public static void metodo1() {
		System.out.println("***MÉTODO UM START***");
		metodo2();
		System.out.println("***MÉTODO UM END***");

	}

	public static void metodo2() {

		System.out.println("***MÉTODO DOIS START***");
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Informe uma lista de valores separados por virgula e depois"
					+ " a posição do valor que deseja visualizar. ");
			// declarar vector que separar por virgular cada valor
			String[] vector = sc.nextLine().split(",");
			int posicao = sc.nextInt();
			System.out.println(vector[posicao]);

		} catch (ArrayIndexOutOfBoundsException erroPosicaoInvalida) {
			System.out.println("Tu informaste uma posicão que não existe dados.");
			//imprime na tela o rastreamento do stack
			//por default do java chama printstacktrace para te ajudar a achar o erro de exceção não tratada 
			erroPosicaoInvalida.printStackTrace();

		}

		catch (InputMismatchException erroTipoDeDados) {
			System.out.println("Tu não informaste um número inteiro.");
			erroTipoDeDados.printStackTrace();
		}

		sc.close();
		System.out.println("***MÉTODO DOIS END***");

	}

}
