package ejemplos;

import java.time.LocalDate;

public class SuperheroeConIdentidadSecreta extends Superheroe {

	
	
	public SuperheroeConIdentidadSecreta(String nombre, LocalDate fechaNacimiento, String poder) {
		super(nombre, fechaNacimiento, poder);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String getNombre() {
		// TODO Auto-generated method stub
		return "identidad secreta";
	}
	
	
}
