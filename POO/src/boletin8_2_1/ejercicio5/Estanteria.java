package boletin8_2_1.ejercicio5;

public class Estanteria {
	private int id=0;
	public static final int HUECOS=6;
	private static int contador=0;
	
	public Estanteria(int id) {
		super();
		contador++;
		this.id = contador;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Estanteria [id=" + id + "]";
	}
	
	
}
