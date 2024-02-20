package Ejemplos;

import java.time.LocalDate;

public class MainFechaCasa {

	public static void main(String[] args) {
		System.out.println(estaEnCasa(LocalDate.of(2024, 12, 8), LocalDate.of(2024, 12, 20)));

	}
	public static boolean estaEnCasa(LocalDate fechaInicio,LocalDate fechaFin) {
		boolean ocupado=false;
		LocalDate fechaInicioSalida=LocalDate.of(2024, 12, 07);
		int duracionSalida=15;
		LocalDate fechaFinSalida=fechaInicio.plusDays(duracionSalida);
		if (fechaInicio.isBefore(fechaFinSalida)||fechaFin.isAfter(fechaFinSalida)) {
			ocupado=true;
		}
		return ocupado;
		
		
		
	}

}
