package Boletin8_2;

public class Entrenador {
	private int numeroColegiado;
	private Nacionalidad nacionalidad;
	
	public Entrenador(int numeroColegiado, Nacionalidad nacionalidad) {
		super();
		this.numeroColegiado = numeroColegiado;
		this.nacionalidad = nacionalidad;
	}

	public int getNumeroColegiado() {
		return numeroColegiado;
	}

	public void setNumeroColegiado(int numeroColegiado) {
		this.numeroColegiado = numeroColegiado;
	}

	public Nacionalidad getNacionalidad() {
		return nacionalidad;
	}

	public void setNacionalidad(Nacionalidad nacionalidad) {
		this.nacionalidad = nacionalidad;
	}

	@Override
	public String toString() {
		return "Entrenador [numeroColegiado=" + numeroColegiado + ", nacionalidad=" + nacionalidad + "]";
	}
	
	

	
	
	
	
	
	
	
	
}
