package andreiAlexandruBudau;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Iterator;

public class Reserva {
	private Socio socio;
	private Pista pista;
	private LocalDate fechaReserva;
	private LocalTime horaReserva;
	
	
	public Reserva(Socio socio, Pista pista, LocalDate fechaReserva, LocalTime horaReserva) {
		super();
		this.socio = socio;
		this.pista = pista;
		this.fechaReserva = fechaReserva;
		this.horaReserva = horaReserva;
	}
	public Socio getSocio() {
		return socio;
	}
	public void setSocio(Socio socio) {
		this.socio = socio;
	}
	public Pista getPista() {
		return pista;
	}
	public void setPista(Pista pista) {
		this.pista = pista;
	}
	public LocalDate getFechaReserva() {
		return fechaReserva;
	}
	public void setFechaReserva(LocalDate fechaReserva) {
		this.fechaReserva = fechaReserva;
	}
	public LocalTime getHoraReserva() {
		return horaReserva;
	}
	public void setHoraReserva(LocalTime horaReserva) {
		this.horaReserva = horaReserva;
	}
	
	@Override
	public String toString() {
		
		return "************** Reserva *************************\n"
		+ "Fecha: "+ fechaReserva + "\n"
		+ "Socio: " + socio.getNombreCompleto()+"\n"
		+ "Pista: "+ pista.getNumeroIdentificacion()+"\n"
		+ "Hora de comienzo: "+ horaReserva.getHour()+":"+horaReserva.getMinute()+"0";
		
	}
	
}
