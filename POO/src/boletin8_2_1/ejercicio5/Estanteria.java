package boletin8_2_1.ejercicio5;

public class Estanteria {
	private int id=0;
	public static final int HUECOS=6;
	private static int contador=0;
	private Estanteria[]estanteria;
	
	public Estanteria() {
		super();
		contador++;
		this.id = contador;
		this.estanteria = new Estanteria[HUECOS];
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Estanteria[] getEstanteria() {
		return estanteria;
	}

	@Override
	public String toString() {
		return "Estanteria [id=" + id + "]";
	}
	
	
}
