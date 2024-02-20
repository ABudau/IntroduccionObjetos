package boletin8_2_1;

import java.time.LocalDate;
import static java.time.temporal.ChronoUnit.DAYS;
public class AlquilerBarco {
	private String nombreCliente;
	private String dniCliente;
	private LocalDate fechaInicioAlquiler;
	private LocalDate fechaFinAlquiler;
	private int posicionAmarre;
	private Barco barco;

	public AlquilerBarco(String nombreCliente, String dniCliente, LocalDate fechaInicioAlquiler,
			LocalDate fechaFinAlquiler, int posicionAmarre, Barco barco) {
		super();
		this.nombreCliente = nombreCliente;
		this.dniCliente = dniCliente;
		this.fechaInicioAlquiler = fechaInicioAlquiler;
		this.fechaFinAlquiler = fechaFinAlquiler;
		this.posicionAmarre = posicionAmarre;
		this.barco = barco;
	}


	public String getNombreCliente() {
		return nombreCliente;
	}



	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}



	public String getDniCliente() {
		return dniCliente;
	}


	public void setDniCliente(String dniCliente) {
		this.dniCliente = dniCliente;
	}


	public LocalDate getFechaInicioAlquiler() {
		return fechaInicioAlquiler;
	}

	public void setFechaInicioAlquiler(LocalDate fechaInicioAlquiler) {
		this.fechaInicioAlquiler = fechaInicioAlquiler;
	}


	public LocalDate getFechaFinAlquiler() {
		return fechaFinAlquiler;
	}

	public void setFechaFinAlquiler(LocalDate fechaFinAlquiler) {
		this.fechaFinAlquiler = fechaFinAlquiler;
	}

	public int getPosicionAmarre() {
		return posicionAmarre;
	}

	public void setPosicionAmarre(int posicionAmarre) {
		this.posicionAmarre = posicionAmarre;
	}

	public Barco getBarco() {
		return barco;
	}


	public void setBarco(Barco barco) {
		this.barco = barco;
	}


	public double getPrecioAlquiler() {
		double precio;
		int dias=(int) DAYS.between(getFechaInicioAlquiler(), getFechaFinAlquiler())+1;

		precio=dias*getBarco().funcionModulo()*Barco.VALOR_FIJO;

		return precio;

	}
}
