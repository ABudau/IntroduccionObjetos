package Boletin8_2;

public class Piso {
	private String planta;
	private String numeroPuerta;
	private double precioBase;
	

	public Piso(String planta, String numeroPuerta, double precioBase) {
		super();
		this.planta = planta;
		this.numeroPuerta = numeroPuerta;
		this.precioBase = precioBase;
	}
	public double getPrecioBase() {
		return precioBase;
	}
	public void setPrecioBase(double precioBase) {
		this.precioBase = precioBase;
	}
	public String getPlanta() {
		return planta;
	}
	public void setPlanta(String planta) {
		this.planta = planta;
	}
	public String getNumeroPuerta() {
		return numeroPuerta;
	}
	public void setNumeroPuerta(String numeroPuerta) {
		this.numeroPuerta = numeroPuerta;
	}
	@Override
	public String toString() {
		return "Piso [planta=" + planta + ", numeroPuerta=" + numeroPuerta + ", precioBase=" + precioBase + "]";
	}
	
}
