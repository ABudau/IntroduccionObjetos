package boletin8_2_1.ejercicio5;

public class BebidaAzucarada extends Producto {
	private double porcentajeAzucar;
	private boolean promocion;
	
	public BebidaAzucarada(int identificador, double cantidadLitros, double precioBase, Marca marca,
			double porcentajeAzucar, boolean promocion) {
		super(identificador, cantidadLitros, precioBase, marca);
		this.porcentajeAzucar = porcentajeAzucar;
		this.promocion = promocion;
	}

	public double getPorcentajeAzucar() {
		return porcentajeAzucar;
	}

	public void setPorcentajeAzucar(double porcentajeAzucar) {
		this.porcentajeAzucar = porcentajeAzucar;
	}

	public boolean isPromocion() {
		return promocion;
	}

	public void setPromocion(boolean promocion) {
		this.promocion = promocion;
	}
	
}
