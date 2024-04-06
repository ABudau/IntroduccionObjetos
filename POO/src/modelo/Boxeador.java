package modelo;

public class Boxeador extends Atleta {

	public Boxeador(String nombre, int edad) {
		super(nombre, edad);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return getNombre() + " "+ getEdad();
	}

	
}
