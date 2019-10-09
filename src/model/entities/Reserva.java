package model.entities;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Reserva {
	private Integer numeroQuarto;
	private Date checkin;
	private Date checkout;
	public static SimpleDateFormat sdf=new SimpleDateFormat("DD/MM/AAAA");
	
public Reserva(Integer numeroQuarto, Date checkin, Date checkout) {
		this.numeroQuarto = numeroQuarto;
		this.checkin = checkin;
		checkout = checkout;
	}	
public Reserva () {
	
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
	//converter de data para inteiro para poder fazer a conta
	Long diferenca=(checkout.getTime()-checkin.getTime());
	return TimeUnit.DAYS.convert(diferenca, TimeUnit.MICROSECONDS);
		
}

public void atualizarDatas(Date checkin, Date checkout) {
	this.checkin=checkin;
	this.checkout=checkout;
}

@Override
public String toString() {
	return "Reserva: Número do quarto: "
			+ numeroQuarto
			+ ", check-in: "
			+sdf.format(checkin)
			+", check-out: "
			+sdf.format(checkout)
			+", "
			+duracao()
			+" dias."
;
}

	
}


