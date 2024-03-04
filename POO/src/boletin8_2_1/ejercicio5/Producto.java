package boletin8_2_1.ejercicio5;

public class Producto {
	private int identificador;
	private double cantidadLitros;
	private double precioBase;
	private Marca marca;
	private static int contador=0;
	public static final double IVA=1.21;//corresponde al 21%
	
	public Producto(double cantidadLitros, double precioBase, Marca marca) {
		super();
		contador++;
		this.identificador = contador;
		this.cantidadLitros = cantidadLitros;
		this.precioBase = precioBase;
		this.marca = marca;
	}
	
	public int getIdentificador() {
		return identificador;
	}
	public void setIdentificador(int identificador) {
		this.identificador = identificador;
	}
	public double getCantidadLitros() {
		return cantidadLitros;
	}
	public void setCantidadLitros(double cantidadLitros) {
		if (cantidadLitros>0) {
			this.cantidadLitros = cantidadLitros;
		}
		
	}
	public double getPrecioBase() {
		return precioBase;
	}
	public void setPrecioBase(double precioBase) {
		if (precioBase>0) {
			this.precioBase = precioBase;
		}
		
	}
	public Marca getMarca() {
		return marca;
	}
	public void setMarca(Marca marca) {
		this.marca = marca;
	}
	
	public double getPrecioFinal() {
		return getPrecioBase()*IVA;
	}
	
	
	
	@Override
	public String toString() {
		return "Producto [identificador=" + identificador + ", cantidadLitros=" + cantidadLitros + ", precioBase="
				+ precioBase + ", marca=" + marca + ", getPrecioFinal()=" + getPrecioFinal() + "]";
	}
	
	
	
}
