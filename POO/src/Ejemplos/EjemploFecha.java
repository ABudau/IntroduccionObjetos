package Ejemplos;

import java.time.LocalDate;

public class EjemploFecha {

	
	public static void main( String args[]) {
		LocalDate fechaNacimiento=LocalDate.of(1998,1,25);
		Persona p1=new Persona(LocalDate.of(1998,1,25),"Pepe");
		Persona p2=new Persona(LocalDate.of(1997,3,15),"Maria");
		
		mostrarNombre(p1);
		
		
		System.out.println(p2.masJoven(p1));
		
		System.out.println(Persona.masJoven(p1, p2));
	}
	
	
	public static void mostrarNombre(Persona p1) {
		System.out.println(p1.getNombre());
	}
	
	
}
