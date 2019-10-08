package application;

import java.util.InputMismatchException;
import java.util.Scanner;

public class try_catch {

	public static void main(String[] args) {
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

		}

		catch (InputMismatchException erroTipoDeDados) {
			System.out.println("Tu não informaste um número inteiro.");
		}

		System.out.println("Erro, execute a aplicação novamente.");

		sc.close();

	}

}
