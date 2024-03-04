package boletin8_2_1.ejercicio5;

public class BebidaAzucarada extends Producto {
	private double porcentajeAzucar;
	private boolean promocion;
	public final double DESCUENTO=0.9;//corresponde al 10%
	
	public BebidaAzucarada(double cantidadLitros, double precioBase, Marca marca,
			double porcentajeAzucar, boolean promocion) {
		super(cantidadLitros, precioBase, marca);
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

	@Override
	public double getPrecioFinal() {
		double precio=super.getPrecioFinal();
		if (promocion) {
			precio*=DESCUENTO;
		}
		return precio;
	}

	@Override
	public String toString() {
		return "BebidaAzucarada [porcentajeAzucar=" + porcentajeAzucar + ", promocion=" + promocion
				+ ", getPrecioFinal()=" + getPrecioFinal() + ", getIdentificador()=" + getIdentificador()
				+ ", getCantidadLitros()=" + getCantidadLitros() + ", getPrecioBase()=" + getPrecioBase()
				+ ", getMarca()=" + getMarca() + "]";
	}

	
	
}
