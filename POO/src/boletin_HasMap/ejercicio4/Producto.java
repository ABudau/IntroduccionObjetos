package boletin_HasMap.ejercicio4;

import java.util.Objects;

public class Producto {
	private String codigo;
	private String descripcion;
	private double precioVenta;
	private int stock;
	
	
	
	public Producto(String codigo, String descripcion, double precioVenta, int stock) {
		super();
		this.codigo = codigo;
		this.descripcion = descripcion;
		this.precioVenta = precioVenta;
		this.stock=stock;
	}
	
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public double getPrecioVenta() {
		return precioVenta;
	}
	public void setPrecioVenta(double precioVenta) {
		this.precioVenta = precioVenta;
	}
	public int getStock() {
		return stock;
	}
	/**
	 * Método que modifica el stock, devuelve true si se modifica 
	 * y false si no lo hace
	 * @param stock es el número que se le pasa para modificar el 
	 * stock
	 * @return devuelve true si se modifica el stock
	 */
	public boolean setStock(int stock) {
		boolean modificado=false;
		if (stock<=0) {
			this.stock=0;
			modificado=true;
		}else {
			this.stock=stock;
			modificado=true;
		}
		return modificado;
		
		
	}

	

	@Override
	public String toString() {
		return "Producto [codigo=" + codigo + ", descripcion=" + descripcion + ", precio=" + precioVenta
				+ ", stock=" + stock + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(codigo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Producto other = (Producto) obj;
		return Objects.equals(codigo, other.codigo);
	}
	
	
	
}
