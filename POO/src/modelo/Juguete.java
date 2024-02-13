package modelo;

public class Juguete {
	private String nombre;
	private double precio;
	private boolean pilas;
	
	public Juguete(String nombre, double precio, boolean pilas) {
		super();
		this.nombre = nombre;
		this.precio = precio;
		this.pilas = pilas;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public boolean isPilas() {
		return pilas;
	}

	public void setPilas(boolean pilas) {
		this.pilas = pilas;
	}

	@Override
	public String toString() {
		return "Juguete [nombre=" + nombre + ", precio=" + precio + ", pilas=" + pilas + "]";
	}
	
	
	
}
