package Ejemplos;

import java.time.LocalDate;

public class Superheroe extends Persona {
	private String poder;

	public Superheroe( String nombre,LocalDate fechaNacimiento, String poder) {
		super( nombre,fechaNacimiento);
		this.poder = poder;
	}

	public String getPoder() {
		return poder;
	}

	public void setPoder(String poder) {
		this.poder = poder;
	}

//	@Override
//	public String getNombre() {
//		return "identidad secreta";
//	}
	
	@Override
	public String toString() {
		return "Superheroe [poder=" + poder + "]";
	}
	
	
	
	
	
	
}
