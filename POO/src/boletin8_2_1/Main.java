package boletin8_2_1;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Main {

	public static void main(String[] args) {
		ejercicio1();
	}
	
	
	
	private static void ejercicio1() {
		RelojDigital r1= new RelojDigital();
		r1.establecerAlarma(20, 12);
//		r1.desactivarAlarma();
		
		System.out.println(r1.isAlarma());
		System.out.println("Hora Alarma "+r1.getHoraAlarma());
		
		RelojAnalogico r2 = new RelojAnalogico();
		
		r1.mostrarHora();
		r2.mostrarHora();
		

	}

}
