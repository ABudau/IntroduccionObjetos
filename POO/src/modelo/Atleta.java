package modelo;

public class Atleta {
	private String nombre;
	private int edad;
//	private boolean mayorEdad;
	
	public Atleta(String nombre, int edad) {
		super();
		this.nombre = nombre;
		this.edad = edad;

	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public boolean isMayorEdad() {
		return this.edad>=18;
	}
	public void saludar() {
		System.out.println("HOLA");

	}
	public void accion() {
	System.out.println("Voy a correr");

	}
	
	
	
	
	
}
