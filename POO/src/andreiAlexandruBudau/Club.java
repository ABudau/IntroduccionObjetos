package andreiAlexandruBudau;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Iterator;

public class Club {
	private static Reserva[] reservasRealizadas= new Reserva[100];
	private static Socio[] sociosClub=new Socio[100];
	private static Pista[]pistasClub =new Pista[10];
	
	public static Reserva[] getReservasRealizadas() {
		return reservasRealizadas;
	}
	public static void setReservasRealizadas(Reserva[] reservasRealizadas) {
		Club.reservasRealizadas = reservasRealizadas;
	}
	public static Socio[] getSociosClub() {
		return sociosClub;
	}
	public static void setSociosClub(Socio[] sociosClub) {
		Club.sociosClub = sociosClub;
	}
	
	public static boolean almacenarReserva(Reserva reserva1) {
		boolean almacenado=false;
		if (reserva1!=null) {
			for (int i = 0; i < reservasRealizadas.length&&!almacenado; i++) {
				if (reservasRealizadas[i]==null) {
					reservasRealizadas[i]=reserva1;
					almacenado=true;
				}
			}
		}
		return almacenado;
	}
	public static boolean almacenarPista(Pista pista1) {
		boolean almacenado=false;
		if (pista1!=null) {
			for (int i = 0; i < pistasClub.length&&!almacenado; i++) {
				if (pistasClub[i]==null) {
					pistasClub[i]=pista1;
					almacenado=true;
				}
			}
		}
		return almacenado;
	}
	
	public static boolean buscarReserva(Pista pista, LocalDate fechaReserva, LocalTime horaReserva) {
		boolean encontrado=false;
		Reserva []reservaAux=getReservasRealizadas();
		if (pista!=null&&fechaReserva!=null&&horaReserva!=null) {
			for (int i = 0; i < reservaAux.length&&!encontrado; i++) {
				if (reservaAux[i]!=null) {
					if (reservaAux[i].getPista().equals(pista)&&reservaAux[i].getFechaReserva().equals(fechaReserva)&&reservaAux[i].getHoraReserva().getHour()==horaReserva.getHour()) {
						encontrado=true;
					}
				}
			}
		}
		return encontrado;

	}
	
	public static void mostrarReservasRealizadas() {
		for (int i = 0; i < reservasRealizadas.length; i++) {
			if (reservasRealizadas[i]!=null) {
				System.out.println(reservasRealizadas[i]);
			}
		}

	}
}
