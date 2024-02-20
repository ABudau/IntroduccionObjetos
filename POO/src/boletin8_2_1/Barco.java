package boletin8_2_1;

import java.time.LocalDate;

public abstract class Barco {
	private String matricula;
	private double eslora;
	private LocalDate anioFabricacion;
	
	public static final int VALOR_FIJO=800;
	public Barco(String matricula, double eslora, LocalDate anioFabricacion) {
		super();
		this.matricula = matricula;
		this.eslora = eslora;
		this.anioFabricacion = anioFabricacion;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public double getEslora() {
		return eslora;
	}

	public void setEslora(double eslora) {
		this.eslora = eslora;
	}

	public LocalDate getAnioFabricacion() {
		return anioFabricacion;
	}

	public void setAnioFabricacion(LocalDate anioFabricacion) {
		this.anioFabricacion = anioFabricacion;
	}
	abstract public double funcionModulo();

	@Override
	public String toString() {
		return "Barco [matricula=" + matricula + ", eslora=" + eslora + ", anioFabricacion=" + anioFabricacion + "]";
	}
	
	
	
}
