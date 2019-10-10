package application;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Reserva;

public class Program {

	public static void main(String[] args) throws ParseException  {
		
		Locale.setDefault(Locale.US);
		Scanner sc=new Scanner (System.in);
		SimpleDateFormat sdf =new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("Infome o númedo do quarto e data de check-in e check-out (dd/MM/yyyy):");
		int numeroQuarto=sc.nextInt();
		//converte String para Date
		Date checkin = sdf.parse(sc.next());
		Date checkout = sdf.parse(sc.next());
		Reserva reserva=new Reserva(numeroQuarto, checkin, checkout);
		System.out.println(reserva);
		
		System.out.println();
		
		System.out.println("Informe as novas de checkin e checkout da reserva:");
		checkin = sdf.parse(sc.next());
		checkout = sdf.parse(sc.next());
		
		reserva.atualizarDatas(checkin, checkout);
		System.out.println("Dados atualizados da "+reserva);
			
		sc.close();

	}

}
