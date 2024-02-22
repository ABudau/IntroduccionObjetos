package boletin8_2_1.ejercicio2;

public class Circulo implements Figura{
	private double radio;
	
	
	public Circulo(double radio) {
		super();
		this.radio = radio;
	}


	@Override
	public double getArea() {
		return PI*Math.pow(radio,2);
	}


	@Override
	public String toString() {
		return "Circulo [radio=" + radio + "]";
	}

}
