package boletin8_2_1.ejercicio4;

import java.time.LocalDate;

public class EmbarcacionesDeportivasAMotor extends Barco {
	private double potenciaCv;
	
	
	public EmbarcacionesDeportivasAMotor(String matricula, double eslora, LocalDate anioFabricacion,
			double potenciaCv) {
		super(matricula, eslora, anioFabricacion);
		this.potenciaCv = potenciaCv;
	}


	public double getPotenciaCv() {
		return potenciaCv;
	}

	public void setPotenciaCv(double potenciaCv) {
		this.potenciaCv = potenciaCv;
	}
	
	@Override
	public double getPrecioAlquiler() {
		return super.getPrecioAlquiler()+getPotenciaCv();
	}
	
	

}
