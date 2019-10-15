package application;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Reserva;

public class Program {

	public static void main(String[] args) throws ParseException {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		try {

			System.out.println("Infome o númedo do quarto e data de check-in e check-out (dd/MM/yyyy):");
			int numeroQuarto = sc.nextInt();
			// converte String para Date
			Date checkin = sdf.parse(sc.next());
			Date checkout = sdf.parse(sc.next());

			Reserva reserva = new Reserva(numeroQuarto, checkin, checkout);
			System.out.println(reserva);
			System.out.println();

			// comandos testes
			System.out.println("Print da segunda reserva: (teste)");
			Reserva reserva2 = new Reserva(2536090, sdf.parse("17/12/2019"), sdf.parse("25/12/2029"));
			System.out.println("O número do quarto da 2.ª reserva é: " + reserva2.getNumeroQuarto());
			reserva2.setNumeroQuarto(2560);
			System.out.println("2ª reserva: " + reserva2);
			System.out.println();
			System.out.println("Informe as novas de checkin e checkout da reserva:");
			checkin = sdf.parse(sc.next());
			checkout = sdf.parse(sc.next());
			// fazer a data atual
			Date hoje = new Date();
			reserva.atualizarDatas(checkin, checkout);
			System.out.println("Dados atualizados da " + reserva);
		} catch (ParseException erroCaracterInvalido) {
			System.out.println("Data no formato inválido");
		} catch (IllegalArgumentException erroArgumentoInvalido) {
			System.out.println("Erro na reserva: " + erroArgumentoInvalido.getMessage());

		}

		sc.close();
	}

}


