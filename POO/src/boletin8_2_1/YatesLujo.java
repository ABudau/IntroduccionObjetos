package boletin8_2_1;

import java.time.LocalDate;

public class YatesLujo extends EmbarcacionesDeportivasAMotor {
	private int numeroCamarotes;

	public YatesLujo(String matricula, double eslora, LocalDate anioFabricacion, double potenciaCv,
			int numeroCamarotes) {
		super(matricula, eslora, anioFabricacion, potenciaCv);
		setNumeroCamarotes(numeroCamarotes);
	}

	public int getNumeroCamarotes() {
		return numeroCamarotes;
	}

	public void setNumeroCamarotes(int numeroCamarotes) {
		if (numeroCamarotes>0) {
			this.numeroCamarotes = numeroCamarotes;
		}
		
	}

	
	
	@Override
	public double funcionModulo() {
		return getEslora()*10+getPotenciaCv()+getNumeroCamarotes();
	}

	@Override
	public String toString() {
		return "YatesLujo [numeroCamarotes=" + numeroCamarotes + "]";
	}
	
	
	
	
}
