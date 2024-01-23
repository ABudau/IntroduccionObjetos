package Modelo;

import java.util.Arrays;

public class Persona {
	private String nombre;
	private Perro [] perros;
	
	private static final int MAXIMO_PERROS=5;
	
	public Persona(String nombre, Perro perro) {
		this.nombre = nombre;
		this.perros = new Perro[MAXIMO_PERROS];
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public Perro[] getPerros() {
		return perros;
	}


	public void setPerros(Perro[] perros) {
		this.perros = perros;
	}


	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", perros=" + Arrays.toString(perros) + "]";
	}
	
//	public void setPerro(Perro perro) {
//		this.perros = ;
//	}





	
	
	
	
	
}
