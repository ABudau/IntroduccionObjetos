package Ejemplos;

import java.time.LocalDate;

public class Persona {
	//Atributos
	private String nombre;
	private LocalDate fechaNacimiento;
//	private double altura;
//	private String direccion;
//	private double peso;
//	private String dni;
//	public static final double ESTATURA_IDEAL=1.50;

public Persona(String nombre,LocalDate fechaNacimiento) {
	this.fechaNacimiento=fechaNacimiento;
	this.nombre=nombre;
}


public LocalDate getFechaNacimiento() {
	return fechaNacimiento;
}
public void setFechaNacimiento(LocalDate fechaNacimiento) {
	this.fechaNacimiento = fechaNacimiento;
}
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
/**
 * 
 * @param persona2
 * @return true si this es mas joven
 */
public boolean masJoven(Persona persona2) {
	return this.fechaNacimiento.isBefore(persona2.fechaNacimiento);
}

public static boolean masJoven(Persona p1,Persona p2) {

	return p1.fechaNacimiento.isBefore(p2.fechaNacimiento); 
		
}


}
