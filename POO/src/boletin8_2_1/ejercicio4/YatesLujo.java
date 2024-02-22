package boletin8_2_1.ejercicio4;

import java.time.LocalDate;

public class YatesLujo extends Barco {
	private int numeroCamarotes;
	private double potenciaCv;

	public YatesLujo(String matricula, double eslora, LocalDate anioFabricacion, int numeroCamarotes,
			double potenciaCv) {
		super(matricula, eslora, anioFabricacion);
		setNumeroCamarotes(numeroCamarotes);
		setPotenciaCv(potenciaCv);
	}

	public int getNumeroCamarotes() {
		return numeroCamarotes;
	}

	public void setNumeroCamarotes(int numeroCamarotes) {
		if (numeroCamarotes>0) {
			this.numeroCamarotes = numeroCamarotes;
		}
		
	}
	

	
	
	public double getPotenciaCv() {
		return potenciaCv;
	}

	public void setPotenciaCv(double potenciaCv) {
		if (potenciaCv>0) {
			this.potenciaCv = potenciaCv;
		}
		
	}

	@Override
	public double getPrecioAlquiler() {
		return super.getPrecioAlquiler()+getPotenciaCv()+getNumeroCamarotes();
	}

	
	
	
	
}
