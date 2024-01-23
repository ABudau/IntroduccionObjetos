package Modelo;

public class Perro {
	private String nombre;
	private Color color;
	private Juguete juguete;
	
	
	
	
	public Perro(String nombre, Color color, Juguete juguete) {
		super();
		this.nombre = nombre;
		this.color = color;
		this.juguete = juguete;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Color getColor() {
		return color;
	}
	public void setColor(Color color) {
		this.color = color;
	}
	public Juguete getJuguete() {
		return juguete;
	}
	public void setJuguete(Juguete juguete) {
		this.juguete = juguete;
	}

	@Override
	public String toString() {
		return "Perro [nombre=" + nombre + ", color=" + color + ", juguete=" + juguete + "]";
	}
	
	
	
	
}
