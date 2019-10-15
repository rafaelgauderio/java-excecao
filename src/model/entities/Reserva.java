package model.entities;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Reserva {

	private Integer numeroQuarto;
	private Date checkin;
	private Date checkout;
	public static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

	public Reserva(Integer numeroQuarto, Date checkin, Date checkout) {
		this.numeroQuarto = numeroQuarto;
		this.checkin = checkin;
		this.checkout = checkout;
	}

	public Reserva() {

	}

	public Integer getNumeroQuarto() {
		return numeroQuarto;
	}

	public void setNumeroQuarto(Integer numeroQuarto) {
		this.numeroQuarto = numeroQuarto;
	}

	public Date getCheckin() {
		return checkin;
	}

	public void setCheckin(Date checkin) {
		this.checkin = checkin;
	}

	public Date getcheckout() {
		return checkout;
	}

	public void setCheckout(Date checkout) {
		this.checkout = checkout;
	}

	public Long duracao() {
		// converter de data para inteiro para poder fazer a conta
		Long diferenca = checkout.getTime() - checkin.getTime();
		// converter de milisegundos (pradrao do time Unit para dias)
		return TimeUnit.DAYS.convert(diferenca, TimeUnit.MILLISECONDS);

	}

	public void atualizarDatas(Date checkin, Date checkout) {
		Date agora = new Date();
		if (checkin.before(agora) || checkout.before(agora)) {
			throw new IllegalArgumentException("As datas das reservas devem ser datas futuras.");
		}
		if (!checkout.after(checkin)) {
			throw new IllegalArgumentException("A data de check-out deve ser posterior a de check-in.");
		}
		this.checkin = checkin;
		this.checkout = checkout;
	}

	@Override
	public String toString() {
		return "Reserva: Número do quarto: " + numeroQuarto + ", check-in: " + sdf.format(checkin) + ", check-out: "
				+ sdf.format(checkout) + ", " + duracao() + " dias.";
	}
	
}


