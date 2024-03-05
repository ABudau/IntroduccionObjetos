package andreiAlexandruBudau;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Arrays;

public class SocioFundacional extends Socio {
	public static final int NUMERO_MAXIMO_INVITACIONES=5;
	private LocalDate fechaInscripcion;
	private Socio []sociosInvitados=new Socio[NUMERO_MAXIMO_INVITACIONES];
	

	
	
	public SocioFundacional(String nombreCompleto, int numeroSocio, LocalDate fechaInscripcion) {
		super(nombreCompleto, numeroSocio);
		this.fechaInscripcion = fechaInscripcion;
	}

	public Socio[] getSociosInvitados() {
		return sociosInvitados;
	}

	public void setSociosInvitados(Socio[] sociosInvitados) {
		this.sociosInvitados = sociosInvitados;
	}

	public void setFechaInscripcion(LocalDate fechaInscripcion) {
		this.fechaInscripcion = fechaInscripcion;
	}

	public LocalDate getFechaInscripcion() {
		return fechaInscripcion;
	}


	
	public int getDescuento() {
		return getNumeroSociosInvitados();
		
		
	}

	private int getNumeroSociosInvitados() {
		int contador=0;
		if (getSociosInvitados()!=null) {
			for (int i = 0; i < sociosInvitados.length; i++) {
				if (sociosInvitados[i]!=null) {
					contador++;
				}
			}
		}
		return contador;
	}

//	@Override
//	public double reservarPista(Pista pista, LocalDate fechaReserva, LocalTime horaReserva) {
//		
//		double costeResesva=-1;
//		if (pista!=null&&fechaReserva!=null&&horaReserva!=null) {
//			double precioReserva=super.reservarPista(pista, fechaReserva, horaReserva);
//			if (!Club.buscarReserva(pista, fechaReserva, horaReserva)) {
//				costeResesva=100-getDescuento()/100*precioReserva;
////				Club.almacenarReserva(new Reserva(this, pista, fechaReserva, horaReserva));
//			}
//		}
//		return costeResesva;
//	}
	


	@Override
	public double reservarPista(Pista pista, LocalDate fechaReserva, LocalTime horaReserva) {
		double precio=super.reservarPista(pista, fechaReserva, horaReserva);
		double precioConDescuento=0;
		if (pista!=null&&fechaReserva!=null&&horaReserva!=null) {
			precioConDescuento=precio*getDescuento()/100;
		}
		return precioConDescuento=precio-precioConDescuento;
	}

	@Override
	public String toString() {
		return "SocioFundacional [fechaInscripcion=" + fechaInscripcion + ", getNombreCompleto()=" + getNombreCompleto()
				+ ", getNumeroSocio()=" + getNumeroSocio() + "]";
	}

	
	
	
}
