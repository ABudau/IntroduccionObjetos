package boletin8_2_1.ejercicio3;

import java.time.LocalDate;

public class Alquiler {
	private Cliente cliente;
	private Producto producto;
	private LocalDate fechaAlquiler;
	
	public Alquiler(Cliente cliente, Producto producto, LocalDate fechaAlquiler) {
		super();
		this.cliente = cliente;
		this.producto = producto;
		this.fechaAlquiler = fechaAlquiler;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	public LocalDate getFechaAlquiler() {
		return fechaAlquiler;
	}

	public void setFechaAlquiler(LocalDate fechaAlquiler) {
		this.fechaAlquiler = fechaAlquiler;
	}

	@Override
	public String toString() {
		return "Alquiler [cliente=" + cliente + ", producto=" + producto + ", fechaAlquiler=" + fechaAlquiler + "]";
	}
	
	
	
}
