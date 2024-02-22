package boletin8_2_1.ejercicio2;

public class Rectangulo implements Figura {
	private double largo;
	private double ancho;
	
	
	
	public Rectangulo(double largo, double ancho) {
		super();
		this.largo = largo;
		this.ancho = ancho;
	}



	@Override
	public double getArea() {
		
		return this.largo*this.ancho;
	}



	@Override
	public String toString() {
		return "Rectangulo [largo=" + largo + ", ancho=" + ancho + "]";
	}
	

}
