package application;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

//Finaly � um bloque que vai ser executado, independente de ter ocorrido um exce��oo u n�o

public class Finaly {
	public static void main(String[] args) {
		File file = new File("C:\\temp\\FINALY.txt");
	Scanner sc = null;
	try {
		sc = new Scanner(file);
		while (sc.hasNextLine()) {
			System.out.println(sc.nextLine());
		}
	} catch (IOException e) {
		System.out.println("Error opening file: " + e.getMessage());
	} finally {
		if (sc != null) {
			sc.close();
		}
		System.out.println("\nBLoco finaly executado com sucesso");
		}
	}
}