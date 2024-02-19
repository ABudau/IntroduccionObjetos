package boletin8_2_1;

public class Pelicula extends Producto {
	private Categoria categoria;

	public Pelicula(String nombre, double precio, String descripcion, Categoria categoria) {
		super(nombre, precio, descripcion);
		this.categoria = categoria;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	@Override
	public String toString() {
		return "Pelicula [categoria=" + categoria + ", getNombre()=" + getNombre() + ", getPrecio()=" + getPrecio()
				+ ", getDescripcion()=" + getDescripcion() + "]";
	}
	
	
	
	

}
