package andreiAlexandruBudau;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Objects;

public class Socio {
	private String nombreCompleto;
	private int numeroSocio;
	
	public Socio(String nombreCompleto, int numeroSocio) {
		super();
		this.nombreCompleto = nombreCompleto;
		this.numeroSocio = numeroSocio;
	}
	
	public String getNombreCompleto() {
		return nombreCompleto;
	}
	public void setNombreCompleto(String nombreCompleto) {
		this.nombreCompleto = nombreCompleto;
	}
	public int getNumeroSocio() {
		return numeroSocio;
	}
	public void setNumeroSocio(int numeroSocio) {
		this.numeroSocio = numeroSocio;
	}
	
	public double reservarPista(Pista pista, LocalDate fechaReserva, LocalTime horaReserva) {
		double costeResesva=-1;
		if (pista!=null&&fechaReserva!=null&&horaReserva!=null) {
			if (!Club.buscarReserva(pista, fechaReserva, horaReserva)) {
				costeResesva=pista.getPrecio();
				Club.almacenarReserva(new Reserva(this, pista, fechaReserva, horaReserva));
			}
		}
		return costeResesva;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(numeroSocio);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Socio other = (Socio) obj;
		return numeroSocio == other.numeroSocio;
	}

	@Override
	public String toString() {
		return "Socio [nombreCompleto=" + nombreCompleto + ", numeroSocio=" + numeroSocio + "]";
	}
	
	
	
}
