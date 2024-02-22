package boletin8_2_1.ejercicio3;

import java.time.LocalDate;

public class Persona {
	private String nombre;
	private String apellidos;
	private LocalDate fechaNacimiento;
	private String dni;
	
	
	
	public Persona(String nombre, String apellidos, LocalDate fechaNacimiento, String dni) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.fechaNacimiento = fechaNacimiento;
		this.dni = dni;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellidos=" + apellidos + ", fechaNacimiento=" + fechaNacimiento
				+ ", dni=" + dni + "]";
	}
	
	
	
	
	
}
