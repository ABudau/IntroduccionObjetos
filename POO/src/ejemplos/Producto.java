package ejemplos;

public class Producto {
	//atributos
	private int id;
	private String nombre;
	
//	private double precio;
//	private int stock;
//	private String imagen;
//	private double ancho;
//	private double largo;
//	private double peso;
//	private boolean disponibilidad;

	
	public Producto(int id, String nombre) {
		super();
		this.id = id;
		this.nombre = nombre;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Producto [id=" + id + ", nombre=" + nombre + "]";
	}
	
	
}
