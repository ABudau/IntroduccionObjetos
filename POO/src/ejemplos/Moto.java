package Ejemplos;

import java.time.LocalDate;

public class Moto extends Vehiculos {
private double cv;
private int velocidadMaxima;

public Moto(String matricula, String marca, String modelo, LocalDate fechaMatriculacion, double cv,
		int velocidadMaxima) {
	super(matricula, marca, modelo, fechaMatriculacion);
	this.cv = cv;
	this.velocidadMaxima = velocidadMaxima;
}

public double getCv() {
	return cv;
}

public void setCv(double cv) {
	this.cv = cv;
}

public int getVelocidadMaxima() {
	return velocidadMaxima;
}

public void setVelocidadMaxima(int velocidadMaxima) {
	this.velocidadMaxima = velocidadMaxima;
}




}
