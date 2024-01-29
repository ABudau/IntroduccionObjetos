package tests;

import java.time.LocalDate;

import Ejemplos.Persona;

public class MainAlumnos {

	public static void main(String[] args) {
		Persona [] alumnos;
		alumnos=new Persona[30];
		alumnos[0]=new Persona(LocalDate.of(2004, 3, 31), "John");
		alumnos[1]=new Persona(LocalDate.of(2002, 3, 2), "Alejandro");
		alumnos[2]=new Persona(LocalDate.of(2001, 2, 22), "Pablo");
		alumnos[3]=new Persona(LocalDate.of(2000, 11, 25), "Sergio");
		alumnos[4]=new Persona(LocalDate.of(2005, 10, 31), "Jose María");

		for (Persona persona : alumnos) {
			if (persona!=null) {
				System.out.println("Nombre: "+ persona.getNombre());
				System.out.println("AñoNacimiento: "+ persona.getFechaNacimiento().getYear());
			}
			
		}
		
		
	}

}
