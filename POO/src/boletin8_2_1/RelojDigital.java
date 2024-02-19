package boletin8_2_1;

import java.time.format.DateTimeFormatter;

public class RelojDigital extends Reloj {
	
	public RelojDigital() {
		super();
		
	}

	/**
	 * Método que muestra la hora con un formato concreto
	 */
	@Override
	public void mostrarHora() {
		String mensaje="";
		if (getHora()==getHoraAlarma().getHour()&&getMinutos()==getHoraAlarma().getMinute()&&isAlarma()) {//si la hora y los minutos coinciden con la hora y los minutos
																											//de la alarma y la alarma está activada
			mensaje="RING!!!!!";
		}
//		DateTimeFormatter formato = DateTimeFormatter.ofPattern("H:mm:ss");//defino el patron y lo almaceno en una variable
//		System.out.println(getReloj().format(formato)+" "+mensaje);//muestro el reloj aplicando el metodo format y pasandole el patron
		System.out.println(getReloj().format(DateTimeFormatter.ofPattern("H:mm:ss"))+" "+mensaje);//muestro el reloj aplicando el metodo format
																						//y definiendo el patron dentro del metodo
	}

}
