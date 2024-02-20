package boletin8_2_1;

import java.time.LocalDate;

public class Cliente extends Persona {
	public static int id=0;
	
	public Cliente(String nombre, String apellidos, LocalDate fechaNacimiento, String dni) {
		super(nombre, apellidos, fechaNacimiento, dni);
		Cliente.id++;
	}

	public static int getId() {
		return id;
	}

	public static void setId(int id) {
		Cliente.id = id;
	}
	

}
